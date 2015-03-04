public class Main {
	public static void main(String[] args){
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int sum = 0;
		
		for(int x = 1; x <= 100; x++){
			sumOfSquares += Math.pow(x, 2);
			sum += x;
		}
		
		squareOfSum = (int)Math.pow(sum, 2);
		System.out.println(squareOfSum - sumOfSquares);
	}
}
