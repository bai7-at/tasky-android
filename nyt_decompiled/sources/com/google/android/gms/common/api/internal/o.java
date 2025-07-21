package com.google.android.gms.common.api.internal;

import defpackage.ho9;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class o extends ho9 {
    private final WeakReference a;

    o(zaaw zaawVar) {
        this.a = new WeakReference(zaawVar);
    }

    @Override // defpackage.oo9
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        zabi zabiVar;
        zaaw zaawVar = (zaaw) this.a.get();
        if (zaawVar == null) {
            return;
        }
        zabiVar = zaawVar.zaa;
        zabiVar.zal(new n(this, zaawVar, zaawVar, zakVar));
    }
}
