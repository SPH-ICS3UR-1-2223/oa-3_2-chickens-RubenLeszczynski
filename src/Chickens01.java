public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        
    	
    	int totalEggs = 0;
        int eggsPerChicken = 3;
        int chickenCount = 5;
        //Monday
        totalEggs = eggsPerChicken * chickenCount;
        //Tuesday
        chickenCount++;
        totalEggs += eggsPerChicken *chickenCount;
        //Wednesday
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println(totalEggs);
      

        
        
        
        
        
    }   
}
