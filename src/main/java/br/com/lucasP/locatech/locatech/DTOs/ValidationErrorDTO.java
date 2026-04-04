package br.com.lucasP.locatech.locatech.DTOs;

import java.util.List;

public record ValidationErrorDTO(List<String> errors, int status) {

}
