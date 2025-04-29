package dfa;
import core.Constants;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;
import static java.util.Map.entry;

public class Problem1 {
    private int[] states;
    private int[] startState;
    private int[] finalState;
    private char[] alphabet;
    private Map<Integer, int[]> transitionTable;
    private DFA dfa;
    public Problem1(BufferedReader br , BufferedWriter bw) throws IOException {
        initProblem(bw);
        dfa.solveProblem(br,bw);
    }

    private void initProblem(BufferedWriter bw) throws IOException {
        states = new int[]{0, 1};
        startState = new int[]{0};
        finalState = new int[]{1};
        alphabet = new char[]{'a','b'};
        initTransitions();
        initDFA();
        bw.append("1").append("\n");
    }

    private void initTransitions(){
        transitionTable = Map.ofEntries(
               entry(0, new int[]{1, 0}),
               entry(1, new int[]{0, 1})
        );
    }
    private void initDFA(){
        dfa = new DFA(startState,states,finalState,alphabet,transitionTable);
    }

}

