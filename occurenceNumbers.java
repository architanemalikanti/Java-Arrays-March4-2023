import java.util.Scanner;
class occurenceNumbers{
	

	public static void main(String args[]){


	Scanner input = new Scanner(System.in);
	int numOfIntegers;
	

	//get the number of integers from the user
	System.out.println("how many integers will u enter? ");
	numOfIntegers = input.nextInt();

	int integers[] = new int[numOfIntegers];


	//get integers from the user
	for(int j = 0; j < numOfIntegers; j++){

	System.out.println("please enter the "+ j+"th integer");
	integers[j] = input.nextInt();

	}

	//check how many times each number occurs. 
	int occurence;

	for(int i = 0; i < integers.length; i++){

		occurence = 0;

	//how many times does integers[i] occur?

		for(int p = 0; p < integers.length; p++){

			if(integers[p] == integers[i]){

				occurence++;

			}

		}

		if(occurence == 1){

			System.out.println("the occurence of "+integers[i]+" is "+occurence+" time.");
		
		}else{

			System.out.println("the occurence of "+integers[i]+" is "+occurence+" times.");

		} 

	}//end for


}
}