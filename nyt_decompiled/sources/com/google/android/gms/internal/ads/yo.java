package com.google.android.gms.internal.ads;

import defpackage.fyb;
import defpackage.jzf;
import defpackage.l0c;
import defpackage.n1c;
import defpackage.z4c;

/* loaded from: classes3.dex */
final class yo extends jzf {
    private final l0c g;

    yo(zo zoVar, n1c n1cVar) {
        super(n1cVar);
        this.g = new l0c();
    }

    @Override // defpackage.jzf, defpackage.n1c
    public final fyb d(int i, fyb fybVar, boolean z) {
        fyb d = this.f.d(i, fybVar, z);
        if (this.f.e(d.c, this.g, 0L).b()) {
            d.l(fybVar.a, fybVar.b, fybVar.c, fybVar.d, 0L, z4c.e, true);
        } else {
            d.f = true;
        }
        return d;
    }
}
