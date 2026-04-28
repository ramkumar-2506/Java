public class checkvowels {
    public static void main(String[] args) {
        char[] letters = {'a','b','c','d','e','f','g','h'};
        for(char ch:letters){
            char c = Character.toLowerCase(ch);
            if(c == 'a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println(ch+"is a vowel");
            }
        }
    }
}
