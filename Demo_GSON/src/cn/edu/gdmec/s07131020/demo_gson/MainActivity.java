package cn.edu.gdmec.s07131020.demo_gson;

import java.util.ArrayList;
import java.util.List;

import com.example.demo_gson.R;
import com.google.gson.Gson;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        List<String> phones=new ArrayList<String>();
        phones.add("123566");
        phones.add("14164573");
        phones.add("14314568786");
        
        Person person=new Person("zhangsan",20,phones);
        
        Gson gson=new Gson();
        String s1=gson.toJson(person);
        Log.i("info",s1);
        
        Person person2=gson.fromJson(s1,Person.class);
        Log.i("info","通过GSON生成的Java对象:"+person2);

    }


  
}
