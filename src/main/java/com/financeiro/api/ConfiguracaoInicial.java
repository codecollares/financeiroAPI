package com.financeiro.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoInicial {

    @Bean
    CommandLineRunner iniciarBanco(TransacaoRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                Transacao t1 = new Transacao();
                t1.setDescricao("Salário Mensal");
                t1.setValor(5000.0);

                Transacao t2 = new Transacao();
                t2.setDescricao("Pagamento Aluguel");
                t2.setValor(-1200.0);

                repository.save(t1);
                repository.save(t2);
                System.out.println("Bases de teste criadas com sucesso!");
            }
        };
    }
}