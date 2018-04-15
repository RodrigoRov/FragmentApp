package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView text, contenido;
    ImageView imagen;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        contenido = view.findViewById(R.id.TextoDcontenido);
        imagen = view.findViewById(R.id.ImagenPlaneta);
        text = view.findViewById(R.id.textId);
        Bundle bundle = this.getArguments();


        if(bundle != null){

            Contenido contenido = bundle.getParcelable("planetas");

            text.setText(contenido.getPlanetName());
            this.contenido.setText(contenido.getContenido());
            imagen.setImageResource(contenido.getImagenId());
        }

        return view;
    }


}
