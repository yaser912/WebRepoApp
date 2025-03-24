package yaserpackage.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class BlogPost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	private String title;
    private String content;
    //private List<String> tags; // Selected tag IDs
    
    public BlogPost() {
    	
    }
   
    public BlogPost(long id, String title, String content) {
    	this.ID = id;
    	this.title = title;
    	this.content = content;
    }

    //getters and setters
	public long getId() {return this.ID;}
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    
    
}
