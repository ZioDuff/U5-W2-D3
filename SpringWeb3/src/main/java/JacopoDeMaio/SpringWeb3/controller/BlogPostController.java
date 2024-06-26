package JacopoDeMaio.SpringWeb3.controller;


import JacopoDeMaio.SpringWeb3.entities.BlogPost;
import JacopoDeMaio.SpringWeb3.entities.BlogPostPayload;
import JacopoDeMaio.SpringWeb3.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogPostController {
//
    @Autowired
    private BlogPostService blogPostService;
//
////    GET che ritorna la lista di blogPost
//    @GetMapping // <-- qui andiamo a dirgli che con il metodo get ci ritorna tutta la lista dei blog post
//    public List<BlogPost> getAllBlogPost(){
//        return  blogPostService.getBlogPostList();
//    }
//
////    GET che ritorna un blogPost singolo
//    @GetMapping("/{blogPostId}")
//    public BlogPost findBlogPostById(@PathVariable long blogPostId){
//        return blogPostService.findById(blogPostId);
//    }
//
////    POST che serve per generare un singolo blogPost
    @PostMapping // <-- annotazione che viene intercettata durante una post
    @ResponseStatus(HttpStatus.CREATED) // <-- cambiamo il messaggio di status in questo caso 201
    public BlogPostPayload saveBlogPost(@RequestBody BlogPostPayload body){ // <-- per poter generare una post abbiamo bisogno di un body questo viene settato grazie all'apposita annotazione nel parametro
        return this.blogPostService.saveBlogPost(body);
    }
//
//    @PutMapping("/{blogPostId}")
//    public BlogPost findBlogPostByIdAndUpdate(@PathVariable long blogPostId, @RequestBody BlogPost body){
//        return blogPostService.findByIdAndUpdate(blogPostId,body);
//    }
//
//    @DeleteMapping("/{blogPostId}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void findBlogPostByIdAndDelete(@PathVariable long blogPostId){
//        blogPostService.findByIdAndDelete(blogPostId);
//    }
}
