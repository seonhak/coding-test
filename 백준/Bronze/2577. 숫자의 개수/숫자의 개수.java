import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str_result;
        int result = 1;
        int[] answer = new int[10];

        for(int i = 0; i < 3; i ++){
            result *= Integer.parseInt(br.readLine());
        }

        str_result = Integer.toString(result);

        for(int i = 0; i < str_result.length(); i ++){
            answer[Integer.parseInt(String.valueOf(str_result.charAt(i)))] ++;
        }

        for(int i : answer){
            bw.write(String.valueOf(i) + '\n');
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
