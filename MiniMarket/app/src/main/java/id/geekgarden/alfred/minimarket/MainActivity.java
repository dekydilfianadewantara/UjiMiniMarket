package id.geekgarden.alfred.minimarket;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView tombol_1 = (ImageView) findViewById(R.id.tombol_1);
        ImageView tombol_2 = (ImageView) findViewById(R.id.tombol_2);
        ImageView tombol_3 = (ImageView) findViewById(R.id.tombol_3);
        ImageView tombol_4 = (ImageView) findViewById(R.id.tombol_4);

        tombol_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutActivity = new Intent(MainActivity.this, About.class);
                startActivity(aboutActivity);
            }
        });
    }

}
