package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        //Anagram
        Assert.assertEquals("ARMY is anagram of MARY", "ARMY is anagram of MARY");

        //Duplicate word
        Assert.assertEquals(" word 'Java': 3 times","word 'Java': 3 times");

        //Palindrome
        Assert.assertEquals("level is a palindrome", "level is a palindrome");

        //Permutation
        Assert.assertEquals("ACB", "ACB");
    }
}