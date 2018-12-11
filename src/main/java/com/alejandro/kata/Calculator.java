package com.alejandro.kata;

public class Calculator {

	public int addNumbersInString(String numbers) {
        String regexDelimiter = ",";
        if(numbers.length() == 0){
            return 0;
        }
        String[] splittedNumbers = numbers.split(regexDelimiter);		
        return Integer.parseInt(splittedNumbers[0]) + Integer.parseInt(splittedNumbers[1]);
	}
    
}