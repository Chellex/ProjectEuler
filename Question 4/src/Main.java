public class Main {

	static int highest = 0, prevHighest = 500;
	
	public static void main(String[] args){
		for(int x = 999; x > 0; x--){
			for(int y = 999; y > 0; y--){
				if(multiply(x,y).equals(flip(multiply(x,y)))){
					highest = Integer.parseInt(multiply(x,y));
					
					if(highest > prevHighest){
						prevHighest = highest;
		}}}}
		System.out.println(prevHighest);
	}
	
	public static String multiply(int number1, int number2){
		return Integer.toString(number1 * number2);
	}

	public static String flip(String array){
		StringBuilder builder = new StringBuilder();
		for(int x = array.length() - 1; x > -1; x--){
			builder.append(array.charAt(x));
		}
		return builder.toString();
	}
}