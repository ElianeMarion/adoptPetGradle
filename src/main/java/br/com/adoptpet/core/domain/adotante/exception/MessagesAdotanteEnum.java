package br.com.adoptpet.core.domain.adotante.exception;

public enum MessagesAdotanteEnum {
    ADOTANTE_NULL("Os dados do adotante não foram informados para inserção.");

    private final String message;

    MessagesAdotanteEnum(String message) {
        this.message = message;
    }
    public String message() {
        return this.message;
    }
}
