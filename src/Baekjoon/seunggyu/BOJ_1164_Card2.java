package Baekjoon.seunggyu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_1164_Card2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정수 N을 입력받는다.
        int N = Integer.parseInt(st.nextToken());

        // 큐에 1부터 N까지의 수를 넣는다.
        for(int i = 1; i<N+1; i++){
            q.add(i);
        }

        // 큐에서 처음 수를 빼고, 그 다음수는 꺼낸다음 뒤로 집어넣는것을 하나의 루틴으로 잡고,
        // 이 루틴을 마지막 하나가 남을때 까지 반복한다.
        while(q.size()>1){
            q.poll();
            q.add(q.poll());
        }
        bw.write(q.poll() + "\n");
        bw.flush();
        bw.close();

    }
}
