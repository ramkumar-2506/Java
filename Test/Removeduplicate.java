public class Removeduplicate {
    public static void main(String[] args) {
        String s = "Tirunelveli";
        String result = "";
        for(char c:s.toCharArray()){
            if(!result.contains(String.valueOf(c)))
                result += c;
        }
        System.out.println(result);
    }
}
