public class Stringbuilderdmo {
    public static void main(String[] args) {
        StringBuilder A = new StringBuilder("Ram");
        A.append("kumar");
        System.out.println("After append:"+A);
        A.insert(4,"(Rk)");
        System.out.println("After insert:"+A);
        A.replace(4,6," ");
        System.out.println("After Replace:"+A);
        A.reverse();
        System.out.println("After Reverse:"+A);
    }
}
