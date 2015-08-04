package pmcg.imti.cursoimti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Virmerson on 04/08/15.
 */
public class Activity02  extends AppCompatActivity{

    @Bind(R.id.btn_1)
    Button btn1;

    @Bind(R.id.btn_2)
    Button btn2;

    @Bind(R.id.btn_3)
    Button btn3;

    @Bind(R.id.btn_4)
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02);
        ButterKnife.bind(this);


        btn1.setOnClickListener(new Listener("Ok 1"));


        btn2.setOnClickListener(new Listener("OK 2"));


        btn3.setOnClickListener(new Listener("Ok 3"));


        btn4.setOnClickListener(new Listener("Ok 4"));

    }

    class Listener implements View.OnClickListener{

        String msg;

        public Listener(String msg) {
            this.msg = msg;
        }

        @Override
        public void onClick(View v) {

            Toast.makeText(Activity02.this, msg, Toast.LENGTH_SHORT).show();
        }
    }
}
