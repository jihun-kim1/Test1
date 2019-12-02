
public class StudentDTO {
 
	
	private String id;
	private String name;
	private Score score;
	private Detail detail;
	
	public StudentDTO(String id, String name, Score score, Detail detail) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.detail = detail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public Detail getDetail() {
		return detail;
	}
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	
	
	
}
