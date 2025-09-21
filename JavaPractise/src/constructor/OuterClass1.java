package constructor;

import constructor.OuterClass.InnerClass;

public class OuterClass1 {
	
		public static void main(String args[])
		{
			OuterClass myOuter = new OuterClass();
			OuterClass.InnerClass myInner = myOuter.new InnerClass();
			System.out.println(myInner.y + myOuter.x);
		}
		
	}


