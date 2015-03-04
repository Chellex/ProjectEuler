public class Main {
	
	static int sum = 0;
	static int nextNum = 1;
	
	public static void main(String[] args){
		sumOfEven(1,2,4000000);
		System.out.println("Sum = " + sum);
	}
	
	public static void sumOfEven(int first, int second, int max){
		if(first < max){
			if(first % 2 == 0){
				sum += first;
			}
			System.out.println(first);
			nextNum = first + second;
			sumOfEven(second, nextNum, max);
		}
	}
}
