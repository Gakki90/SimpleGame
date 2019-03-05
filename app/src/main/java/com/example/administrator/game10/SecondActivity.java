package com.example.administrator.game10;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.GestureDetector.OnGestureListener;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SecondActivity extends AppCompatActivity implements android.view.GestureDetector.OnGestureListener {
    GestureDetector detector;
    private ImageView imageView = null;
    private ImageView imageView1 = null;
    private ImageView img1 = null;
    private ImageView img2 = null;
    private ImageView img3 = null;
    private ImageView img4 = null;
    private ImageView img5 = null;
    private ImageView img6 = null;
    private ImageView img7 = null;
    private ImageView img8 = null;
    private ImageView img9 = null;
    private ImageView img10 = null;
    private ImageView img11 = null;
    private ImageView img12 = null;

    private ImageView imgId[];
    int score = 0;
    private Button bt1 = null;//bird

    static int flag = 0;
    float x1;
    private final Timer timer = new Timer();
    private TimerTask task;


    int[] imageId = new int[]{R.drawable.ic_launcher_foreground};
    Handler handler = new Handler() {


        @Override

        public void handleMessage(Message msg) {


            img2.setY( img2.getY() + 40 );

            img3.setY( img3.getY() + 40 );
            img4.setY( img4.getY() + 40 );
            img5.setY( img5.getY() + 40 );
            img6.setY( img6.getY() + 40 );
            img7.setY( img7.getY() + 40 );
            img8.setY( img8.getY() + 40 );
            img9.setY( img9.getY() + 40 );
            img10.setY( img10.getY() + 40 );
            img11.setY( img11.getY() + 40 );
            img12.setY( img12.getY() + 40 );
            if (img2.getY() >= 1200) {
                img2.setY( 0 );
                score += 1;
            }
            ;
            if (img3.getY() >= 1200) {
                img3.setY( 0 );
                score += 1;
            }
            if (img4.getY() >= 1200) {
                img4.setY( 0 );
                score += 1;
            }
            if (img5.getY() >= 1200) {
                img5.setY( 0 );
                score += 1;
            }
            if (img6.getY() >= 1200) {
                img6.setY( 0 );
                score += 1;
            }
            if (img7.getY() >= 1200) {
                img7.setY( 0 );
                score += 1;
            }
            if (img8.getY() >= 1200) {
                img8.setY( 0 );
                score += 1;
            }
            if (img9.getY() >= 1200) {
                img9.setY( 0 );
                score += 1;
            }
            if (img10.getY() >= 1200) {
                img10.setY( 0 );
                score += 1;
            }
            if (img11.getY() >= 1200) {
                img11.setY( 0 );
                score += 1;
            }
            if (img12.getY() >= 1200) {
                img12.setY( 0 );
                score += 1;
            }


            if (score == 6) {
                imageView.setImageResource( R.drawable.wolfartboard1512 );
                imageView1.setImageResource( R.drawable.bg_blue );

            }
            if (score == 12) {
                imageView.setImageResource( R.drawable.giraffe );
                imageView1.setImageResource( R.drawable.bg_grey );
            }
            ((TextView) findViewById( R.id.textView2 )).setText( score + "" );


            if (Math.abs(imageView.getX() -img2.getX()) <50&&Math.abs(imageView.getY() -img2.getY())<50) {
                Intent intent = new Intent(SecondActivity.this, LoseActivity.class);
                startActivity(intent);

            }
            if (Math.abs(imageView.getX() -img3.getX()) <50&&Math.abs(imageView.getY() -img3.getY())<50) {
                Intent intent = new Intent(SecondActivity.this, LoseActivity.class);
                startActivity(intent);

            }
            if (Math.abs(imageView.getX() -img4.getX()) <50&&Math.abs(imageView.getY() -img4.getY())<50) {
                Intent intent = new Intent(SecondActivity.this, LoseActivity.class);
                startActivity(intent);

            }
            if (Math.abs(imageView.getX() -img5.getX()) <50&&Math.abs(imageView.getY() -img5.getY())<50) {
                Intent intent = new Intent(SecondActivity.this, LoseActivity.class);
                startActivity(intent);

            }
            if (Math.abs(imageView.getX() -img6.getX()) <50&&Math.abs(imageView.getY() -img6.getY())<50) {
                Intent intent = new Intent(SecondActivity.this, LoseActivity.class);
                startActivity(intent);

            }
            if (Math.abs(imageView.getX() -img7.getX()) <50&&Math.abs(imageView.getY() -img7.getY())<50) {
                Intent intent = new Intent(SecondActivity.this, LoseActivity.class);
                startActivity(intent);

            }
            if (Math.abs(imageView.getX() -img8.getX()) <50&&Math.abs(imageView.getY() -img8.getY())<50) {
                Intent intent = new Intent(SecondActivity.this, LoseActivity.class);
                startActivity(intent);

            }
            if (Math.abs(imageView.getX() -img9.getX()) <50&&Math.abs(imageView.getY() -img9.getY())<50) {
                Intent intent = new Intent(SecondActivity.this, LoseActivity.class);
                startActivity(intent);

            }
            if (Math.abs(imageView.getX() -img10.getX()) <50&&Math.abs(imageView.getY() -img10.getY())<50) {
                Intent intent = new Intent(SecondActivity.this, LoseActivity.class);
                startActivity(intent);

            }
            if (Math.abs(imageView.getX() -img11.getX()) <50&&Math.abs(imageView.getY() -img11.getY())<50) {
                Intent intent = new Intent(SecondActivity.this, LoseActivity.class);
                startActivity(intent);

            }
            if (Math.abs(imageView.getX() -img12.getX()) <50&&Math.abs(imageView.getY() -img12.getY())<50) {
                Intent intent = new Intent(SecondActivity.this, LoseActivity.class);
                startActivity(intent);

            }
            super.handleMessage( msg );
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.second_activity );


        task = new TimerTask() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Message message = new Message();
                message.what = 1;
                handler.sendMessage( message );
            }
        };
        timer.schedule( task, 500, 500 );


        detector = new GestureDetector( this, (OnGestureListener) this );

        img2 = (ImageView) findViewById( R.id.imageView4 );
        img3 = (ImageView) findViewById( R.id.imageView12 );
        img4 = (ImageView) findViewById( R.id.imageView13 );
        img5 = (ImageView) findViewById( R.id.imageView14 );
        img6 = (ImageView) findViewById( R.id.imageView15 );
        img7 = (ImageView) findViewById( R.id.imageView16 );
        img8 = (ImageView) findViewById( R.id.imageView17 );
        img9 = (ImageView) findViewById( R.id.imageView18 );
        img10 = (ImageView) findViewById( R.id.imageView19 );
        img11 = (ImageView) findViewById( R.id.imageView20 );
        img12 = (ImageView) findViewById( R.id.imageView7 );
        imageView1 = (ImageView) findViewById( R.id.imageView3 );
        imageView = (ImageView) findViewById( R.id.imageView8 );


    }


    public boolean onTouchEvent(MotionEvent me) {
        return detector.onTouchEvent( me );
    }

    public boolean onDown(MotionEvent arg0) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }


    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        int minMove = 120;
        float minVelocity = 0;
        float beginX = e1.getX();
        float endX = e2.getX();
        float beginY = e1.getY();
        float endY = e2.getY();
        float X = imageView.getX();
        float Y = imageView.getY();
float x1=img2.getX();
        float y1=img2.getY();
        if (beginX - endX > minMove && Math.abs( velocityX ) > minVelocity) {
            imageView.setX( X - 100 );

        } else if (endX - beginX > minMove && Math.abs( velocityX ) > minVelocity) {
            imageView.setX( X + 100 );
        }
        final AlertDialog.Builder builder;
        builder = new Builder( this );


        return true;
    }

}