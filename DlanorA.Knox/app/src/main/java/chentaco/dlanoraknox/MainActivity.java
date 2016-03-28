package chentaco.dlanoraknox;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;
    private Button botonSonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonSonido = (Button) findViewById(R.id.playbutton);
        botonSonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp = MediaPlayer.create(MainActivity.this,R.raw.diethedeath);
                mp.start();
            }
        });
    }



}
