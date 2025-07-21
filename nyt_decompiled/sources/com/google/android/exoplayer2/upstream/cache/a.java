package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import defpackage.jg0;
import defpackage.lg0;
import defpackage.mw0;
import defpackage.ow0;
import defpackage.sq8;
import defpackage.ur;
import defpackage.w91;
import defpackage.z19;
import defpackage.zg8;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a implements com.google.android.exoplayer2.upstream.a {
    private final Cache a;
    private final com.google.android.exoplayer2.upstream.a b;
    private final com.google.android.exoplayer2.upstream.a c;
    private final com.google.android.exoplayer2.upstream.a d;
    private final jg0 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private Uri i;
    private com.google.android.exoplayer2.upstream.b j;
    private com.google.android.exoplayer2.upstream.b k;
    private com.google.android.exoplayer2.upstream.a l;
    private long m;
    private long n;
    private long o;
    private lg0 p;
    private boolean q;
    private boolean r;
    private long s;
    private long t;

    public interface b {
    }

    public static final class c implements a.InterfaceC0194a {
        private Cache a;
        private w91.a c;
        private boolean e;
        private a.InterfaceC0194a f;
        private int g;
        private int h;
        private a.InterfaceC0194a b = new FileDataSource.b();
        private jg0 d = jg0.a;

        private a c(com.google.android.exoplayer2.upstream.a aVar, int i, int i2) {
            w91 w91Var;
            Cache cache = (Cache) ur.e(this.a);
            if (this.e || aVar == null) {
                w91Var = null;
            } else {
                w91.a aVar2 = this.c;
                w91Var = aVar2 != null ? aVar2.a() : new CacheDataSink.a().b(cache).a();
            }
            return new a(cache, aVar, this.b.a(), w91Var, this.d, i, null, i2, null);
        }

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0194a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a() {
            a.InterfaceC0194a interfaceC0194a = this.f;
            return c(interfaceC0194a != null ? interfaceC0194a.a() : null, this.h, this.g);
        }

        public c d(Cache cache) {
            this.a = cache;
            return this;
        }

        public c e(int i) {
            this.h = i;
            return this;
        }

        public c f(a.InterfaceC0194a interfaceC0194a) {
            this.f = interfaceC0194a;
            return this;
        }
    }

    private void A(com.google.android.exoplayer2.upstream.b bVar, boolean z) {
        lg0 f;
        long j;
        com.google.android.exoplayer2.upstream.b a;
        com.google.android.exoplayer2.upstream.a aVar;
        String str = (String) z19.j(bVar.i);
        if (this.r) {
            f = null;
        } else if (this.f) {
            try {
                f = this.a.f(str, this.n, this.o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            f = this.a.d(str, this.n, this.o);
        }
        if (f == null) {
            aVar = this.d;
            a = bVar.a().h(this.n).g(this.o).a();
        } else if (f.d) {
            Uri fromFile = Uri.fromFile((File) z19.j(f.e));
            long j2 = f.b;
            long j3 = this.n - j2;
            long j4 = f.c - j3;
            long j5 = this.o;
            if (j5 != -1) {
                j4 = Math.min(j4, j5);
            }
            a = bVar.a().i(fromFile).k(j2).h(j3).g(j4).a();
            aVar = this.b;
        } else {
            if (f.c()) {
                j = this.o;
            } else {
                j = f.c;
                long j6 = this.o;
                if (j6 != -1) {
                    j = Math.min(j, j6);
                }
            }
            a = bVar.a().h(this.n).g(j).a();
            aVar = this.c;
            if (aVar == null) {
                aVar = this.d;
                this.a.c(f);
                f = null;
            }
        }
        this.t = (this.r || aVar != this.d) ? Long.MAX_VALUE : this.n + 102400;
        if (z) {
            ur.g(u());
            if (aVar == this.d) {
                return;
            }
            try {
                k();
            } finally {
            }
        }
        if (f != null && f.b()) {
            this.p = f;
        }
        this.l = aVar;
        this.k = a;
        this.m = 0L;
        long b2 = aVar.b(a);
        ow0 ow0Var = new ow0();
        if (a.h == -1 && b2 != -1) {
            this.o = b2;
            ow0.g(ow0Var, this.n + b2);
        }
        if (w()) {
            Uri uri = aVar.getUri();
            this.i = uri;
            ow0.h(ow0Var, bVar.a.equals(uri) ? null : this.i);
        }
        if (x()) {
            this.a.h(str, ow0Var);
        }
    }

    private void B(String str) {
        this.o = 0L;
        if (x()) {
            ow0 ow0Var = new ow0();
            ow0.g(ow0Var, this.n);
            this.a.h(str, ow0Var);
        }
    }

    private int C(com.google.android.exoplayer2.upstream.b bVar) {
        if (this.g && this.q) {
            return 0;
        }
        return (this.h && bVar.h == -1) ? 1 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void k() {
        com.google.android.exoplayer2.upstream.a aVar = this.l;
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } finally {
            this.k = null;
            this.l = null;
            lg0 lg0Var = this.p;
            if (lg0Var != null) {
                this.a.c(lg0Var);
                this.p = null;
            }
        }
    }

    private static Uri s(Cache cache, String str, Uri uri) {
        Uri c2 = mw0.c(cache.b(str));
        return c2 != null ? c2 : uri;
    }

    private void t(Throwable th) {
        if (v() || (th instanceof Cache.CacheException)) {
            this.q = true;
        }
    }

    private boolean u() {
        return this.l == this.d;
    }

    private boolean v() {
        return this.l == this.b;
    }

    private boolean w() {
        return !v();
    }

    private boolean x() {
        return this.l == this.c;
    }

    private void y() {
    }

    private void z(int i) {
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long b(com.google.android.exoplayer2.upstream.b bVar) {
        try {
            String a = this.e.a(bVar);
            com.google.android.exoplayer2.upstream.b a2 = bVar.a().f(a).a();
            this.j = a2;
            this.i = s(this.a, a, a2.a);
            this.n = bVar.g;
            int C = C(bVar);
            boolean z = C != -1;
            this.r = z;
            if (z) {
                z(C);
            }
            if (this.r) {
                this.o = -1L;
            } else {
                long d = mw0.d(this.a.b(a));
                this.o = d;
                if (d != -1) {
                    long j = d - bVar.g;
                    this.o = j;
                    if (j < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long j2 = bVar.h;
            if (j2 != -1) {
                long j3 = this.o;
                if (j3 != -1) {
                    j2 = Math.min(j3, j2);
                }
                this.o = j2;
            }
            long j4 = this.o;
            if (j4 > 0 || j4 == -1) {
                A(a2, false);
            }
            long j5 = bVar.h;
            return j5 != -1 ? j5 : this.o;
        } catch (Throwable th) {
            t(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        this.j = null;
        this.i = null;
        this.n = 0L;
        y();
        try {
            k();
        } catch (Throwable th) {
            t(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map f() {
        return w() ? this.d.f() : Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri getUri() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void i(sq8 sq8Var) {
        ur.e(sq8Var);
        this.b.i(sq8Var);
        this.d.i(sq8Var);
    }

    @Override // defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        com.google.android.exoplayer2.upstream.b bVar = (com.google.android.exoplayer2.upstream.b) ur.e(this.j);
        com.google.android.exoplayer2.upstream.b bVar2 = (com.google.android.exoplayer2.upstream.b) ur.e(this.k);
        try {
            if (this.n >= this.t) {
                A(bVar, true);
            }
            int read = ((com.google.android.exoplayer2.upstream.a) ur.e(this.l)).read(bArr, i, i2);
            if (read == -1) {
                if (w()) {
                    long j = bVar2.h;
                    if (j == -1 || this.m < j) {
                        B((String) z19.j(bVar.i));
                    }
                }
                long j2 = this.o;
                if (j2 <= 0) {
                    if (j2 == -1) {
                    }
                }
                k();
                A(bVar, false);
                return read(bArr, i, i2);
            }
            if (v()) {
                this.s += read;
            }
            long j3 = read;
            this.n += j3;
            this.m += j3;
            long j4 = this.o;
            if (j4 != -1) {
                this.o = j4 - j3;
            }
            return read;
        } catch (Throwable th) {
            t(th);
            throw th;
        }
    }

    private a(Cache cache, com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.a aVar2, w91 w91Var, jg0 jg0Var, int i, PriorityTaskManager priorityTaskManager, int i2, b bVar) {
        this.a = cache;
        this.b = aVar2;
        this.e = jg0Var == null ? jg0.a : jg0Var;
        this.f = (i & 1) != 0;
        this.g = (i & 2) != 0;
        this.h = (i & 4) != 0;
        if (aVar != null) {
            this.d = aVar;
            this.c = w91Var != null ? new zg8(aVar, w91Var) : null;
        } else {
            this.d = j.a;
            this.c = null;
        }
    }
}
