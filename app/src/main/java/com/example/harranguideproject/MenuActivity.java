package com.example.harranguideproject;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MenuActivity extends AppCompatActivity {
    Context context;


    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


        public boolean onCreateOptionsMenu (Menu menu){

            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu_desing, menu);

            super.onCreateOptionsMenu(menu);

            return true;

        }


    public boolean onOptionsItemSelected(MenuItem item){

            switch (item.getItemId()) {
                case R.id.etkinlik:
                    Toast.makeText(this, "etkinlik tıklandı", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.haberler:
                    Toast.makeText(this, "haberler tıklandı", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.obs_giris:
                    Toast.makeText(this, "girise yonlendiriliyor", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.akademikPersonel:
                    Toast.makeText(this, "akademik personel tıklandı", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.mezun_ogrenci:
                    Toast.makeText(this, "mezun ogrenci portalı", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.fakulteler:
                    Toast.makeText(this, "fakulteler", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.kutuphane:
                    Toast.makeText(this, "kutuphane tıklandı", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.yemekhane:
                    Toast.makeText(this, "yemekhane tıklandı", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.iletisim:
                    Toast.makeText(this, "iletisim tıklandı", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.harita:
                    Toast.makeText(this, "harita tıklandı", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.duyuru:
                Toast.makeText(this, "duyuruya tıklandı", Toast.LENGTH_SHORT).show();
                return true;

                default:

                    return super.onOptionsItemSelected(item);
            }


    }
}

