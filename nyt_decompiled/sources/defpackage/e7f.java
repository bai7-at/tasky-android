package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
public final class e7f extends y5f {
    private f8f a;
    private final f8f b;
    private HttpURLConnection c;
    private g6f d;

    e7f() {
        z6f z6fVar = new f8f() { // from class: z6f
            @Override // defpackage.f8f
            public final Object zza() {
                return -1;
            }
        };
        b7f b7fVar = new f8f() { // from class: b7f
            @Override // defpackage.f8f
            public final Object zza() {
                return -1;
            }
        };
        this.a = z6fVar;
        this.b = b7fVar;
        this.d = null;
    }

    public final URLConnection b(URL url, int i) {
        final int i2 = 26624;
        this.a = new f8f(i2) { // from class: e6f
            @Override // defpackage.f8f
            public final Object zza() {
                return 26624;
            }
        };
        this.d = new g6f(url);
        b6f.b(((Integer) this.a.zza()).intValue(), -1);
        g6f g6fVar = this.d;
        g6fVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) g6fVar.a.openConnection();
        this.c = httpURLConnection;
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.c;
        b6f.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
