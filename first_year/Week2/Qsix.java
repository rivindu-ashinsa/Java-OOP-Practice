package Week2;

import java.util.*;
class Qsix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of classes held : ");
        int noOfClassesHeld = input.nextInt();
        System.out.print("Enter the number of classes attended : ");
        int noOfClassesAttended = input.nextInt();
        int attendancePercentage = (noOfClassesAttended * 100) / noOfClassesHeld;
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
        if (attendancePercentage >= 75) {
            System.out.println("You are allowed to sit in the exam");
        } else {
            System.out.print("Do you have a medical cause? (Y/N) : ");
            char medicalCause = input.next().charAt(0);
            if (medicalCause == 'Y') {
                System.out.println("You are allowed to sit in the exam");
            }

            else{
                System.out.println("You are not allowed to sit in the exam");
            }
        }
    }
}