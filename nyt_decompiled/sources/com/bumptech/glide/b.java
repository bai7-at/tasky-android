package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.a;
import com.bumptech.glide.load.engine.h;
import defpackage.dd4;
import defpackage.ed4;
import defpackage.kd4;
import defpackage.nq3;
import defpackage.ny6;
import defpackage.ou0;
import defpackage.pp4;
import defpackage.py6;
import defpackage.rr1;
import defpackage.so;
import defpackage.tg1;
import defpackage.to;
import defpackage.tp4;
import defpackage.w03;
import defpackage.w80;
import defpackage.x80;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    private h b;
    private w80 c;
    private to d;
    private pp4 e;
    private w03 f;
    private w03 g;
    private rr1.a h;
    private tp4 i;
    private ou0 j;
    private ny6.b m;
    private w03 n;
    private boolean o;
    private List p;
    private boolean q;
    private boolean r;
    private final Map a = new so();
    private int k = 4;
    private a.InterfaceC0146a l = new a();

    class a implements a.InterfaceC0146a {
        a() {
        }

        @Override // com.bumptech.glide.a.InterfaceC0146a
        public py6 build() {
            return new py6();
        }
    }

    com.bumptech.glide.a a(Context context) {
        if (this.f == null) {
            this.f = w03.h();
        }
        if (this.g == null) {
            this.g = w03.f();
        }
        if (this.n == null) {
            this.n = w03.d();
        }
        if (this.i == null) {
            this.i = new tp4.a(context).a();
        }
        if (this.j == null) {
            this.j = new tg1();
        }
        if (this.c == null) {
            int b = this.i.b();
            if (b > 0) {
                this.c = new ed4(b);
            } else {
                this.c = new x80();
            }
        }
        if (this.d == null) {
            this.d = new dd4(this.i.a());
        }
        if (this.e == null) {
            this.e = new kd4(this.i.d());
        }
        if (this.h == null) {
            this.h = new nq3(context);
        }
        if (this.b == null) {
            this.b = new h(this.e, this.h, this.g, this.f, w03.k(), this.n, this.o);
        }
        List list = this.p;
        if (list == null) {
            this.p = Collections.emptyList();
        } else {
            this.p = Collections.unmodifiableList(list);
        }
        return new com.bumptech.glide.a(context, this.b, this.e, this.c, this.d, new ny6(this.m), this.j, this.k, this.l, this.a, this.p, this.q, this.r);
    }

    void b(ny6.b bVar) {
        this.m = bVar;
    }
}
