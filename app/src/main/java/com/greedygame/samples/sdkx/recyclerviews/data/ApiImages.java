
package com.greedygame.samples.sdkx.recyclerviews.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiImages {

    @SerializedName("total")
    @Expose
    public long total;
    @SerializedName("totalHits")
    @Expose
    public long totalHits;
    @SerializedName("hits")
    @Expose
    public List<Hit> hits = null;

}
