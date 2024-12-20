package element_table_symbole;

public class Affectation extends Expression
{
ID_Class var;
int intVallue;
float floatVallue;
char charVallue;

public Affectation(ID_Class Id,int intVallue) 
{
	this.var=Id;
	this.intVallue=intVallue;
}

public Affectation(ID_Class Id,float floatVallue) 
{
	this.var=Id;
	this.floatVallue=floatVallue;
}

public Affectation(ID_Class Id,char charVallue) 
{
	this.var=Id;
	this.charVallue=charVallue;
}

}
