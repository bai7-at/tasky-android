package defpackage;

import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public final class xce extends qce {
    private fhe a;
    private fhe b;
    private wce c;
    private HttpURLConnection d;

    xce(fhe fheVar, fhe fheVar2, wce wceVar) {
        this.a = fheVar;
        this.b = fheVar2;
        this.c = wceVar;
    }

    static /* synthetic */ Integer b() {
        return -1;
    }

    static /* synthetic */ Integer d() {
        return -1;
    }

    public static void m(HttpURLConnection httpURLConnection) {
        rce.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m(this.d);
    }

    public HttpURLConnection j() {
        rce.b(((Integer) this.a.zza()).intValue(), ((Integer) this.b.zza()).intValue());
        wce wceVar = this.c;
        wceVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) wceVar.zza();
        this.d = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection l(wce wceVar, final int i, final int i2) {
        this.a = new fhe() { // from class: uce
            @Override // defpackage.fhe
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.b = new fhe() { // from class: vce
            @Override // defpackage.fhe
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.c = wceVar;
        return j();
    }

    xce() {
        this(new fhe() { // from class: sce
            @Override // defpackage.fhe
            public final Object zza() {
                return xce.b();
            }
        }, new fhe() { // from class: tce
            @Override // defpackage.fhe
            public final Object zza() {
                return xce.d();
            }
        }, null);
    }
}
