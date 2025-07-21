package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.b;
import defpackage.t18;
import defpackage.ur;
import defpackage.v64;
import defpackage.z19;
import defpackage.z91;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i implements Loader.e {
    public final long a;
    public final b b;
    public final int c;
    private final t18 d;
    private final a e;
    private volatile Object f;

    public interface a {
        Object a(Uri uri, InputStream inputStream);
    }

    public i(com.google.android.exoplayer2.upstream.a aVar, Uri uri, int i, a aVar2) {
        this(aVar, new b.C0195b().i(uri).b(1).a(), i, aVar2);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
        this.d.u();
        z91 z91Var = new z91(this.d, this.b);
        try {
            z91Var.b();
            this.f = this.e.a((Uri) ur.e(this.d.getUri()), z91Var);
        } finally {
            z19.n(z91Var);
        }
    }

    public long b() {
        return this.d.k();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void c() {
    }

    public Map d() {
        return this.d.t();
    }

    public final Object e() {
        return this.f;
    }

    public Uri f() {
        return this.d.s();
    }

    public i(com.google.android.exoplayer2.upstream.a aVar, b bVar, int i, a aVar2) {
        this.d = new t18(aVar);
        this.b = bVar;
        this.c = i;
        this.e = aVar2;
        this.a = v64.a();
    }
}
