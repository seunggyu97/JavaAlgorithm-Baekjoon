package Baekjoon.seunggyu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//
public class BOJ_11866_Josephus {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        sb.append("<");

        // 큐에 1부터 N까지의 수를 차례로 집어넣는다.
        for(int i = 1; i<N+1; i++){
            q.add(i);
        }

        // 큐에서 K번째 존재하는 수는 StringBuilder에 넣어둔다.
        // 이 외에는 큐에서 꺼낸다음 다시 큐에 집어넣는다.
        // 이 과정을 큐가 빌때까지 반복한다.
        while(!q.isEmpty()) {
            for (int i = 1; i < K; i++) {
                q.add(q.poll());
            }
            sb.append(q.poll());
            if(!q.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");

        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }
}

