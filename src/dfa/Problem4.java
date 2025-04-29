package dfa;
import core.Constants;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;
import static java.util.Map.entry;

public class Problem4 {
    private int[] states;
    private int[] startState;
    private int[] finalState;
    private char[] alphabet;
    private Map<Integer, int[]> transitionTable;
    private DFA dfa;
    public Problem4(BufferedReader br , BufferedWriter bw) throws IOException {
        initProblem(bw);
        dfa.solveProblem(br,bw);
    }

    private void initProblem(BufferedWriter bw) throws IOException {
        states = new int[]{0, 1, 2, 3, 4, 5, 6};
        startState = new int[]{0};
        finalState = new int[]{0};
        alphabet = new char[]{'0','1'};
        initTransitions();
        initDFA();
        bw.append("4").append("\n");
    }

    private void initTransitions(){
        transitionTable = Map.ofEntries(
               entry(0, new int[]{0, 1}),
               entry(1, new int[]{2, 3}),
               entry(2, new int[]{4, 5}),
               entry(3, new int[]{6, 0}),
               entry(4, new int[]{1, 2}),
               entry(5, new int[]{3, 4}),
               entry(6, new int[]{5, 6})
        );
    }
    private void initDFA(){
        dfa = new DFA(startState,states,finalState,alphabet,transitionTable);
    }

}

