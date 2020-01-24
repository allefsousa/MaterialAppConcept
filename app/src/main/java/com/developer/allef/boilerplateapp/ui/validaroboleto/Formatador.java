package com.developer.allef.boilerplateapp.ui.validaroboleto;

import java.util.regex.Pattern;

/**
 * @author allef.santos on 2020-01-22
 */
public interface Formatador {

    /**
     * Singleton de formatação de boletos bancários.
     */
    Formatador BOLETO = FormatadorBoleto.getInstance();

    /**
     * Formata um valor COMPLETO. Deve falhar caso o valor não esteja completo.
     *
     * @param value valor a formatar
     * @return REsultado da formatação
     */
    String formata(String value);

    /**
     * Desformata um valor.
     *
     * @param value Valor a desformatar
     * @return Resultado da desformatação
     */
    String desformata(String value);

    /**
     * Verifica se um parâmetro está formatado.
     *
     * @param value Valor para verificar
     * @return True se estiver formatado, falso caso contrário.
     */
    boolean estaFormatado(String value);

    /**
     * Verifica se um parâmetro pode ser formatado.
     *
     * @param value Valor para verificar
     * @return True se puder ser formatado, falso caso contrário.
     */
    boolean podeSerFormatado(String value);

    /**
     * Classe para guardar os padrões de experssões regulares usados no framework.
     */
    abstract class Padroes {

        public static final Pattern PADRAO_SOMENTE_NUMEROS = Pattern.compile("[^0-9]");

        public static final Pattern CPF_FORMATADO = Pattern.compile(
                "(\\d{3})[.](\\d{3})[.](\\d{3})-(\\d{2})"
        );

        public static final Pattern CPF_DESFORMATADO = Pattern.compile(
                "(\\d{3})(\\d{3})(\\d{3})(\\d{2})"
        );

        private Padroes() {
        }
    }

}
