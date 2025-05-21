package br.com.techchallenge.product.core.usecase;

import br.com.techchallenge.product.core.domain.Produto;
import br.com.techchallenge.product.infrastructure.entity.ProdutoEntity;
import br.com.techchallenge.product.infrastructure.mapper.ProdutoMapper;
import br.com.techchallenge.product.infrastructure.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        repository.findBySku(produto.getSku())
                .ifPresent(p -> { throw new RuntimeException("SKU já cadastrado"); });

        ProdutoEntity saved = repository.save(ProdutoMapper.toEntity(produto));
        return ProdutoMapper.toDomain(saved);
    }

    public List<Produto> listar() {
        return repository.findAll().stream()
                .map(ProdutoMapper::toDomain)
                .collect(Collectors.toList());
    }
}
