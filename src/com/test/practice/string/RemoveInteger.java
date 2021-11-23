package com.test.practice.string;

public class RemoveInteger {


    public static void main(String[] args) {
        String name = "qwerty12poi89oi";

        System.out.println(checkInt(name));
        /*char checkInt[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < name.length(); i++) {

            for (int j = 0; j < checkInt.length; j++) {
                if (name.charAt(i) == checkInt[j])
                    temp += checkInt[j];// temp=temp+checkInt[j]
            }

        }*/
    }

    private static String checkInt(String str) {
        String temp = "";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i)))
                temp+=str.charAt(i);
        }
        return temp;
    }

}
