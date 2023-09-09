
public class PreCalculatedValue{
	SetTariffBelow500 setTarfiffBelow500Object=new SetTariffBelow500();
	SetTariffAbove500 setTarfiffAbove500Object=new SetTariffAbove500();
	  double value101_200=100*setTarfiffBelow500Object.getU101_200();
	  double value101_400=300*setTarfiffBelow500Object.getU201_400();
	  double value201_400=200*setTarfiffBelow500Object.getU201_400();
	  double value401_500=100*setTarfiffBelow500Object.getU401_500();
	  double value501_600=100*setTarfiffAbove500Object.getUnit501_600();
	  double value601_800=200*setTarfiffAbove500Object.getUnit601_800();
	  double value801_1000=200*setTarfiffAbove500Object.getUnit801_1000();
	public double getValue101_400() {
		return value101_400;
	}
	public double getValue101_200() {
		return value101_200;
	}
	public double getValue201_400() {
		return value201_400;
	}
	public double getValue401_500() {
		return value401_500;
	}
	public double getValue501_600() {
		return value501_600;
	}
	public double getValue601_800() {
		return value601_800;
	}
	public double getValue801_1000() {
		return value801_1000;
	}
	  
}
