package cl.ejemplo.agriyouamara;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.os.Bundle;


public class mapa extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        SupportMapFragment mapFragment=(SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.mapView);

        mapFragment.getMapAsync(this);
    }
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng MiDireccion  = new LatLng(32.0898,-76.0758);

        mMap.addMarker(new MarkerOptions().position(MiDireccion).title("Mi locación"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MiDireccion));

    }

}