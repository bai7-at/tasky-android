package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.e;
import defpackage.k91;
import defpackage.ov3;
import defpackage.yu4;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
class b implements e, k91.a {
    private final List a;
    private final f b;
    private final e.a c;
    private int d;
    private ov3 e;
    private List f;
    private int g;
    private volatile yu4.a h;
    private File i;

    b(f fVar, e.a aVar) {
        this(fVar.c(), fVar, aVar);
    }

    private boolean a() {
        return this.g < this.f.size();
    }

    @Override // com.bumptech.glide.load.engine.e
    public boolean b() {
        while (true) {
            boolean z = false;
            if (this.f != null && a()) {
                this.h = null;
                while (!z && a()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    this.h = ((yu4) list.get(i)).a(this.i, this.b.s(), this.b.f(), this.b.k());
                    if (this.h != null && this.b.t(this.h.c.a())) {
                        this.h.c.d(this.b.l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            ov3 ov3Var = (ov3) this.a.get(this.d);
            File a = this.b.d().a(new c(ov3Var, this.b.o()));
            this.i = a;
            if (a != null) {
                this.e = ov3Var;
                this.f = this.b.j(a);
                this.g = 0;
            }
        }
    }

    @Override // k91.a
    public void c(Exception exc) {
        this.c.a(this.e, exc, this.h.c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.e
    public void cancel() {
        yu4.a aVar = this.h;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // k91.a
    public void f(Object obj) {
        this.c.d(this.e, obj, this.h.c, DataSource.DATA_DISK_CACHE, this.e);
    }

    b(List list, f fVar, e.a aVar) {
        this.d = -1;
        this.a = list;
        this.b = fVar;
        this.c = aVar;
    }
}
