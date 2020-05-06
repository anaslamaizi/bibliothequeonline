package bebliotheque.online.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bebliotheque.online.Entity.Books;

public interface BookRepository extends JpaRepository<Books, Long>{

}
