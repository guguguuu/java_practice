public class Pendulum{
	
		float mass;
		float length=2.0f;
		int cycles;

		float getPosition(){
			return 1.0f;
		};
	
	public static void main(String[] args)
	{
		Pendulum p=new Pendulum();
		System.out.println(p.length);
		float a=p.getPosition();
		System.out.println(a);
	
	}

	}

