package pl.sda.calculator.numbers;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int calculateNumbers(String numbers){

        String[] arrayNumbers = numbers.split("\\+");
        int number1 = Integer.parseInt(arrayNumbers[0].trim());
        int number2 = Integer.parseInt(arrayNumbers[1].trim());

        return number1+number2;
    }


}
