public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
    	int dailyAverage = 0;
    	int monthlyAverage = 0;
    	double monthlyProfit = 0;
    	int eggCount = 0;
    	//Monday
    	eggCount+=100; //Collect 100 eggs
    	//Tuesday
    	eggCount+=121; //Collect 121 eggs
    	//Wednesday
    	eggCount+=117; //Collect 117 eggs
    	
    	//calculate Daily Average
    	dailyAverage = eggCount/3;
    	System.out.println("Daily Average:   " +dailyAverage);
    	
    	//calculate Monthly Average
    	monthlyAverage = dailyAverage*30;
    	System.out.println("Monthly Average: " +monthlyAverage);
    
    	//calculate Monthly Profit
    	monthlyProfit = monthlyAverage*0.18;
    	System.out.println("Monthly Profit:  $" +monthlyProfit);
    	
    	
    	
    	
        
        
        
        
    }
    
}
