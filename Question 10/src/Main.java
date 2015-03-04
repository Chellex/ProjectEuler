public class Main {
	public static void main(String[] args){
		long sum = 0;
		for(int x = 2; x < 2000000; x++){
			if(isPrime(x)){
				sum += x;
			}
		}
		System.out.println("= " + sum);
	}
	
	public static boolean isPrime(int number){
		for(int x = 2; x <= Math.sqrt(number); x++){
			if(number % x == 0){
				return false;
			}
		}
		return true;
	}
}
