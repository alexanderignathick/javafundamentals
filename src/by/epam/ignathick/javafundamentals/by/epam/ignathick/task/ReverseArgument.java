package by.epam.ignathick.javafundamentals.by.epam.ignathick.task;

import java.util.Arrays;

public class ReverseArgument {

    public ReverseArgument(String ... args){
        if (args.length == 0) {
            System.out.println("No arguments was inputed into java program");
        } else {
            System.out.println("Original arguments:" + Arrays.toString(args));
            System.out.println("Reverse arguments:");
            String reverseString = "";
            for (int i=args.length-1; i>=0; i--) {

                String originalString = args[i];

                char[] charArrat = originalString.toCharArray();
                for (int j=originalString.length()-1; j>=0;j--){
                    reverseString+=charArrat[j];
                }
                reverseString+=" ";
            }
            reverseString.trim();
            System.out.println(reverseString);
        }

    }

}
