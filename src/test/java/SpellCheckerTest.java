import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class SpellCheckerTest{


    @Test
    public void parseTest(){
        // Given
        File f = new File("letters_from_gandhi_v2.txt");
        SpellChecker sc = new SpellChecker();

        // When
        String expected = "[, but, erred, been, reqwest, paye, your, listen, without, sinceire, impertinance, " +
                "that, humenity, would, price, shunned, friend, me, from, because, state, has, wor, sake, if, you, which, reduce, " +
                "considreable, soomething, method, in, is, feeling, it, my, wryte, an, friends, whatever, uging, success, letter, apppeal," +
                " must, remein, qwuite, who, persan, however, be, for, their, worthy, worth, prevent, can, not, world, are, and, of, today, " +
                "obejct, yur, writing, have, dear, gandhi, make, a, may, deliberately, will, one, clear, i, war, appeal, k, any, m, tto," +
                " savoge, way, the, tells, appear, caclulate, forgivness, anticipate, to, resissted]";
        String actual = sc.parse(f);

        // Then
        Assert.assertEquals(expected, actual);
    }


}
