#ifndef F41x_Blinky_H
#define F41x_Blinky_H

void OSCILLATOR_Init(void);

void PORT_Init(void);

void Timer2_Init(int counts);

void Timer2_ISR(void);

#endif

/*------------------------------------------------------------------*-
 ----- END OF FILE -----------------------------------------------
 -*------------------------------------------------------------------*/

