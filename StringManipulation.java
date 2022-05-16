package com.java.tasks;

/**
 * @author Bekan
 * @version 13/05/2022-v.1
 */
public class StringManipulation {

    /**
     * @param allSmall
     * @return converts given string to lowercase
     */
    public String allSmall(String allSmall) {
        return allSmall.toLowerCase();
    }

    /**
     * @param noSpace
     * @return Removes all spaces in given String
     */
    public String allSmallRemoveSpace(String noSpace) {
        return noSpace.replaceAll(" ", "").toLowerCase();
    }

    /**
     * @param underscore
     * @return Replaces all the spaces with "_" character
     */
    public String allSmallReplaceSpaceWithUnderscore(String underscore) {
        return underscore.replaceAll(" ", "_").toLowerCase();
    }

    /**
     * @param hyphen
     * @return Replaces all the spaces with "-" character
     */
    public String allSmallReplaceSpaceWithHyphen(String hyphen) {
        return hyphen.replaceAll(" ", "-").toLowerCase();
    }
}
