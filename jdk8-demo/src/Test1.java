
public class Test1 {
	public static void main(String[] args){
		new Thread(){
			public void run(){
				System.out.println("hello world");
			};
		}.start();
		Runnable run=()-> System.out.println("hello world");
	}
}
