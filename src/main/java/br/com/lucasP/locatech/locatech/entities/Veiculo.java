package br.com.lucasP.locatech.locatech.entities;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Veiculo {
    private Long id;
    private String marca;
    private String modelo;
    private String placa;
    private int anoFabricacao;
    private String cor;
    private BigDecimal valorDiaria;
}
