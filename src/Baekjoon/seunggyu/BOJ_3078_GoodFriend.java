//package Baekjoon.seunggyu;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.IOException;
//import java.util.Queue;
//import java.util.LinkedList;
//import java.util.StringTokenizer;
//
//public class BOJ_3078_GoodFriend {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Queue<String> q = new LinkedList<>();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        int ans = 0;
//        // N명의 이름을 성적순으로 큐에 넣는다.
//        for(int i=0; i<N; i++){
//            q.add(br.readLine());
//        }
//
//        // 처음에 큐에서 하나를 빼고, 큐가 완전히 빌 때까지 하나씩 빼가면서 K번 뒤에 있는 이름과 길이를 비교한다.
//        // 같으면 변수 ans의 값을 1씩 늘린다.
//        while(q.size()>1){
//            int a = q.poll().length();
//            for(int i = 0; i<K; i++){
//                if(q.size()-K < 0){
//                    String name = q.poll();
//                    if(a==name.length()) ans++;
//                    break;
//                }
//                String name = q.poll();
//                if(a==name.length()) ans++;
//                q.add(name);
//                for(int j = 0; j<q.size()-K; j++){
//                    q.add(q.poll());
//                }
//            }
//        }
//        bw.write(ans + "\n");
//        bw.flush();
//        bw.close();
//    }
//}
