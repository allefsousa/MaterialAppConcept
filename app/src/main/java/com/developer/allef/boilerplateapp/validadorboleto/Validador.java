package com.developer.allef.boilerplateapp.validadorboleto;

import android.text.Editable;

/**
 * @author allef.santos on 2020-01-22
 */
public interface Validador {


    /**
     * Referência para o singleton de validação de boleto
     */
    Validador BOLETO =  ValidadorBoleto.getInstance();


    /**
     * Valida uma {@link String} completa
     *
     * @param valor Valor a ser validado
     * @return true se estiver válida e false caso contrário
     */
    boolean ehValido(String valor);

    /**
     * Valida um {@link Editable} retornando o
     *
     * @param valor            Editable
     * @param resultadoParcial Objeto com o estado da validação
     * @return Objeto com o estado da validação atualizado
     */
    ResultadoParcial ehValido(Editable valor, ResultadoParcial resultadoParcial);

    /**
     * Value Object com o estado da validação.
     */
    class ResultadoParcial {

        private boolean valido;
        private boolean parcialmenteValido = true;
        private String mensagem;

        public boolean isValido() {
            return valido;
        }

        public boolean isParcialmenteValido() {
            return parcialmenteValido;
        }

        public String getMensagem() {
            return mensagem;
        }

        /**
         * Ajusta a validação com o valor de "totalmente válido".
         *
         * @param valido Flag totalmenteValido
         * @return Fluent Interface "this"
         */
        public ResultadoParcial totalmenteValido(boolean valido) {
            this.valido = valido;
            return this;
        }

        /**
         * Ajusta a validação com o valor de "totalmente válido".
         *
         * @param parcialmenteValido Flag parcialmenteValido
         * @return Fluent Interface "this"
         */
        public ResultadoParcial parcialmenteValido(boolean parcialmenteValido) {
            this.parcialmenteValido = parcialmenteValido;
            return this;
        }

        /**
         * Ajusta a mensagem de erro
         *
         * @param mensagem Mensagem usada na apresentação do erro.
         * @return Fluent Interface "this"
         */
        public ResultadoParcial mensagem(String mensagem) {
            this.mensagem = mensagem;
            return this;
        }
    }
}
