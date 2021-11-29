
package br.com.treinaweb.springbootapiexemplo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.treinaweb.springbootapiexemplo.entity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}