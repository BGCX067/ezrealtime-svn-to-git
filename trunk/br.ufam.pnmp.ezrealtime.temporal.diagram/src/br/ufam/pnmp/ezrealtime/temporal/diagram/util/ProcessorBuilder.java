/*
 * Created on 12/12/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.ufam.pnmp.ezrealtime.temporal.diagram.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.ufam.pnmp.ezrealtime.temporal.diagram.Interval;
import br.ufam.pnmp.ezrealtime.temporal.diagram.Processor;
import br.ufam.pnmp.ezrealtime.temporal.diagram.Task;

/**
 * @author Adilson Arcoverde
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class ProcessorBuilder {

    private static final ProcessorBuilder instance = new ProcessorBuilder();

    /**
     *  
     */
    private ProcessorBuilder() {
    }

    public static ProcessorBuilder getInstance() {
        return instance;
    }

    public List createProcessors(File input) {
        List result = new ArrayList();
        Map tasksMap = new HashMap();
        Map transitionsMap = new HashMap();
        String lineSeparator = System.getProperty("line.separator");
        try {
            BufferedReader bf = new BufferedReader(new FileReader(input));
            String nextFileLine = null;
            StringBuffer buffer = new StringBuffer();
            while ((nextFileLine = bf.readLine()) != null) {
                buffer.append(nextFileLine + lineSeparator);
            }

            String[] sections = buffer.toString().split("#");

            String[] processorsDecl = new String[sections.length - 1];
            String scheduling = sections[sections.length - 1];

            for (int i = 0; i < sections.length - 1; i++) {
                processorsDecl[i] = sections[i];

                String[] splitted = sections[i].split(lineSeparator);
                Processor newProcessor = null;
                for (int j = 0; j < splitted.length; j++) {
                    String nextLine = splitted[j];
                    if (nextLine.startsWith("Proc=")) {
                        newProcessor = new Processor();
                        String processorName = nextLine.substring("Proc=".length(), nextLine.length());
                        newProcessor.setName(processorName);
                        result.add(newProcessor);
                    } else {
                        String[] transitionEval = nextLine.split("=");
                        if (transitionEval.length == 2) {
                            Task newTask = new Task();

                            String transitionName = transitionEval[0];
                            Integer transitionValue = new Integer(transitionEval[1]);
                            transitionsMap.put(transitionName, transitionValue);

                            newTask.setName(transitionName);

                            if (newProcessor != null) {
                                List tasksList = newProcessor.getTasks();
                                if (tasksList == null) {
                                    tasksList = new ArrayList();
                                }
                                tasksList.add(newTask);
                                newProcessor.setTasks(tasksList);
                                tasksMap.put(transitionName, newTask);
                            }
                        }
                    }
                }
            }

            Pattern energyTuplePattern = Pattern.compile("\\((\\w+),(\\d+)(,(\\d+))?\\) ?");
            Matcher energyTupleMatcher = energyTuplePattern.matcher(scheduling);

            int clock = 0;

            while (energyTupleMatcher.find()) {
                String transitionName = energyTupleMatcher.group(1);
                int clockIncrement = Integer.parseInt(energyTupleMatcher.group(2));
                clock += clockIncrement;

                Integer transitionTime = (Integer) transitionsMap.get(transitionName);
                if (transitionTime != null) {
                    Task task = (Task) tasksMap.get(transitionName);
                    Interval interval = new Interval(clock - transitionTime.intValue(), clock);
                    task.addInterval(interval);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Iterator processorsIterator = result.iterator();
        while (processorsIterator.hasNext()) {
            Processor nextProcessor = (Processor) processorsIterator.next();

            Integer initTime = null;
            Integer endTime = null;
            Iterator nextProcessorTasksIterator = nextProcessor.getTasks().iterator();
            while (nextProcessorTasksIterator.hasNext()) {
                Task nextTask = (Task) nextProcessorTasksIterator.next();
                List taskIntervals = nextTask.getIntervals();
                Interval firstInterval = (Interval) taskIntervals.get(0);
                Interval lastInterval = (Interval) taskIntervals.get(taskIntervals.size() - 1);

                if (initTime != null) {
                    initTime = new Integer(Math.min(initTime.intValue(), firstInterval.getInitialTime()));
                } else {
                    initTime = new Integer(firstInterval.getInitialTime());
                }

                if (endTime != null) {
                    endTime = new Integer(Math.max(endTime.intValue(), lastInterval.getEndTime()));
                } else {
                    endTime = new Integer(lastInterval.getEndTime());
                }
            }
            nextProcessor.setInterval(new Interval(initTime.intValue(), endTime.intValue()));
        }
        return result;
    }

}