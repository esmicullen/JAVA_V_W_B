package test.constructor2;

public class RunUSBMemory {

	public static void main(String[] args) {
		USBMemory u1 = new USBMemory(64 , "Black & Siver");
		USBMemory u2 = new USBMemory(256 , "Ruby");
		
		u1.writeUSBMemory();
		u1.readUSBMemory();
		System.out.println("=====================================");
		
	//	u2.writeUSBMemory();
		u1.readUSBMemory();
	}

}
