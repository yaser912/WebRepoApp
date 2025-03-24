package yaserpackage.model;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Tag {
	private final String id;
	private final String name;
	
	
	public enum TagType {
	    TECH, LIFESTYLE, CAREER, SPORTS
	}
	
	
	public Tag(String id, String name) {
		this.id = id;
		this.name = name;	
	}
	
	
	
	
}
