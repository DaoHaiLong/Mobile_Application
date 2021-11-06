package android.newapi;

import android.newapi.Implementation.Articles;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.newapi.Api.APIClients;
import android.newapi.Api.APIKey;
import android.newapi.Utils.utlis;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NewfeedFace extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public static final  String API_KEY="23d4ed0e5fe84741ac530eb21b6ecc8a";
    private RecyclerView recyclerView;
    private List<Articles> articles=new ArrayList<>();
    private AdapterHome adapterHome;
    private final String Tag=MainActivity.class.getSimpleName();
    private RecyclerView.LayoutManager layoutManager;

    public NewfeedFace() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static NewfeedFace newInstance() {
        NewfeedFace fragment = new NewfeedFace();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_newfeed, container, false);
        recyclerView=(RecyclerView) view.findViewById(R.id.recycleview);
        layoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        DefaultItemAnimator itemAnimator = new DefaultItemAnimator();
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.setNestedScrollingEnabled(false);

//        call api
        ObjectJson();
//        call tablayout
        Button button=(Button) view.findViewById(R.id.button2);
        Button button1=(Button) view.findViewById(R.id.button5);
        Button button2=(Button) view.findViewById(R.id.button8);
        Button button3=(Button) view.findViewById(R.id.button11);
        Button button4=(Button) view.findViewById(R.id.button14);

        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        return view;
    }
    public void ObjectJson(){
        APIKey api= APIClients.getAPIClients().create(APIKey.class);
        String country =utlis.getCountry();
        Call<android.newapi.Implementation.Newfeed> call;
        call=api.getNewfeed(country,API_KEY);
        call.enqueue(new Callback<android.newapi.Implementation.Newfeed>() {
            @Override
            public void onResponse(Call<android.newapi.Implementation.Newfeed> call, Response<android.newapi.Implementation.Newfeed> response) {
                if (response.body().getArticles()!=null && response.isSuccessful()){
                    if (!articles.isEmpty()){
                        articles.clear();
                    }
                    articles=response.body().getArticles();
                    adapterHome =new AdapterHome(articles,getActivity());
                    recyclerView.setAdapter(adapterHome);
                    adapterHome.notifyDataSetChanged();

                    OnclickListenerDetail();

                }else {
                    Toast toast=Toast.makeText(getActivity(),"No result",Toast.LENGTH_LONG);
                    toast.show();
                }
            }

            @Override
            public void onFailure(Call<android.newapi.Implementation.Newfeed> call, Throwable t) {
                Toast.makeText(getActivity(),"error",Toast.LENGTH_LONG).show();
            }
        });

    }
    private void OnclickListenerDetail(){
        adapterHome.setOnItemClickListener((view, position) -> {
            ImageView imageView = view.findViewById(R.id.imageView);
            Intent intent = new Intent(getActivity(), DetailActivity.class);

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
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
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
        Intent intent = new Intent(getActivity(),ButttomCommentFragment.class);
        startActivity(intent);
    }


}