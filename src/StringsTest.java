import org.junit.Assert;
import org.junit.Test;

public class StringsTest {
    Strings str = new Strings();
    @Test
    public void isHasAllUniqueCharactersTest()throws Exception{

        Assert.assertTrue(str.isHasAllUniqueCharacters("hola"));
        Assert.assertTrue(str.isHasAllUniqueCharacters(""));
        Assert.assertFalse(str.isHasAllUniqueCharacters("hello World"));
        Assert.assertFalse(str.isHasAllUniqueCharacters("!holla mami"));
        Assert.assertFalse(str.isHasAllUniqueCharacters("holla"));

    }

    @Test
    public void  isAPermutationTest(){
        Assert.assertFalse(str.isAPermutation("asdfghjkl;'","';lkjhgfdsaa"));
        Assert.assertTrue(str.isAPermutation("asdfghjkl;'","';lkjhgfdsa"));
        Assert.assertFalse(str.isAPermutation("asdfghjkl;'","';lkjhgfdaa"));
        Assert.assertTrue(str.isAPermutation("lahol;'","';holla"));
    }

    @Test
     public void  replaceSpacesTest(){
        Assert.assertTrue(str.replaceSpaces("Hellow world").equals("Hellow%20world"));
        Assert.assertTrue(str.replaceSpaces("a b c d e f").equals("a%20b%20c%20d%20e%20f"));
        Assert.assertFalse(str.replaceSpaces("a b c d e f").equals("a b%20c%20d%20e%20f"));
    }

    @Test
     public void  permutationOfPalindromeTest(){
        Assert.assertTrue(str.permutationOfPalindrome("aabbccddeef"));
        Assert.assertTrue(str.permutationOfPalindrome("abcdcba"));
        Assert.assertFalse(str.permutationOfPalindrome("abcdeeabcdzG"));
        Assert.assertTrue(str.permutationOfPalindrome("abCdeeabcdz"));
        Assert.assertFalse(str.permutationOfPalindrome("abcdeeabcG"));
    }
    @Test
     public void  isOnlyOnEditTest(){
        Assert.assertTrue(str.isOnlyOnEdit("pale", "ple"));
        Assert.assertTrue(str.isOnlyOnEdit("pale","bale"));
        Assert.assertTrue(str.isOnlyOnEdit("pales","pale"));
        Assert.assertFalse(str.isOnlyOnEdit("pale","bake"));
        Assert.assertFalse(str.isOnlyOnEdit("paless","bake"));
    }




}
