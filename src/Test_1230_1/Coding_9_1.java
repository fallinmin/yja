package Test_1230_1;
//미완성 잘모르겠음
public class Coding_9_1 {
	private String movie_name;
	private String movie_RunTime;
	private String movie_actor;
	
	
	public String getMovie_RunTime() {
		return movie_RunTime;
	}
	public void setMovie_RunTime(String movie_RunTime) {
		this.movie_RunTime = movie_RunTime;
	}
	public String getMovie_actor() {
		return movie_actor;
	}
	public void setMovie_actor(String movie_actor) {
		this.movie_actor = movie_actor;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	
}
class Movie_info extends Coding_9_1{

}

class Movie_actor extends Movie_info{

	@Override
	public void setMovie_actor(String movie_actor) {
		// TODO Auto-generated method stub
		super.setMovie_actor("메간 폭스");

	}
	
	
}

class Play{
	
	public static void mo() {
		Movie_info a = new Movie_info();
		Movie_actor b = new Movie_actor();
		System.out.println(a.getMovie_name());
		System.out.println(a.getMovie_RunTime());
		System.out.println(b.getMovie_actor());
	}
	
	
}

