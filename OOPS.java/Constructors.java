public class Constructors {
    public static void main (String args[]){
        Student s1 = new Student() ;
        Student s2 = new Student("Madhav");
        System.out.println(s2.name);
        Student s3 = new Student(19);
        System.out.println(s3.age);


    }
}

class Student {
    String name ; 
    int age ;

    Student() {                   // Non Parameterized Constructor
        System.out.println("Non Parameterized Constructor .");
    }

    Student(String name){        // Parameterized Constructor
        this.name = name ;
    }

    Student (int age){           // Parameterized Constructor
        this.age = age ;
    }

}
