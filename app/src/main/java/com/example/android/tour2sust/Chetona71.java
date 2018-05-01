package com.example.android.tour2sust;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Chetona71 extends AppCompatActivity {
    ViewPager viewPager;
    //slider dot
    LinearLayout sliderDotsSpanel;
    private int dotsCount;
    private ImageView[] dots;
    //end

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chetona71);

        //audi 360 image view images page
        ImageButton chetona360 = (ImageButton)findViewById(R.id.chetona360ImageViewButton);
        chetona360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chetona71.this,Chetona360Imageview.class);
                startActivity(intent);
            }
        });
        ImageButton chetonaMap = (ImageButton)findViewById(R.id.chetnaMapButton);
        chetonaMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chetona71.this,Chetona71MapActivity.class);
                startActivity(intent);
            }
        });

        viewPager= (ViewPager) findViewById(R.id.chetonaviewpager);
        ViewpageAdapterChetona71 viewPageAdapter=new ViewpageAdapterChetona71(this);
        viewPager.setAdapter(viewPageAdapter);
        //slider  dot code start from here
        sliderDotsSpanel=(LinearLayout) findViewById(R.id.sliderdots);
        dotsCount=viewPageAdapter.getCount();
        dots = new ImageView[dotsCount];
        for(int i=0;i<dotsCount;i++)
        {
            dots[i]=new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.non_active_dot));

            LinearLayout.LayoutParams params =new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8,0,8,0);
            sliderDotsSpanel.addView(dots[i],params);

        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for(int i=0;i<dotsCount;i++)
                {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.non_active_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        //end of slider dot code
    }
}
class ViewpageAdapterChetona71 extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] Images={R.drawable.chetona1,R.drawable.chetonan1,
            R.drawable.chetonap2,R.drawable.chetanap1,R.drawable.chetona1};

    public ViewpageAdapterChetona71(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.custom_chetona71,null);
        ImageView imageView=(ImageView) view.findViewById(R.id.chetona71ImageView);

        imageView.setImageResource(Images[position]);
        ViewPager vp=(ViewPager) container;
        vp.addView(view,0);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp=(ViewPager) container;
        View view=(View) object;
        vp.removeView(view);
    }
}

