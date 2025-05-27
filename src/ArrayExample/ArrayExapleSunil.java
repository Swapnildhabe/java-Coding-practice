package ArrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExapleSunil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter How many student information you want to stored ? ");
        int noOfStudents = scanner.nextInt();

        Student [] sarr = new Student[noOfStudents];

        for (int i = 0; i<noOfStudents;i++ ){
            System.out.println("Enter your Number and name for Student " +(i+1));
            int rollNumber = scanner.nextInt();
            String name = scanner.next();
            sarr[i] = new Student(rollNumber, name);
        }

        for (int i = 0;i<noOfStudents;i++){
            System.out.println(sarr[i].getRollNumber() + " - "+ sarr[i].getName());
        }









//        System.out.println("\n\n\n\n");
//
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//
//        for (int i =0; i<2;i++){
//            System.out.println(fmarks[i]);
//        }
//        System.out.println();
//        for (int i =0; i<5;i++){
//            System.out.println(carr[i]);
//        }
//        System.out.println();
//
//        int i =0;
//        while (i<4){
//            System.out.print(sName[i] + ", ");
//            i++;
//        }

    }

}
