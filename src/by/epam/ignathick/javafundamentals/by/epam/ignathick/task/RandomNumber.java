package by.epam.ignathick.javafundamentals.by.epam.ignathick.task;

import java.util.Random;

public class RandomNumber {

    private int numbersCount;
    private int randomRange;

    public RandomNumber(int numbersCount, int randomRange){
        this.numbersCount = numbersCount;
        this.randomRange = randomRange;
        printRandomValues();
    }

    private int getRandomValueInRange(int range){
        range = range>0?range:-range;
        int min = 0;
        int max = range;
        return new Random().nextInt((max - min) + 1) + min;
    }

    private void printRandomValues(){
        System.out.println("Generated " + this.numbersCount + "numbers are:" );
        for (int i=0; i<numbersCount; i++){

            System.out.print(" " + getRandomValueInRange(this.randomRange));
            if (getRandomValueInRange(1) == 1) {
                System.out.print("\n");
            }
        }
        System.out.println();
    }

}
