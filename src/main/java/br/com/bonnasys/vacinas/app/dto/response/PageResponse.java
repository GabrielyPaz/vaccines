package br.com.bonnasys.vacinas.app.dto.response;

public record PageResponse (Integer pageNumber,
                            Integer pageSize,
                            Long totalElements,
                            Integer totalPages) {

}
