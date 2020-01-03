package bob.example.mybackgroundthread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity implements
        MyAsyncCallback {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onPreExecute() {

    }

    @Override
    public void onPostExecute(String text) {

    }

    private static class DemoAsync extends AsyncTask<String, Void, String> {
        static final String LOG_ASYNC = "DemoAsync";
        WeakReference<MyAsyncCallback> myListener;

        DemoAsync(MyAsyncCallback myListener) {
            this.myListener = new WeakReference<>(myListener);
        }

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }
    }

    interface MyAsyncCallback {
        void onPreExecute();

        void onPostExecute(String text);
    }
}
