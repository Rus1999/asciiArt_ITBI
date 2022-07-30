package LAB;
import java.util.Scanner;

public class PJ2_nocomment {			
	public static int userInput    = 5;			
	public static int [][] space   = {{0,1,1,1,0},{1,3,2,1,2},{1,3,2,3,0},{0,2,2,1,0}}; 			
	public static int [][] charac  = {{3,3,3,3,0},{1,1,1,1,1},{1,1,2,1,0},{3,1,3,3,0}};				
	public static char output      = 'X';														
	public static int currentrow   = 0;
	public static void main(String[] args) {															
		Scanner input = new Scanner(System.in);															
		System.out.println("This is default size of ITBI");			
		
		while(!(userInput==0)) {									
			for(currentrow=0;currentrow<4;currentrow++) {
					printrow(currentrow,1);
				if(currentrow==2&&userInput<5) {
					printrow(1,1);
				}
				if(userInput%5==0||userInput>=5) {				
					printrow(currentrow,userInput/5);
					if(currentrow==2&&userInput>=5) {
						printrow(1,(userInput/5)+1);	
					}																	
				}																						
			}
			System.out.println("_______________________________________________________________________________________");
			System.out.print("Please Enter front size (1-50) OR enter 0 to exit program : ");			
			userInput = input.nextInt();	
		}	
	}		
	static void printrow(int row,int time) { 
		for(int i=1;i<=time;i++) {
			for(int col=0;col<5;col++) {								
				for(int sp=0;sp<space[row][col]*userInput;sp++) {	
					System.out.print(" ");								
				}												
				for(int ch=0;ch<charac[row][col]*userInput;ch++) {		
					System.out.print(output);							
				}																							
			}System.out.println();	
		}
	}
}