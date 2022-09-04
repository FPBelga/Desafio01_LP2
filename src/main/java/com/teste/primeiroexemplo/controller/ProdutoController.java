package com.teste.primeiroexemplo.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.support.ReflectivePropertyAccessor.OptimalPropertyAccessor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.repository.ProdutoRepository;
import com.teste.primeiroexemplo.services.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    @Autowired //Tomando o controle
    private ProdutoService produtoService;

    @GetMapping //Consultando todos os produtos
    public List<Produto> obterTodos(){
        return produtoService.obterTodos();
        
    }

    @GetMapping("/{id}") //Consultando o produto por ID
    public Optional<Produto> obterPorId(@PathVariable Integer id){
        return produtoService.obterPorId(id);
    }

    @PostMapping // Adicionando Produto
    public Produto adicionar(@RequestBody Produto produto){
        return produtoService.adicionar(produto);
    }

    @DeleteMapping("/{id}") //Deletando o produto por ID
    public String deletar(@PathVariable Integer id){
        produtoService.deletar(id);
        return ("Poduto ID: "+id+" foi deletado com sucesso");
    }

    @PutMapping("/{id}") // Atualizando o produto pelo ID
    public Produto atualizar(@RequestBody Produto produto, @PathVariable Integer id){
        return produtoService.atualizar(id, produto);  
        
    }
}
