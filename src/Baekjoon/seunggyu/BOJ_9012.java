package Baekjoon.seunggyu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;;
import java.util.StringTokenizer;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        whileloop:
        while(T-- > 0){
            String str = br.readLine();

            stack.clear(); // 초기화를 안시켜주니까 틀렸다고,,,,ㅠ ㅠ

            for(int i = 0; i< str.length(); i++) {
                if (str.charAt(i) == '(') {
                    stack.push('(');
                }
                else{
                    if(stack.isEmpty()){
                        bw.write("NO"+ "\n");
                        continue whileloop;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty()){
                bw.write("YES" + "\n");
            }
            else{
                bw.write("NO" + "\n");

            }
        }
        bw.flush();
        bw.close();
    }
}
