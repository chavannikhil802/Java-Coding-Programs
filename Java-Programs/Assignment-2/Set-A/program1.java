/*
Define a Student class(roll number, name, percentage). Define a default and parameterized constructor.
Override the toString method. Keep a count of the objects created. Create objects using parameterized
constructor and display the object count after each object is created. Also display the contents of each object.
*/

class Student {
    int roll_number;
    String student_name;
    float student_percentage;
    public static int count = 0;

    Student() {
        roll_number = -1;
        student_name = "null";
        student_percentage = 0.0f;
    }

    Student(int rollno, String name, float percentage) {
        this.roll_number = rollno;
        this.student_name = name;
        this.student_percentage = percentage;
        count++;
    }

    public String toString() {
        return "Student Name : "+student_name
                +"\nStudent Roll Number : "+roll_number
                +"\nStudent Percentage : "+student_percentage
                +"\nStudent Count : "+count;
    }
}

class program1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Student 1", 99.99f);
        System.out.println(s1);
        System.out.println();
        Student s2 = new Student(1, "Student 2", 99.98f);
        System.out.println(s2);
        System.out.println();
        Student s3 = new Student(1, "Student 3", 99.97f);
        System.out.println(s3);
        System.out.println();
        Student s4 = new Student(1, "Student 4", 99.96f);
        System.out.println(s4);
    }
}