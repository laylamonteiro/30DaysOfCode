import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Task
//Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
//and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's
//total cost. Round the result to the nearest integer.

//Example
//A tip of 15% * 100 = 15,
//and the taxes are 8% * 100 = 8.
//Print the value  and return from the function.

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
        double tip = (tip_percent/100.0) * meal_cost;
        double taxes = (tax_percent/100.0) * meal_cost;
        double total = meal_cost + tip + taxes;
        
        System.out.println(Math.round(total));
    }

}

public class Day2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
