package doannvph05829.com.androidnangcaoass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import doannvph05829.com.androidnangcaoass.news.NewsActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imgCourse;
    private ImageView imgMaps;
    private ImageView imgNews;
    private ImageView imgSocial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        imgCourse =  findViewById(R.id.imgCourse);
        imgMaps =  findViewById(R.id.imgMaps);
        imgNews =  findViewById(R.id.imgNews);
        imgSocial = findViewById(R.id.imgSocial);

        imgMaps.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, MapsActivity.class );
                startActivity( intent );
            }
        } );
        imgNews.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, NewsActivity.class );
                startActivity( intent );
            }
        } );
        imgCourse.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, HocTapActivity.class );
                startActivity( intent );
            }
        } );
        imgSocial.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, FacebookActivity.class );
                startActivity( intent );
            }
        } );

    }
}
