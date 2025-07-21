package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.http.HttpHeader;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import defpackage.k91;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes2.dex */
public class gb3 implements k91 {
    static final b g = new a();
    private final z03 a;
    private final int b;
    private final b c;
    private HttpURLConnection d;
    private InputStream e;
    private volatile boolean f;

    private static class a implements b {
        a() {
        }

        @Override // gb3.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public gb3(z03 z03Var, int i) {
        this(z03Var, i, g);
    }

    private InputStream c(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.e = kw0.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.e = httpURLConnection.getInputStream();
        }
        return this.e;
    }

    private static boolean f(int i) {
        return i / 100 == 2;
    }

    private static boolean g(int i) {
        return i / 100 == 3;
    }

    private InputStream h(URL url, int i, URL url2, Map map) {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.d = this.c.a(url);
        for (Map.Entry entry : map.entrySet()) {
            this.d.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        this.d.setConnectTimeout(this.b);
        this.d.setReadTimeout(this.b);
        this.d.setUseCaches(false);
        this.d.setDoInput(true);
        this.d.setInstanceFollowRedirects(false);
        this.d.connect();
        this.e = this.d.getInputStream();
        if (this.f) {
            return null;
        }
        int responseCode = this.d.getResponseCode();
        if (f(responseCode)) {
            return c(this.d);
        }
        if (!g(responseCode)) {
            if (responseCode == -1) {
                throw new HttpException(responseCode);
            }
            throw new HttpException(this.d.getResponseMessage(), responseCode);
        }
        String headerField = this.d.getHeaderField(HttpHeader.LOCATION);
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        b();
        return h(url3, i + 1, url, map);
    }

    @Override // defpackage.k91
    public Class a() {
        return InputStream.class;
    }

    @Override // defpackage.k91
    public void b() {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.d = null;
    }

    @Override // defpackage.k91
    public void cancel() {
        this.f = true;
    }

    @Override // defpackage.k91
    public void d(Priority priority, k91.a aVar) {
        StringBuilder sb;
        long b2 = b94.b();
        try {
            try {
                aVar.f(h(this.a.h(), 0, null, this.a.e()));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                aVar.c(e);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(b94.a(b2));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + b94.a(b2));
            }
            throw th;
        }
    }

    @Override // defpackage.k91
    public DataSource e() {
        return DataSource.REMOTE;
    }

    gb3(z03 z03Var, int i, b bVar) {
        this.a = z03Var;
        this.b = i;
        this.c = bVar;
    }
}
