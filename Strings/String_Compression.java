public class String_Compression {
    public static String stringcompression (String str ){
        StringBuilder sb = new StringBuilder ("");

        for(int i = 0 ; i < str.length() ; ){
            char ch = str.charAt(i);
            i++;
            int count = 1 ;
            sb.append(ch);
            while(i < str.length() && ch == str.charAt(i)  ){
                count++;
                i++;
            }
            if (count > 1 ){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main (String args[] ){
    String str = "aaabbbcccd" ;
    // String str = "abc" ;

    System.out.println(stringcompression(str));
    }
}
