/*
C Write a java Program to create n objects of the Student Class. Assign roll nummbers in Ascending Order.
Accept name and percentage from the user for each object. Define a Static method "sortStudent" which sorts
the array on the basis of percentage.
*/
import java.io.*;

class Student {
    int roll_number;
    String student_name;
    float student_percentage;

    Student() {
        roll_number = -1;
        student_name = "null";
        student_percentage = 0.0f;
    }

    Student(int rollno, String name, float percentage) {
        this.roll_number = rollno;
        this.student_name = name;
        this.student_percentage = percentage;
    }

    float getPercentage() {
        return this.student_percentage;
    }

    static void sortStudent(Student[] student) {
        Student temp;
        for(int i=0; i<student.length; i++) {
            for(int j=i+1; j<student.length; j++) {
                if(student[i].getPercentage() > student[j].getPercentage()) {
                    temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        System.out.println("\nList of Students after Sorting:-\n");
        for(int i=0; i<student.length; i++) {
            System.out.println(student[i]);
            System.out.println();
        }
    }

    public String toString() {
        return "Student Name : " + student_name + "\nStudent Roll Number : " + roll_number + "\nStudent Percentage : "
                + student_percentage;
    }
}

class program2 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        try {
            System.out.print("Enter the number of Students : ");
            count = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Student student[] = new Student[count];

        for (int i=0; i<count; i++) {
            try {
                System.out.println();
                System.out.print("Enter Student Name : ");
                String name = br.readLine();
                System.out.print("Enter Student percentage : ");
                float percentage = Float.parseFloat(br.readLine());

                student[i] = new Student(i+1, name, percentage);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("\nList of Students before Sorting:-\n");
        for(int i=0; i<count; i++) {
            System.out.println(student[i]+"\n");
        }
        Student.sortStudent(student);
    }
}

/* OUTPUT:- 

Enter the number of Students : 4

Enter Student Name : nikhil
Enter Student percentage : 99.99

Enter Student Name : neha
Enter Student percentage : 99.88

Enter Student Name : narendra
Enter Student percentage : 99.77

Enter Student Name : savita
Enter Student percentage : 99.66

List of Students before Sorting:-

Student Name : nikhil
Student Roll Number : 1
Student Percentage : 99.99

Student Name : neha
Student Roll Number : 2
Student Percentage : 99.88

Student Name : narendra
Student Roll Number : 3
Student Percentage : 99.77

Student Name : savita
Student Roll Number : 4
Student Percentage : 99.66


List of Students after Sorting:-

Student Name : savita
Student Roll Number : 4
Student Percentage : 99.66

Student Name : narendra
Student Roll Number : 3
Student Percentage : 99.77

Student Name : neha
Student Roll Number : 2
Student Percentage : 99.88

Student Name : nikhil
Student Roll Number : 1
Student Percentage : 99.99

*/
