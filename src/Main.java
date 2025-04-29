import core.Constants;
import nfa.Problem10;
import nfa.Problem8;
import nfa.Problem9;
import nfa.Problem7;
import dfa.Problem6;
import dfa.Problem5;
import dfa.Problem4;
import dfa.Problem3;
import dfa.Problem2; 
import dfa.Problem1;   

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(Constants.INPUT_FILE));
        BufferedWriter bw = new BufferedWriter(new FileWriter(Constants.OUTPUT_FILE));
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            String answer = "";
            if (line.equals(Constants.ONE)) {
                Problem1 problem1 = new Problem1(br,bw);
            } else if (line.equals(Constants.TWO)) {
                Problem2 problem2 = new Problem2(br,bw);
            } else if (line.equals(Constants.THREE)) {
                Problem3 problem3 = new Problem3(br,bw);
            } else if (line.equals(Constants.FOUR)) {
                Problem4 problem4 = new Problem4(br,bw);
            } else if (line.equals(Constants.FIVE)) {
                 Problem5 problem5 = new Problem5(br,bw);
            } else if (line.equals(Constants.SIX)) {
                 Problem6 problem6 = new Problem6(br,bw);
            } else if (line.equals(Constants.SEVEN)) {
                Problem7 problem7 = new Problem7(br,bw);
            } else if (line.equals(Constants.EIGHT)) {
                Problem8 problem8 = new Problem8(br,bw);
            } else if (line.equals(Constants.NINE)) {
                Problem9 problem9 = new Problem9(br,bw);
            } else if (line.equals(Constants.TEN)) {
               Problem10 problem10 = new Problem10(br,bw);
            }
        }
        br.close();
        bw.close();
    }
}
