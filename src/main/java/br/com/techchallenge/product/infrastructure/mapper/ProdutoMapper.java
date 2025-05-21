package br.com.techchallenge.product.infrastructure.mapper;

import br.com.techchallenge.product.core.domain.Produto;
import br.com.techchallenge.product.infrastructure.entity.ProdutoEntity;

import java.math.BigDecimal;
import java.util.UUID;

public class ProdutoMapper {

    public static ProdutoEntity toEntity(Produto produto) {
        return ProdutoEntity.builder()
                .id(produto.getId() != null ? UUID.fromString(produto.getId()) : null)
                .nome(produto.getNome())
                .sku(produto.getSku())
                .preco(new BigDecimal(produto.getPreco()))
                .build();
    }

    public static Produto toDomain(ProdutoEntity entity) {
        return Produto.builder()
                .id(entity.getId().toString())
                .nome(entity.getNome())
                .sku(entity.getSku())
                .preco(entity.getPreco().toPlainString())
                .build();
    }
}
