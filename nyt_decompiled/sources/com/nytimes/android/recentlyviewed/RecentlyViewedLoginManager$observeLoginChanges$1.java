package com.nytimes.android.recentlyviewed;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.recentlyviewed.RecentlyViewedLoginManager$observeLoginChanges$1", f = "RecentlyViewedLoginManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RecentlyViewedLoginManager$observeLoginChanges$1 extends SuspendLambda implements gt2 {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ RecentlyViewedLoginManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecentlyViewedLoginManager$observeLoginChanges$1(RecentlyViewedLoginManager recentlyViewedLoginManager, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = recentlyViewedLoginManager;
    }

    public final Object b(boolean z, by0 by0Var) {
        return ((RecentlyViewedLoginManager$observeLoginChanges$1) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        RecentlyViewedLoginManager$observeLoginChanges$1 recentlyViewedLoginManager$observeLoginChanges$1 = new RecentlyViewedLoginManager$observeLoginChanges$1(this.this$0, by0Var);
        recentlyViewedLoginManager$observeLoginChanges$1.Z$0 = ((Boolean) obj).booleanValue();
        return recentlyViewedLoginManager$observeLoginChanges$1;
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Boolean) obj).booleanValue(), (by0) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.i(this.Z$0);
        return ww8.a;
    }
}
