class linearsearch{
	

	public static void main(String args[]){

	int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int key = 5;


	for(int i = 0; i < list.length; i++){

	if(list[i] == key){
		System.out.println(i);
	}
	
	}//end for

	}//end main

	}//end class
	

//linear search is inefficient for a large array
