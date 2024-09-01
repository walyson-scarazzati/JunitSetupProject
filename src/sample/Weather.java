package sample;

public class Weather {
	
		   private int answer;
		   
		   public boolean willItRainToday()
		   {
		       return answer % 2 == 0;
		   }
		   
		   public boolean isItSunnyToday()
		   {
		       return answer % 3 == 0;
		   }
		   
		   public boolean isItFreezingToday()
		   {
		       return answer % 5 == 3;
		   }
		    
		   public Weather(int answer)
		   {
		       super();
		       this.answer = answer;
		   }
}
