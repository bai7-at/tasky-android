package com.nytimes.android.subauth.core.purchase.storefront;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.p28;
import defpackage.ww8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$queryProductDetailsSupported$2", f = "GoogleStoreFront.kt", l = {290}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleStoreFront$queryProductDetailsSupported$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ GoogleStoreFront this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleStoreFront$queryProductDetailsSupported$2(GoogleStoreFront googleStoreFront, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = googleStoreFront;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleStoreFront$queryProductDetailsSupported$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        boolean z;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            GoogleStoreFront googleStoreFront = this.this$0;
            this.label = 1;
            obj = googleStoreFront.l(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        p28 p28Var = (p28) obj;
        if (p28Var instanceof p28.b) {
            Result.a aVar = Result.a;
            z = this.this$0.z();
            b = Result.b(cc0.a(z));
        } else {
            if (!(p28Var instanceof p28.c)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(new IllegalStateException("Failed to connect to Google Billing")));
        }
        return Result.a(b);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GoogleStoreFront$queryProductDetailsSupported$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
