package com.nytimes.android.entitlements.purr.client;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.z58;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.entitlements.purr.client.PurrCookiePersister$persistAsCookie$2$1", f = "PurrCookiePersister.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrCookiePersister$persistAsCookie$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $directiveCookie;
    int label;
    final /* synthetic */ PurrCookiePersister this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrCookiePersister$persistAsCookie$2$1(PurrCookiePersister purrCookiePersister, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = purrCookiePersister;
        this.$directiveCookie = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PurrCookiePersister$persistAsCookie$2$1(this.this$0, this.$directiveCookie, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z58 z58Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            z58Var = this.this$0.a;
            String str = this.$directiveCookie;
            this.label = 1;
            if (z58Var.k(str, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PurrCookiePersister$persistAsCookie$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
