package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ok0 implements Loader.e {
    public final long a = v64.a();
    public final b b;
    public final int c;
    public final t0 d;
    public final int e;
    public final Object f;
    public final long g;
    public final long h;
    protected final t18 i;

    public ok0(a aVar, b bVar, int i, t0 t0Var, int i2, Object obj, long j, long j2) {
        this.i = new t18(aVar);
        this.b = (b) ur.e(bVar);
        this.c = i;
        this.d = t0Var;
        this.e = i2;
        this.f = obj;
        this.g = j;
        this.h = j2;
    }

    public final long b() {
        return this.i.k();
    }

    public final long d() {
        return this.h - this.g;
    }

    public final Map e() {
        return this.i.t();
    }

    public final Uri f() {
        return this.i.s();
    }
}
