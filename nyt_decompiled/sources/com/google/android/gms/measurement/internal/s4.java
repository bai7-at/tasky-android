package com.google.android.gms.measurement.internal;

import defpackage.cvf;
import java.util.List;

/* loaded from: classes3.dex */
final class s4 implements cvf {
    final /* synthetic */ u4 a;

    s4(u4 u4Var) {
        this.a = u4Var;
    }

    @Override // defpackage.cvf
    public final void a(int i, String str, List list, boolean z, boolean z2) {
        int i2 = i - 1;
        u3 t = i2 != 0 ? i2 != 1 ? i2 != 3 ? i2 != 4 ? this.a.a.o().t() : z ? this.a.a.o().x() : !z2 ? this.a.a.o().w() : this.a.a.o().v() : this.a.a.o().u() : z ? this.a.a.o().s() : !z2 ? this.a.a.o().r() : this.a.a.o().n() : this.a.a.o().m();
        int size = list.size();
        if (size == 1) {
            t.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            t.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            t.a(str);
        } else {
            t.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
