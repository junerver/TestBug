package com.junerver.testbug;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by junerver on 17-3-24.
 */
public class NewsViewBinder
		extends ItemViewBinder<News.ResultsBean, NewsViewBinder.ViewHolder> {

	@NonNull
	@Override
	protected ViewHolder onCreateViewHolder(
			@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
		View root = inflater.inflate(R.layout.item_news, parent, false);
		return new ViewHolder(root);
	}

	@Override
	protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull News.ResultsBean item) {
		holder.tvNewsTitle.setText(item.getDesc());
	}

	static class ViewHolder extends RecyclerView.ViewHolder {
		TextView tvNewsTitle;

		ViewHolder(View itemView) {
			super(itemView);
			tvNewsTitle = (TextView) itemView.findViewById(R.id.tv_news_title);
		}
	}
}