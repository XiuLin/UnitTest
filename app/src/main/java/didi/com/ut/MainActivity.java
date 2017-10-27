package didi.com.ut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final TextView textView = (TextView)findViewById(R.id.tv_name);
        Button btnClick = (Button) findViewById(R.id.button);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });

        System.out.print("MainActivity onCreate\n");
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.print("MainActivity onStart\n");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.print("MainActivity onResume\n");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.print("MainActivity onPause\n");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.print("MainActivity onStop\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        System.out.print("MainActivity onDestroy\n");
    }
}
