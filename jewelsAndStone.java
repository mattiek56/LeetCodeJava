import java.util.Scanner;

public class Jewels {

    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        for(char j:J.toCharArray()) {
        	System.out.println(j);
        	for (char s: S.toCharArray()) {
        		System.out.println(s);
        		if (j == s) {
        			counter ++;

        		}
        	}
        }
        return counter;
    }
}

// String one = new String('aA');
// String two = new String('aaAAAbbb')
//int a = numJewelsInStones();
// System.out.println(Solution.numJewelsInStones('aA', 'aaAAAbbb'));
Jewels.result = Jewels.numJewelsInStones(aA, aaAAAbbb);