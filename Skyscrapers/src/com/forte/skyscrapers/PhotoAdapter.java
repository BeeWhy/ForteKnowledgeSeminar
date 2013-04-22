package com.forte.skyscrapers;

import java.util.ArrayList;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PhotoAdapter extends PagerAdapter {
	private ArrayList<PhotoItem> mList = PhotoGenerator.generatePhotos();
	private Context mContext;

	public PhotoAdapter(ArrayList<PhotoItem> mList, Context mContext) {
		super();
		this.mList = mList;
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		// returns the number of picures in our gallery

		return mList.size();
	}

	@Override
	public boolean isViewFromObject(View view, Object obj) {

		return view == obj;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((View) object);

	}

	@Override
	public CharSequence getPageTitle(int position) {
		return super.getPageTitle(position);
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		// here I arrange how a viewpager item will look(eg name, the photo
		// itself)
		LayoutInflater inflater = LayoutInflater.from(mContext);
		View item = inflater.inflate(R.layout.item, container, false);

		container.addView(item);
		TextView tv = (TextView) item.findViewById(R.id.page_number);
		ImageView iv = (ImageView) item.findViewById(R.id.item_photo);

		int pageNumber = position + 1;
		tv.setText("Page " + pageNumber);
		iv.setImageResource(mList.get(position).getLocation());

		return item;
	}

}
