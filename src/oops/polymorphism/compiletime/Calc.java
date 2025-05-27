package oops.polymorphism.compiletime;

// Compiletime Polymorphism --Method Overloadding
public class Calc 
{
	public void addFun(byte no1,byte no2) 
	{
		int ans = no1 + no2;
		System.out.println("Tw(byte) args addFun : " + ans);
	}

	public void addFun(short no1,short no2) 
	{
		int ans = no1 + no2;
		System.out.println("Tw(short) args addFun : " + ans);
	}
//	public void addFun(int no1,int no2) 
//	{
//		//        'a'    'b'
//		int ans = no1 + no2;
//		System.out.println("Tw(int) args addFun : " + ans);
//	}
	public void addFun(double no1,double no2) 
	{
		double ans = no1 + no2;
		System.out.println("Tw(double) args addFun : " + ans);
	}
	
	public void addFun(int no1,int no2,int no3) 
	{
		int ans = no1 + no2 + no3;
		System.out.println("Three args addFun : " + ans);
	}
	public void addFun(int no1,int no2,int no3,int no4) 
	{
		int ans = no1 + no2 + no3+no4;
		System.out.println("Four args addFun : " + ans);
	}
	public static void main(String[] args) 
	{
		Calc calc = new Calc ();
		
		calc.addFun('a','b');
	}
}
/* METHOD OVERLOADDING RULES:-
 * ----------------------------
  1. argument count 
  2. arg type excat match 
  3. type pramotion rule[ smaller---bigger] 
  
  
  Type Pramotion rule:-
--------------------

boolean---X

		byte
		  |
		short
		  |
char------------>int
		  |
		long
		  |
		float
		  |
		double	
//------------------------------------------------------------------------------

 Rules of Method Overloadding:-
 ------------------------------

		✅ 1. Method Name Must Be the Same 
		
			void display() { }
			void display(int a) { } // Valid overloading
			
  		✅ 2. Parameter List Must Be Different
  		
  			void show() { }
			void show(int a) { }         // Valid - different number of parameters
			void show(double a) { }      // Valid - different type of parameter

  		❌ 3. Return Type Alone Is Not Enough
			int add(int a, int b) { return a + b; }
			double add(int a, int b) { return a + b; } // ❌ Error – same parameter list
  
  		✅ 4. Can Change Access Modifiers
	  		public void test(int a) { }
			private void test(String s) { } // Valid	
  
  		✅ 5. Can Throw Different Exceptions
	  		void compute(int a) throws IOException { }
			void compute(double a) throws SQLException { } // Valid
  
  		✅ 6. Can Be Static or Non-Static
	  		static void print(int a) { }
			void print(String s) { } // Valid
			
		✅ 7. Overloading Can Occur in Same Class or Subclass
			class A 
			{
			    void greet(String name) { }
			}
			class B extends A 
			{
			    void greet(String name, int times) { } // Overloaded in subclass – Valid
			}	
		
 */



