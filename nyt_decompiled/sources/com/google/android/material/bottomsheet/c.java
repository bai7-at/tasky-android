package com.google.android.material.bottomsheet;

import android.view.View;
import defpackage.ch9;
import defpackage.hi;
import defpackage.pg9;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class c extends pg9.b {
    private final View c;
    private int d;
    private int e;
    private final int[] f;

    public c(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // pg9.b
    public void c(pg9 pg9Var) {
        this.c.setTranslationY(0.0f);
    }

    @Override // pg9.b
    public void d(pg9 pg9Var) {
        this.c.getLocationOnScreen(this.f);
        this.d = this.f[1];
    }

    @Override // pg9.b
    public ch9 e(ch9 ch9Var, List list) {
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if ((((pg9) it2.next()).c() & ch9.l.c()) != 0) {
                this.c.setTranslationY(hi.c(this.e, 0, r0.b()));
                break;
            }
        }
        return ch9Var;
    }

    @Override // pg9.b
    public pg9.a f(pg9 pg9Var, pg9.a aVar) {
        this.c.getLocationOnScreen(this.f);
        int i = this.d - this.f[1];
        this.e = i;
        this.c.setTranslationY(i);
        return aVar;
    }
}
