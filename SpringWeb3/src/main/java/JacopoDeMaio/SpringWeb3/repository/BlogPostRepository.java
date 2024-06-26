package JacopoDeMaio.SpringWeb3.repository;

import JacopoDeMaio.SpringWeb3.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, UUID> {
}
