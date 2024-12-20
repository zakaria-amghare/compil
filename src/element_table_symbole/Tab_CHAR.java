package element_table_symbole;

import java.util.ArrayList;

public class Tab_CHAR extends ID_Class
{
    int nobre_de_element;
    ArrayList<Character> element_de_tableau;

    Tab_CHAR(int nobre_de_element,String ID)
    {
        this.ID=ID;
        this.nobre_de_element=nobre_de_element;
    }
}
