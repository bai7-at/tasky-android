package com.nytimes.android.entitlements.purr;

import defpackage.by0;
import defpackage.d96;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.entitlements.purr.PurrLoginManager$start$1", f = "PurrLoginManager.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurrLoginManager$start$1 extends SuspendLambda implements gt2 {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ PurrLoginManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurrLoginManager$start$1(PurrLoginManager purrLoginManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = purrLoginManager;
    }

    public final Object b(boolean z, by0 by0Var) {
        return ((PurrLoginManager$start$1) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PurrLoginManager$start$1 purrLoginManager$start$1 = new PurrLoginManager$start$1(this.this$0, by0Var);
        purrLoginManager$start$1.Z$0 = ((Boolean) obj).booleanValue();
        return purrLoginManager$start$1;
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Boolean) obj).booleanValue(), (by0) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d96 d96Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            boolean z = this.Z$0;
            d96Var = this.this$0.a;
            this.label = 1;
            if (d96Var.b(z, this) == h) {
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
}
