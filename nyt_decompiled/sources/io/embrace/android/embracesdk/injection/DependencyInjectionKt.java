package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.qs2;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class DependencyInjectionKt {
    public static final /* synthetic */ <T> hp6 factory(qs2 qs2Var) {
        zq3.h(qs2Var, "provider");
        return new FactoryDelegate(qs2Var);
    }

    public static final /* synthetic */ <T> hp6 singleton(LoadType loadType, qs2 qs2Var) {
        zq3.h(loadType, "loadType");
        zq3.h(qs2Var, "provider");
        return new SingletonDelegate(loadType, qs2Var);
    }

    public static /* synthetic */ hp6 singleton$default(LoadType loadType, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            loadType = LoadType.LAZY;
        }
        zq3.h(loadType, "loadType");
        zq3.h(qs2Var, "provider");
        return new SingletonDelegate(loadType, qs2Var);
    }
}
