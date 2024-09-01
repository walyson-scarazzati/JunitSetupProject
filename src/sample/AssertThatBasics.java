package sample;

import java.io.Serializable;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


public class AssertThatBasics {
	   @Test
	   public void _Anything()
	   {
	       String tested = "Hello matcher logic";
	       String check = "matcher";
	       assertThat("Anything passes", tested, anything(check)); // neste caso "Ol� matcher l�gica", e dizemos, hey, assertThat anything � verdadeiro. N�o importa qual � o valor, apenas alguma coisa l� dentro vai funcionar perfeitamente bem
	   }

	   @Test
	   public void _Null()
	   {
	       String tested = null;
	       assertThat("Is it null?", tested, nullValue()); // verifica se o valor de tested esta nulo
	   }

	   @Test
	   public void _NotNull()
	   {
	       String tested = "";
	       assertThat("Is it not null?", tested, notNullValue()); //verifica se o valor de tested n�o esta nulo
	   }
	   
	   @Test
	   public void _EqualTo()
	   {
	       String tested = "equals";
	       String check = "equals";
	       assertThat("Are they equals?", tested, equalTo(check)); //verifica se o valor de tested � igual o valor de check 
	       assertThat("Are they equals?", tested, is(check)); //verifica se o valor de tested � igual o valor de check 
	   }

	   @Test
	   public void _NotEqualTo()
	   {
	       String tested = "separate";
	       String check = "equals";
	       assertThat("They are not equal", tested, not(check)); //verifica se o valor de tested � diferente o valor de check 
	   }
	   
	   @Test
	   public void _Same()
	   {
	       SampleClass first = new SampleClass(3, "same"); //verifica se count�udo same esta igual a first
	       SampleClass same = first;
	       assertThat("==?", first, sameInstance(same));
	       assertThat("==?", first, theInstance(same));
	   }
	   
	   @Test
	   public void _InstanceOf()
	   {
	       String tested = "Excited!";
	       assertThat("Is instanceof?", tested, instanceOf(Serializable.class));  //verifica se count�udo tested esta diferente de Serializable.class
	       assertThat("Is a?", tested, isA(Serializable.class));
	   }

	   @Test
	   public void _ContainsString()
	   {
	       String tested = "Hello matcher logic";
	       String check = "matcher";
	       assertThat("Does it contain a string?", tested, containsString(check)); //verifica se o conte�do (string) de check est� em tested
	   }
	   

	   @Test
	   public void _StartsWith()
	   {
	       String tested = "(side bar)";
	       String check = "(";
	       assertThat("Starts with?", tested, startsWith(check));  //verifica se o conte�do (string) de check come�a em tested
	   }
	   
	   @Test
	   public void _EndsWith()
	   {
	       String tested = "Excited!";
	       String check = "!";
	       assertThat("Ends with?", tested, endsWith(check));  //verifica se o conte�do (string) de check termina em tested
	   }

	   @Test
	   public void _Negation()
	   {
	       String tested = "Neutral";
	       String check = "!";
	       assertThat("Negation", tested, not(endsWith(check))); //verifica se o conte�do (string) de check n�o est� em tested
	   }
	   
	   

}
