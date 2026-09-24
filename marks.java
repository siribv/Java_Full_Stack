import java.util.Scanner;
public class marks{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks:");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("5 star");

        }
        else if(marks>=80)
        {
            System.out.println("4 star");
        }
        else if(marks>=70){
            System.out.println("3 star");
        }
        else
        {
            System.out.println("avg student");
        }


    }
}