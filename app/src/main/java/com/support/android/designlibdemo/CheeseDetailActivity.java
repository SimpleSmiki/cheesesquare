package com.support.android.designlibdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.support.android.designlibdemo.model.CategoryObject;
import com.support.android.designlibdemo.model.Question;

public class CheeseDetailActivity extends FragmentActivity {

    public static final String EXTRA_NAME = "cheese_name";
    public static final String EXTRA_DATA = "detail_data";

    CategoryObject detailData;

    TextView title;
    TextView description;
    Button link;
    LinearLayout questionContainer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        final String cheeseName = intent.getStringExtra(EXTRA_NAME);
        detailData = intent.getParcelableExtra(EXTRA_DATA);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(detailData.getTitle());

        title = (TextView) findViewById(R.id.title);
        description = (TextView) findViewById(R.id.description);
        questionContainer = (LinearLayout) findViewById(R.id.question_container);
        link = (Button) findViewById(R.id.link_button);

//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(cheeseName);*/

//        loadBackdrop();
        setData();
    }

    private void setData() {
        title.setText(detailData.getTitle());
        description.setText(detailData.getFullDescription());
        for (Question q : detailData.getQuestions()){
            QuestionView qw = new QuestionView(getApplicationContext());
            qw.setValues(q.getQuestion(), q.getAnswer());
            questionContainer.addView(qw);
        }
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(detailData.getLinkToWebsite());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    private void loadBackdrop() {
//        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
//        Glide.with(this).load(Cheeses.getRandomCheeseDrawable()).centerCrop().into(imageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.sample_actions, menu);
        return true;
    }
}
