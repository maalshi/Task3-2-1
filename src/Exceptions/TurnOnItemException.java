package Exceptions;

import java.lang.Exception;

public class TurnOnItemException extends Exception {
	
	//create my exception; will be shown when we try to use TurnedOff item
	public TurnOnItemException(){
		super("Error: Item is turned off");
	}
	
	public TurnOnItemException(String message){
		super(message);
	}

}
