package com.teste.primeiroexemplo.services;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    /**
    * Método para retorna uma lista de produtos
    * @return Lista de produtos
    */
    public List<Produto> obterTodos(){
        //Aqui poderia colocar uma regra de negócio
        return produtoRepository.obterTodos();
    }

    /**
     * Metodo que retorna o produto encontrado encontrado pelo seu ID
     * @param id do produto que será localizado
     * @return retorna um produto caso seja encontrado o seu ID
     */
    public Optional<Produto> obterPorId(Integer id){
        return produtoRepository.obterPorId(id);
    }

    /**
     * Método para adicionar o produto na lista
     * @param produto que será adicionado
     * @return Retorna o produto que foi adicionado na lista
     * @throws ParseException
     */
    public Produto adicionar(Produto produto){
        //Poderia ter alguma regra de negócio para validar o produto
       
        return produtoRepository.adicionar(produto);
    } 

    /**
     * Método para deletar o produto na lista
     * @param integer
     * @param Id do produto a ser deletado
     * @return 
     */
    public void deletar(Integer id){
        // Aqui poderia ter alguma lógica de validação 
        produtoRepository.deletar(id);
    }

    /**
     * Método para atualizar p produto na lista
     * @param produto que será atualizado
     * @param ID do Produto que será atualizad
     * @return Retorna o produto atualizado na lista
     */
    public Produto atualizar(Integer id, Produto produto){
        //Ter alguma validação no ID.
        produto.setId(id);
    

        return produtoRepository.atualizar(produto);
    }
}
