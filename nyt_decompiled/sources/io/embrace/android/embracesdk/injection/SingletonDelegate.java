package io.embrace.android.embracesdk.injection;

import defpackage.c04;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;

/* loaded from: classes5.dex */
public final class SingletonDelegate<T> implements hp6 {
    private final c04 value$delegate;

    public SingletonDelegate(LoadType loadType, qs2 qs2Var) {
        zq3.h(loadType, "loadType");
        zq3.h(qs2Var, "provider");
        this.value$delegate = c.b(LazyThreadSafetyMode.PUBLICATION, qs2Var);
        if (loadType == LoadType.EAGER) {
            getValue();
        }
    }

    private final T getValue() {
        return (T) this.value$delegate.getValue();
    }

    @Override // defpackage.hp6
    public T getValue(Object obj, iv3 iv3Var) {
        zq3.h(iv3Var, "property");
        return getValue();
    }
}
