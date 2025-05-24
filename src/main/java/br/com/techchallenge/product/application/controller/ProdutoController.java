package br.com.techchallenge.product.application.controller;

import br.com.techchallenge.product.core.domain.Produto;
import br.com.techchallenge.product.core.usecase.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto) {
        return ResponseEntity.ok(service.salvar(produto));
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}

