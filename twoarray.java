public class twoarray {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3,4},{5,6,7,8}};
        System.out.println(numbers[1][1]);
        System.out.println(numbers[0][2]);
        numbers[0][2]=11;
        System.out.println(numbers[0][2]);
    }
}
