
public class Singleton {

	private volatile static Singleton a=null;
	private String name;
	
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		
		if(a == null){
			a=new Singleton();
			a.name="test";
		}
	
		return a;
		
	}
	
	public String getName(){
		return name;
	}
	
	
}
