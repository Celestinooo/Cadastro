package br.edu.ifsp.scl.ads.pdm.cadastro;

import androidx.annotation.NonNull;

public class Formulario {
    private final String nomeCompleto;
    private final String telefone;
    private final String email;
    private final boolean ingressarEmEmails;
    private final Sexo sexo;
    private final String cidade;
    private final String uf;

    public Formulario(String nomeCompleto, String telefone, String email, boolean ingressarEmEmails, Sexo sexo, String cidade, String uf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.ingressarEmEmails = ingressarEmEmails;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }

    @NonNull
    @Override
    public String toString() {
        return "Usuario{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", ingressarEmEmails=" + ingressarEmEmails +
                ", sexo=" + sexo +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
