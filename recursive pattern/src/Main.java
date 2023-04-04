import java.util.Scanner;

public class Main {
    static void rule(int k){
        int temp = k;
        System.out.print(temp+" ");
        while(temp >= -4){
            if(temp > 0){
            temp -= 5;
            System.out.print(temp+" ");
        }else
            break;
        }
        while(temp <= k){
            if(temp <k){
                temp += 5;
                System.out.print(temp+" ");
            }else
                break;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter an N number: ");
        n = scanner.nextInt();
        rule(n);
    }
}
