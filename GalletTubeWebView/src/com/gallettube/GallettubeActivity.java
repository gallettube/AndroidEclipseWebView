package  com.gallettube;
import com.certiorem.webview.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GallettubeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) { 
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.main); 
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("https://www.youtube.com/c/jongalletero");
        webView.setWebViewClient(new WebViewClient());
    }
}