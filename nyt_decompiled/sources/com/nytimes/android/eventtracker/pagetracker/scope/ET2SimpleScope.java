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
import defpackage.ww8;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public class ET2SimpleScope implements ET2Scope {
    public static final int b = 8;
    private final ET2SinglePageClient a;

    public ET2SimpleScope(ET2SinglePageClient eT2SinglePageClient) {
        zq3.h(eT2SinglePageClient, "et2Client");
        this.a = eT2SinglePageClient;
    }

    public static /* synthetic */ Object i(ET2SimpleScope eT2SimpleScope, e32 e32Var, String str, String str2, wt6 wt6Var, na2 na2Var, qs2 qs2Var, ss2 ss2Var, ss2 ss2Var2, CoroutineScope coroutineScope, by0 by0Var, int i, Object obj) {
        if (obj == null) {
            return eT2SimpleScope.h(e32Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : wt6Var, (i & 16) != 0 ? null : na2Var, (i & 32) != 0 ? new qs2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope$trackPage$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Void mo865invoke() {
                    return null;
                }
            } : qs2Var, (i & 64) != 0 ? new ss2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope$trackPage$3
                public final void b(tx1 tx1Var) {
                    zq3.h(tx1Var, "$this$null");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((tx1) obj2);
                    return ww8.a;
                }
            } : ss2Var, (i & 128) != 0 ? new ss2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope$trackPage$4
                public final void b(tx1 tx1Var) {
                    zq3.h(tx1Var, "$this$null");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((tx1) obj2);
                    return ww8.a;
                }
            } : ss2Var2, coroutineScope, by0Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackPage");
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

    public final Object h(e32 e32Var, String str, String str2, wt6 wt6Var, na2 na2Var, qs2 qs2Var, ss2 ss2Var, ss2 ss2Var2, CoroutineScope coroutineScope, by0 by0Var) {
        return d().e(e32Var, str, str2, wt6Var, na2Var, qs2Var, ss2Var, ss2Var2, coroutineScope, by0Var);
    }
}
