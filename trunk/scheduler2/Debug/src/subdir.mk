################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src/main.c \
../src/parser_engine.c \
../src/pnml_parser.c 

OBJS += \
./src/main.o \
./src/parser_engine.o \
./src/pnml_parser.o 

C_DEPS += \
./src/main.d \
./src/parser_engine.d \
./src/pnml_parser.d 


# Each subdirectory must supply rules for building sources it contributes
src/%.o: ../src/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C Compiler'
	gcc -D_REENTRANT -I. -I"C:\cygwin\usr\include\libxml2" -O0 -g3 -Wall -c -fmessage-length=0 -v -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


