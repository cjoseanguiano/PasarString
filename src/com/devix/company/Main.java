package com.devix.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String numString = "12";
        System.out.println("numString " + numString);

        long numLong = Long.parseLong(numString);
        System.out.println("numLong " + numString);

        int numInt = Integer.parseInt(numString);
        System.out.println("numInt " + numString);

        short numShort = Short.parseShort(numString);
        System.out.println("numShort " + numString);

        byte numByte = Byte.parseByte(numString);
        System.out.println("numByte " + numString);

        double numDouble = Double.parseDouble(numString);
        System.out.println("numDouble " + numString);

        float numFloat = Float.parseFloat(numString);
        System.out.println("numFloat " + numString);

    }
}
