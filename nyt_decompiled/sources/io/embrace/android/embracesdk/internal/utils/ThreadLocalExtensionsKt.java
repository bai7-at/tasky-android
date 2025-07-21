package io.embrace.android.embracesdk.internal.utils;

import defpackage.hp6;
import defpackage.qs2;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class ThreadLocalExtensionsKt {
    public static final /* synthetic */ <T> hp6 threadLocal(qs2 qs2Var) {
        zq3.h(qs2Var, "provider");
        return new ThreadLocalDelegate(qs2Var);
    }
}
