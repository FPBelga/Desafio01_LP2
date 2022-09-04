package com.teste.primeiroexemplo.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.teste.primeiroexemplo.model.Produto;

@Repository
public class ProdutoRepository {

    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;
    

   /**
    * Método para retorna uma lista de produtos
    * @return Lista de produtos
    */
   public List<Produto> obterTodos(){
        return produtos;
    }
    /**
     * Metodo que retorna o produto encontrado encontrado pelo seu ID
     * @param id do produto que será localizado
     * @return retorna um produto caso seja encontrado o seu ID
     */
    public Optional<Produto> obterPorId(Integer id){
        return produtos
               .stream()
               .filter(produto -> produto.getId() == id)
               .findFirst();
    }
    /**
     * Método para adicionar o produto na lista
     * @param produto que será adicionado
     * @return Retorna o produto que foi adicionado na lista
     */
    public Produto adicionar(Produto produto){
        
        ultimoId++; //Incrementa o produto

        produto.setId(ultimoId); //Pega o Id e grava npo produto
        produtos.add(produto);//Grava o produto
        
        return produto;
    } 

    /**
     * Método para deletar o produto na lista
     * @param integer
     * @param Id do produto a ser deletado
     * @return 
     */
    public void deletar(Integer id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    /**
     * Método para atualizar p produto na lista
     * @param produto que será atualizado
     * @return Retorna o produto atualizado na lista
     */
    public Produto atualizar(Produto produto){
        
        // Encontrar o produto na lista
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

        if(produtoEncontrado.isEmpty()){
            throw new InputMismatchException("Produto não encontrado");
        }
        //Remover o produto da lista
        deletar(produto.getId());
        //Depois adicionar o novo produto atualizado na lista
        produtos.add(produto);

        return produto;
    }
}
