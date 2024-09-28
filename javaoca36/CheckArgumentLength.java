class CheckArgumnetLength{
	public static void main(String[] args){
	if (args.length>3){
		System.out.println("Too many arguments!");

	}		 
	else if(args.length<3){
		System.out.println("Not enough arguments!");

	}
	else{
		System.out.println("Perfect number of arguments!");
	}	
}



}