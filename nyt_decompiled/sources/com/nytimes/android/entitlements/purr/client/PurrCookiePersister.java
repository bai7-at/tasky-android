package com.nytimes.android.entitlements.purr.client;

import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import defpackage.t86;
import defpackage.z58;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class PurrCookiePersister {
    private final z58 a;
    private final CoroutineScope b;
    private final t86 c;

    public PurrCookiePersister(z58 z58Var, CoroutineScope coroutineScope) {
        zq3.h(z58Var, "subauthClient");
        zq3.h(coroutineScope, "scope");
        this.a = z58Var;
        this.b = coroutineScope;
        this.c = new t86();
    }

    public final void b(PrivacyConfiguration privacyConfiguration) {
        String k;
        if (privacyConfiguration == null || (k = this.c.k(privacyConfiguration)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new PurrCookiePersister$persistAsCookie$2$1(this, k, null), 3, null);
    }
}
