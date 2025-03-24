package yaserpackage.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import yaserpackage.model.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    // JpaRepository provides basic CRUD methods (save, findById, findAll, delete, etc.)
	
}
