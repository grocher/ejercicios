public class HelloWorld{
	
	private String gretting;
	public int y;

	public static int x;

	public String getGretting(){
		return this.gretting;
	}
	
	public void setGretting(String gretting){
		this.gretting = gretting;
	}

	public static void main(String args[]){
		HelloWorld hello = new HelloWorld();
		String gretting = "";
		gretting  = hello.getGretting();
		System.out.println("saludo: " + gretting);
		hello.setGretting("Hola Como estas");
		gretting  = hello.getGretting();
		System.out.println("saludo: " + gretting);
		hello.x = 2;
		System.out.println("x" + HelloWorld.x);
		hello.gretting = "LO QUE SEA";
		gretting  = hello.getGretting();
		System.out.println("saludo: " + gretting);

	}

}