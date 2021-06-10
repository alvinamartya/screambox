package id.ac.astra.polman.screambox_0320180002;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import id.ac.astra.polman.screambox_0320180002.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ScreamBox mScreamBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mScreamBox = new ScreamBox(getApplicationContext());

        ActivityMainBinding binding = DataBindingUtil
                .setContentView(MainActivity.this, R.layout.activity_main);
        binding.recyclerView
                .setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        binding.recyclerView.setAdapter(new SoundAdapter(this, mScreamBox.getSounds(), mScreamBox));
    }
}