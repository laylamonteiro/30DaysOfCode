import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        int evenOrOdd = N % 2;

        if (evenOrOdd != 0 || 20 >= N && N >= 6) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        bufferedReader.close();
    }
}
