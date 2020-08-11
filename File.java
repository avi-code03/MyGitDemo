Public class{
	public static void main(){
		System.out.println("Hello Java");
	}
	
	public void test(String str){
		System.out.println(str+ "Hello from test method");
	}

	public void newTest(){
		test();
		System.out.println("Hello from newTest method");
	}
}