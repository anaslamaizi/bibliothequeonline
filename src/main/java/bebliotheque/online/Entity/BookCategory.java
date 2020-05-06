package bebliotheque.online.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "tbl_category")
@Setter
@Getter
@ToString
public class BookCategory {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Getter @Setter private Long id;
   
   @Column(name ="category_name")
   @Getter @Setter private String categoryName;
   
   @OneToMany(cascade = CascadeType.ALL , mappedBy = "category")
   @Getter @Setter private Set<Book> book;
   
   
}
