package training;

public class Box {
	private int width;
	private int height;
	private int depth;
	private int volume;
	public void setwidth(int width) {
		this.width=width;
	}
	public void setheight(int height) {
		this.height=height;
	}
	public void setdepth(int depth) {
		this.depth=depth;
	}
	public Box(int width,int height,int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
		this.volume();
	}
	public int getwidth() {
		return width;
	}
	public int getheight() {
		return height;
	}
	public int getdepth() {
		return depth;
	}
 public void volume () {
	 
	volume=width*height*depth;
	//System.out.println(volume);
	 //return volume;
}
 public void disp() {
		System.out.print(volume);
		}

 
}
