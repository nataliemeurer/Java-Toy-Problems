public class reverse_string {
    public static String reversal(String str){
        String newString = "";
        for( int i = str.length() - 1; i >= 0; i-- ){
            newString += str.charAt(i);
        }
        return newString;
    }
    public static void main(String[] args){
        System.out.println(reversal("Goodbye World!"));
    }
}
