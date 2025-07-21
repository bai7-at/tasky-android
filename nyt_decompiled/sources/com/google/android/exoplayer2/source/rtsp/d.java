package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.source.rtsp.b;
import com.google.android.exoplayer2.upstream.Loader;
import defpackage.a82;
import defpackage.aa1;
import defpackage.e06;
import defpackage.hh1;
import defpackage.s91;
import defpackage.ur;
import defpackage.z19;
import defpackage.z72;

/* loaded from: classes2.dex */
final class d implements Loader.e {
    public final int a;
    public final r b;
    private final a c;
    private final a82 d;
    private final b.a f;
    private b g;
    private e h;
    private hh1 i;
    private volatile boolean j;
    private volatile long l;
    private final Handler e = z19.w();
    private volatile long k = -9223372036854775807L;

    public interface a {
        void a(String str, b bVar);
    }

    public d(int i, r rVar, a aVar, a82 a82Var, b.a aVar2) {
        this.a = i;
        this.b = rVar;
        this.c = aVar;
        this.d = a82Var;
        this.f = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str, b bVar) {
        this.c.a(str, bVar);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() {
        if (this.j) {
            this.j = false;
        }
        try {
            if (this.g == null) {
                b a2 = this.f.a(this.a);
                this.g = a2;
                final String c = a2.c();
                final b bVar = this.g;
                this.e.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.this.d(c, bVar);
                    }
                });
                this.i = new hh1((s91) ur.e(this.g), 0L, -1L);
                e eVar = new e(this.b.a, this.a);
                this.h = eVar;
                eVar.c(this.d);
            }
            while (!this.j) {
                if (this.k != -9223372036854775807L) {
                    ((e) ur.e(this.h)).a(this.l, this.k);
                    this.k = -9223372036854775807L;
                }
                if (((e) ur.e(this.h)).d((z72) ur.e(this.i), new e06()) == -1) {
                    break;
                }
            }
            this.j = false;
            if (((b) ur.e(this.g)).j()) {
                aa1.a(this.g);
                this.g = null;
            }
        } catch (Throwable th) {
            if (((b) ur.e(this.g)).j()) {
                aa1.a(this.g);
                this.g = null;
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void c() {
        this.j = true;
    }

    public void e() {
        ((e) ur.e(this.h)).g();
    }

    public void f(long j, long j2) {
        this.k = j;
        this.l = j2;
    }

    public void g(int i) {
        if (((e) ur.e(this.h)).f()) {
            return;
        }
        this.h.h(i);
    }

    public void h(long j) {
        if (j == -9223372036854775807L || ((e) ur.e(this.h)).f()) {
            return;
        }
        this.h.i(j);
    }
}
