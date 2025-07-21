package com.nytimes.android.recentlyviewed;

import android.content.Context;
import android.widget.Toast;
import defpackage.b04;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.recentlyviewed.RecentlyViewedModule$provideDevSettingItem$1", f = "RecentlyViewedModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RecentlyViewedModule$provideDevSettingItem$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ b04 $recentlyViewedManager;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecentlyViewedModule$provideDevSettingItem$1(b04 b04Var, by0 by0Var) {
        super(2, by0Var);
        this.$recentlyViewedManager = b04Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((RecentlyViewedModule$provideDevSettingItem$1) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        RecentlyViewedModule$provideDevSettingItem$1 recentlyViewedModule$provideDevSettingItem$1 = new RecentlyViewedModule$provideDevSettingItem$1(this.$recentlyViewedManager, by0Var);
        recentlyViewedModule$provideDevSettingItem$1.L$0 = obj;
        return recentlyViewedModule$provideDevSettingItem$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Context context = (Context) this.L$0;
        ((RecentlyViewedManager) this.$recentlyViewedManager.get()).v();
        Toast.makeText(context, "History cleared!", 0).show();
        return ww8.a;
    }
}
