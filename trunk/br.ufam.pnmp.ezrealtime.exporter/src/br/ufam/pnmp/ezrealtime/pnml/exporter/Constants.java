/**
 * <copyright> 
 *
 * Copyright (c) 2008 Fabiano Cruz (UFAM - Universidade Federal do Amazonas) 
 * and others. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Fabiano Cruz [fabianoc at acm.org] - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: Constants.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.pnml.exporter;

public final class Constants {

	/*
	 * PLACES
	 */

	// pwri : waiting for releasing;
	public static final String PWR = "pwr_";

	// pwgi : waiting for processor granting;
	public static final String PWG = "pwg_";

	// pwci : waiting for task computation;
	public static final String PWC = "pwc_";

	// pwfi : waiting for task instance end;
	public static final String PWF = "pwf_";

	// pfi : end of a task instance;
	public static final String PF = "pf_";

	// pwdi : waiting for deadline missing.
	public static final String PWD = "pwd_";

	// pprock : processor.
	public static final String PPROC = "pproc_";

	// pwpci : waiting for computation removing;
	public static final String PWPC = "pwpc_";

	// pdmi : deadline missed; and
	public static final String PDM = "pdm_";

	// final place
	public static final String PEND = "PEnd";

	// pstart: waiting for system starting
	public static final String PSTART = "pstart";

	// psti : starting of the ith task, 1 = i = n.
	public static final String PST = "pst_";

	// pwai : waiting for the arrival of another task instance;
	public static final String PWA = "pwa_";

	public static final String PBUS = "pbus_";

	// pwsij : waiting for sending a message;
	public static final String PWS = "pws_";

	// psbufij : sending buffer; and
	public static final String PSBUF = "psbuf_";

	// prbufij : receiving buffer.
	public static final String PRBUF = "prbuf_";

	// pprockTi : states that task ti was the last to be allocated to the
	// processor
	public static final String PPROC_STATES = "pproc_state_";

	/*
	 * TRANSITIONS
	 */

	// tdi : deadline missing;
	public static final String TD = "td_";

	// tpci : computation removing.
	public static final String TPC = "tpc_";

	public static final String TSTART = "tstart";

	// tend: end of tasks in the system.
	public static final String TEND = "tend";

	public static final String TA = "ta_";

	public static final String TPH = "tph_";

	// tri : task releasing;
	public static final String TR = "tr_";

	// tgi : processor granting;
	public static final String TG = "tg_";

	// tci : executing one task unit, and processor releasing; and
	public static final String TC = "tc_";

	// tfi : concluding the task computation;
	public static final String TF = "tf_";

	// tgbij : bus granting;
	public static final String TGB = "tgb_";

	// tsendi,j : sending the message; and
	public static final String TSEND = "tsend_";

	// tcommi,j : communication.
	public static final String TCOMM = "tcomm_";

	// tgwoi : processor granting without dispatcher overhead (highest
	// priority);
	public static final String TWGO = "tgwo_";

	// tgwi : processor granting with dispatcher overhead (lowest priority);
	public static final String TGW = "tgw_";

	// tfpi : concluding the task computation, and removes the marking pprockTi
	// (higher priority than tfi)
	public static final String TFP = "tfp_";

}
