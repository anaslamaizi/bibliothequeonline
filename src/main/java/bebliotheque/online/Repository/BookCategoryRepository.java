package bebliotheque.online.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bebliotheque.online.Entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
