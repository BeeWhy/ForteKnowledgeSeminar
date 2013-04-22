package com.forte.skyscrapers;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends Activity {
	
	private ViewPager mPager;
	private ArrayList<PhotoItem> mList = PhotoGenerator.generatePhotos();
	private PhotoAdapter mPhotoAdapter;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                
        mPager = (ViewPager)findViewById(R.id.pager);
        mPhotoAdapter = new PhotoAdapter(mList, this);
        
        mPager.setAdapter(mPhotoAdapter);
        mPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			
			public void onPageSelected(int i) {
				mPhotoAdapter.instantiateItem(mPager, i);
				
			}
			
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				
				
			}
			
			public void onPageScrollStateChanged(int arg0) {
				
				
			}
		});
    }

   
}
