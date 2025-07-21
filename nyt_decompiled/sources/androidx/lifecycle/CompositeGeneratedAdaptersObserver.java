package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.d44;
import defpackage.pt4;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements g {
    private final c[] a;

    public CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        zq3.h(cVarArr, "generatedAdapters");
        this.a = cVarArr;
    }

    @Override // androidx.lifecycle.g
    public void h(d44 d44Var, Lifecycle.Event event) {
        zq3.h(d44Var, "source");
        zq3.h(event, "event");
        new pt4();
        c[] cVarArr = this.a;
        if (cVarArr.length > 0) {
            c cVar = cVarArr[0];
            throw null;
        }
        if (cVarArr.length <= 0) {
            return;
        }
        c cVar2 = cVarArr[0];
        throw null;
    }
}
