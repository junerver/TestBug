package com.junerver.testbug;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;
import okhttp3.Call;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
	private RecyclerView mRecyclerView;
	private SwipeRefreshLayout mSwipeRefreshLayout;
	private LinearLayoutManager mLayoutManager;
	private MultiTypeAdapter mAdapter;
	private Gson mGson;
	private Items mItems;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_container);
		mRecyclerView = (RecyclerView) findViewById(R.id.rv_data_list);
		mLayoutManager = new LinearLayoutManager(this);
		mAdapter = new MultiTypeAdapter();
		mAdapter.register(News.ResultsBean.class,new NewsViewBinder());
		mRecyclerView.setAdapter(mAdapter);
		mRecyclerView.setLayoutManager(mLayoutManager);
		mGson = new Gson();
		mSwipeRefreshLayout.setOnRefreshListener(this);
		getData();
	}



	private void getData() {
		OkHttpUtils.get()
				.url("http://gank.io/api/data/Android/10/1")
				.build().execute(new StringCallback() {
			@Override
			public void onError(Call call, Exception e, int id) {

			}

			@Override
			public void onResponse(String response, int id) {
				News news = mGson.fromJson(response, News.class);
				mItems = new Items();
				mItems.addAll(news.getResults());
				mAdapter.setItems(mItems);
				mAdapter.notifyDataSetChanged();
			}
		});
	}

	@Override
	public void onRefresh() {
		getData();
	}
}
