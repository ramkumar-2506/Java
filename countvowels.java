public class countvowels {
    public static void main(String[] args) {
        String s = "Ram";
        int count = 0;
        for(char ch:s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1)
                count++;
        } 
        System.out.println("vowels:"+count);
    }
}
