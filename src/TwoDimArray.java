import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimArray {
	
	
	static int daysOfMonth = 30;
	static int employees = 20;
	
	
	public static int[] january = Database.january;
	
	
	public static int[][] plan = new int[daysOfMonth][employees];	

	public static int reference = 0;
	
	public static void fillFirstFourDays() {
		
		
	
		for(int i = 0; i< 4; i++) {
			
			
			BaseArray.randomize();
			

			
			
			for(int j = 0; j < employees; j++) {
				
				plan[i][j] = BaseArray.baseArray[j];
				
				
			}
			
			
			BaseArray.resetBaseArray();
			BaseArray.posNum = 0;
			
			
		}
		
		}
		
	
	
	public static void printFourDaysArray() {
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < employees; j++) {
				
				//System.out.print(plan[i][j] + "   ");
				
			}
			if(i< 3) {
			//System.out.println(" ");
			
			}
			
		}
		
		
	}
	
	public static void fillRestOfMonth() {
		for(int i = 4; i < daysOfMonth; i++) {
			
			reference = i;
			
			
			
		PastCounter.shiftsCounter();
		
		// Pregledava dane unazad i zbraja koliko ima smjena odradjenih
		
		PastCounter.pastCounterSorter();
		
		// sortira listu koju shiftsCounter napravi
		
		PastCounter.shifftsAssigner();
		
		// prvih 9 u sortiranoj listi dobivaju SMJENU (1)
		
//		for (int j = 0; j < employees; j++) {
//				
//				System.out.print(plan[i][j] + "   ");
//			}
//			
		
		PastCounter.arrayReseter();
		
		// resetira listu "sortedCounterList" 
		
		}
		
	}



	public static void determineWeekend() {
		// idi kroz weekend array i gdje je 1 izbroji na kojim indeksima
		//plana ima 1 i ostavi samo 3
		
		int weekendDaysCount = 0;
		
		for(int i = 0; i < january.length ; i++) {
			
			if(january[i] == 1) {
				weekendDaysCount++;
			}
		}
		
		ArrayList<Integer> weekendIndex= new ArrayList<Integer>();

		
		int [] weekendDays = new int[weekendDaysCount];
		
		
		
		for(int i = 0; i < january.length ; i++) {
			
			if(january[i] == 1) {
				weekendIndex.add(i);
				
				
				}
			}
		System.out.println( Arrays.toString(weekendIndex.toArray()) );
		
		
		
		
				
	}
	
	
	
}











