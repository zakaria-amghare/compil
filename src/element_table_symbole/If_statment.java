package element_table_symbole;

import java.util.ArrayList;

public class If_statment extends Expression
{ 
	  ArrayList<Expression> instructions; // Corrected name and type
	    // Constructor
	    public If_statment()
	    {
	        this.instructions = new ArrayList<Expression>();
	    }
	
}
