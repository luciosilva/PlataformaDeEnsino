package entities;

public class Video extends Lesson {

	private String url;
	private int secounds;
	
	public Video (String title,String url,int secounds)
	{
		this.setTitle(title);
		this.setUrl(url);
		this.setSecounds(secounds);
	}
	
	
	@Override
	public int duration() {
		// TODO Auto-generated method stub
		return secounds;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSecounds() {
		return secounds;
	}

	public void setSecounds(int secounds) {
		this.secounds = secounds;
	}

	
	
	
}
