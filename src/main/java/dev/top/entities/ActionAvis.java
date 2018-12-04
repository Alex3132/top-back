package dev.top.entities;



/*
 * 
 * { 
 * 	"avis" :"AIMER"
 * }
 * 
 */
public class ActionAvis{
	
	
public enum Action {
		AIMER,
		DETESTER;				
		}

	private Action action;

	public Action getAction() {
		return action;
	}


	public void setAction(Action action) {
		this.action = action;
	}

}
 

 
