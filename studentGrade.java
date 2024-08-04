import java.util.Scanner;
public class studentGrade {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no. of subjects: ");
        int subjects=s.nextInt();

        int tMarks=0;
        for(int i=1;i<=subjects;i++) {
            System.out.println("Enter the marks in subject "+i+" ");
            int marks=s.nextInt();
            tMarks+=marks;
        }

        double avgPercent=tMarks/subjects;
        char grade;
        if (avgPercent>=90) {
            grade='A';
        } else if (avgPercent>=75) {
            grade='B';
        } else if (avgPercent>=60) {
            grade='C';
        } else if (avgPercent>=50) {
            grade='D';
        } else if (avgPercent>=40) {
            grade='P';
        } else if (avgPercent<40) {
            grade='F';
        } else {
            grade='X';
        }
        System.out.println("------------------------");
        System.out.println("Total Marks: "+tMarks);
        System.out.println("Average percentage: "+avgPercent);
        System.out.println("Grade:" + grade);
    }
}
