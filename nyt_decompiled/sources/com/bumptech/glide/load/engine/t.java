package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.e;
import defpackage.b12;
import defpackage.b94;
import defpackage.k91;
import defpackage.ov3;
import defpackage.tr1;
import defpackage.yu4;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
class t implements e, e.a {
    private final f a;
    private final e.a b;
    private int c;
    private b d;
    private Object e;
    private volatile yu4.a f;
    private c g;

    class a implements k91.a {
        final /* synthetic */ yu4.a a;

        a(yu4.a aVar) {
            this.a = aVar;
        }

        @Override // k91.a
        public void c(Exception exc) {
            if (t.this.g(this.a)) {
                t.this.i(this.a, exc);
            }
        }

        @Override // k91.a
        public void f(Object obj) {
            if (t.this.g(this.a)) {
                t.this.h(this.a, obj);
            }
        }
    }

    t(f fVar, e.a aVar) {
        this.a = fVar;
        this.b = aVar;
    }

    private void e(Object obj) {
        long b = b94.b();
        try {
            b12 p = this.a.p(obj);
            d dVar = new d(p, obj, this.a.k());
            this.g = new c(this.f.a, this.a.o());
            this.a.d().b(this.g, dVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.g + ", data: " + obj + ", encoder: " + p + ", duration: " + b94.a(b));
            }
            this.f.c.b();
            this.d = new b(Collections.singletonList(this.f.a), this.a, this);
        } catch (Throwable th) {
            this.f.c.b();
            throw th;
        }
    }

    private boolean f() {
        return this.c < this.a.g().size();
    }

    private void j(yu4.a aVar) {
        this.f.c.d(this.a.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void a(ov3 ov3Var, Exception exc, k91 k91Var, DataSource dataSource) {
        this.b.a(ov3Var, exc, k91Var, this.f.c.e());
    }

    @Override // com.bumptech.glide.load.engine.e
    public boolean b() {
        Object obj = this.e;
        if (obj != null) {
            this.e = null;
            e(obj);
        }
        b bVar = this.d;
        if (bVar != null && bVar.b()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while (!z && f()) {
            List g = this.a.g();
            int i = this.c;
            this.c = i + 1;
            this.f = (yu4.a) g.get(i);
            if (this.f != null && (this.a.e().c(this.f.c.e()) || this.a.t(this.f.c.a()))) {
                j(this.f);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.e
    public void cancel() {
        yu4.a aVar = this.f;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void d(ov3 ov3Var, Object obj, k91 k91Var, DataSource dataSource, ov3 ov3Var2) {
        this.b.d(ov3Var, obj, k91Var, this.f.c.e(), ov3Var);
    }

    boolean g(yu4.a aVar) {
        yu4.a aVar2 = this.f;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(yu4.a aVar, Object obj) {
        tr1 e = this.a.e();
        if (obj != null && e.c(aVar.c.e())) {
            this.e = obj;
            this.b.c();
        } else {
            e.a aVar2 = this.b;
            ov3 ov3Var = aVar.a;
            k91 k91Var = aVar.c;
            aVar2.d(ov3Var, obj, k91Var, k91Var.e(), this.g);
        }
    }

    void i(yu4.a aVar, Exception exc) {
        e.a aVar2 = this.b;
        c cVar = this.g;
        k91 k91Var = aVar.c;
        aVar2.a(cVar, exc, k91Var, k91Var.e());
    }
}
