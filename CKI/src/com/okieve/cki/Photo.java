package com.okieve.cki;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ViewFlipper;


public class Photo extends Fragment {  
    @Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  
              Bundle savedInstanceState) { 
  	View vs = inflater.inflate(R.layout.activity_photo, container, false);
    	
    	final ViewFlipper vf=(ViewFlipper)vs.findViewById(R.id.viewFlipper1);
    	
    	vf.setFlipInterval(2500);
    	vf.startFlipping();
    	vf.setOnClickListener(new OnClickListener (){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				vf.showNext();
			}
    		
    	});
         return vs;  
    } 
}