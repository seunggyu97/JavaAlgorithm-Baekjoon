package Baekjoon.seunggyu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class BOJ_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < N ;i++) {
            if(CheckGroup()) {
                count++;
            }
        }
        bw.write(count+"\n");
        bw.close();
    }
    public static boolean CheckGroup() throws IOException {
        boolean[] check = new boolean[26];
        String str = br.readLine();
        int prev = 0;
        for(int i = 0; i<str.length();i++) {
            int now = str.charAt(i);
            if(prev != now) {
                if(!check[now - 'a']) {
                    check[now - 'a'] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            }
            else {
                continue;
            }
        }
        return true;
    }

}
