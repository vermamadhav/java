public class Static_Keyword {
    public static void main (String args[]){
        Students s1 = new Students();
        s1.schoolname = "RLVM";  // OR  Students.schoolname = "RLVM";   we can do this only in static variables
        
        System.out.println(s1.schoolname);       

        Students s2 = new Students();
        System.out.println(s2.schoolname);       // automatically s2 point the s1 schoolname

        Students s3 = new Students();
        s3.schoolname = "Galgotias";
        System.out.println(s3.schoolname); 
        System.out.println(s2.schoolname); 
        System.out.println(s1.schoolname);
    }
}

class Students {
    String name ;
    int roll ;
    static String schoolname ;

}