package Baekjoon.seunggyu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.PriorityQueue;
public class BOJ_1927 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        while(N-- >0) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0) {
                if(pq.isEmpty()) bw.write(0 + "\n");
                else bw.write(pq.poll() + "\n");
            }
            else if(input > 0) {
                pq.offer(input);
            }
        }
        bw.close();
        br.close();
    }
}
