
public class Jungle extends Fire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jungle ref = new Jungle();
		ref.spark();	
	}
}

abstract class Fire{
	void spark(){
		System.out.println("There is spark");
	}
}

interface Trees{
	void leaves();
}
