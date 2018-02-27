package com.example.mrflood.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.PrintStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*String Json = "{\"sites\":{\"site\":[{\"id\":\"1\",\"name\":\"菜鸟教程\",\"url\":\"www.runoob.com\"},{\"id\":\"2\",\"name\":\"菜鸟工具\",\"url\":\"c.runoob.com\"},{\"id\":\"3\",\"name\":\"Google\",\"url\":\"www.google.com\"}]}}";
        PrintStream out = System.out ;
        JSONObject object = null;
        try {
            object = new JSONObject(Json);

            String Json1 = object.getString("sites");
            JSONObject object1 = object.getJSONObject("sites");

            String Json2 = object1.getString("site");
            JSONArray array2 = object1.getJSONArray("site");

            JSONObject object3_1 = array2.getJSONObject(0);
            String Json3_1 = array2.getString(0);

            out.println(Json1);
            out.println(Json2);
            out.println(Json3_1);
            out.println(object3_1);
            out.println(array2);
        } catch (JSONException e) {
            e.printStackTrace();
        }*/
        JSONObject object1 = new JSONObject();
        JSONObject object2 = new JSONObject();
        try {
            object2.put("id",1);
            object2.put("name","Mr.Flood");
            object2.put("sex","Male");
            object1.put("adress","山东");
            object1.put("detail",object2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.e("问", object1.toString() );
    }
}
