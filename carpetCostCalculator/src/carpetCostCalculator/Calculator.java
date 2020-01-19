package carpetCostCalculator;

public class Calculator {
          private floor flore;
          private Carpet Carpet;
		public Calculator(floor flore, carpetCostCalculator.Carpet carpet) {
			super();
			this.flore = flore;
			Carpet = carpet;
		}
          floor fr=new floor(30,40);
          Carpet cpt =new Carpet(2);
          
          public double getTotalCost()
          {
        	  
        	  return fr.getArea()*cpt.getCost();
        	  
        	  
          }
          
}
