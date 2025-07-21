package com.bumptech.glide.load.engine;

import defpackage.b18;
import defpackage.cz6;
import defpackage.da2;
import defpackage.sz5;
import defpackage.z06;

/* loaded from: classes2.dex */
final class p implements cz6, da2.f {
    private static final sz5 e = da2.d(20, new a());
    private final b18 a = b18.a();
    private cz6 b;
    private boolean c;
    private boolean d;

    class a implements da2.d {
        a() {
        }

        @Override // da2.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a() {
            return new p();
        }
    }

    p() {
    }

    private void e(cz6 cz6Var) {
        this.d = false;
        this.c = true;
        this.b = cz6Var;
    }

    static p f(cz6 cz6Var) {
        p pVar = (p) z06.d((p) e.b());
        pVar.e(cz6Var);
        return pVar;
    }

    private void g() {
        this.b = null;
        e.a(this);
    }

    @Override // defpackage.cz6
    public int a() {
        return this.b.a();
    }

    @Override // da2.f
    public b18 b() {
        return this.a;
    }

    @Override // defpackage.cz6
    public synchronized void c() {
        this.a.c();
        this.d = true;
        if (!this.c) {
            this.b.c();
            g();
        }
    }

    @Override // defpackage.cz6
    public Class d() {
        return this.b.d();
    }

    @Override // defpackage.cz6
    public Object get() {
        return this.b.get();
    }

    synchronized void h() {
        this.a.c();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            c();
        }
    }
}
