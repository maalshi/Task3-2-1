package Exceptions;

import java.lang.Exception;

public class PowerException extends Exception{
	
	public PowerException(){
		super("Error: Power is negative");
	}
	
	public PowerException(String message){
		super(message);
	}
}