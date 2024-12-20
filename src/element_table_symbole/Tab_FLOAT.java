package element_table_symbole;

import java.util.ArrayList;

public class Tab_FLOAT extends ID_Class
{
    int nobre_de_element;
    ArrayList<Float> element_de_tableau;

    Tab_FLOAT(int nobre_de_element,String ID)
    {
        this.ID=ID;
        this.nobre_de_element=nobre_de_element;
    }
}