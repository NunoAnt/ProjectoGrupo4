package pt.ipca.segurtec_grupo4.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pt.ipca.segurtec_grupo4.MainActivity;
import pt.ipca.segurtec_grupo4.R;

public class Login extends AppCompatActivity {

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Encontrar o Objecto
        btnLogin = (Button) findViewById(R.id.btn_login);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Abrir Uuma nova actividade
                Intent i = new Intent(Login.this, MainActivity.class);
                startActivity(i);

            }
        });
    }

}
