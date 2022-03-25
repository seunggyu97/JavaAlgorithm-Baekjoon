//package Baekjoon.seunggyu;
//
//import java.awt.*;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.IOException;
//import java.util.StringTokenizer;
//import java.util.Queue;
//import java.util.LinkedList;
//
//public class BOJ_1966_PrinterQueue {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Queue<int[]> q;
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int T = Integer.parseInt(st.nextToken());
//        while(T-->0){
//            q = new LinkedList<>();
//            st = new StringTokenizer(br.readLine());
//            int N = Integer.parseInt(st.nextToken());
//            int M = Integer.parseInt(st.nextToken());
//            int count = 0;
//            st = new StringTokenizer(br.readLine());
//            for(int j = 0; j<N; j++){
//                q.offer(new int[] {j, Integer.parseInt(st.nextToken())});
//            }
//        }
//    }
//}
