//São permiditods comentário antes de cada bloco (##XXX##)
//sem necessidade de modificar algoritmo de parse

// *********** Bloco de Inicio *****************
//  PLACE_FINAL_MARK 
//  NUM_PLACE	
//  NUM_TRANS	
//  CHECAR_POTENCIA	
//  POTENCIA_TROCA_CONTEXTO_PROCESSADOR 
//  POTENCIA_MAXIMA 

##BEGIN##
7
40
30
0
0
0

// ************ Conj de transicoes de Deadline ***************
// Cardinalidade$transição1%transição2%....%transiçãoN
##TD##
4$4%11%18%25

// ************ Conj de transicoes de Arrival ***************
// Cardinalidade$transição1%transição2%....%transiçãoN
##TA##
8$2%3%9%10%16%17%23%24

// ************ Conj de transicoes Releasa ***************
// Cardinalidade$transição1%transição2%....%transiçãoN
##TR##
4$6%13%20%27

// ************ Conj de transicoes Exclusion ***************
// Cardinalidade$transição1%transição2%....%transiçãoN
##TE##
0$

// ************ Conj de transicoes Grant ***************
// Cardinalidade$transição1%transição2%....%transiçãoN
##TG##
4$7%14%21%28

// ************ Conj de transicoes Computation  ***************
// Cardinalidade$transição1%transição2%....%transiçãoN
##TC##
4$8%15%22%29

// ************ Conj de transicoes Final **************
// Cardinalidade$transicao1%transicao2%....%transicaoN
##TF##
0$

// ************ Conj de transicoes Outras **************
// Cardinalidade$transicao1%transicao2%....%transicaoN
##TO##
2$0%1

// ************ Conj de transicoes Precedence **************
// Cardinalidade$transicao1%transicao2%....%transicaoN
##TP##
0$

// *********** Power consumption ****************
// Cardinalidade$Consumo_1a_trans_computacao%Consumo_2a_trans_computacao...
##PC##
0$

// **** transicoes de Computacao x processador *****
// NUMERO_PROCESSADORES
// Processador1:Cardinalidade$transicao1%transicao2%....%transicaoN
// Processador2:Cardinalidade$transicao1%transicao2%....%transicaoN
// ...
// ProcessadorN:Cardinalidade$transicao1%transicao2%....%transicaoN
##TASK-PROC##
2
P1:2$8%15
P2:2$22%29

// ***** Marcacao Inicial ***************
//Marcas_Ligar1%Marcas_Ligar2%Marcas_Ligar3%...%Marcas_LigarN
##ESTADO_INICIAL##
1%1%1%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0%0

// ***** Lugares ***************
//Nome_Lugar1%Nome_Lugar2%Nome_Lugar3%...%Nome_LugarN
##PLACES##
Pstart%P1%P2%PEndA%PEndB%PEndC%PEndD%PEnd%PStartA%PA1A%PA2A%PD1A%PD2A%PD3A%PR1_A%PR2_A%PStartB%PA1B%PA2B%PD1B%PD2B%PD3B%PR1_B%PR2_B%PStartC%PA1C%PA2C%PD1C%PD2C%PD3C%PR1_C%PR2_C%PStartD%PA1D%PA2D%PD1D%PD2D%PD3D%PR1_D%PR2_D

// ***** Transicoes ***************
//Nome_Trans1%Nome_Trans2%Nome_Trans3%...%Nome_TransN
//EFT_Trans1%EFT_Trans2%EFT_Trans3%...%EFT_TransN
//LFT_Trans1%LFT_Trans2%LFT_Trans3%...%LFT_TransN
##TRANSITIONS##
tstart%tEnd%tPhA%tAA%tDA%tMDA%tR_A%tP_A%tC_A%tPhB%tAB%tDB%tMDB%tR_B%tP_B%tC_B%tPhC%tAC%tDC%tMDC%tR_C%tP_C%tC_C%tPhD%tAD%tDD%tMDD%tR_D%tP_D%tC_D
0%0%0%8%7%0%0%0%2%0%6%6%0%2%0%3%0%8%7%0%0%0%2%0%6%6%0%2%0%3
0%0%0%8%7%0%5%0%2%0%6%6%0%3%0%3%0%8%7%0%5%0%2%0%6%6%0%3%0%3

// ******* Pos condicoes (uma linha para cada trans)**************
// Cardinalidade1$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN 
// Cardinalidade2$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN
// ...
// CardinalidadeN$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN
##POST##
4$8%16%24%32$1%1%1%1
1$7$1
3$9%10%11$2%1%1
2$10%11$1%1
1$12$1
1$13$1
1$14$1
1$15$1
2$3%1$1%1
3$17%18%19$3%1%1
2$18%19$1%1
1$20$1
1$21$1
1$22$1
1$23$1
2$4%1$1%1
3$25%26%27$2%1%1
2$26%27$1%1
1$28$1
1$29$1
1$30$1
1$31$1
2$5%2$1%1
3$33%34%35$3%1%1
2$34%35$1%1
1$36$1
1$37$1
1$38$1
1$39$1
2$6%2$1%1

// ******* Pre condicoes (uma linha para cada trans)**************
// Cardinalidade1$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN 
// Cardinalidade2$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN
// ...
// CardinalidadeN$Lugar1%Lugar2%...%LugarN$Peso1%Peso2%...%PesoN
##PRE##
1$0$1
4$3%4%5%6$3%4%3%4
1$8$1
1$9$1
1$11$1
2$12%15$1%1
1$10$1
2$14%1$1%1
2$15%11$1%1
1$16$1
1$17$1
1$19$1
2$20%23$1%1
1$18$1
2$22%1$1%1
2$23%19$1%1
1$24$1
1$25$1
1$27$1
2$28%31$1%1
1$26$1
2$30%2$1%1
2$31%27$1%1
1$32$1
1$33$1
1$35$1
2$36%39$1%1
1$34$1
2$38%2$1%1
2$39%35$1%1

// ******** Bloco de Fim ************* 
##END-SPEC##