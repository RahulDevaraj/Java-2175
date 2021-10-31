package exercise;

public class Recording {
	String title,artist;
	int playTime;
	
		public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getPlayTime() {
		return playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	public Recording(String title, String artist, int playTime) {
		
		this.title = title;
		this.artist = artist;
		this.playTime = playTime;
	}
	@Override
	public String toString() {
		return "Recording [title=" + title + ", artist=" + artist + ", playTime=" + playTime + "]";
	}
		
		
	

}
