package dfa;
import core.Constants;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;
import static java.util.Map.entry;

public class Problem3 {
    private int[] states;
    private int[] startState;
    private int[] finalState;
    private char[] alphabet;
    private Map<Integer, int[]> transitionTable;
    private DFA dfa;
    public Problem3(BufferedReader br , BufferedWriter bw) throws IOException {
        initProblem(bw);
        dfa.solveProblem(br,bw);
    }

    private void initProblem(BufferedWriter bw) throws IOException {
        states = new int[]{0, 1};
        startState = new int[]{0};
        finalState = new int[]{3};
        alphabet = new char[]{'x','y','z'};
        initTransitions();
        initDFA();
        bw.append("3").append("\n");
    }

    private void initTransitions(){
        transitionTable = Map.ofEntries(
               entry(0, new int[]{1, 0, 0}),
               entry(1, new int[]{0, 2, 0 }),
               entry(2, new int[]{1, 0, 3}),
               entry(3, new int[]{3, 3, 3})
        );
    }
    private void initDFA(){
        dfa = new DFA(startState,states,finalState,alphabet,transitionTable);
    }

}

