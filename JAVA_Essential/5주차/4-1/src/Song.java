
public class Song {
	String title;
	
	public Song() {
		title = "없음";
	}
	public Song(String _str_) {
		title = _str_;
	}
	public String getTitle() {
		return title;
	}

	
	public static void main(String[] args) {
	
	Song mySong = new Song("Nessun Dorma");
	Song yourSong = new Song("공주는 잠 못 이루고");
	System.out.println("내 노래는 " + mySong.getTitle());
	System.out.println("너 노래는 " + yourSong.getTitle());

	}



}

