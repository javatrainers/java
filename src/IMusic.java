
public interface IMusic {
	public void playMusic();
	public void start();
	default void sing() {
		System.out.println("classic");
	}
}
