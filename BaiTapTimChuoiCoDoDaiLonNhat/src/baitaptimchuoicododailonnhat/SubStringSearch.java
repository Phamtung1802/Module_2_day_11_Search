package baitaptimchuoicododailonnhat;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SubStringSearch {
    private Scanner scan;
    private String stringInput;
    public ArrayList<Character> charArr;
    public StringBuffer result, max;

    public SubStringSearch() {
        scan = new Scanner(System.in);
        charArr = new ArrayList<Character>();
        max = new StringBuffer();
        result = new StringBuffer();
        System.out.println("Input String");
        stringInput = scan.nextLine();

        for (int i = 0; i < stringInput.length(); i++) {
            charArr.add(stringInput.charAt(i));
        }
        System.out.println(charArr);
    }

    public StringBuffer returnResult() {
        int current=0;
        for (int j = 0; j < charArr.size(); j++) {
                System.out.println("loop number " + j);
                System.out.println("result= " + result);
                System.out.println("max= " + max);
                current=j;
                for (int i = j; i < charArr.size() - 1; i++) {
                    System.out.println("current= "+charArr.get(current));
                    if (Character.compare(charArr.get(current),charArr.get(i))<1) {
                        result.append(charArr.get(i));
                        current=i;
                        System.out.println("appended " + charArr.get(i));
                    }
                }
                System.out.println("result set= " + result);
                if (result.length() >= max.length()) {
                    System.out.println("correct");
                    max.delete(0, max.length());
                    max.append(result);
                    result.delete(0, result.length());
                } else {
                    result.delete(0, result.length());
            }
        }
        return max;
    }

}
