package br.com.bonnasys.vacinas.app.graphql.response;

public record PageResponse (Integer pageNumber,
                            Integer pageSize,
                            Long totalElements,
                            Integer totalPages) {

}
