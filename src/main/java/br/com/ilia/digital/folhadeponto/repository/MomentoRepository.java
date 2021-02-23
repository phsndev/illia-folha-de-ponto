package br.com.ilia.digital.folhadeponto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.ilia.digital.folhadeponto.model.MomentoModel;

@Repository
public interface MomentoRepository extends JpaRepository<MomentoModel, Long>{

}
