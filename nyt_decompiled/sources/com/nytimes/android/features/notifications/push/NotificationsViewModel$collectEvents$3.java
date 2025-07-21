package com.nytimes.android.features.notifications.push;

import com.nytimes.android.features.notifications.push.b;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.NotificationsGroupItems;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.notifications.push.NotificationsViewModel$collectEvents$3", f = "NotificationsViewModel.kt", l = {242}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationsViewModel$collectEvents$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $channelError;
    final /* synthetic */ qs2 $loadingError;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsViewModel$collectEvents$3(qs2 qs2Var, qs2 qs2Var2, NotificationsViewModel notificationsViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$loadingError = qs2Var;
        this.$channelError = qs2Var2;
        this.this$0 = notificationsViewModel;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(b bVar, by0 by0Var) {
        return ((NotificationsViewModel$collectEvents$3) create(bVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        NotificationsViewModel$collectEvents$3 notificationsViewModel$collectEvents$3 = new NotificationsViewModel$collectEvents$3(this.$loadingError, this.$channelError, this.this$0, by0Var);
        notificationsViewModel$collectEvents$3.L$0 = obj;
        return notificationsViewModel$collectEvents$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            b bVar = (b) this.L$0;
            if (bVar instanceof b.a) {
                this.$loadingError.mo865invoke();
            } else if (bVar instanceof b.C0291b) {
                this.$channelError.mo865invoke();
            } else if (bVar instanceof b.c) {
                NotificationsViewModel notificationsViewModel = this.this$0;
                b.c cVar = (b.c) bVar;
                NotificationsGroupItems b = cVar.b();
                NotificationsChannel a = cVar.a();
                boolean c = cVar.c();
                this.label = 1;
                if (notificationsViewModel.s(b, a, c, this) == h) {
                    return h;
                }
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
