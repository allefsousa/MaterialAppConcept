package com.developer.allef.boilerplateapp.validadorboleto;

/**
 * @author allef.santos on 2020-01-22
 */
public interface EventoDeValidacaoDeBoleto extends EventoDeValidacao {

    /**
     * Invocado quando os números digitados estão inválidos. Pode ser apenas um trecho ou o número completo.
     *
     * @param valorAtual    O valor após a digitação.
     * @param blocoInvalido O bloco com valor inválido
     */
    void invalido(String valorAtual, int blocoInvalido);

}
