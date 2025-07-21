package com.nytimes.android.features.settings.legal;

import defpackage.at3;
import defpackage.dt3;
import defpackage.ss2;
import defpackage.tt3;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class FeatureSingletonModule {
    public static final FeatureSingletonModule a = new FeatureSingletonModule();

    private FeatureSingletonModule() {
    }

    public final at3 a() {
        return tt3.b(null, new ss2() { // from class: com.nytimes.android.features.settings.legal.FeatureSingletonModule$provideJson$1
            public final void b(dt3 dt3Var) {
                zq3.h(dt3Var, "$this$Json");
                dt3Var.f(true);
                dt3Var.c(true);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((dt3) obj);
                return ww8.a;
            }
        }, 1, null);
    }
}
