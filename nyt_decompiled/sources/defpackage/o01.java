package defpackage;

import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public abstract class o01 {
    private final CoroutineDispatcher a;
    private final ss2 b;
    private boolean c;

    public o01(CoroutineDispatcher coroutineDispatcher, ss2 ss2Var) {
        zq3.h(coroutineDispatcher, "dispatcher");
        zq3.h(ss2Var, "lambda");
        this.a = coroutineDispatcher;
        this.b = ss2Var;
    }

    public final boolean a() {
        return this.c;
    }
}
