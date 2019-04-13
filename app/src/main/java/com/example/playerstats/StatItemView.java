package com.example.playerstats;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class StatItemView extends LinearLayout {
    TextView textView;
    ProgressBar progressBar;

    public StatItemView(Context context) {
        super(context);
        init(context);
    }

    public StatItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.stat_item, this, true);

        textView = (TextView) findViewById(R.id.item_text);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
//        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.gradient_progressbar));
    }

    public void setValue(String value) {
        textView.setText(value);
    }

    public void setProgressValue(int value) {
        progressBar.setProgress(value);
    }

    public void setProgressDrawable(Drawable drawable) {
        progressBar.setProgressDrawable(drawable);
    }
}
