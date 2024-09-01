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
	       assertThat("Anything passes", tested, anything(check)); // neste caso "Olá matcher lógica", e dizemos, hey, assertThat anything é verdadeiro. Não importa qual é o valor, apenas alguma coisa lá dentro vai funcionar perfeitamente bem
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
	       assertThat("Is it not null?", tested, notNullValue()); //verifica se o valor de tested não esta nulo
	   }
	   
	   @Test
	   public void _EqualTo()
	   {
	       String tested = "equals";
	       String check = "equals";
	       assertThat("Are they equals?", tested, equalTo(check)); //verifica se o valor de tested é igual o valor de check 
	       assertThat("Are they equals?", tested, is(check)); //verifica se o valor de tested é igual o valor de check 
	   }

	   @Test
	   public void _NotEqualTo()
	   {
	       String tested = "separate";
	       String check = "equals";
	       assertThat("They are not equal", tested, not(check)); //verifica se o valor de tested é diferente o valor de check 
	   }
	   
	   @Test
	   public void _Same()
	   {
	       SampleClass first = new SampleClass(3, "same"); //verifica se countéudo same esta igual a first
	       SampleClass same = first;
	       assertThat("==?", first, sameInstance(same));
	       assertThat("==?", first, theInstance(same));
	   }
	   
	   @Test
	   public void _InstanceOf()
	   {
	       String tested = "Excited!";
	       assertThat("Is instanceof?", tested, instanceOf(Serializable.class));  //verifica se countéudo tested esta diferente de Serializable.class
	       assertThat("Is a?", tested, isA(Serializable.class));
	   }

	   @Test
	   public void _ContainsString()
	   {
	       String tested = "Hello matcher logic";
	       String check = "matcher";
	       assertThat("Does it contain a string?", tested, containsString(check)); //verifica se o conteúdo (string) de check está em tested
	   }
	   

	   @Test
	   public void _StartsWith()
	   {
	       String tested = "(side bar)";
	       String check = "(";
	       assertThat("Starts with?", tested, startsWith(check));  //verifica se o conteúdo (string) de check começa em tested
	   }
	   
	   @Test
	   public void _EndsWith()
	   {
	       String tested = "Excited!";
	       String check = "!";
	       assertThat("Ends with?", tested, endsWith(check));  //verifica se o conteúdo (string) de check termina em tested
	   }

	   @Test
	   public void _Negation()
	   {
	       String tested = "Neutral";
	       String check = "!";
	       assertThat("Negation", tested, not(endsWith(check))); //verifica se o conteúdo (string) de check não está em tested
	   }
	   
	   

}
