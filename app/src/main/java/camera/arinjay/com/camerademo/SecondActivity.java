package camera.arinjay.com.camerademo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.File;

public class SecondActivity extends AppCompatActivity {


    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        File dir = new File(getCacheDir()+  "/req_images");

        File file = new File(dir, "mypic");

        if(file.exists())
        {
            Bitmap myBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            ImageView imageView =findViewById(R.id.secondImageView);
            imageView.setImageBitmap(myBitmap);
        }
    }
}
