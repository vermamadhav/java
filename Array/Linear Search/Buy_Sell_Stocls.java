public class Buy_Sell_Stocls {
    public static void BuySellStocks (int arr [] ){
        int maxprofit = 0 ;
        int minbuy = arr[0] ;
        for(int i=1 ; i<arr.length ; i++){
            minbuy = Math.min(minbuy,arr[i]);
            int profit = arr[i] - minbuy ;
            maxprofit = Math.max(maxprofit , profit);
        }
        System.out.println(maxprofit);
    }
    public static void main (String args[] ){
    // int arr [] = {7,1,5,3,6,4} ;
    int arr [] = {8,6,0,2,10,7,3,2,12};

    BuySellStocks(arr);
    }
}
