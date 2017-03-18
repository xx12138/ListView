package com.example.asus.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ASUS on 2017/3/7.
 */

public class AnimalAdapter extends ArrayAdapter<Animal>
{
    private int resourceID;

    public AnimalAdapter(Context context, int textViewResoueceID, List<Animal> objects)
    {
        super(context,textViewResoueceID,objects);
        resourceID = textViewResoueceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Animal animal = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceID,parent,false);
        ImageView animalImage = (ImageView) view.findViewById(R.id.animal_image);
        TextView animalName = (TextView) view.findViewById(R.id.animal_name);
        animalImage.setImageResource(animal.getimageID());
        animalName.setText(animal.getName());
        return view;
    }
}
