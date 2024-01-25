package br.com.adoptpet.core.usecase.endereco.exception;

public class FalhaAoIncluirEnderecoException extends RuntimeException{
    public FalhaAoIncluirEnderecoException() {
        super("Não foi possível incluir o endereço!");
    }
}
