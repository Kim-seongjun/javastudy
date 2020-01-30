package main;
class Car{
	protected int gasoline; //가솔리
	public Car(int gasoline) {
		this.gasoline=gasoline;
	}
	public void showGasInfo() {
		System.out.println("gas="+gasoline);
	}
}
class HybridCar extends Car{
	private int elec; //전기
	public HybridCar(int gasoline, int elec) {
		super(gasoline);
		this.elec=elec;
	}
	public void showHybridElecCarInfo() {
		showGasInfo();
		System.out.println("elec="+elec+"kw");
		
		
	}
}


public class HybridWaterCar extends HybridCar {
    
	
	public HybridWaterCar(int gasoline, int elec, int water) {
	super(gasoline,elec);
	this.water=water;
	
	}

	private int water;
	

	public void showHybridWaterInfo() {
		showHybridElecCarInfo();
		System.out.println("water="+water+"L");
		
	}

}
