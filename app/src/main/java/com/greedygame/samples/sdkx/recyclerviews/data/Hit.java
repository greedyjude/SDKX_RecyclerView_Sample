
package com.greedygame.samples.sdkx.recyclerviews.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hit {

    @SerializedName("id")
    @Expose
    public long id;
    @SerializedName("pageURL")
    @Expose
    public String pageURL;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("tags")
    @Expose
    public String tags;
    @SerializedName("previewURL")
    @Expose
    public String previewURL;
    @SerializedName("previewWidth")
    @Expose
    public long previewWidth;
    @SerializedName("previewHeight")
    @Expose
    public long previewHeight;
    @SerializedName("webformatURL")
    @Expose
    public String webformatURL;
    @SerializedName("webformatWidth")
    @Expose
    public long webformatWidth;
    @SerializedName("webformatHeight")
    @Expose
    public long webformatHeight;
    @SerializedName("largeImageURL")
    @Expose
    public String largeImageURL;
    @SerializedName("imageWidth")
    @Expose
    public long imageWidth;
    @SerializedName("imageHeight")
    @Expose
    public long imageHeight;
    @SerializedName("imageSize")
    @Expose
    public long imageSize;
    @SerializedName("views")
    @Expose
    public long views;
    @SerializedName("downloads")
    @Expose
    public long downloads;
    @SerializedName("collections")
    @Expose
    public long collections;
    @SerializedName("likes")
    @Expose
    public long likes;
    @SerializedName("comments")
    @Expose
    public long comments;
    @SerializedName("user_id")
    @Expose
    public long userId;
    @SerializedName("user")
    @Expose
    public String user;
    @SerializedName("userImageURL")
    @Expose
    public String userImageURL;

}
