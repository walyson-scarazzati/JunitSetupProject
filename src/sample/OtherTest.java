package sample;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Categories.class)
@IncludeCategory(OtherTest.class)
@SuiteClasses(AssertThatBasics2.class)
public class OtherTest {

}
