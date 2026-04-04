package br.com.lucasP.locatech.locatech.DTOs;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record AluguelRequestDto(
        @NotNull(message = "O id da pessoa não pode ser nulo")
        Long pessoaId,

        @NotNull(message = "O ida do veiculo não pode ser nulo")
        Long veiculoId,

        LocalDate dataInicio,
        LocalDate dataFim){

}
