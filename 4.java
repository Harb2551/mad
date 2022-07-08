package com.example.labpgm4;
import androidx.appcompat.app.AppCompatActivity;
import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable; import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import java.io.IOException; import java.util.Timer; import java.util.TimerTask;
public class MainActivity extends AppCompatActivity { Timer mytimer;
Drawable drawable;
WallpaperManager wpm;
int next=1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(saved I nsta nc eStat e);
setC ontentView( R. la yo ut.ac t ivit y_ ma in); mytimer=new Timer();
wpm=Wallpape rMa na ge r. getI nsta nce (t his) ;
}
public void changewallpaper(View v) {
setWallPaper(); }
public void setWallPaper() {
mytimer.schedule(new TimerTask() { @Override
public void run() {
if(next==1) {
drawable=getReso urces( ). get Dra wab le( R.dra wab le.o ne ); next=2;
}
else if(next==2) {
drawable=getReso urces( ). get Dra wab le( R.dra wab le. two );
next=3; }

else if(next==3) {
drawable=getReso urces( ). get Dra wab le( R.dra wab le. t hree );
next=4; }
else if(next==4) {
drawable=getReso urces( ). get Dra wab le( R.dra wab le. fo ur) ;
next=5; }
else if(next==5) {
drawable=getReso urces( ). get Dra wab le( R.dra wab le. f ive) ;
next=6; }
else if(next==6) {
drawable=getReso urces( ). get Dra wab le( R.dra wab le.s i x) ;
next=7; }
else if(next==7) {
drawable=getReso urces( ). get Dra wab le( R.dra wab le.s e ve n);
next=8; }
else if(next==8) {
drawable=getReso urces( ). get Dra wab le( R.dra wab le.e i ght );
next=9; }
else if(next==9) {
drawable=getReso urces( ). get Dra wab le( R.dra wab le. ni ne) ;
next=10; }
else if(next==10) {
drawable=getReso urces( ). get Dra wab le( R.dra wab le. te n) ;
next=1; }
Bitmap img=((BitmapDrawable)drawable).getBitmap();

try { wpm.setBitmap(img);
} catch (IOException e) { e.printStackTrace();
}
} },30000,5000);
} }
