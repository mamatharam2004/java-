import java.util.Scanner;
class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0) {
            System.out.println("Positive");
        }
        else if(a==0) {
            System.out.println("Neutral");
        }
        else {
            System.out.println("Negative");
        
        }
    }
}