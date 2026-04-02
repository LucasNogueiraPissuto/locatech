package br.com.lucasP.locatech.locatech.entities;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Aluguel {
    private Long id;
    private Long idPessoa;
    private Long idVeiculo;
    private String veiculoModelo;
    private Veiculo veiculo;
    private String pessoaCpf;
    private String pessoaNome;
    private LocalDate dataIncio;
    private LocalDate dataFim;
    private BigDecimal valorTotal;
}
