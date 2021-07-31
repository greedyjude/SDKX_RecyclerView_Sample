package com.greedygame.samples.sdkx.recyclerviews.data;

import com.google.gson.Gson;
import com.greedygame.samples.sdkx.recyclerviews.BaseApplication;
import com.greedygame.samples.sdkx.recyclerviews.R;

import java.io.IOException;
import java.io.InputStream;

public class DataManager {

    private static DataManager instance = null;
    public static ApiImages apiImages = null;

    static public DataManager getInstance(){
            if(instance == null){
                instance  = new DataManager();
            }
            return instance;
    }

    private DataManager(){
        InputStream inputStream  = BaseApplication.appContext.getResources().openRawResource(R.raw.response);
        try {
            String content = getStringFromInputStream(inputStream);
            apiImages = new Gson().fromJson(content,ApiImages.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private String getStringFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int ch; (ch = inputStream.read()) != -1; ) {
            sb.append((char) ch);
        }
        return sb.toString();
    }



}
