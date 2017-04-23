package Exceptions;

import java.lang.Exception;

public class ConsumptionException extends Exception{
	public ConsumptionException(){
		super("Error: Power is negative");
	}
	
	public ConsumptionException(String message){
		super(message);
	}
}