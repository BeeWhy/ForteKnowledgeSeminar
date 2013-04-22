package com.forte.skyscrapers;

import java.util.ArrayList;

public class PhotoGenerator {
	
	private static ArrayList<PhotoItem> mList = new ArrayList<PhotoItem>();
	
	private PhotoGenerator(){
		//private empty constructor
		
	}
	
	public static ArrayList<PhotoItem> generatePhotos(){
		if (mList.size()==0){
			//here I will add photos
			mList.add(new PhotoItem(R.drawable.sc1));
			mList.add(new PhotoItem(R.drawable.sc2));
			mList.add(new PhotoItem(R.drawable.sc3));
			mList.add(new PhotoItem(R.drawable.sc4));
			mList.add(new PhotoItem(R.drawable.sc5));
			mList.add(new PhotoItem(R.drawable.sc6));
			mList.add(new PhotoItem(R.drawable.sc7));
		}
		return mList;
	}
	

}
