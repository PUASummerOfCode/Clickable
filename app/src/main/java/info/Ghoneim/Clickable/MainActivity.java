package info.Ghoneim.Clickable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button myButton;
    Button elzorar;
    ImageView elsora;

    Button Next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button) findViewById(R.id.clickButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "ma bora7a :@", Toast.LENGTH_SHORT).show();
            }
        });
        elzorar=(Button)findViewById(R.id.elzorar);
        elsora=(ImageView) findViewById(R.id.elsora);
        elzorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               elsora.setVisibility(view.VISIBLE);
            }
        });


        Next=(Button)findViewById(R.id.next);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });





    }
}
