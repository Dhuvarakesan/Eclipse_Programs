
public class CalculateBelow500{
	PreCalculatedValue precalculatedvalueobject=new PreCalculatedValue();
	SetTariffBelow500 setTarfiffBelow500Object=new SetTariffBelow500();
	public double calculate(int unit) {
    	 double amount=0;
    	 if(unit>100&&unit<=200)
    		amount=below200(unit);
    	 else if(unit>200&&unit<=400)
    		amount=below400(unit);
    	 else if(unit>400&&unit<=500)
    		 amount=below500(unit);
    	 return amount;
     }
      double below200(int unit) { 
    	return (unit-100)*setTarfiffBelow500Object.getU101_200();
      }
      double below400(int unit) {
        return precalculatedvalueobject.getValue101_200()+((unit-200)*setTarfiffBelow500Object.getU201_400());
      }
      double below500(int unit) {
        return precalculatedvalueobject.getValue101_200()+ precalculatedvalueobject.getValue201_400()+(unit-400)*setTarfiffBelow500Object.getU401_500();
      }
      
}
