public class Nissan implements ICar,IMusic{
	public void sing() {
		System.out.println("traditional");
	}
	public void drive() {
		System.out.println("nissan driving");
	} 
	public void start(){
		System.out.println("Nissan starting car");
	}
	public void playMusic() {
		System.out.println("play music");
	}
	public void takeTurn(int a) {
		System.out.println("turning left");
	}
	public void takeTurn(String s) {
		System.out.println("turning right");
		
	}
	
}
