import java.util.Scanner;
class assigningrades{


	public static void main(String args[]){

		Scanner myObj = new Scanner(System.in);
		System.out.println("number of students: ");

		int numStudents = myObj.nextInt();

		Scanner input = new Scanner(System.in);

		int scores[] = new int[numStudents];

		for(int i = 0; i< numStudents; i++){
			//instantiate the scores array.

			System.out.println("please enter the score of student #"+i +": ");
			scores[i] = input.nextInt();


		}

		//get the best score in the scores array

		int highestScore = scores[0];

		for(int i = 0; i < scores.length; i++){

			if(scores[i] > highestScore){
				highestScore = scores[i];
			}


		}


		//for loop for assigning grades:

		for(int j = 0; j < scores.length; j++){

			if(scores[j] >= highestScore -10){

				System.out.println("Student "+ j+ " score is "+scores[j]+ " and grade is A");

			}else if(scores[j] >= highestScore -20){
				
				System.out.println("Student "+ j+ " score is "+scores[j]+ " and grade is B");

			}else if(scores[j] >= highestScore -30){

				System.out.println("Student "+ j+ " score is "+scores[j]+ " and grade is C");

			}else if(scores[j] >= highestScore -40){

				System.out.println("Student "+ j+ " score is "+scores[j]+ " and grade is D");

			}else{

				System.out.println("Student "+ j+ " score is "+scores[j]+ " and grade is F");
			}


		}







	}
	




}//end class