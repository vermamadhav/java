public class Find_Subsets_Of_String {
    public static void subsets (String str , String str1 , int i){
        if (i == str.length()){
            if (str1.length() == 0){
                System.out.print("Null");
            }
            else {
                System.out.print(str1 + " ") ;
            }
            return ;
        }
        subsets (str , str1 + str.charAt(i) , i + 1);
        subsets (str , str1 , i + 1);
    }
    public static void main (String args[]){
        String str = "abc";
        String str1 = "";
        subsets (str , str1 , 0);
    }
}