package mercadolivre.mercadolivre.repositories;

import mercadolivre.mercadolivre.entities.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {

    Page<Categoria> findAll(Pageable paginacao);
}
