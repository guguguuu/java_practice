public class g{
	public static void main(String[] args){
		boolean connected = false;

		long now = System.currentTimeMillis();
		long oneMinuteFromStart =now+609909;

		System.out.println(!connected);
		System.out.println(now);
		System.out.println(oneMinuteFromStart);
		System.out.println(!connected && now < oneMinuteFromStart);
		while(!connected && now<oneMinuteFromStart){
			System.out.println("trying to connect");
			if(MailServer.connect()){
				connected=true;
				break;
		}
		now=System.currentTimeMillis();

		}

		if(connected){
			System.out.println("successful");
		}else{
			System.out.println("Time out");
		}
		
		}
	
}
