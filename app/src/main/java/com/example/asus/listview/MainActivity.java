package com.example.asus.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Animal> animalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAnimals();
        AnimalAdapter adapter = new AnimalAdapter(MainActivity.this,R.layout.animal_item,animalList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Animal animal = animalList.get(position);
                Toast.makeText(MainActivity.this,animal.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initAnimals(){
            Animal lion = new Animal("Lion",R.drawable.lion);
            animalList.add(lion);
            Animal tiger = new Animal("Tiger",R.drawable.tiger);
            animalList.add(tiger);
            Animal monkey = new Animal("Monkey",R.drawable.monkey);
            animalList.add(monkey);
            Animal dog = new Animal("Dog",R.drawable.dog);
            animalList.add(dog);
            Animal cat = new Animal("Cat",R.drawable.cat);
            animalList.add(cat);
            Animal elephant = new Animal("Elephant",R.drawable.elephant);
            animalList.add(elephant);

    }
}
