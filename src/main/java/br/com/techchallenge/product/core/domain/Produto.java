package br.com.techchallenge.product.core.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produto {
    private String id;
    private String nome;
    private String sku;
    private String preco;
}
