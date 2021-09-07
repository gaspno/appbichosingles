package com.shambles.ntworkenterprice.ingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.shambles.ntworkenterprice.ingles.Fragments.BichosFragment;
import com.shambles.ntworkenterprice.ingles.Fragments.NumerosFragment;
import com.shambles.ntworkenterprice.ingles.Fragments.VogaisFragment;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTabLayout=findViewById(R.id.viewpagertab);
        viewPager=findViewById(R.id.viewpager);
        FragmentPagerItemAdapter adapter=new FragmentPagerItemAdapter(getSupportFragmentManager(), FragmentPagerItems.with(this).
                add("Numeros", NumerosFragment.class).add("Bichos", BichosFragment.class).add("Vogais",VogaisFragment.class)
                .create());

        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);

    }

}
