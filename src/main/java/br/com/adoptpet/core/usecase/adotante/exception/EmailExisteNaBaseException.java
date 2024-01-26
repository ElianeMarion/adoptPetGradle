package br.com.adoptpet.core.usecase.adotante.exception;

public class EmailExisteNaBaseException extends RuntimeException{
    public EmailExisteNaBaseException() {
        super("O email informado para registro não pode ser utilizado!");
    }
}
