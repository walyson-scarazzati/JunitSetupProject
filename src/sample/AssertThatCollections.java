package sample;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class AssertThatCollections {

	   @Test
	   public void _CollectionContains()
	   {
	       String [] testArray = {"a", "b", "c", "d", "e"};
	       Collection<String> tested = Arrays.asList(testArray);
	       assertThat("Is the item contained", tested, hasItem("c"));
	   }  //verifica se tested tem o item c

	   @Test
	   public void _CheckCollection()
	   {
	       String [] testArray = {"a", "b", "c", "d", "e"};
	       List<String> tested = Arrays.asList(testArray);
	       assertThat("Any item meets the criteria", tested, hasItems("b", "e"));
	   } //verifica se tested tem os itens b e "e"
	   
	   @Test
	   public void _CollectionSearch()
	   {
	       String [] testArray = {"dog", "cat", "tiger", "mouse", "unicorn"};
	       Set<String> tested = new HashSet<String>(Arrays.asList(testArray));
	       assertThat("Any item meets the criteria", tested, hasItem(startsWith("uni")));
	   } //verifica se tested tem algum item que começa com uni
	   
	
}
