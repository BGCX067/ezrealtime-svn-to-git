/*
 * Created on Jul 21, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.ufam.pnmp.ezrealtime.temporal.diagram;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.ColorPropertyDescriptor;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * @author Adilson Arcoverde
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class RealTimeDiagramTasksPageCanvas extends Canvas implements IPropertySource {

	transient protected PropertyChangeSupport listeners = new PropertyChangeSupport(
			this);

	private Color backgroundColor;

	private Color axesColor;

	private Color gridColor;

	private Color tasksColor1;

	private Color tasksColor2;

	private Color labelsColor;

	private Integer printVerticalGrid = new Integer(1);

	private Integer printHorizontalGrid = new Integer(1);

	/**
	 * @return Returns the printHorizontalGrid.
	 */
	public Integer getPrintHorizontalGrid() {
		return printHorizontalGrid;
	}

	/**
	 * @param printHorizontalGrid
	 *            The printHorizontalGrid to set.
	 */
	public void setPrintHorizontalGrid(Integer printHorizontalGrid) {
		this.printHorizontalGrid = printHorizontalGrid;
	}

	/**
	 * @return Returns the printVerticalGrid.
	 */
	public Integer getPrintVerticalGrid() {
		return printVerticalGrid;
	}

	/**
	 * @param printVerticalGrid
	 *            The printVerticalGrid to set.
	 */
	public void setPrintVerticalGrid(Integer printVerticalGrid) {
		this.printVerticalGrid = printVerticalGrid;
	}

	/**
	 * @param parent
	 * @param style
	 */
	public RealTimeDiagramTasksPageCanvas(Composite parent, int style) {
		super(parent, style);
		this.backgroundColor = new Color(null, 255, 255, 255);
		this.axesColor = new Color(null, 0, 0, 0);
		this.gridColor = new Color(null, 100, 100, 100);
		this.tasksColor1 = new Color(null, 0, 100, 0);
		this.tasksColor2 = new Color(null, 50, 150, 50);
		this.labelsColor = new Color(null, 0, 0, 255);
	}

	/**
	 * @return Returns the backgroundColor.
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * @param backgroundColor
	 *            The backgroundColor to set.
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @return Returns the labelsColor.
	 */
	public Color getLabelsColor() {
		return labelsColor;
	}

	/**
	 * @param labelsColor
	 *            The labelsColor to set.
	 */
	public void setLabelsColor(Color labelsColor) {
		this.labelsColor = labelsColor;
	}

	/**
	 * @return Returns the tasksColor.
	 */
	public Color getTasksColor1() {
		return tasksColor1;
	}

	/**
	 * @param tasksColor
	 *            The tasksColor to set.
	 */
	public void setTasksColor1(Color tasksColor1) {
		this.tasksColor1 = tasksColor1;
	}

	/**
	 * @return Returns the tasksColor.
	 */
	public Color getTasksColor2() {
		return tasksColor2;
	}

	/**
	 * @param tasksColor
	 *            The tasksColor to set.
	 */
	public void setTasksColor2(Color tasksColor2) {
		this.tasksColor2 = tasksColor2;
	}

	/**
	 * @return Returns the axesColor.
	 */
	public Color getAxesColor() {
		return axesColor;
	}

	/**
	 * @param axesColor
	 *            The axesColor to set.
	 */
	public void setAxesColor(Color axesColor) {
		this.axesColor = axesColor;
	}

	/**
	 * @return Returns the gridColor.
	 */
	public Color getGridColor() {
		return gridColor;
	}

	/**
	 * @param gridColor
	 *            The gridColor to set.
	 */
	public void setGridColor(Color gridColor) {
		this.gridColor = gridColor;
	}

	/////////////////////////////
	//Property source methods
	/////////////////////////////

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
	 */
	public Object getEditableValue() {
		return this;
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	public IPropertyDescriptor[] getPropertyDescriptors() {
		ColorPropertyDescriptor backgroundColorDescriptor = new ColorPropertyDescriptor(
				"background", "Background");
		ColorPropertyDescriptor axesColorDescriptor = new ColorPropertyDescriptor(
				"axes", "Axes");
		ColorPropertyDescriptor tasks1ColorDescriptor = new ColorPropertyDescriptor(
				"tasks1", "Tasks 1");
		ColorPropertyDescriptor tasks2ColorDescriptor = new ColorPropertyDescriptor(
				"tasks2", "Tasks 2");
		ColorPropertyDescriptor labelsColorDescriptor = new ColorPropertyDescriptor(
				"labels", "Labels");
		ColorPropertyDescriptor gridColorDescriptor = new ColorPropertyDescriptor(
				"grid", "Grid");
		backgroundColorDescriptor.setCategory("Color");
		axesColorDescriptor.setCategory("Color");
		tasks1ColorDescriptor.setCategory("Color");
		tasks2ColorDescriptor.setCategory("Color");
		labelsColorDescriptor.setCategory("Color");
		gridColorDescriptor.setCategory("Color");

		ComboBoxPropertyDescriptor printVerticalGridDescriptor = new ComboBoxPropertyDescriptor(
				"printVerticalGrid", "Vertical", new String[] { "no", "yes" });
		ComboBoxPropertyDescriptor printHorizontalGridDescriptor = new ComboBoxPropertyDescriptor(
				"printHorizontalGrid", "Horizontal",
				new String[] { "no", "yes" });
		printHorizontalGridDescriptor.setCategory("Grid");
		printVerticalGridDescriptor.setCategory("Grid");

		return new IPropertyDescriptor[] { backgroundColorDescriptor,
				axesColorDescriptor, tasks1ColorDescriptor,
				tasks2ColorDescriptor, gridColorDescriptor,
				labelsColorDescriptor, printHorizontalGridDescriptor,
				printVerticalGridDescriptor };
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		if (id.equals("background")) {
			return this.backgroundColor.getRGB();
		} else if (id.equals("axes")) {
			return this.axesColor.getRGB();
		} else if (id.equals("tasks1")) {
			return this.tasksColor1.getRGB();
		} else if (id.equals("tasks2")) {
			return this.tasksColor2.getRGB();
		} else if (id.equals("labels")) {
			return this.labelsColor.getRGB();
		} else if (id.equals("grid")) {
			return this.gridColor.getRGB();
		} else if (id.equals("printVerticalGrid")) {
			return this.printVerticalGrid;
		} else if (id.equals("printHorizontalGrid")) {
			return this.printHorizontalGrid;
		}
		return null;
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.Object)
	 */
	public boolean isPropertySet(Object id) {
		return false;
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object id) {
	}

	/**
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object,
	 *      java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		Color old = null;
		if (id.equals("background")) {
			this.backgroundColor.dispose();
			this.backgroundColor = new Color(null, (RGB) value);
			this.setBackground(this.backgroundColor);
		} else if (id.equals("axes")) {
			this.axesColor.dispose();
			this.axesColor = new Color(null, (RGB) value);
		} else if (id.equals("tasks1")) {
			this.tasksColor1.dispose();
			this.tasksColor1 = new Color(null, (RGB) value);
		} else if (id.equals("tasks2")) {
			this.tasksColor2.dispose();
			this.tasksColor2 = new Color(null, (RGB) value);
		} else if (id.equals("labels")) {
			this.labelsColor.dispose();
			this.labelsColor = new Color(null, (RGB) value);
		} else if (id.equals("grid")) {
			this.gridColor.dispose();
			this.gridColor = new Color(null, (RGB) value);
		} else if (id.equals("printVerticalGrid")) {
			this.printVerticalGrid = (Integer) value;
		} else if (id.equals("printHorizontalGrid")) {
			this.printHorizontalGrid = (Integer) value;
		}
		this.firePropertyChange(id.toString(), null, value);
	}

	protected void firePropertyChange(String prop, Object old, Object newValue) {
		listeners.firePropertyChange(prop, old, newValue);
	}

	/////////////////////////////
	//End of property source methods
	/////////////////////////////
	public void addPropertyChangeListener(PropertyChangeListener l) {
		listeners.addPropertyChangeListener(l);
	}

	public void removePropertyChangeListener(PropertyChangeListener l) {
		listeners.removePropertyChangeListener(l);
	}

	public void dispose() {
		this.backgroundColor.dispose();
		this.axesColor.dispose();
		this.tasksColor1.dispose();
		this.tasksColor2.dispose();
		this.labelsColor.dispose();
		this.gridColor.dispose();
		super.dispose();
	}
}