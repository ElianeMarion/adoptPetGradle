package br.com.adoptpet.dataprovider.repository;


import br.com.adoptpet.dataprovider.entities.shared.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {
    EnderecoEntity findByCep(String cep);
}
