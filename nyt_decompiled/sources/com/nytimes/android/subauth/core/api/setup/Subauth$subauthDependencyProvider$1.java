package com.nytimes.android.subauth.core.api.setup;

import defpackage.by0;
import defpackage.ss2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
/* synthetic */ class Subauth$subauthDependencyProvider$1 extends FunctionReferenceImpl implements ss2 {
    Subauth$subauthDependencyProvider$1(Object obj) {
        super(1, obj, Subauth.class, "doNotTrackWithTimeout", "doNotTrackWithTimeout(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        Object d;
        d = ((Subauth) this.receiver).d(by0Var);
        return d;
    }
}
