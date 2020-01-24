package com.developer.allef.boilerplateapp.validadorboleto;

/**
 * @author allef.santos on 2020-01-22
 */
public interface EventoDeValidacao {

    /**
     * Invocado quando os números digitados estão inválidos. Pode ser apenas um trecho ou o número completo.
     *
     * @param valorAtual O valor após a digitação.
     * @param mensagem   A mensagem de erro da validação.
     */
    void invalido(String valorAtual, String mensagem);

    /**
     * Invocado quando os números digitados estão parcialmente válidos. Quando o número estiver completamente válido
     * será chamado o callback {@link #totalmenteValido(String)}.
     *
     * @param valorAtual O valor após a digitação.
     */
    void parcialmenteValido(String valorAtual);

    /**
     * Invocado quando a máscara está completa e os números são válidos.
     *
     * @param valorAtual O valor após a digitação.
     */
    void totalmenteValido(String valorAtual);
}
