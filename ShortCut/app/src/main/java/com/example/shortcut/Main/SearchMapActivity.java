package com.example.shortcut.Main;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.shortcut.MainActivity;
import com.example.shortcut.Navi.NaviStraight;
import com.example.shortcut.R;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapPolyline;
import net.daum.mf.map.api.MapReverseGeoCoder;
import net.daum.mf.map.api.MapView;



public class SearchMapActivity extends AppCompatActivity{
    private static int REQUEST_ACCESS_FINE_LOCATION = 1000;
    //destination: MyungSin building : 37.5457038, 126.9636382
    //start: Prime building 203: 37.544848, 126.964806
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_map);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("위치 검색");

        //Get location access
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);

            if(permissionCheck == PackageManager.PERMISSION_DENIED){

                // 권한 없음
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        REQUEST_ACCESS_FINE_LOCATION);


            } else{

                // ACCESS_FINE_LOCATION 에 대한 권한이 이미 있음.

            }


        }

        // OS가 Marshmallow 이전일 경우 권한체크를 하지 않는다.
        else{

        }

        MapView mapView = new MapView(this);
        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.search_map_map_view);
        mapView.setCurrentLocationTrackingMode(MapView.CurrentLocationTrackingMode.TrackingModeOnWithHeading);

        MapPolyline polyline = new MapPolyline();
        polyline.setTag(100);
        polyline.setLineColor(Color.argb(128, 255, 51, 0)); // Polyline 컬러 지정.

        // Polyline 좌표 지정.
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.544848, 126.964806));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.545757, 126.964772));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.5457038, 126.9636382));

        // Polyline 지도에 올리기.
        mapView.addPolyline(polyline);

        MapPoint myMapPoint = MapPoint.mapPointWithGeoCoord(37.5457038, 126.9636382);
        MapPoint startMapPoint = MapPoint.mapPointWithGeoCoord(37.544848, 126.964806);
        mapView.setMapCenterPoint(myMapPoint, true);//true면 앱 실행 시 애니메이션 효과가 나오고 false면 애니메이션이 나오지않음.
        mapViewContainer.addView(mapView);


        MapPOIItem marker = new MapPOIItem();
        marker.setItemName("명신관 322호");
        marker.setTag(0);
        marker.setMapPoint(myMapPoint);// 기본으로 제공하는 BluePin 마커 모양.
        marker.setMarkerType(MapPOIItem.MarkerType.RedPin);// 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        marker.setSelectedMarkerType(MapPOIItem.MarkerType.BluePin);
        mapView.addPOIItem(marker);

        MapPOIItem marker2 = new MapPOIItem();
        marker2.setItemName("프라임관 203호");
        marker2.setTag(1);
        marker2.setMapPoint(startMapPoint);
        marker2.setMarkerType(MapPOIItem.MarkerType.YellowPin);
        marker2.setSelectedMarkerType(MapPOIItem.MarkerType.BluePin);
        mapView.addPOIItem(marker2);
    }


}

