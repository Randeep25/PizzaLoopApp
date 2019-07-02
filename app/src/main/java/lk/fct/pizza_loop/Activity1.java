package lk.fct.pizza_loop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class Activity1 extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.email);
        Password = (EditText) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.Login);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });

    }

    private void validate (String name,String password){
        if((name.equals("admin")) && (password.equals("12345"))){

            Intent intent1 = new Intent(Activity1.this,Pizza_list.class);
            startActivity(intent1);
        }
        else{
            Login.setEnabled(false);
        }
    }

}



