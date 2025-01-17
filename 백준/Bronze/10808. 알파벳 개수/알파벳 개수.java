import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        char[] word;
        word = br.readLine().toCharArray();
        int[] alphabet_num = new int[26];
        String answer = "";

        for(char c : word) {
            alphabet_num[c - 'a']++;
        }

        for(int i = 0; i < alphabet_num.length; i++) {
            bw.write(alphabet_num[i] + " ");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
