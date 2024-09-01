package sample;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AssertThatCombination {
	@Test
	   public void _AllOf()
	   {
	       String tested = "(side bar)!";
	       assertThat("Many Criteria", tested, allOf(startsWith("("), 
	                                                 containsString("bar"), 
	                                                 endsWith("!")));
	   } //allOf (tem que ter todas combinações) tested tem que começar com ( conter a string "bar" e terminar com !
	 
	
	@Test
	   public void _AnyOf()
	   {
	       String tested = "does this, being a fragment, contain punctuation?";
	       assertThat("Many Criteria", tested, anyOf(containsString(","),
	                                                 containsString("."),
	                                                 containsString("!"),
	                                                 containsString("?")));
	   }//anyOf (tem que ter algumas dessas combinações) 

	   @Test
	   public void _Combination()
	   {
	       String tested = "this should avoid special characters";
	       assertThat("Negated anyOf", tested, not(anyOf(containsString(","),
	                                                     containsString("."),
	                                                     containsString("!"),
	                                                     containsString("?"))));
	   }//not(anyOf (não pode ter nenhuma dessas combinações) 
	   
	   
	   
}
