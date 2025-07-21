package com.nytimes.android.features.settings.legal;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import defpackage.n34;
import defpackage.o34;
import defpackage.u14;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class LibrariesViewModel extends q {
    private final n34 a;
    private final o34 b;
    private final MutableStateFlow c;
    private final StateFlow d;

    public LibrariesViewModel(n34 n34Var, o34 o34Var) {
        zq3.h(n34Var, "loader");
        zq3.h(o34Var, "repository");
        this.a = n34Var;
        this.b = o34Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(u14.b.b);
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
        i();
    }

    public final StateFlow getState() {
        return this.d;
    }

    public final void i() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), Dispatchers.getIO(), null, new LibrariesViewModel$loadLibraries$1(this, null), 2, null);
    }
}
