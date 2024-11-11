import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Math's marks");
        int mathMarks=sc.nextInt(); 
        System.out.println("Enter the English's marks");
        int englishMarks=sc.nextInt(); 
        System.out.println("Enter the Hindi's marks");
        int hindiMarks=sc.nextInt(); 
        System.out.println("Enter the History's marks");
        int historyMarks=sc.nextInt(); 
        System.out.println("Enter the Computer's marks");
        int computerMarks=sc.nextInt();
        double sum=0;
        sum = mathMarks + englishMarks + hindiMarks + historyMarks + computerMarks;
        double percentage=(sum/5);
        char grade='F';
        if((percentage<60)){
            grade='E';
        }
        else if(percentage>=60 && percentage<70){
            grade='D';
        }
        else if(percentage>=70 && percentage<80){
            grade='C';
        }
        else if(percentage>=80 && percentage<90){
            grade='B';
        }
        else if(percentage>=90 && percentage<=100){
            grade='A';
        }
        System.out.println("Your Marks:"+sum);
        System.out.println("Your Average Percentage:"+percentage);
        System.out.println("Your Grade:"+grade);
    }
}
