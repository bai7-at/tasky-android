package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i0f {
    private Uri a;
    private Map b = Collections.emptyMap();
    private long c;
    private int d;

    public final i0f a(int i) {
        this.d = 6;
        return this;
    }

    public final i0f b(Map map) {
        this.b = map;
        return this;
    }

    public final i0f c(long j) {
        this.c = j;
        return this;
    }

    public final i0f d(Uri uri) {
        this.a = uri;
        return this;
    }

    public final u1f e() {
        if (this.a != null) {
            return new u1f(this.a, this.b, this.c, this.d);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
