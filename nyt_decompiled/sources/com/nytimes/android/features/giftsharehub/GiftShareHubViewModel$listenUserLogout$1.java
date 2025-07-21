package com.nytimes.android.features.giftsharehub;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.giftsharehub.GiftShareHubViewModel$listenUserLogout$1", f = "GiftShareHubViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GiftShareHubViewModel$listenUserLogout$1 extends SuspendLambda implements gt2 {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ GiftShareHubViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GiftShareHubViewModel$listenUserLogout$1(GiftShareHubViewModel giftShareHubViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = giftShareHubViewModel;
    }

    public final Object b(boolean z, by0 by0Var) {
        return ((GiftShareHubViewModel$listenUserLogout$1) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        GiftShareHubViewModel$listenUserLogout$1 giftShareHubViewModel$listenUserLogout$1 = new GiftShareHubViewModel$listenUserLogout$1(this.this$0, by0Var);
        giftShareHubViewModel$listenUserLogout$1.Z$0 = ((Boolean) obj).booleanValue();
        return giftShareHubViewModel$listenUserLogout$1;
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Boolean) obj).booleanValue(), (by0) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        if (this.Z$0) {
            this.this$0.u();
        } else {
            this.this$0.k();
        }
        return ww8.a;
    }
}
