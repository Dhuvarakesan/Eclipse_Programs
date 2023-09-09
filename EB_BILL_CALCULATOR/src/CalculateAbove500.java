
public class CalculateAbove500 {
	PreCalculatedValue precalculatedvalueobject=new PreCalculatedValue();
	SetTariffAbove500 settariffabove500object=new SetTariffAbove500();
	public double calculate(int unit) {
   	 double amount=0;
   	 if(unit>100&&unit<=400)
   		amount=below400(unit);
   	 else if(unit>400&&unit<=500)
   		amount=below500(unit);
   	 else if(unit>500&&unit<=600)
   		 amount=below600(unit);
   	 else if(unit>600&&unit<=800)
   		amount=below800(unit);
   	 else if(unit>800&&unit<=1000)
   		amount=below1000(unit);
   	 return amount;
    }
     double below400(int unit) { 
    	 return (unit-100)*settariffabove500object.getUnit101_400();
     }
     double below500(int unit) {
    	 return precalculatedvalueobject.getValue101_400()+(unit-400)*settariffabove500object.getUnit401_500();
     }
     double below600(int unit) {
    	 return precalculatedvalueobject.getValue101_400()+precalculatedvalueobject.getValue401_500()+(unit-500)*settariffabove500object.getUnit501_600();
     }
     double below800(int unit) {
    	 return precalculatedvalueobject.getValue101_400()+precalculatedvalueobject.getValue401_500()+precalculatedvalueobject.getValue501_600()+(unit-600)*settariffabove500object.getUnit601_800();
     }
     double below1000(int unit) {
    	 return precalculatedvalueobject.getValue101_400()+precalculatedvalueobject.getValue401_500()+precalculatedvalueobject.getValue501_600()+precalculatedvalueobject.getValue601_800()+(unit-800)*settariffabove500object.getUnit801_1000();
     }

}
