import java.util.Scanner;

public class Main {

	public static Contexto c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c = new Contexto();
		
		
		Bike bike = new Bike();
		Bus bus = new Bus();
		Car car = new Car();
		
		for(int i = 0; i < 5 ; i++ )
		{
			int rnd = (int)(( Math.random() * 3 ) % 3);
			
			// un usuario prefiere timpo, presupuesto o las dos
			// 0, tiempo,
			// 1, presupuesto
			// 2, ambas
			// las tres opciones tienen la misma probabilidad
			
			StringBuilder builder = new StringBuilder(rnd + "El usuario ");
			builder.append((i+1));
			builder.append(" prefiere ");

			if(rnd == 0)
			{
				builder.append(" el tiempo por sobre el presupuesto.");
				System.out.println(builder.toString());
				c.SetTeacher(car);
				c.Teach();
			}
			else if( rnd == 1)
			{
				builder.append(" el presupuesto por sobre el tiempo.");
				System.out.println(builder.toString());
				
				c.SetTeacher(bike);
				c.Teach();
			}
			else if( rnd == 2)
			{
				builder.append(" el tiempo y el presupuesto con una misma prioridad.");
				System.out.println(builder.toString());
				
				c.SetTeacher(bus);
				c.Teach();
			}
		} 
		

	    
	    
	}
	
	public void MainMethod(int n)
	{
		int getCode;
	}

}
