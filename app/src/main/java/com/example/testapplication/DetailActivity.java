package com.example.testapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "Detail Activity";
    TextView dName, dLocation, dRating, dDesc, dTimezone;
    ImageView dImage;
    ImageView dMap;


    // Using Picasso method and Xml variables, setText
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        dName = findViewById(R.id.tvName);
        dLocation = findViewById(R.id.tvLocation);
        dRating = findViewById(R.id.tvRating);
        dTimezone = findViewById(R.id.tvTimezone);
        dDesc = findViewById(R.id.tvDesc);
        dImage = findViewById(R.id.tvImage);
        dMap = findViewById(R.id.tvMap);

        Bundle extras = getIntent().getExtras();
        Integer pos = extras.getInt("Position");
        ArrayList<SubjectData> arrayList = new ArrayList<SubjectData>();
        if (pos == 0){
            dName.setText("Hotel du Cygne Tours");
            dLocation.setText("France, Paris");
            dRating.setText("4.6/5");
            dTimezone.setText("(GMT+2)");
            dDesc.setText("InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach");
            Picasso.get().load("https://images.trvl-media.com/hotels/4000000/3690000/3688100/3688029/b64e4d0a.jpg?impolicy=resizecrop&rw=598&ra=fit").into(dImage);
            Picasso.get().load("https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C47.39571,0.69119&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=f78EoabK8IRqMBCZVw7HCjizJpU=").into(dMap);
        }else if (pos == 1){
            dName.setText("Holiday Inn Athens");
            dLocation.setText("Greece, Athens");
            dRating.setText("4.4/5");
            dTimezone.setText("(GMT+3)");
            dDesc.setText("InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach");
            Picasso.get().load("https://images.trvl-media.com/hotels/2000000/1090000/1086700/1086615/980b7932.jpg?impolicy=resizecrop&rw=297&ra=fit").into(dImage);
            Picasso.get().load("https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C37.971679,23.879791&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=xZLCWQTxLl5Vl9_Y4pDFbny24wI=").into(dMap);
        }
        else if (pos == 2){
            dName.setText("Hilton Wakiki Village");
            dLocation.setText("Hawaii, Wakiki");
            dRating.setText("4.3/5");
            dTimezone.setText("(GMT+8)");
            dDesc.setText("InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach");
            Picasso.get().load("https://images.trvl-media.com/hotels/1000000/20000/13900/13857/985d6727.jpg?impolicy=resizecrop&rw=598&ra=fit").into(dImage);
            Picasso.get().load("https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C21.283732,-157.835486&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=Ok6igdlP8Sf-XVfsowdrBkmPY4k=").into(dMap);
        }
        else if (pos == 3){
            dName.setText("The Heritage Manila");
            dLocation.setText("Phillipines, Manila");
            dRating.setText("4.2/5");
            dTimezone.setText("(GMT+2)");
            dDesc.setText("InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach");
            Picasso.get().load("https://images.trvl-media.com/hotels/1000000/20000/18000/17999/ac2db145.jpg?impolicy=resizecrop&rw=297&ra=fit").into(dImage);
            Picasso.get().load("=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C47.39571,0.69119&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=f78EoabK8IRqMBCZVw7HCjizJpU=").into(dMap);
        }
        else if (pos == 4){
            dName.setText("Courtyard Flagstaff Gardens");
            dLocation.setText("Australia, Melbourne");
            dRating.setText("4.1/5");
            dTimezone.setText("(GMT+11)");
            dDesc.setText("InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach");
            Picasso.get().load("https://images.trvl-media.com/hotels/74000000/73370000/73369800/73369716/a476a305.jpg?impolicy=resizecrop&rw=297&ra=fit").into(dImage);
            Picasso.get().load("https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C-37.810587,144.95126&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=d3bwXN4tRXN2jXA-Yn4VHmpALRw=").into(dMap);
        }
        else if (pos == 5){
            dName.setText("Express Lisbon Inn");
            dLocation.setText("Portugal, Lisbon");
            dRating.setText("4.0/5");
            dTimezone.setText("(GMT+1)");
            dDesc.setText("InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach");
            Picasso.get().load("https://images.trvl-media.com/hotels/6000000/5020000/5013200/5013165/00acc044.jpg?impolicy=resizecrop&rw=297&ra=fit").into(dImage);
            Picasso.get().load("https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C38.722147,-9.217897&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=fj2O0zKWgAa5e78HUfvo4ypzs1Y=").into(dMap);
        }
        else if (pos == 6){
            dName.setText("The Royal Park Hotel");
            dLocation.setText("Japan, Tokyo");
            dRating.setText("4.0/5");
            dTimezone.setText("(GMT+9)");
            dDesc.setText("InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach");
            Picasso.get().load("https://images.trvl-media.com/hotels/9000000/8090000/8080900/8080801/e485fe39.jpg?impolicy=resizecrop&rw=598&ra=fit").into(dImage);
            Picasso.get().load("https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C35.543949,139.768329&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=Oc_ODoeVmL0UtMValFO5zsD-zUM=").into(dMap);
        }
        else if (pos == 7){
            dName.setText("Courtyard, Seminyak Resort");
            dLocation.setText("Indonesia, Bali");
            dRating.setText("4.0/5");
            dTimezone.setText("(GMT+8)");
            dDesc.setText("InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach");
            Picasso.get().load("https://images.trvl-media.com/hotels/9000000/8260000/8254100/8254002/61a73f98.jpg?impolicy=resizecrop&rw=297&ra=fit").into(dImage);
            Picasso.get().load("https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C-8.691971,115.162501&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=8wVowe6P1pKfLfmljq8C7OQqV9g=").into(dMap);
        }
        else if (pos == 8){
            dName.setText("Citadines Sukhumvit");
            dLocation.setText("Thailand, Bangkok");
            dRating.setText("4.0/5");
            dTimezone.setText("(GMT+7)");
            dDesc.setText("InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach");
            Picasso.get().load("https://images.trvl-media.com/hotels/3000000/2110000/2110000/2109916/850a8ca0.jpg?impolicy=resizecrop&rw=598&ra=fit").into(dImage);
            Picasso.get().load("https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C13.73568,100.556028&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=D0c8Nzvum9eiolmqwY4nHlur95c=").into(dMap);
        }
        else if (pos == 9){
            dName.setText("InterContinental Wellington");
            dLocation.setText("New Zealand, Wellington");
            dRating.setText("3.9/5");
            dTimezone.setText("(GMT+13)");
            dDesc.setText("InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach");
            Picasso.get().load("https://images.trvl-media.com/hotels/1000000/20000/19100/19028/7d3eedae.jpg?impolicy=resizecrop&rw=297&ra=fit").into(dImage);
            Picasso.get().load("https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C-41.284925,174.776519&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=eyGXp0dVTJQQyTqEjCFe6g1vI2s=").into(dMap);
        }

    }


}
