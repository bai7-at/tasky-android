package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u1f {
    public static final /* synthetic */ int j = 0;
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        zza.b("media3.datasource");
    }

    public final boolean a(int i) {
        return (this.i & i) == i;
    }

    public final String toString() {
        return "DataSpec[GET " + String.valueOf(this.a) + ", " + this.f + ", " + this.g + ", null, " + this.i + "]";
    }

    public u1f(Uri uri) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }

    public u1f(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i) {
        this(uri, j2 - j3, 1, null, Collections.emptyMap(), j3, j4, null, i, null);
    }

    private u1f(Uri uri, long j2, int i, byte[] bArr, Map map, long j3, long j4, String str, int i2, Object obj) {
        long j5 = j2 + j3;
        boolean z = false;
        wad.d(j5 >= 0);
        wad.d(j3 >= 0);
        if (j4 <= 0) {
            j4 = j4 == -1 ? -1L : j4;
            wad.d(z);
            this.a = uri;
            this.b = 1;
            this.c = null;
            this.d = Collections.unmodifiableMap(new HashMap(map));
            this.f = j3;
            this.e = j5;
            this.g = j4;
            this.h = null;
            this.i = i2;
        }
        z = true;
        wad.d(z);
        this.a = uri;
        this.b = 1;
        this.c = null;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.f = j3;
        this.e = j5;
        this.g = j4;
        this.h = null;
        this.i = i2;
    }
}
