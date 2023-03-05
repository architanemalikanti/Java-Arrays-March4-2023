import java.util.Scanner;
class reverseOrder{
	

	public static void main(String args[]){

	Scanner input = new Scanner(System.in);
	int integers[] = new int[10];

	//get integers from the user
	for(int i = 0; i < 10; i++){

	System.out.println("please enter the "+ i+"th integer");
	integers[i] = input.nextInt();

	}

	//reverse the array

	for(int j = integers.length -1; j >=0; j--){
		System.out.println(integers[j]);
	} //end for loop #2

	}//end main



}//end class