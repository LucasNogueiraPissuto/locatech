package br.com.lucasP.locatech.locatech.entities;

import br.com.lucasP.locatech.locatech.DTOs.AluguelRequestDto;
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
    private Long pessoaId;
    private Long veiculoId;
    private String veiculoModelo;
    private String pessoaCpf;
    private String pessoaNome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private BigDecimal valorTotal;

    public Aluguel (AluguelRequestDto aluguelDto, BigDecimal valor) {
        this.pessoaId = aluguelDto.pessoaId();
        this.veiculoId = aluguelDto.veiculoId();
        this.dataInicio = aluguelDto.dataInicio();
        this.dataFim = aluguelDto.dataFim();
        this.valorTotal = valor;
    }
}
