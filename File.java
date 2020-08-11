Public class File{
	public static void main(){
		System.out.println("Hello Java");
		//newTest();
		File f = new File();
		f.newTest();
	}
	
	public void test(String str){
		System.out.println(str+" Hello from test method");
	}

	public void newTest(){
		File f = new File();
		f.test("Hello Git");
		System.out.println(str+ "Hello from test method");
	}
}
