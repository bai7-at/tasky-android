package com.google.android.gms.internal.ads;

import defpackage.mge;
import java.util.Map;

/* loaded from: classes3.dex */
final class a9 extends o8 {
    private final Object a;
    private int b;
    final /* synthetic */ zzfzj c;

    a9(zzfzj zzfzjVar, int i) {
        this.c = zzfzjVar;
        this.a = zzfzj.n(zzfzjVar, i);
        this.b = i;
    }

    private final void a() {
        int E;
        int i = this.b;
        if (i == -1 || i >= this.c.size() || !mge.a(this.a, zzfzj.n(this.c, this.b))) {
            E = this.c.E(this.a);
            this.b = E;
        }
    }

    @Override // com.google.android.gms.internal.ads.o8, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.o8, java.util.Map.Entry
    public final Object getValue() {
        Map t = this.c.t();
        if (t != null) {
            return t.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return zzfzj.r(this.c, i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map t = this.c.t();
        if (t != null) {
            return t.put(this.a, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            this.c.put(this.a, obj);
            return null;
        }
        zzfzj zzfzjVar = this.c;
        Object r = zzfzj.r(zzfzjVar, i);
        zzfzj.v(zzfzjVar, this.b, obj);
        return r;
    }
}
