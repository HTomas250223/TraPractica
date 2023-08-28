package epeu.edu.example.mscatalogo.repository;
import epeu.edu.example.mscatalogo.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
