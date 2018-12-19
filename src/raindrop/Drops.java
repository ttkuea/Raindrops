package raindrop;

public class Drops{
	private Drop[] drops;
	
	public Drops() {
		drops = new Drop[400];
		for (int i = 0; i < drops.length; ++i) {
			drops[i] = new Drop();
		}
	}
	
	public void update() {
		for (int i = 0; i < drops.length; ++i) {
			drops[i].update();
		}
	}
	
	public Drop[] getDrops(){
		return  drops;
	}
}
