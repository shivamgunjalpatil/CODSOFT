import java.util.Scanner;
public class Student_Grade_calculator
{
    public static void main(String[] args) 
    {
        int total = 0;
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i = 0; i < n; i++)
        {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        percentage = total / n;
        System.out.println("total marks:"+total);
        System.out.println("Percentage:"+percentage);
        switch ((int) percentage / 10)
        {
        case 9:
            System.out.println("Grade : A+");
            break;
        case 8:
        case 7:
            System.out.println("Grade : A");
            break;
        case 6:
            System.out.println("Grade : B");
            break;
        case 5:
            System.out.println("Grade : C");
            break;
        default:
            System.out.println("Grade : D");
            break;
        }
    }
}