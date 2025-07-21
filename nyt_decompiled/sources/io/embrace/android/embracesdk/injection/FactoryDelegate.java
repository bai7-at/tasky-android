package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class FactoryDelegate<T> implements hp6 {
    private final qs2 provider;

    public FactoryDelegate(qs2 qs2Var) {
        zq3.h(qs2Var, "provider");
        this.provider = qs2Var;
    }

    @Override // defpackage.hp6
    public T getValue(Object obj, iv3 iv3Var) {
        zq3.h(iv3Var, "property");
        return (T) this.provider.mo865invoke();
    }
}
