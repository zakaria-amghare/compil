package element_table_symbole;

import java.util.ArrayList; // Import required for ArrayList

public class For_loop extends Expression {
    int index; // Use private for encapsulation
    ArrayList<Expression> instructions; // Corrected name and type

    // Constructor
    public For_loop(int index)
    {
        this.index = index;
        this.instructions = new ArrayList<Expression>();
    }
}