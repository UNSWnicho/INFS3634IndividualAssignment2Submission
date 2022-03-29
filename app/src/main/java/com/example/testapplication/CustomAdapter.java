package com.example.testapplication;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;



import java.util.ArrayList;

class CustomAdapter implements ListAdapter {

    // Call ArrayList object with SubjectData input
    ArrayList<SubjectData> arrayList;
    Context context;


    // Intialise customAdapter Class
    public CustomAdapter(Context context, ArrayList<SubjectData> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    // Get View Method

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SubjectData subjectData = arrayList.get(position);
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.list_row, null);
            convertView.setClickable(true);
            convertView.setOnClickListener(new View.OnClickListener() {

    // On Click method
                @Override
                public void onClick(View v) {


                }
            });

            // Intantialize xml objects
            TextView title = convertView.findViewById(R.id.title);
            TextView location = convertView.findViewById(R.id.location);
            TextView timezone = convertView.findViewById(R.id.timezone);
            TextView rating = convertView.findViewById(R.id.rating);


            ImageView imag = convertView.findViewById(R.id.list_image);
            title.setText(subjectData.Name);
            location.setText(subjectData.Location);
            timezone.setText(subjectData.Timezone);
            rating.setText(subjectData.Rating);

            // OnClick Listener (Intent starts secondary detail activity
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("Position",position);
                    context.startActivity(intent );
                }
            });
            Picasso.get()
                    .load(subjectData.Image)
                    .into(imag);
        }

            return convertView;
        }

        @Override
        public int getItemViewType ( int position){
            return position;
        }

        @Override
        public int getViewTypeCount () {
            return arrayList.size();
        }


        @Override
        public boolean isEmpty () {
            return false;
        }
    }

