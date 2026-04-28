public class palindromestring {
    public static void main(String[] args) {
        String s = "MALAYALAM";
        String rev = new 
        StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev)?"Palindrome":"Not Palindrome");
    }
}
