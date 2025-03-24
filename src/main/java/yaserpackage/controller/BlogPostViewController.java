package yaserpackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import yaserpackage.model.BlogPost;
import yaserpackage.service.BlogPostService;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class BlogPostViewController {

    private final BlogPostService blogPostService;

    public BlogPostViewController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    // Display form to create a new post
    @GetMapping
    public String showPostForm(Model model) {
        model.addAttribute("blogPost", new BlogPost(0, null, null));
        return "posts"; // The form view for creating a blog post
    }

    // Handle form submission and save the new post
    @PostMapping
    public String handlePostForm(@ModelAttribute("blogPost") BlogPost blogPost) {
        blogPostService.save(blogPost);
        return "redirect:/posts/" + blogPost.getId(); // Redirect to the page showing the newly created post
    }

    // Show a single post by ID
    @GetMapping("/{id}")
    public String showPost(@PathVariable Long id, Model model) {
        BlogPost blogPost = blogPostService.findById(id);
        model.addAttribute("blogPost", blogPost);
        return "showPost"; // A view to display the individual post
    }
    	
    // Get all posts (this can be a list view of all blog posts)
    @GetMapping("/all")
    public String showAllPosts(Model model) {
        List<BlogPost> posts = blogPostService.findAll();
        model.addAttribute("posts", posts);
        return "allposts"; // A view to display all blog posts
    }
}
//so the posts that are created all have a unique ID and you can get them 
