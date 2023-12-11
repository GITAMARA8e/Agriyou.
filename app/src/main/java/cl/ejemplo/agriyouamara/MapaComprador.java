package cl.ejemplo.agriyouamara;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.os.Bundle;

public class MapaComprador extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_comprador);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.mapView2);
        mapFragment.getMapAsync(this);
    }
        public void onMapReady(GoogleMap googleMap) {

            mMap = googleMap;

            LatLng negocio1  = new LatLng(30.9088,-74.7897);
            mMap.addMarker(new MarkerOptions().position(negocio1).title("Cecinas mariana"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(negocio1));

            LatLng negocio2 = new LatLng(29.0808,-77.4576);
            mMap.addMarker(new MarkerOptions().position(negocio2).title("Creaciones alfredo"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(negocio2));

            LatLng negocio3  = new LatLng(32.0554,-69.7897);
            mMap.addMarker(new MarkerOptions().position(negocio3).title("La cosecha dorada"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(negocio3));

            LatLng negocio4  = new LatLng(40.7843,-66.2345);
            mMap.addMarker(new MarkerOptions().position(negocio4).title("Fardos San Pedro"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(negocio4));

            LatLng negocio5  = new LatLng(40.7843,-66.2345);
            mMap.addMarker(new MarkerOptions().position(negocio5).title("Manzanas el manzanal"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(negocio5));
        }
    }


