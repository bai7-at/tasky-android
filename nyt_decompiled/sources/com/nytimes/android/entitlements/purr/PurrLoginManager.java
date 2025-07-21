package com.nytimes.android.entitlements.purr;

import com.nytimes.android.entitlements.a;
import defpackage.d96;
import defpackage.zq3;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class PurrLoginManager {
    private final d96 a;
    private final a b;
    private final CoroutineDispatcher c;
    private CoroutineScope d;

    public PurrLoginManager(d96 d96Var, a aVar, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(d96Var, "purrManagerClient");
        zq3.h(aVar, "ecommClient");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.a = d96Var;
        this.b = aVar;
        this.c = coroutineDispatcher;
    }

    private final CoroutineScope b() {
        CompletableJob Job$default;
        CoroutineScope coroutineScope = this.d;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(this.c));
        this.d = CoroutineScope;
        return CoroutineScope;
    }

    public final void c() {
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(this.b.e(), new PurrLoginManager$start$1(this, null)), new PurrLoginManager$start$2(null)), b());
    }
}
