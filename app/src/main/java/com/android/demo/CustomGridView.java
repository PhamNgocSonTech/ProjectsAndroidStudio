package com.android.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.learnandroidlifetime.R;
import java.util.List;

public class CustomGridView extends BaseAdapter {
    static class ViewHolder{
        ImageView imageFlagView;
        TextView countryNameView;
        TextView populationView;
    }

    private List<Country> listCountry;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomGridView(Context context, LayoutInflater layoutInflater,List<Country> listCountry ){
        this.context = context;
        this.layoutInflater = layoutInflater;
        this.listCountry = listCountry;

    }
    public CustomGridView(Context aContext, List<Country> listCountry ){
        this.context = aContext;
        this.listCountry = listCountry;
        this.layoutInflater = LayoutInflater.from(aContext);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.grid_view_with_custom_layout,null);
            holder = new ViewHolder();
            holder.imageFlagView = (ImageView) convertView.findViewById(R.id.imageViewFlag);
            holder.countryNameView = (TextView) convertView.findViewById(R.id.textViewCountryName);
            holder.populationView =(TextView) convertView.findViewById(R.id.textViewPopulation);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        Country country = this.listCountry.get(position);//gán vào tham chiếu vị trí ptu trong ds country
        holder.countryNameView.setText(country.getCountryName());
        //Truyền tham chiếu country vào setText để lấy ra tên
        //để hiển thị tên quốc gia lên textViewConutry
        holder.populationView.setText(""+country.getPopulation());
        int imageID = context.getResources().getIdentifier(country.getFlagName(),
                "drawable",context.getPackageName());
        holder.imageFlagView.setImageResource(imageID);
        return convertView;
    }

    @Override
    public int getCount() {
        return listCountry.size();
    }

    @Override
    public Object getItem(int position) {
        return listCountry.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



}
