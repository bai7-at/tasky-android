package com.nytimes.android.subauth.core.auth.util;

import androidx.fragment.app.f;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import defpackage.by0;
import defpackage.d44;
import defpackage.e44;
import defpackage.ei1;
import defpackage.o98;
import defpackage.ss2;
import defpackage.xq5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public abstract class AssistedLoginLifecycleObserver implements ei1 {
    private final f a;
    private final NYTUser b;
    private final o98 c;
    private final xq5 d;
    private final String e;
    private final ss2 f;
    private final CoroutineDispatcher g;
    private final MutableStateFlow h;
    private final StateFlow i;

    public /* synthetic */ AssistedLoginLifecycleObserver(f fVar, NYTUser nYTUser, o98 o98Var, xq5 xq5Var, String str, ss2 ss2Var, CoroutineDispatcher coroutineDispatcher, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, nYTUser, o98Var, xq5Var, str, ss2Var, coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        this.d.c(this.e);
    }

    public final boolean c() {
        return (!this.c.H() || this.d.a(this.e) || this.b.r()) ? false : true;
    }

    public final ss2 d() {
        return this.f;
    }

    public final StateFlow e() {
        return this.i;
    }

    public final Object f(by0 by0Var) {
        return BuildersKt.withContext(this.g, new AssistedLoginLifecycleObserver$launchAssistedLogin$2(this, null), by0Var);
    }

    @Override // defpackage.ei1
    public void onStart(d44 d44Var) {
        zq3.h(d44Var, "owner");
        BuildersKt__Builders_commonKt.launch$default(e44.a(this.a), this.g, null, new AssistedLoginLifecycleObserver$onStart$1(this, null), 2, null);
    }

    private AssistedLoginLifecycleObserver(f fVar, NYTUser nYTUser, o98 o98Var, xq5 xq5Var, String str, ss2 ss2Var, CoroutineDispatcher coroutineDispatcher) {
        this.a = fVar;
        this.b = nYTUser;
        this.c = o98Var;
        this.d = xq5Var;
        this.e = str;
        this.f = ss2Var;
        this.g = coroutineDispatcher;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.h = MutableStateFlow;
        this.i = MutableStateFlow;
    }

    public /* synthetic */ AssistedLoginLifecycleObserver(f fVar, NYTUser nYTUser, o98 o98Var, xq5 xq5Var, String str, ss2 ss2Var, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, nYTUser, o98Var, xq5Var, str, ss2Var, (i & 64) != 0 ? Dispatchers.getIO() : coroutineDispatcher, null);
    }
}
