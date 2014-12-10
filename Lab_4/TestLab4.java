//CS 172
//lab 4 TestLab4.java
//Written by: Jeremiah Smith
//Sept 10, 2014

public class TestLab4
{
	public static void main(String args[])
	{
		//create windturbine ibject with default values
		WindTurbine wtOne = new WindTurbine();

		//print values of wtOne
		System.out.println("Current Vaules of wtOne:");
		System.out.println(wtOne.toString());
		System.out.println();

		//change powerOutput of wtOne to 150 and print
		System.out.println("Seting wtOne's power output to 150");
		wtOne.setPowerOutput(150.0);
		System.out.println("wtOne current power ouput: " + wtOne.getPowerOutput());
		System.out.println();

		//attempt to chage the blade speed of wtOne to an unacebtable value
		System.out.println("Attempting to change wtOne's blade speed to -10");
		wtOne.setBladeSpeed(-10);
		System.out.println("The current value of wtOne's blade speed is:" + wtOne.getBladeSpeed());
		System.out.println();

		//create WindTurbine wtTwo using values of 800, 90, Vertical
		System.out.println("Creating new wind turbine wtTwo");
		WindTurbine wtTwo = new WindTurbine(800.0, 90, "Vertical");

		//print the vaules of wtTwo
		System.out.println("wtTwo's current power output: " + wtTwo.getPowerOutput());
		System.out.println("wtTwo's current blade speed: " + wtTwo.getBladeSpeed());
		System.out.println("wtTwo's current orientation: " + wtTwo.getOrientation());
		System.out.println();

		//attemp to change the value of wtTwo power output to 0
		wtTwo.setPowerOutput(0);
		System.out.println("wtTwo's power output after attempt to change: " + wtTwo.getPowerOutput());
		System.out.println();

		//attemp to change the value of orientation to Diagonal
		wtTwo.setOrientation("Diagonal");
		System.out.println("wtTwo's orientation after attempt to change: " + wtTwo.getOrientation());
		System.out.println();

		//print wtTwo with its toString method
		System.out.println("Current values of wtTwo:");
		System.out.println(wtTwo.toString());
		System.out.println();




	}
}