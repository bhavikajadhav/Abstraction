package Abstract;

public abstract  class Instagram extends SocialMedia{

	@Override
	public void sendMessage() {
		System.out.println("Send Message Available in version1");
	}

	@Override
	public void receiveMessage() {
		System.out.println("Recieve Message Available in version1");
	}



}
