package com.nytimes.android.subauth.devsettings.items;

import defpackage.ba1;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s16;
import defpackage.ss2;
import defpackage.u16;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthPurchaseDevSettingFactory$purchaseDevSettings$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ ba1 $datastore;
    int label;

    @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$1$1", f = "SubauthPurchaseDevSettingFactory.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory$purchaseDevSettings$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ ba1 $datastore;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ba1 ba1Var, by0 by0Var) {
            super(2, by0Var);
            this.$datastore = ba1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$datastore, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Flow data = this.$datastore.getData();
                this.label = 1;
                obj = FlowKt.firstOrNull(data, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            s16 s16Var = (s16) obj;
            return (s16Var == null || (str = (String) s16Var.c(u16.f("lastSubscriptionId"))) == null) ? "" : str;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseDevSettingFactory$purchaseDevSettings$1(ba1 ba1Var, by0 by0Var) {
        super(1, by0Var);
        this.$datastore = ba1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubauthPurchaseDevSettingFactory$purchaseDevSettings$1(this.$datastore, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubauthPurchaseDevSettingFactory$purchaseDevSettings$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object runBlocking$default;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(this.$datastore, null), 1, null);
        return runBlocking$default;
    }
}
