package sample;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TestTheoryStarter {

 int resultado;
	
@DataPoint
public static int soma1 = 5;	
public static int soma2 = 5;

	@Theory
	public void soma(int soma1,int soma2,int resultado){
	 resultado = soma1+soma2;
	 System.out.println("Resultado " + resultado);
}
	
	
	
	
	
}
