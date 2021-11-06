package android.newapi;

import android.content.Intent;
import android.newapi.Api.APIClients;
import android.newapi.Api.APIKey;
import android.newapi.Implementation.Articles;
import android.newapi.Implementation.Newfeed;
import android.newapi.Utils.utlis;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    public static final  String API_KEY="23d4ed0e5fe84741ac530eb21b6ecc8a";
    private RecyclerView recyclerView;
    private List<Articles> articles=new ArrayList<>();
    private AdapterHome adapterHome;
    private final String Tag=MainActivity.class.getSimpleName();
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleview);
        layoutManager=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        DefaultItemAnimator itemAnimator = new DefaultItemAnimator();
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.setNestedScrollingEnabled(false);

        ObjectJson();
        connectView();

    }

    public void ObjectJson(){
        APIKey api= APIClients.getAPIClients().create(APIKey.class);
        String country =utlis.getCountry();
        Call<Newfeed> call;
        call=api.getNewfeed(country,API_KEY);
        call.enqueue(new Callback<Newfeed>() {
            @Override
            public void onResponse(Call<Newfeed> call, Response<Newfeed> response) {
                if (response.body().getArticles()!=null && response.isSuccessful()){
                    if (!articles.isEmpty()){
                        articles.clear();
                    }
                    articles=response.body().getArticles();
                    adapterHome =new AdapterHome(articles,MainActivity.this);
                    recyclerView.setAdapter(adapterHome);
                    adapterHome.notifyDataSetChanged();

                    OnclickListenerDetail();

                }else {
                    Toast toast=Toast.makeText(MainActivity.this,"No result",Toast.LENGTH_LONG);
                    toast.show();
                }
            }

            @Override
            public void onFailure(Call<Newfeed> call, Throwable t) {
            Toast.makeText(MainActivity.this,"error",Toast.LENGTH_LONG).show();
            }
        });

    }
    private void OnclickListenerDetail(){
        adapterHome.setOnItemClickListener((view, position) -> {
            ImageView imageView = view.findViewById(R.id.imageView);
            Intent intent = new Intent(getApplicationContext(), DetailActivity.class);

            Articles article = articles.get(position);
            intent.putExtra("url", article.getUrl());
            intent.putExtra("title", article.getTitle());
            intent.putExtra("imageView", article.getUrlToImage());
            intent.putExtra("author", article.getAuthor());
            intent.putExtra("date", article.getPublishedAt());
            intent.putExtra("source", article.getSource().getName());
            startActivity(intent);

        });

    }

// Todo: Click button
    private void connectView(){
        Button button=(Button) findViewById(R.id.button2);
        Button button1=(Button)findViewById(R.id.button5);
        Button button2=(Button)findViewById(R.id.button8);
        Button button3=(Button)findViewById(R.id.button11);
        Button button4=(Button)findViewById(R.id.button14);

        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                doClickButton();
                break;
            case R.id.button5:
                doClickButton();
                break;
            case R.id.button8:
                doClickButton();
                break;
            case R.id.button11:
                doClickButton();
                break;
            case R.id.button14:
                doClickButton();
                break;
        }
    }

    private void doClickButton() {
        Intent intent = new Intent(this, ButttomCommentFragment.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action,  menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                Toast toast = Toast.makeText(this, getString(R.string.search), Toast.LENGTH_SHORT);
                toast.show();
                super.onRestart();
                break;

            case R.id.messenger:
                Intent intent = new Intent(this, ButttomCommentFragment.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}