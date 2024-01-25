package br.com.adoptpet.core.usecase.endereco.exception;

public class EnderecoExisteNaBaseException extends RuntimeException{
    public EnderecoExisteNaBaseException() {
        super("O endereço informado já está cadastrado!");
    }
}
