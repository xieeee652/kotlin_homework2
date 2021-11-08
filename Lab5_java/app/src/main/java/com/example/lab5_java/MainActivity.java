package com.example.lab5_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
     class FragmentPagerSupport extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity","onCreate");

        ViewPager a = findViewById(R.id.viewPager);
        //建立 FragmentPagerAdapter 物件
        ViewPagerAdapter adapter = new ViewPagerAdapter();
        adapter.getSupportFragmentManager();
        //連接 Adapter，讓畫面(Fragment)與 ViewPager 建立關聯
       a.setAdapter(a.getAdapter());

  }
}
    @Override
    public void onRestart() {
        super.onRestart();
        Log.e("MainActivity","onRestart");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.e("MainActivity","onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.e("MainActivity","onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.e("MainActivity","onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.e("MainActivity","onStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity","onDestroy");
    }
}

public class ViewPagerAdapter(FragmentManager fm) extends FragmentActivity  {

    @Override
    //回傳對應位置的 Fragment，決定頁面的呈現順序
        protected void getItem(int position){
            getItem(position);
        switch (position)
        {
        case 0:
            FirstFragment a = new FirstFragment(); //第一頁要呈現的 Fragment
            break;
        case 1:
            SecondFragment b = new SecondFragment(); //第二頁要呈現的 Fragment
            break;
        default:
            ThirdFragment c = new ThirdFragment();
            break;
        }

        }
        //回傳 Fragment 頁數

        public int getCount() {
            getCount();
            return 3;
        }

    }
