
public class Car {
	

	private String carModel;
	private String carColor;
	public int carSpeed;

Car(String model, String color, int speed)
{
carModel = model;
carColor = color;
carSpeed = speed;
}
	public String getCarModel()
	{
	return carModel;	
	}
	public void setCarModel(String carModel) 
	{
	this.carModel = carModel;
	}

	
	public String getCarColor()
	{
	return carColor;
	}
	public void setCarColor(String carColor) 
	{
	this.carColor = carColor;
	}
	
	
	public int getCarSpeed()
	{
	return carSpeed;
	}
	public void setCarSpeed(int carSpeed)
	{
	this.carSpeed = carSpeed;
	}

public static void main(String[] args)
{
	Car test = new Car("volvo","red", 0);
	for(int x=0; x<6; x++)
	{
		System.out.println("The " + test.getCarColor() + " " + test.getCarModel()
		+ "\n has traveled " + (test.getCarSpeed()+x) + " " + "miles.");
		
		System.out.println("Now the " + test.getCarColor() + " " + test.getCarModel()
		+ "\n has traveled  " + (test.getCarSpeed()+x+1) + " " +  "miles. ");
	}
}

}
