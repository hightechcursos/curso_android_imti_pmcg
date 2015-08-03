package pmcg.imti.cursoimti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



/**
 * Created by Virmerson on 03/08/15.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        final EditText edNome = (EditText) findViewById(R.id.ed_nome);
        Button btnOk = (Button) findViewById(R.id.btn_ok);
        final TextView tvNome =  (TextView) findViewById(R.id.tv_nome);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = edNome.getText().toString();

               // Toast.makeText(MainActivity.this, nome, Toast.LENGTH_SHORT).show();
                tvNome.setText(nome);
            }
        });

    }
}
