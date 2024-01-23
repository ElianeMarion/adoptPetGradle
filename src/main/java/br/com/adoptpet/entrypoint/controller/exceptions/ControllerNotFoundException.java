package br.com.adoptpet.entrypoint.controller.exceptions;

public class ControllerNotFoundException extends RuntimeException{
    public ControllerNotFoundException(String mensagem){
        super(mensagem);
    }
}
