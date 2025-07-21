package com.nytimes.android.subauth.core.nytuser;

import com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h15;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.nytimes.android.subauth.core.nytuser.NYTUserImpl$setupProvisionalExpirationUpdate$1", f = "NYTUserImpl.kt", l = {170}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NYTUserImpl$setupProvisionalExpirationUpdate$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Long $expiration;
    int label;
    final /* synthetic */ NYTUserImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NYTUserImpl$setupProvisionalExpirationUpdate$1(Long l, NYTUserImpl nYTUserImpl, by0 by0Var) {
        super(2, by0Var);
        this.$expiration = l;
        this.this$0 = nYTUserImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NYTUserImpl$setupProvisionalExpirationUpdate$1(this.$expiration, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h15 h15Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            long longValue = (this.$expiration.longValue() - System.currentTimeMillis()) + 100;
            this.label = 1;
            if (DelayKt.delay(longValue, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        NYTUserImpl nYTUserImpl = this.this$0;
        h15Var = nYTUserImpl.c;
        nYTUserImpl.D(h15Var.a(), true, NYTUserUpdateSource.PROVISIONAL_ENT_EXPIRED);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NYTUserImpl$setupProvisionalExpirationUpdate$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
