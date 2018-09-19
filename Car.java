
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
	
}

}
