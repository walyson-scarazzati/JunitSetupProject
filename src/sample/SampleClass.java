package sample;

public class SampleClass {
	  private int someNumber;
	   private String someString;

	   public SampleClass(int someNumber, String someString)
	   {
	       super();
	       this.someNumber = someNumber;
	       this.someString = someString;
	   }
	   @Override
	   public int hashCode()
	   {
	       final int prime = 31;
	       int result = 1;
	       result = prime * result + someNumber;
	       result = prime * result + ((someString == null) ? 0 : someString.hashCode());
	       return result;
	   }
	   @Override
	   public boolean equals(Object obj)
	   {
	       if (this == obj)
	           return true;
	       if (obj == null)
	           return false;
	       if (getClass() != obj.getClass())
	           return false;
	       SampleClass other = (SampleClass) obj;
	       if (someNumber != other.someNumber)
	           return false;
	       if (someString == null)
	       {
	           if (other.someString != null)
	               return false;
	       } else if (!someString.equals(other.someString))
	           return false;
	       return true;
	   }
	   public int getSomeNumber()
	   {
	       return someNumber;
	   }
	   public String getSomeString()
	   {
	       return someString;
	   }
}
