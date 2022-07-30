package LAB;
import java.util.Scanner;

public class Pj2v3 {
	//Initialize variable for ASCII ART ITBI.			Standard   5 Rows * 15 Column				//000 000 000 000 <======= line 0
	public static int userInput    = 5;//row0        row1         row2        row3					// 0   0  0 0  0  <======= line 1 *
	public static int [][] space   = {{0,1,1,1,0},{1,3,2,1,2},{1,3,2,3,0},{0,2,2,1,0}}; 			// 0   0  00   0  <======= line 2
	public static int [][] charac  = {{3,3,3,3,0},{1,1,1,1,1},{1,1,2,1,0},{3,1,3,3,0}};				//
	public static char output      = 'X';															//000  0  000 000 <======= line 3
	public static int currentrow   = 0;
	//-------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {															
		Scanner input = new Scanner(System.in);															
		System.out.println("This is default size of ITBI");	
		
		while(!(userInput==0)) {		//print default size first then userInput.							
			for(currentrow=0;currentrow<4;currentrow++) {   
					printrow(currentrow,1);					//size 0-4
				if(currentrow==2&&userInput<5) {            //check if(printed line 2 and userInput < 5)
					printrow(1,1);							//then print line 1 again.
				}
				if(userInput%5==0||userInput>=5) {			//size >4
					printrow(currentrow,userInput/5);		//print currentrow again (userInput/5) times.
					if(currentrow==2&&userInput>=5) {		//check if(printed line 2 and userInput >=5 )
						printrow(1,(userInput/5)+1);		//print line1 n+1 times.
					}																	
				}																						
			}
			System.out.println("_______________________________________________________________________________________");
			System.out.print("Please Enter front size (1-50) OR enter 0 to exit program : ");			
			userInput = input.nextInt();					//userInput
		}	
	}	
	//method for print letter ITBI
	static void printrow(int row,int time) { 							//ch     sp
		for(int i=1;i<=time;i++) {										// |     |
			for(int col=0;col<5;col++) {								// v     v
				for(int sp=0;sp<space[row][col]*userInput;sp++) {		//000 000 000 000 <======= line 0
					System.out.print(" ");								// 0   0  0 0  0  <======= line 1
				}														// 0   0  00   0  <======= line 2
				for(int ch=0;ch<charac[row][col]*userInput;ch++) {		// 0   0  0 0  0
					System.out.print(output);							//000  0  000 000 <======= line 3
				}																							
			}System.out.println();	
		}
	}
}