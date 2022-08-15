package br.edu.ifsp.scl.ads.pdm.cadastro;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.ifsp.scl.ads.pdm.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;
    private String nomeCompleto = "";
    private String telefone = "";
    private String email = "";
    private boolean ingressarEmEmails = false;
    private Sexo sexo = Sexo.MASCULINO;
    private String cidade = "";
    private String uf = "Acre";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());

        amb.nomeEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                nomeCompleto = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        amb.telefoneEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                telefone = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        amb.emailEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                email = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        amb.cidadeEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                cidade = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        amb.ingressarCb.setOnCheckedChangeListener((compoundButton, b) -> ingressarEmEmails = b);
        amb.masculinoRb.setOnCheckedChangeListener((compoundButton, b) -> {
            if(b) sexo = Sexo.MASCULINO;
        });
        amb.femininoRb.setOnCheckedChangeListener((compoundButton, b) -> {
            if(b) sexo = Sexo.FEMININO;
        });
        amb.ufSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                uf = getResources().getStringArray(R.array.ufs)[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        amb.limparBt.setOnClickListener(view -> {
                    amb.nomeEt.getEditableText().clear();
                    amb.telefoneEt.getEditableText().clear();
                    amb.emailEt.getEditableText().clear();
                    amb.ingressarCb.setChecked(false);
                    amb.masculinoRb.setChecked(true);
                    amb.cidadeEt.getEditableText().clear();
                    amb.ufSpinner.setSelection(0);
                }
        );
        amb.salvarBt.setOnClickListener(view -> {
                    Formulario formulario = new Formulario(nomeCompleto, telefone, email, ingressarEmEmails, sexo, cidade, uf);
                    Toast.makeText(view.getContext(), formulario.toString(), Toast.LENGTH_SHORT).show();
                }
        );
    }
}