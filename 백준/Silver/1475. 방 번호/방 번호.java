import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        char[] room_num = new char[s.length()];
        int answer = 1;

        for (int i = 0; i < room_num.length; i++) {
            room_num[i] = s.charAt(i);
        }

        int[] num = new int[10];

        for(int i = 0; i < room_num.length; i++) {
            num[Integer.parseInt(String.valueOf(room_num[i]))] ++;
        }

        int sum = num[6] + num[9];
        if(sum % 2 == 0){
            num[9] = num[6] = sum/2;
        }else {
            num[9] = num[6] = (sum / 2) + 1;
        }


        for(int i = 0; i < num.length; i++){
            if(answer < num[i]){
                answer = num[i];
            }
        }

        System.out.println(answer);
    }
}
