package br.edu.famper.cadlivro.service;

import br.edu.famper.cadlivro.model.Livro;
import br.edu.famper.cadlivro.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro salvar(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> findAll(){
        return (List<Livro>) livroRepository.findAll();
    }

    public Optional<Livro> findById(Long id){
        return livroRepository.findById(id);
    }

    public Livro update(Livro livro) {
        Livro salvo = livroRepository.findById(livro.getCodigo()).
                orElseThrow(() ->
                        new RuntimeException("Livro não encontrado!")
                );
        salvo.setTitulo(livro.getTitulo());
        salvo.setAutor(livro.getAutor());
        salvo.setAno_publicacao(livro.getAno_publicacao());
        salvo.setPreco(livro.getPreco());
        return livroRepository.save(salvo);
    }

    public void deleteById(Long id){
        livroRepository.deleteById(id);
    }
}
