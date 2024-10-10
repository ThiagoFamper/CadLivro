package br.edu.famper.cadlivro.repository;

import br.edu.famper.cadlivro.model.Livro;
import org.springframework.data.repository.CrudRepository;

public interface LivroRepository extends CrudRepository<Livro, Long> {
}
