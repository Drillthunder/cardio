package com.example.cardioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;

import java.io.IOException;

public class Mapa extends AppCompatActivity {

    private static final String TYPE_CLINIC = "clinic";
    private static final String TYPE_HOSPITAL = "hospital";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        // Modifica el método que hace la solicitud a la API para buscar clínicas cercanas
        private void searchClinics() {
            // Construye la URL para la solicitud de lugares cercanos
            String url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?" +
                    "location=" + latitude + "," + longitude +
                    "&radius=" + PROXIMITY_RADIUS +
                    "&types=" + TYPE_CLINIC +  // Cambia el tipo de lugar a "clinic"
                    "&sensor=true" +
                    "&key=" + AIzaSyDQ_YFE002Ry_qtUoQaqVJbvD5c8EHcgcg;  // Reemplaza YOUR_API_KEY con tu propia clave API de Google Places

            // Realiza la solicitud HTTP a la API
            // (código para enviar la solicitud HTTP y procesar la respuesta)
        }

// Modifica el método que hace la solicitud a la API para buscar hospitales cercanos
        private void searchHospitals() {
            // Construye la URL para la solicitud de lugares cercanos
            String url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?" +
                    "location=" + latitude + "," + longitude +
                    "&radius=" + PROXIMITY_RADIUS +
                    "&types=" + TYPE_HOSPITAL +  // Cambia el tipo de lugar a "hospital"
                    "&sensor=true" +
                    "&key=" + AIzaSyDQ_YFE002Ry_qtUoQaqVJbvD5c8EHcgcg;  // Reemplaza YOUR_API_KEY con tu propia clave API de Google Places

            // Realiza la solicitud HTTP a la API
            // (código para enviar la solicitud HTTP y procesar la respuesta)
        }

    }

}