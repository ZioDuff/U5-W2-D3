package JacopoDeMaio.SpringWeb3.services;


import JacopoDeMaio.SpringWeb3.entities.BlogPost;
import JacopoDeMaio.SpringWeb3.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;



////    METODI
//
////  metodo per tornare una lista
//    public List<BlogPost> getBlogPostList(){
//        return this.blogPostList;
//    }
//
////    metodo per creare un nuovo blog post
    public BlogPost saveBlogPost(BlogPost body){

        blogPostRepository.save(body);
        return body;
    }
//
////    metodo per tornare unb singolo elemento tramite id
//    public BlogPost findById(long blogPostId){
//        BlogPost found = null;
//        for (BlogPost blogPost: this.blogPostList){
//            if (blogPost.getId() == blogPostId) found = blogPost;
//        }
//        if (found==null) throw  new NotFoundException(blogPostId);
//        else return found;
//    }
//
//    public BlogPost findByIdAndUpdate(long blogPostId, BlogPost blogPostUpdate){
//        BlogPost found = null;
//        for (BlogPost blogPost: this.blogPostList){
//            if (blogPost.getId() == blogPostId){
//                found = blogPost;
//                found.setCategoria(blogPostUpdate.getCategoria());
//                found.setCover(blogPostUpdate.getCover());
//                found.setContenuto(blogPostUpdate.getContenuto());
//                found.setTempoDiLettura(blogPostUpdate.getTempoDiLettura());
//            }
//        }
//        if (found == null) throw new NotFoundException(blogPostId);
//        else return found;
//
//    }
//
//    public void findByIdAndDelete(long blogPostId){
//        Iterator<BlogPost> iterator = this.blogPostList.iterator();
//
//        while (iterator.hasNext()){
//            BlogPost current = iterator.next();
//            if (current.getId() == blogPostId){
//                iterator.remove();
//            }
//        }
//    }
}
