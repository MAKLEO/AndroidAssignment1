package manish.khullar.androidassignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText a,b,c;
    TextView alpha,beta;
    Button bt;
    String av,bv,cv;
    int aa,bb,cc;
    double rs1,rs2;
   // static String s1,s2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectxml();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                av = String.valueOf(a.getText());
                aa=Integer.parseInt(av);
                bv= String.valueOf(b.getText());
                bb=Integer.parseInt(bv);
                cv= String.valueOf(c.getText());
                cc=Integer.parseInt(cv);
                rs1=((-bb) + Math.sqrt((bb*bb)+(4*aa*cc)))/(2*aa);
                rs2=((-bb) + Math.sqrt((bb*bb)-(4*aa*cc)))/(2*aa);
                String alp=String.valueOf(rs1);
                alpha.setText(alp);
                String bet= String.valueOf(rs2);
                beta.setText(bet);
               // Toast.makeText(MainActivity.this, "Result is = "+s1, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void connectxml()
    {
        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        alpha=findViewById(R.id.textView4);
        beta=findViewById(R.id.textView5);
    }
}