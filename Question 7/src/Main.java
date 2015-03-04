public class Main {

	public static void main(String[] args){
		int count = 0;
		
		for(int x = 2; x < 4000000; x++){
			if(isPrime(x)){
				count += 1;
				if(count == 10001){
					System.out.println(x);
					System.exit(0);
				}
			}
		}
	}
	
	public static boolean isPrime(long number){
		for(int x = 2; x < number; x++){
			if(number % x == 0){
				return false;
			}
		}
		return true;
	}
}
