package com.nytimes.android.features.notifications.push;

import com.comscore.streaming.ContentType;
import com.nytimes.android.features.notifications.push.b;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.NotificationsGroupItems;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.android.features.notifications.push.NotificationsViewModel$emitCheckChanged$1", f = "NotificationsViewModel.kt", l = {ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationsViewModel$emitCheckChanged$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ NotificationsChannel $channel;
    final /* synthetic */ NotificationsGroupItems $group;
    final /* synthetic */ boolean $isChecked;
    int label;
    final /* synthetic */ NotificationsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsViewModel$emitCheckChanged$1(NotificationsViewModel notificationsViewModel, NotificationsGroupItems notificationsGroupItems, NotificationsChannel notificationsChannel, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = notificationsViewModel;
        this.$group = notificationsGroupItems;
        this.$channel = notificationsChannel;
        this.$isChecked = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NotificationsViewModel$emitCheckChanged$1(this.this$0, this.$group, this.$channel, this.$isChecked, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutableSharedFlow = this.this$0.h;
            b.c cVar = new b.c(this.$group, this.$channel, this.$isChecked);
            this.label = 1;
            if (mutableSharedFlow.emit(cVar, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NotificationsViewModel$emitCheckChanged$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
