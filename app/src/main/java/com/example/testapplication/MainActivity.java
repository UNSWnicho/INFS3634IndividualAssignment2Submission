package com.example.testapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.ListViewTest.MESSAGE";

    // OnCreate Method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Holiday Favourites");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView list = findViewById(R.id.list);

        // Subject Data Arraylist
        ArrayList<SubjectData> arrayList = new ArrayList<SubjectData>();
        arrayList.add(new SubjectData("Hotel du Cygne Tours", "France, Paris", "(GMT+2)", "4.6/5", "sfds","https://images.trvl-media.com/hotels/4000000/3690000/3688100/3688029/b64e4d0a.jpg?impolicy=resizecrop&rw=598&ra=fit", "https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C47.39571,0.69119&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=f78EoabK8IRqMBCZVw7HCjizJpU="
        , "InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach"));
        arrayList.add(new SubjectData("Holiday Inn Athens", "Greece, Athens", "(GMT+3)", "4.4/5", "sfds","https://images.trvl-media.com/hotels/2000000/1090000/1086700/1086615/980b7932.jpg?impolicy=resizecrop&rw=297&ra=fit", "https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C37.971679,23.879791&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=xZLCWQTxLl5Vl9_Y4pDFbny24wI="
                , "InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach "));
        arrayList.add(new SubjectData("Hilton Wakiki Village", "Hawaii, Wakiki", "(GMT-10)", "4.3/5", "sfds","https://images.trvl-media.com/hotels/1000000/20000/13900/13857/985d6727.jpg?impolicy=resizecrop&rw=598&ra=fit", "https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C21.283732,-157.835486&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=Ok6igdlP8Sf-XVfsowdrBkmPY4k="
                , "InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach"));
        arrayList.add(new SubjectData("The Heritage Manila", "Phillipines, Manila", "(GMT+8)", "4.2/5", "sfds","https://images.trvl-media.com/hotels/1000000/20000/18000/17999/ac2db145.jpg?impolicy=resizecrop&rw=297&ra=fit", "https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C14.537195,120.993771&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=KRbyceiH7cTKLEMxtCbh6XXzjbY="
                , "InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach"));
        arrayList.add(new SubjectData("Courtyard Flagstaff Gardens", "Australia, Melbourne", "(GMT+11)", "4.1/5", "sfds","https://images.trvl-media.com/hotels/74000000/73370000/73369800/73369716/a476a305.jpg?impolicy=resizecrop&rw=297&ra=fit", "https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C-37.810587,144.95126&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=d3bwXN4tRXN2jXA-Yn4VHmpALRw="
                , "InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach"));
        arrayList.add(new SubjectData("Express Lisbon Inn", "Portugal, Lisbon", "(GMT+1)", "4.0/5", "sfds","https://images.trvl-media.com/hotels/6000000/5020000/5013200/5013165/00acc044.jpg?impolicy=resizecrop&rw=297&ra=fit", "https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C38.722147,-9.217897&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=fj2O0zKWgAa5e78HUfvo4ypzs1Y="
                , "InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach"));
        arrayList.add(new SubjectData("The Royal Park Hotel", "Japan, Tokyo", "(GMT+9)", "4.0/5", "sfds","https://images.trvl-media.com/hotels/9000000/8090000/8080900/8080801/e485fe39.jpg?impolicy=resizecrop&rw=598&ra=fit", "https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C35.543949,139.768329&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=Oc_ODoeVmL0UtMValFO5zsD-zUM="
                , "InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach"));
        arrayList.add(new SubjectData("Courtyard, Seminyak Resort", "Indonesia, Bali", "(GMT+8)", "4.0/5", "sfds","https://images.trvl-media.com/hotels/9000000/8260000/8254100/8254002/61a73f98.jpg?impolicy=resizecrop&rw=297&ra=fit", "https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C-8.691971,115.162501&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=8wVowe6P1pKfLfmljq8C7OQqV9g="
                , "InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach"));
        arrayList.add(new SubjectData("Citadines Sukhumvit", "Thailand, Bangkok", "(GMT+7)", "4.0/5", "sfds","https://images.trvl-media.com/hotels/3000000/2110000/2110000/2109916/850a8ca0.jpg?impolicy=resizecrop&rw=598&ra=fit", "https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C13.73568,100.556028&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=D0c8Nzvum9eiolmqwY4nHlur95c="
                , "InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach"));
        arrayList.add(new SubjectData("InterContinental Wellington", "New Zealand, Wellington", "(GMT+13)", "3.9/5", "sfds","https://images.trvl-media.com/hotels/1000000/20000/19100/19028/7d3eedae.jpg?impolicy=resizecrop&rw=297&ra=fit", "https://maps.googleapis.com/maps/api/staticmap?channel=expedia-HotelInformation&maptype=roadmap&format=jpg&zoom=13&scale=&size=375x250&markers=icon:https://a.travel-assets.com/shopping-pwa/images/his-preview-marker.png%7C-41.284925,174.776519&key=AIzaSyCYjQus5kCufOpSj932jFoR_AJiL9yiwOw&signature=eyGXp0dVTJQQyTqEjCFe6g1vI2s="
                , "InterContinental Wellington, an IHG Hotel is located in Wellington CBD, a neighbourhood in Wellington, and is in the city centre and near the beach"));

        list.setClickable(true);

        CustomAdapter customAdapter = new CustomAdapter(this, arrayList);
        list.setAdapter(customAdapter);



    }





    // Grabs the arraylist content and returns it into a holiday variable
//    public static SubjectData findHolidays(String Name) {
//        ArrayList<SubjectData> holidays = findHolidays;
//        for(SubjectData holiday : holidays) {
//            if(holiday.getName().equals(Name)) {
//                return holiday;
//            }
//        }
//        return null;
//    }
}
