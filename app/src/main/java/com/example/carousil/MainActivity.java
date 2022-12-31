package com.example.carousil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.carousil.databinding.ActivityMainBinding;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


binding.carousel.addData(new CarouselItem("https://empire-s3-production.bobvila.com/pages/538/original/Bedroom.jpg?1310503752","Room"));
        binding.carousel.addData(new CarouselItem("https://www.rd.com/wp-content/uploads/2020/04/GettyImages-694542042-e1586274805503.jpg","Rabbit"));
binding.carousel.addData(new CarouselItem("https://img.freepik.com/free-photo/colorful-fruits-tasty-fresh-ripe-juicy-white-desk_179666-169.jpg?w=2000","Fruit"));
binding.carousel.addData(new CarouselItem("https://www.healthyeating.org/images/default-source/home-0.0/nutrition-topics-2.0/general-nutrition-wellness/2-2-2-2foodgroups_vegetables_detailfeature.jpg?sfvrsn=226f1bc7_6","Vege"));
binding.carousel.addData(new CarouselItem("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/family-room-ideas-hbx0613000a-1611614336.jpg","ROOM"));

    }
}