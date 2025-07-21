package com.nytimes.android.navigation;

import androidx.activity.ComponentActivity;
import com.nytimes.android.entitlements.subauth.models.SimpleLoginResponse;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.nr3;
import defpackage.pf9;
import defpackage.ww8;
import defpackage.y25;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.navigation.ItemToDetailNavigatorImpl$manageNavigationOf$1", f = "ItemToDetailNavigatorImpl.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ItemToDetailNavigatorImpl$manageNavigationOf$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ComponentActivity $activity;
    final /* synthetic */ y25 $item;
    int label;
    final /* synthetic */ ItemToDetailNavigatorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ItemToDetailNavigatorImpl$manageNavigationOf$1(ItemToDetailNavigatorImpl itemToDetailNavigatorImpl, ComponentActivity componentActivity, y25 y25Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = itemToDetailNavigatorImpl;
        this.$activity = componentActivity;
        this.$item = y25Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ItemToDetailNavigatorImpl$manageNavigationOf$1(this.this$0, this.$activity, this.$item, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nr3 nr3Var;
        pf9 pf9Var;
        nr3 nr3Var2;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                pf9Var = this.this$0.d;
                ComponentActivity componentActivity = this.$activity;
                String q = this.$item.q();
                zq3.e(q);
                this.label = 1;
                obj = pf9Var.a(componentActivity, q, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            if (obj == SimpleLoginResponse.SUCCESS) {
                nr3Var2 = this.this$0.b;
                nr3Var2.c(this.$item, this.$activity);
            }
        } catch (Exception e) {
            nr3Var = this.this$0.b;
            nr3Var.b(e);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ItemToDetailNavigatorImpl$manageNavigationOf$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
