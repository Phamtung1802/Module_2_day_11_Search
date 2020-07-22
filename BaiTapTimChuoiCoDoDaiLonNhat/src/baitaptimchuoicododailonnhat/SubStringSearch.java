package baitaptimchuoicododailonnhat;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SubStringSearch {
    private Scanner scan;
    private String stringInput;
    public ArrayList<Character> charArr;
    public StringBuffer result, max, continuousResult,maxContinuousResult;
    public SubStringSearch() {
        scan = new Scanner(System.in);
        charArr = new ArrayList<Character>();
        max = new StringBuffer();
        result = new StringBuffer();
        System.out.println("Input String");
        stringInput = scan.nextLine();
        maxContinuousResult=new StringBuffer();
        continuousResult=new StringBuffer();
        for (int i = 0; i < stringInput.length(); i++) {
            charArr.add(stringInput.charAt(i));
        }
    }

    public StringBuffer returnResult() {
        int current = 0;
        for (int j = 0; j < charArr.size(); j++) {
            current = j;
            for (int i = j; i < charArr.size(); i++) {
                if (Character.compare(charArr.get(current), charArr.get(i)) <= 1) {
                    result.append(charArr.get(i));
                    current = i;
                }
            }
            if (result.length() >= max.length()) {
                max.delete(0, max.length());
                max.append(result);
            }
            result.delete(0, result.length());
        }
        return max;
    }

    public StringBuffer returnContinuousResult() {
        for (int j = 0; j < charArr.size(); j++) {
            continuousResult.append(charArr.get(j));
            for (int i = j; i < charArr.size()-1; i++) {

                if (Character.compare(charArr.get(i), charArr.get(i+1)) <= 1) {
                    continuousResult.append(charArr.get(i+1));
                }
                else break;
            }

            if (continuousResult.length() >= maxContinuousResult.length()) {
                maxContinuousResult.delete(0, maxContinuousResult.length());
                maxContinuousResult.append(continuousResult);
            }
            continuousResult.delete(0, continuousResult.length());
        }
        return maxContinuousResult;
    }
}
