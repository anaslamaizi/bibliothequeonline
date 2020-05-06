package bebliotheque.online.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import bebliotheque.online.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}