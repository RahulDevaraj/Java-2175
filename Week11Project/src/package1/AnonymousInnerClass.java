package package1;

public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		int pound  =50;
		
//		Worker wash = new Worker() {
//			
//			@Override
//			public void work() {
//				// TODO Auto-generated method stub
//				System.out.println("WAshhhh "+pound);
//				
//			}
//		};
		Worker wash = () -> {									
				// TODO Auto-generated method stub
				System.out.println("WAshhhh "+pound);						
		};
		
		
		wash.work();
	}

}
