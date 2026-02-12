package com.financeiro.api;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transacoes")
@CrossOrigin(origins = "*") // Não esqueça dessa linha para o HTML funcionar!
public class TransacaoController {

    private final TransacaoRepository repository;

    public TransacaoController(TransacaoRepository repository) {
        this.repository = repository;
    }

    // 1. Rota de Busca (Já tínhamos)
    @GetMapping
    public List<Transacao> listar() {
        return repository.findAll();
    }

    // 2. Rota de Criação (COLE ESTA PARTE AQUI)
    @PostMapping
    public Transacao criar(@Valid @RequestBody Transacao novo) {
        return repository.save(novo);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}