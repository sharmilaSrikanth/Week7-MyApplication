package com.example.shrisharmi.myapplication;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shrisharmi on 1/2/2016.
 */
public class ArticleFragment extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedIntanceState )
    {
        //inflate the layout for this fragment
        return inflater.inflate(R.layout.news_aticles, container, false);
    }
}
