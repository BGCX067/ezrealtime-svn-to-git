// ********* Initial Block *********
//  PLACE FINAL MARK
//  NUM OF PLACES
//  NUM OF TRANSITIONS
//  CHECK POWER
//  POWER CHANGE PROCESSOR' CONTEXT
//  MAX POWER
##BEGIN##
33
37
28
0
0
0

// ********* Deadline Transitions *********
//Cardinality$transition1%transition2%....%transitionN
##TD##
3$6%14%22

// ********* Arrival Transitions *********
//Cardinality$transition1%transition2%....%transitionN
##TA##
6$0%1%8%9%16%17

// ********* Release Transitions *********
//Cardinality$transition1%transition2%....%transitionN
##TR##
3$2%10%18

// ********* Grant Transitions *********
//Cardinality$transition1%transition2%....%transitionN
##TG##
3$3%11%19

// ********* Computation Transitions *********
//Cardinality$transition1%transition2%....%transitionN
##TC##
3$4%12%20

// ********* Final Transitions *********
//Cardinality$transition1%transition2%....%transitionN
##TF##
3$5%13%21

// ********* Other Transitions *********
//Cardinality$transition1%transition2%....%transitionN
##TO##
5$7%15%23%26%27

// ********* Precedence Transitions *********
//Cardinality$transition1%transition2%....%transitionN
##TP##
2$24%25

// ********* Computation x Processor Transitions *********
// NUMERO_PROCESSADORES
// Processador1:Cardinalidade$transicao1%transicao2%....%transicaoN
// Processador2:Cardinalidade$transicao1%transicao2%....%transicaoN
// ...
// ProcessadorN:Cardinalidade$transicao1%transicao2%....%transicaoN
##TASK-PROC##
1
pproc_P1:3$5%13%21

// ********* Initial Marking *********
// Marking_1%Marking_3%Marking_3%...Marking_N
##ESTADO_INICIAL##
0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%1%1%0%0%0%0%0%0%0

// ********* ALL Places *********
##PLACES##
pwa_green%pwd_green%pwr_green%pwg_green%pwc_green%pwf_green%pwpc_green%pdm_green%pwa_yellow%pwd_yellow%pwr_yellow%pwg_yellow%pwc_yellow%pwf_yellow%pwpc_yellow%pdm_yellow%pwa_red%pwd_red%pwr_red%pwg_red%pwc_red%pwf_red%pwpc_red%pdm_red%prec_green_yellow%pwp_green_yellow%prec_yellow_red%pwp_yellow_red%pproc_P1%pstart%pst_0%pst_01%pst_012%PEnd%pf_0%pf_01%pf_012

// ********* ALL Transitions *********
//Trans_Name1%Trans_Name2%Trans_Name3...%Trans_NameN
//EFT_Trans1%EFT_Trans2%EFT_Trans3...%EFT_TransN
//LFT_Trans1%LFT_Trans2%LFT_Trans3...%LFT_TransN
##TRANSITIONS##
ta_green%tph_green%tr_green%tg_green%tc_green%tf_green%td_green%tpc_green%ta_yellow%tph_yellow%tr_yellow%tg_yellow%tc_yellow%tf_yellow%td_yellow%tpc_yellow%ta_red%tph_red%tr_red%tg_red%tc_red%tf_red%td_red%tpc_red%tprec_green_yellow%tprec_yellow_red%tstart%tend
9%0%0%0%1%0%9%0%9%5%0%0%1%0%9%0%9%6%0%0%1%0%9%0%0%0%0%0
9%0%8%0%1%0%9%0%9%5%8%0%1%0%9%0%9%6%8%0%1%0%9%0%0%0%0%0

// ********* Post Conditions *********
// Cardinalidade1$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN
// Cardinalidade2$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN
// ...
// CardinalidadeN$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN
##POST##
2$1%2$1%1
3$0%1%2$1%1%1
1$3$1
1$4$1
2$5%28$1%1
2$24%34$1%1
1$6$1
1$7$1
2$9%10$1%1
3$8%9%10$1%1%1
1$25$1
1$12$1
2$13%28$1%1
2$26%35$1%1
1$14$1
1$15$1
2$17%18$1%1
3$16%17%18$1%1%1
1$27$1
1$20$1
2$21%28$1%1
1$36$1
1$22$1
1$23$1
1$11$1
1$19$1
3$30%31%32$1%1%1
1$33$1


// ********* Pre Conditions *********
// Cardinalidade1$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN
// Cardinalidade2$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN
// ...
// CardinalidadeN$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN
##PRE##
1$0$1
1$30$1
1$2$1
2$3%28$1%1
1$4$1
2$1%5$1%1
1$1$1
2$4%6$1%1
1$8$1
1$31$1
1$10$1
2$11%28$1%1
1$12$1
2$9%13$1%1
1$9$1
2$12%14$1%1
1$16$1
1$32$1
1$18$1
2$19%28$1%1
1$20$1
2$17%21$1%1
1$17$1
2$20%22$1%1
2$24%25$1%1
2$26%27$1%1
1$29$1
3$34%35%36$1%1%1


// ********* Final Block *********
##END-SPEC##