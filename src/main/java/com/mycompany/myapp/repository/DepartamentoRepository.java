package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Departamento;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Departamento entity.
 */
@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
    default Optional<Departamento> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<Departamento> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<Departamento> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select departamento from Departamento departamento left join fetch departamento.jefe",
        countQuery = "select count(departamento) from Departamento departamento"
    )
    Page<Departamento> findAllWithToOneRelationships(Pageable pageable);

    @Query("select departamento from Departamento departamento left join fetch departamento.jefe")
    List<Departamento> findAllWithToOneRelationships();

    @Query("select departamento from Departamento departamento left join fetch departamento.jefe where departamento.id =:id")
    Optional<Departamento> findOneWithToOneRelationships(@Param("id") Long id);
}
