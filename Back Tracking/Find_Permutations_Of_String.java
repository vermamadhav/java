public class Find_Permutations_Of_String {
    public static void FindPermutation (String str , String str1){
        if (str.length() == 0){
            System.out.println(str1);
            return ;
        }
        for(int i = 0 ; i < str.length() ; i++){
            char a = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);  // for deleting i th character from the string
            FindPermutation(newstr , str1 + a);
        }
    }
    public static void main (String args[]){
        String str = "mad";
        FindPermutation (str , "");
    }
}