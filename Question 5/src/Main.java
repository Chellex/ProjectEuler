public class Main {

	public static void main(String[] args){
		int count = 0;
		
		for(int i = 1; i < 4000000000000000l; i++){
			for(int x = 1; x <= 20; x++){
				if(i % x == 0){
					count += 1;
					if(count == 20){
						System.out.println(i);
					}
				}else{
					count = 0;
				}
			}
		}
	}
}