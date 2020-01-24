package com.developer.allef.boilerplateapp.ui.validaroboleto;

import android.util.Log;

import androidx.appcompat.app.AlertDialog;

import com.google.android.material.textfield.TextInputLayout;

/**
 * @author allef.santos on 2020-01-22
 */
public class SampleEventoDeValidacao implements EventoDeValidacao {
    TextInputLayout textInputLayout;

    public SampleEventoDeValidacao(TextInputLayout textInputLayout) {
        this.textInputLayout = textInputLayout;
    }

    @Override
    public void invalido(String valorAtual, String mensagem) {
        textInputLayout.setError(mensagem);
    }

    @Override
    public void parcialmenteValido(String valorAtual) {
        Log.d("Allef","Parcial Valido");
        textInputLayout.setErrorEnabled(false);
        textInputLayout.setError(null);
    }

    @Override
    public void totalmenteValido(String valorAtual) {
        new AlertDialog.Builder(textInputLayout.getContext())
                .setTitle("Campo válido!")
                .setMessage(valorAtual)
                .show();
    }
}
