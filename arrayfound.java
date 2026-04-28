public class arrayfound {
    public static void main(String[] args) {
        int[] arr = {11,33,55,77,99};
        int target = 77;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        if(index != -1){
                System.out.println("Element Found at index:"+index);
            }
            else{
                System.out.println("Element not Found");
            }
    }
}
