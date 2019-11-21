package com.example.shortcut.Main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.shortcut.Navi.NaviStraight;
import com.example.shortcut.R;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;


public class SearchMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_map);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("위치 검색");

        MapView mapView = new MapView(this);
        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.search_map_map_view);
        MapPoint mapPoint = MapPoint.mapPointWithGeoCoord(37.545892, 126.964738);
        mapView.setMapCenterPoint(mapPoint, true);//true면 앱 실행 시 애니메이션 효과가 나오고 false면 애니메이션이 나오지않음.
        mapViewContainer.addView(mapView);
        mapViewContainer.requestLayout();

        MapPOIItem marker = new MapPOIItem();
        marker.setItemName("숙명여대 ?");

        marker.setTag(0);
        marker.setMapPoint(mapPoint);// 기본으로 제공하는 BluePin 마커 모양.
        marker.setMarkerType(MapPOIItem.MarkerType.BluePin);// 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin);
        mapView.addPOIItem(marker);

    }

    public void onClick_search(View view){
        Intent intent_navi_running = new Intent(this, NaviStraight.class);
        startActivity(intent_navi_running);
    }
}
