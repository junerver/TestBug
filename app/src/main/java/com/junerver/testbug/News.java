package com.junerver.testbug;

import java.util.List;

/**
 * Created by junerver on 17-3-24.
 */
public class News {

	/**
	 * error : false
	 * results : [{"_id":"58d24805421aa90f033451c1","createdAt":"2017-03-22T17:46:45.109Z","desc":"一份小组协同开发可以使用的Android代码规范","images":["http://img.gank.io/15e2d305-1742-4129-8dce-146666494993"],"publishedAt":"2017-03-24T12:12:34.753Z","source":"web","type":"Android","url":"https://github.com/LoranWong/Android-Code-Style/blob/master/README.md","used":true,"who":"黄灰红"},{"_id":"58d49a18421aa93abf5d3b72","createdAt":"2017-03-24T12:01:28.665Z","desc":"基于 Java 实现的轻量级推荐系统","images":["http://img.gank.io/4807eb35-6867-4276-a277-9744b03ef677"],"publishedAt":"2017-03-24T12:12:34.753Z","source":"chrome","type":"Android","url":"https://github.com/guoguibing/librec","used":true,"who":"带马甲"}]
	 */

	private boolean error;
	private List<ResultsBean> results;

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public List<ResultsBean> getResults() {
		return results;
	}

	public void setResults(List<ResultsBean> results) {
		this.results = results;
	}

	public static class ResultsBean {
		/**
		 * _id : 58d24805421aa90f033451c1
		 * createdAt : 2017-03-22T17:46:45.109Z
		 * desc : 一份小组协同开发可以使用的Android代码规范
		 * images : ["http://img.gank.io/15e2d305-1742-4129-8dce-146666494993"]
		 * publishedAt : 2017-03-24T12:12:34.753Z
		 * source : web
		 * type : Android
		 * url : https://github.com/LoranWong/Android-Code-Style/blob/master/README.md
		 * used : true
		 * who : 黄灰红
		 */

		private String _id;
		private String createdAt;
		private String desc;
		private String publishedAt;
		private String source;
		private String type;
		private String url;
		private boolean used;
		private String who;
		private List<String> images;

		public String get_id() {
			return _id;
		}

		public void set_id(String _id) {
			this._id = _id;
		}

		public String getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getPublishedAt() {
			return publishedAt;
		}

		public void setPublishedAt(String publishedAt) {
			this.publishedAt = publishedAt;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public boolean isUsed() {
			return used;
		}

		public void setUsed(boolean used) {
			this.used = used;
		}

		public String getWho() {
			return who;
		}

		public void setWho(String who) {
			this.who = who;
		}

		public List<String> getImages() {
			return images;
		}

		public void setImages(List<String> images) {
			this.images = images;
		}
	}
}