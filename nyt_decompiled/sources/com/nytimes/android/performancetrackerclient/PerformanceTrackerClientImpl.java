package com.nytimes.android.performancetrackerclient;

import defpackage.d44;
import defpackage.ei1;
import defpackage.lh4;
import defpackage.zq3;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class PerformanceTrackerClientImpl implements ei1 {
    private final Map a;

    @Override // defpackage.ei1
    public void onPause(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onPause(d44Var);
        Iterator it2 = this.a.entrySet().iterator();
        if (it2.hasNext()) {
            lh4.a(((Map.Entry) it2.next()).getValue());
            throw null;
        }
    }

    @Override // defpackage.ei1
    public void onResume(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onResume(d44Var);
        Iterator it2 = this.a.entrySet().iterator();
        if (it2.hasNext()) {
            lh4.a(((Map.Entry) it2.next()).getValue());
            throw null;
        }
    }
}
