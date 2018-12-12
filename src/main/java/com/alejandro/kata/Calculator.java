package com.alejandro.kata;

public class Calculator {

	public int addNumbersInString(String numbers) {
        String regexDelimiter = "[,\n]";
        if(numbers.length() == 0){
            return 0;
        }
        String[] splittedNumbers = numbers.split(regexDelimiter);

        Integer sum = 0;
        for(int i=0; i < splittedNumbers.length; i++){
            sum += Integer.parseInt(splittedNumbers[i]);
        }
        return  sum;
	}

}