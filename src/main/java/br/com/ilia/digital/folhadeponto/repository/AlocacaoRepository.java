package br.com.ilia.digital.folhadeponto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.ilia.digital.folhadeponto.model.AlocacaoModel;

@Repository
public interface AlocacaoRepository extends JpaRepository<AlocacaoModel, Long> {

}
