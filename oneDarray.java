public class oneDarray {
    public static void main(String[] args){
        int[] numbers = {11,22,33,44,55};
        System.out.println("Original Array:" + java.util.Arrays.toString(numbers));
        System.out.println("\nElement at index 2:" + numbers[2]);
        numbers[3] = 85;
        System.out.println("\nModified Array:"+ java.util.Arrays.toString(numbers));
    }
}
