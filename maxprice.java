public class maxprice {
    public static void main(String[] args) {
        int[] prices = {1000,2000,3000,45000,25000};
        int max = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>max){
                max = prices[i];
            }
        }
        System.out.println("Highest Price:"+max);
    }
}
