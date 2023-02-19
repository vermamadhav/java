public class String_Builder {
    public static void stringbuilder (StringBuilder sb ){
        for(char ch = 'a' ; ch <= 'z' ; ch++){
            sb.append(ch);
        }

        System.out.println(sb) ;
        System.out.println("Length of String : " + sb.length()) ;
    }
    public static void main (String args[] ){
    StringBuilder sb = new StringBuilder ("");
    stringbuilder (sb) ;
    }
}