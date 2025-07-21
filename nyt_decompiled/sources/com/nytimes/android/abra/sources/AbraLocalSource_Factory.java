package com.nytimes.android.abra.sources;

import defpackage.b04;
import defpackage.ba2;
import defpackage.nt1;
import defpackage.p76;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class AbraLocalSource_Factory implements ba2 {
    private final p76 abraAllocatorLazyProvider;
    private final p76 scopeProvider;

    public AbraLocalSource_Factory(p76 p76Var, p76 p76Var2) {
        this.abraAllocatorLazyProvider = p76Var;
        this.scopeProvider = p76Var2;
    }

    public static AbraLocalSource_Factory create(p76 p76Var, p76 p76Var2) {
        return new AbraLocalSource_Factory(p76Var, p76Var2);
    }

    public static AbraLocalSource newInstance(b04 b04Var, CoroutineScope coroutineScope) {
        return new AbraLocalSource(b04Var, coroutineScope);
    }

    @Override // defpackage.p76
    public AbraLocalSource get() {
        return newInstance(nt1.a(this.abraAllocatorLazyProvider), (CoroutineScope) this.scopeProvider.get());
    }
}
