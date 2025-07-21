package com.nytimes.android.mainactivity.banner;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.nytimes.android.push.PushClientManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.mainactivity.banner.NotificationsBannerViewModel$subscribeToChannel$1$1$1", f = "NotificationsBannerViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationsBannerViewModel$subscribeToChannel$1$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Set<String> $set;
    int label;
    final /* synthetic */ NotificationsBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsBannerViewModel$subscribeToChannel$1$1$1(NotificationsBannerViewModel notificationsBannerViewModel, Set set, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = notificationsBannerViewModel;
        this.$set = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NotificationsBannerViewModel$subscribeToChannel$1$1$1(this.this$0, this.$set, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PushClientManager pushClientManager;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            pushClientManager = this.this$0.b;
            Set<String> set = this.$set;
            this.label = 1;
            obj = pushClientManager.f(set, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NotificationsBannerViewModel$subscribeToChannel$1$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
