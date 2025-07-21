package com.nytimes.android.eventtracker.pagetracker.scope;

import com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.by0;
import defpackage.e32;
import defpackage.e52;
import defpackage.na2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.ue4;
import defpackage.wt6;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class ET2CoroutineScope implements ET2Scope, CoroutineScope {
    private final ET2SinglePageClient a;
    private final /* synthetic */ CoroutineScope b;

    public ET2CoroutineScope(ET2SinglePageClient eT2SinglePageClient, CoroutineScope coroutineScope) {
        zq3.h(eT2SinglePageClient, "et2Client");
        zq3.h(coroutineScope, "coroutineScope");
        this.a = eT2SinglePageClient;
        this.b = coroutineScope;
    }

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope, com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope
    public void a(e52 e52Var, ue4 ue4Var, ue4 ue4Var2, qs2 qs2Var) {
        ET2Scope.DefaultImpls.g(this, e52Var, ue4Var, ue4Var2, qs2Var);
    }

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope, com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope
    public void b() {
        ET2Scope.DefaultImpls.h(this);
    }

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope
    public tx1 c() {
        return ET2Scope.DefaultImpls.f(this);
    }

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope
    public ET2SinglePageClient d() {
        return this.a;
    }

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope
    public Object e(ss2 ss2Var, by0 by0Var) {
        return ET2Scope.DefaultImpls.c(this, ss2Var, by0Var);
    }

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope
    public Flow f() {
        return ET2Scope.DefaultImpls.e(this);
    }

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope
    public Object g(e32 e32Var, by0 by0Var) {
        return ET2Scope.DefaultImpls.b(this, e32Var, by0Var);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    public final Object h(e32 e32Var, String str, String str2, wt6 wt6Var, na2 na2Var, qs2 qs2Var, ss2 ss2Var, ss2 ss2Var2, by0 by0Var) {
        return d().e(e32Var, str, str2, wt6Var, na2Var, qs2Var, ss2Var, ss2Var2, this, by0Var);
    }
}
