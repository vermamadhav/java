public class Copy_Constructor {
    public static void main (String args[]){
        Student s1 = new Student() ;
        s1.name = "madhav";
        s1.age = 20 ;
        s1.password = "aaaa";
        s1.marks[0] = 100 ;
        s1.marks[1] = 90 ;
        s1.marks[2] = 80 ;

        Student s2 = new Student(s1);       // Here Copy is Done
        s2.password = "bbbb";
        s1.marks[2] = 100 ;
        for (int i = 0 ; i < 3 ; i++){
            System.out.println(s2.marks[i]);
        } 
    }
}

class Student {
    String name ; 
    int age ;
    String password ;
    int marks [] = new int [3] ;
    Student() { 
    }

    // Shallow copy constructor 
    // Student(Student s1){                      
    //     this.name = s1.name ;
    //     this.age = s1.age ;
    //     this.marks = s1.marks ;             // Here reference is share
    // }

    // Deep copy constructor 
    Student(Student s1){                      
        this.name = s1.name ;
        this.age = s1.age ;
        for(int i = 0 ; i < marks.length ; i++){
            this.marks[i] = s1.marks[i] ;
        }
    }
}
