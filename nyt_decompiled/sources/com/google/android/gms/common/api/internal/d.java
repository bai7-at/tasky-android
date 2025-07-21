package com.google.android.gms.common.api.internal;

import defpackage.me5;
import defpackage.og8;
import defpackage.qg8;
import java.util.Map;

/* loaded from: classes2.dex */
final class d implements me5 {
    final /* synthetic */ qg8 a;
    final /* synthetic */ zaad b;

    d(zaad zaadVar, qg8 qg8Var) {
        this.b = zaadVar;
        this.a = qg8Var;
    }

    @Override // defpackage.me5
    public final void onComplete(og8 og8Var) {
        Map map;
        map = this.b.zab;
        map.remove(this.a);
    }
}
