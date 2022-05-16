package com.java.tasks;

import java.util.Scanner;

/**
 * @author Bekan
 * @version 13/05/2022-v.1
 */
public class Converter {

    static Scanner getInput = new Scanner(System.in);

    public static void main(String[] args) {
        StringManipulation getResults = new StringManipulation();
        System.out.println("Enter the input string");
        String inputString = getInput.nextLine();
        System.out.println("Choose the desired action: \n"+"1.Covert to small\n"+
                "2.Remove unwanted spaces\n"+"3.Replace space with underscore\n"+
                "4.Replace space with hyphen");
        int actionId = getInput.nextInt();
        switch (actionId) {
            case 1:
                System.out.println(getResults.allSmall(inputString));
                break;
            case 2:
                System.out.println(getResults.allSmallRemoveSpace(inputString));
                break;
            case 3:
                System.out.println(getResults.allSmallReplaceSpaceWithUnderscore(inputString));
                break;
            case 4:
                System.out.println(getResults.allSmallReplaceSpaceWithHyphen(inputString));
                break;

            default:
                System.out.println("Enter valid action Id");
        }
    }
}
