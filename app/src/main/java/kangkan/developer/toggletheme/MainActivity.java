package kangkan.developer.toggletheme;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import kangkan.developer.toggletheme.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private  ActivityMainBinding binding;
    private boolean isDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        Student student=new  Student("Kangkan",22);
        student.addcourse("Android");
        student.addcourse("Ios");

        binding.setStudent(student);

        isDay=true;
        binding.setIsDay(isDay);

    }

    public void toggleTheme(View view) {

        isDay=!isDay;
        binding.setIsDay(isDay);
    }
}
