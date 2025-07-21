package com.dropbox.android.external.store4.impl;

import com.dropbox.android.external.store4.SourceOfTruth;
import defpackage.by0;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class PersistentNonFlowingSourceOfTruth implements SourceOfTruth {
    private final gt2 b;
    private final it2 c;
    private final gt2 d;
    private final ss2 e;

    public PersistentNonFlowingSourceOfTruth(gt2 gt2Var, it2 it2Var, gt2 gt2Var2, ss2 ss2Var) {
        zq3.h(gt2Var, "realReader");
        zq3.h(it2Var, "realWriter");
        this.b = gt2Var;
        this.c = it2Var;
        this.d = gt2Var2;
        this.e = ss2Var;
    }

    @Override // com.dropbox.android.external.store4.SourceOfTruth
    public Flow a(Object obj) {
        return FlowKt.flow(new PersistentNonFlowingSourceOfTruth$reader$1(this, obj, null));
    }

    @Override // com.dropbox.android.external.store4.SourceOfTruth
    public Object b(Object obj, Object obj2, by0 by0Var) {
        Object invoke = this.c.invoke(obj, obj2, by0Var);
        return invoke == a.h() ? invoke : ww8.a;
    }
}
