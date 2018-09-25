package com.example.hp.tournigeria;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class IpoAdapter extends ArrayAdapter<Ipo> {
    /**
     * Resource ID for background color per list of ipo
     */
    private int mColorResourceId;

    private static final String LOG_TAG = IpoAdapter.class.getSimpleName();

    public IpoAdapter(Context context, ArrayList<Ipo> ipo, int colorResourceId) {
        super(context, 0, ipo);
        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int i, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        /* Get object located at this position in the list*/
        Ipo currentIpo;
        currentIpo = getItem(i);

        TextView headerTextView = (TextView) listView.findViewById(R.id.header_text_view);
        headerTextView.setText(currentIpo.getHeader());

        TextView descTextView = (TextView) listView.findViewById(R.id.desc_text_view);
        descTextView.setText(currentIpo.getDescription());

        ImageView imageView = (ImageView) listView.findViewById(R.id.image);
        imageView.setImageResource(currentIpo.getImageResourceId());
        View textWrap = listView.findViewById(R.id.text_wrap);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textWrap.setBackgroundColor(color);

        return listView;
    }
}
