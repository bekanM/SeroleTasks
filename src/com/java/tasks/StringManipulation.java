package com.java.tasks;

/**
 * @author Bekan
 * @version 13/05/2022-v.1
 */
public class StringManipulation {


    public String allSmall(String allSmall) {
        return allSmall.toLowerCase();
    }


    public String allSmallRemoveSpace(String noSpace) {
        return noSpace.replaceAll(" ", "").toLowerCase();
    }


    public String allSmallReplaceSpaceWithUnderscore(String underscore) {
        return underscore.replaceAll(" ", "_").toLowerCase();
    }


    public String allSmallReplaceSpaceWithHyphen(String hyphen) {
        return hyphen.replaceAll(" ", "-").toLowerCase();
    }
}
