package com.bumptech.glide.load.engine;

import defpackage.cz6;
import defpackage.ov3;
import defpackage.z06;

/* loaded from: classes2.dex */
class m implements cz6 {
    private final boolean a;
    private final boolean b;
    private final cz6 c;
    private final a d;
    private final ov3 e;
    private int f;
    private boolean g;

    interface a {
        void a(ov3 ov3Var, m mVar);
    }

    m(cz6 cz6Var, boolean z, boolean z2, ov3 ov3Var, a aVar) {
        this.c = (cz6) z06.d(cz6Var);
        this.a = z;
        this.b = z2;
        this.e = ov3Var;
        this.d = (a) z06.d(aVar);
    }

    @Override // defpackage.cz6
    public int a() {
        return this.c.a();
    }

    synchronized void b() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    @Override // defpackage.cz6
    public synchronized void c() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.b) {
            this.c.c();
        }
    }

    @Override // defpackage.cz6
    public Class d() {
        return this.c.d();
    }

    cz6 e() {
        return this.c;
    }

    boolean f() {
        return this.a;
    }

    void g() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.d.a(this.e, this);
        }
    }

    @Override // defpackage.cz6
    public Object get() {
        return this.c.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + '}';
    }
}
