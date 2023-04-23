package homeWork;

public class StockOne {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println("profit: " + profit);
    }

    public static int maxProfit(int[] prices) {
        int price = prices[0];  //--минимальная цена
        int maxProfit = 0;      //--максимальная польза
        for (int i=0; i<prices.length; i++) {
            if (prices[i] < price){ //--Если текущая цена меньше, чем минимальная цена,
                price = prices[i];  //--то минимальная цена присваивает текущую цену
            } else {
                int profit = prices[i] - price; //---Польза = цена - минимальная цена
                maxProfit = Math.max(maxProfit, profit);    //---Извлекаю максимальный показатель
            }
        }
        return maxProfit;
    }
}
