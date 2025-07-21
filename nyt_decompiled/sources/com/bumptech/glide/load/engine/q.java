package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.e;
import defpackage.k91;
import defpackage.ov3;
import defpackage.yu4;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
class q implements e, k91.a {
    private final e.a a;
    private final f b;
    private int c;
    private int d = -1;
    private ov3 e;
    private List f;
    private int g;
    private volatile yu4.a h;
    private File i;
    private r j;

    q(f fVar, e.a aVar) {
        this.b = fVar;
        this.a = aVar;
    }

    private boolean a() {
        return this.g < this.f.size();
    }

    @Override // com.bumptech.glide.load.engine.e
    public boolean b() {
        List c = this.b.c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List m = this.b.m();
        if (m.isEmpty()) {
            if (File.class.equals(this.b.q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.b.i() + " to " + this.b.q());
        }
        while (true) {
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
            if (i2 >= m.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= c.size()) {
                    return false;
                }
                this.d = 0;
            }
            ov3 ov3Var = (ov3) c.get(this.c);
            Class cls = (Class) m.get(this.d);
            this.j = new r(this.b.b(), ov3Var, this.b.o(), this.b.s(), this.b.f(), this.b.r(cls), cls, this.b.k());
            File a = this.b.d().a(this.j);
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
        this.a.a(this.j, exc, this.h.c, DataSource.RESOURCE_DISK_CACHE);
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
        this.a.d(this.e, obj, this.h.c, DataSource.RESOURCE_DISK_CACHE, this.j);
    }
}
