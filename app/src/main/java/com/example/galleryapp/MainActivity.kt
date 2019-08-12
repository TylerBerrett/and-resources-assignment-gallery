package com.example.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageList = arrayOfNulls<ImageView>(10)
        for (i in imageList.indices) imageList[i] = ImageView(this)


        imageList[0]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aerial_photography_aerial_shot_aerial_view_2583847))
        imageList[1]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285))
        imageList[2]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517))
        imageList[3]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653))
        imageList[4]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105))
        imageList[5]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))
        imageList[6]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148))
        imageList[7]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168))
        imageList[8]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.colorful_colourful_houses_2501965))
        imageList[9]?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.wallpaper_astronomy_astrophotography_2538107))


        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        imageList.forEachIndexed { index, imageView ->
            imageView?.layoutParams
            imageView?.adjustViewBounds = true
            imageView?.setPadding(5,5,5,5)
            if (index % 2 == 0) display_img_right.addView(imageView)
            else display_img_left.addView(imageView)
        }
        imageList[0]?.contentDescription = getString(R.string.Wakanda)
        imageList[1]?.contentDescription = getString(R.string.backyard)
        imageList[2]?.contentDescription = getString(R.string.Alleyway)
        imageList[3]?.contentDescription = getString(R.string.bridge)
        imageList[4]?.contentDescription = getString(R.string.canada)
        imageList[5]?.contentDescription = getString(R.string.flora)
        imageList[6]?.contentDescription = getString(R.string.colors)
        imageList[7]?.contentDescription = getString(R.string.coconut)
        imageList[8]?.contentDescription = getString(R.string.house)
        imageList[9]?.contentDescription = getString(R.string.space)
    }
}
