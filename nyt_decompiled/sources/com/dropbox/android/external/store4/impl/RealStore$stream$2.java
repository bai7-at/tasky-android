package com.dropbox.android.external.store4.impl;

import com.dropbox.android.external.store4.ResponseOrigin;
import defpackage.a38;
import defpackage.b38;
import defpackage.by0;
import defpackage.dg0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.dropbox.android.external.store4.impl.RealStore$stream$2", f = "RealStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RealStore$stream$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ a38 $request;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RealStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealStore$stream$2(RealStore realStore, a38 a38Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = realStore;
        this.$request = a38Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(b38 b38Var, by0 by0Var) {
        return ((RealStore$stream$2) create(b38Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        RealStore$stream$2 realStore$stream$2 = new RealStore$stream$2(this.this$0, this.$request, by0Var);
        realStore$stream$2.L$0 = obj;
        return realStore$stream$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        dg0 dg0Var;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        b38 b38Var = (b38) this.L$0;
        if (b38Var.b() != ResponseOrigin.Cache && (a = b38Var.a()) != null) {
            RealStore realStore = this.this$0;
            a38 a38Var = this.$request;
            dg0Var = realStore.c;
            if (dg0Var != null) {
                dg0Var.put(a38Var.b(), a);
            }
        }
        return ww8.a;
    }
}
