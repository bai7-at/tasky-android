package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import defpackage.dyf;
import defpackage.f6f;
import defpackage.glb;
import defpackage.j64;
import defpackage.kye;
import defpackage.mpa;
import defpackage.pgb;
import defpackage.pla;
import defpackage.qve;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class j6 extends qve {
    private final Context e;
    private final kye f;
    private final String g;
    private final int h;
    private final boolean i;
    private InputStream j;
    private boolean k;
    private Uri l;
    private volatile zzbbb m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private long r;
    private j64 s;
    private final AtomicLong t;
    private final glb u;

    public j6(Context context, kye kyeVar, String str, int i, f6f f6fVar, glb glbVar) {
        super(false);
        this.e = context;
        this.f = kyeVar;
        this.u = glbVar;
        this.g = str;
        this.h = i;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = 0L;
        this.t = new AtomicLong(-1L);
        this.s = null;
        this.i = ((Boolean) pla.c().a(mpa.Q1)).booleanValue();
        h(f6fVar);
    }

    private final boolean u() {
        if (!this.i) {
            return false;
        }
        if (!((Boolean) pla.c().a(mpa.m4)).booleanValue() || this.p) {
            return ((Boolean) pla.c().a(mpa.n4)).booleanValue() && !this.q;
        }
        return true;
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        if (!this.k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.j;
        int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.f.b(bArr, i, i2);
        if (!this.i || this.j != null) {
            zzg(read);
        }
        return read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01eb  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // defpackage.kye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(defpackage.u1f r14) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j6.e(u1f):long");
    }

    public final long n() {
        return this.r;
    }

    public final long o() {
        if (this.m != null) {
            if (this.t.get() != -1) {
                return this.t.get();
            }
            synchronized (this) {
                try {
                    if (this.s == null) {
                        this.s = pgb.a.j(new Callable() { // from class: com.google.android.gms.internal.ads.i6
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return j6.this.p();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.s.isDone()) {
                try {
                    this.t.compareAndSet(-1L, ((Long) this.s.get()).longValue());
                    return this.t.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    final /* synthetic */ Long p() {
        return Long.valueOf(dyf.e().a(this.m));
    }

    public final boolean q() {
        return this.n;
    }

    public final boolean r() {
        return this.q;
    }

    public final boolean s() {
        return this.p;
    }

    public final boolean t() {
        return this.o;
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        return this.l;
    }

    @Override // defpackage.kye
    public final void zzd() {
        if (!this.k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.k = false;
        this.l = null;
        boolean z = (this.i && this.j == null) ? false : true;
        InputStream inputStream = this.j;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.j = null;
        } else {
            this.f.zzd();
        }
        if (z) {
            k();
        }
    }
}
