package yaserpackage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yaserpackage.model.BlogPost;
import yaserpackage.repository.BlogPostRepository;

@Service
public class BlogPostService {

	 private final BlogPostRepository blogPostRepository;
	 	
	 	@Autowired
	    public BlogPostService(BlogPostRepository blogPostRepository) {
	        this.blogPostRepository = blogPostRepository;
	    }

	    public void save(BlogPost blogPost) {
	        blogPostRepository.save(blogPost); // Save to database or repository
	    }

	    // Find a blog post by its ID
	    public BlogPost findById(Long id) {
	        Optional<BlogPost> blogPost = blogPostRepository.findById(id);
	        return blogPost.orElse(null);  // Return the blog post if found, or null if not
	    }

		public List<BlogPost> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
}
