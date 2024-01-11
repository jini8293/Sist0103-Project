package day0111;

class Artist {

	private String group;
	private String mname;

	static String sos;
	static int cnt;

	public Artist(String group, String mname) {
		this.group = group;
		this.mname = mname;
	}

	public void getArtist() {
		cnt++;
		System.out.println("**아티스트 정보_" + cnt + "**");
		System.out.println("소속기획사: " + Artist.sos);
		System.out.println("그룹명: " + group);
		System.out.println("대표곡: " + mname);
		System.out.println("----------------------");
	}

}

public class QuizInstance_06 {

	public static void main(String[] args) {
		Artist a1 = new Artist("bts", "버터");
		Artist a2 = new Artist("뉴진스", "어텐션");

		Artist.sos = "하이브";

		a1.getArtist();
		a2.getArtist();
	}

}
