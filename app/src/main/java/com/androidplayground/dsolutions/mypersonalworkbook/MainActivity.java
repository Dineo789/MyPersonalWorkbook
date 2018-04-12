package com.androidplayground.dsolutions.mypersonalworkbook;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.androidplayground.dsolutions.mypersonalworkbook.databinding.ActivityHomescreenBinding;

public class MainActivity extends AppCompatActivity implements HomeScreenView {

    ActivityHomescreenBinding binding;
    HomeScreenPresenter presenter;
    String currentTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_homescreen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        presenter = new HomeScreenPresenter(this);
        presenter.showTime();
        presenter.showGreetings();
    }

    @Override
    public void showCurrentTime(String time) {
        binding.tvCurrentTime.setText(time);
    }

    @Override
    public void showGreetingsMessage(String message) {
        binding.tvGreetingMessage.setText(message);

    }
}
