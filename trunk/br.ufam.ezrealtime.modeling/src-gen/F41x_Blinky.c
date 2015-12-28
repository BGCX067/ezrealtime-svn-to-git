//-----------------------------------------------------------------------------
// Includes
//-----------------------------------------------------------------------------
#include <c8051f410.h>

#define SYSCLK 24500000 / 64

sfr16 TMR2RL = 0xca;

sfr16 TMR2 = 0xcc;

sbit LED = P2^1;

void OSCILLATOR_Init(void) {

	OSCICN = 0x81;

}

void PORT_Init(void) {

	XBR0 = 0x00;

	XBR1 = 0x40;

	P2MDOUT = 0x02;

}

void Timer2_Init(int counts) {

	TMR2CN = 0x00;

	CKCON = 0x30;

	TMR2RL = -counts;

	ET2 = 1;

	ET2 = 1;

	TMR2 = 0xffff;

}

Timer2_ISR(void) interrupt INTERRUPT_TIMER2 {

	TF2H = 0;

	LED = ~LED;

}

/*------------------------------------------------------------------*-
 ----- END OF FILE -----------------------------------------------
 -*------------------------------------------------------------------*/

