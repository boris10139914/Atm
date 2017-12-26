package com.boris.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
private  ListView cities;
   // private String[] cities;
    private String TAG = CityActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
         cities =(ListView)findViewById(R.id.city);
        //cities = new String[]{"新北市","基隆市","台北市"};
        //ArrayAdapter adapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1, cities);
        //R.layout用這邊做好的陣列
        ArrayAdapter adapter =new ArrayAdapter(this, )
                city.setAdapter(adapter);
                city.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long itemid) {
        Log.d(TAG,"onItemClick:"+position+"/"+cities[position]);
        //TextView tv =(TextView)view;
        //tv.setText(tv.getText()+"*");
        String text =
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
