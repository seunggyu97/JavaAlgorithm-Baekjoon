package Baekjoon.seunggyu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.io.IOException;

public class BOJ_11899 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i = 0; i<S.length(); i++) {
            if(S.charAt(i) == '(') {
                stack.push('(');
            }
            else {
                if(stack.size() == 0) {
                    count++;
                }
                else {
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()) {
            count += stack.size();
        }
        bw.write(count + "\n");
        bw.close();
    }
}