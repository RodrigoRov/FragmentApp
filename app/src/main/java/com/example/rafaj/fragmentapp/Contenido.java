package com.example.rafaj.fragmentapp;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

public class Contenido implements Parcelable{
    private int ImagenId;
    private String PlanetName;
    private String Contenido;

    public Contenido(int imagenId,String planetName,String contenido){
        ImagenId = imagenId;
        PlanetName = planetName;
        Contenido = contenido;
    }
    public int getImagenId(){
        return ImagenId;
    }
    public String getPlanetName(){
        return PlanetName;
    }
    public String getContenido(){
        return Contenido;
    }

    public Contenido(Parcel in){
        String[] data= new String[3];

        in.readStringArray(data);
        this.PlanetName= data[0];
        this.Contenido= data[1];
        this.ImagenId= Integer.parseInt(data[2]);
    }
    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO Auto-generated method stub

        dest.writeStringArray(new String[]{this.PlanetName,this.Contenido,String.valueOf(this.ImagenId)});
    }

    public static final Parcelable.Creator<Contenido> CREATOR= new Parcelable.Creator<Contenido>() {

        @Override
        public Contenido createFromParcel(Parcel source) {
        // TODO Auto-generated method stub
            return new Contenido(source);  //using parcelable constructor
        }

        @Override
        public Contenido[] newArray(int size) {
        // TODO Auto-generated method stub
            return new Contenido[size];
        }
    };

}

