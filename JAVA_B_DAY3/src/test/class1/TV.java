package test.class1;

public class TV {
	
	private String color;
	private int size;
	private String producer;
	private int ch, vol;
	
	public void setcolor(String color){
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	public void powerOn() {
		System.out.println(producer + "TV 전원이 켜짐");
	}
	public void powerOff() {
		System.out.println(producer + "TV 전원이 켜짐");
	}
	
	public void upCh() {
		ch++;
		System.out.println("현재 채널은 "+ch+"번");
	}
	
	public void downCh() {
		ch--;
		System.out.println("현재 채널은 "+ch+"번");
	}
	
	public void upVol() {
		vol++;
		System.out.println("현재 볼륨은 "+vol);
	}
	
	public void downVol() {
		vol--;
		System.out.println("현재 볼륨은 "+vol);
	}
	
	
	public static void main(String[] args) {

		
		//메인
	}
	
	@Override
	public String toString() {
		return "TV [color=" + color + ", size=" + size + ", producer=" + producer + ", ch=" + ch + ", vol=" + vol + "]";
	}

}
