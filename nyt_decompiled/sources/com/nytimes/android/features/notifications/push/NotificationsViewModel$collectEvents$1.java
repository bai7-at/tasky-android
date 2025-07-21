package com.nytimes.android.features.notifications.push;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.a;
import com.nytimes.android.features.notifications.push.NotificationsViewModel$collectEvents$1;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.wl6;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.notifications.push.NotificationsViewModel$collectEvents$1", f = "NotificationsViewModel.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationsViewModel$collectEvents$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ SnackbarUtil $snackbarUtil;
    int label;
    final /* synthetic */ NotificationsViewModel this$0;

    /* renamed from: com.nytimes.android.features.notifications.push.NotificationsViewModel$collectEvents$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends Lambda implements qs2 {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ NotificationsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(NotificationsViewModel notificationsViewModel, Activity activity) {
            super(0);
            this.this$0 = notificationsViewModel;
            this.$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(NotificationsViewModel notificationsViewModel, DialogInterface dialogInterface) {
            zq3.h(notificationsViewModel, "this$0");
            notificationsViewModel.j = false;
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            m420invoke();
            return ww8.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m420invoke() {
            boolean z;
            z = this.this$0.j;
            if (z) {
                return;
            }
            this.this$0.j = true;
            a.C0012a positiveButton = new a.C0012a(this.$activity).e(wl6.notification_change_failed).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.nytimes.android.features.notifications.push.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    NotificationsViewModel$collectEvents$1.AnonymousClass2.d(dialogInterface, i);
                }
            });
            final NotificationsViewModel notificationsViewModel = this.this$0;
            positiveButton.j(new DialogInterface.OnDismissListener() { // from class: com.nytimes.android.features.notifications.push.d
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    NotificationsViewModel$collectEvents$1.AnonymousClass2.g(NotificationsViewModel.this, dialogInterface);
                }
            }).p();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsViewModel$collectEvents$1(NotificationsViewModel notificationsViewModel, SnackbarUtil snackbarUtil, Activity activity, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = notificationsViewModel;
        this.$snackbarUtil = snackbarUtil;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NotificationsViewModel$collectEvents$1(this.this$0, this.$snackbarUtil, this.$activity, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            NotificationsViewModel notificationsViewModel = this.this$0;
            final SnackbarUtil snackbarUtil = this.$snackbarUtil;
            qs2 qs2Var = new qs2() { // from class: com.nytimes.android.features.notifications.push.NotificationsViewModel$collectEvents$1.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m419invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m419invoke() {
                    SnackbarUtil.y(SnackbarUtil.this, wl6.notification_load_failed, 0, 2, null);
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$activity);
            this.label = 1;
            if (notificationsViewModel.l(qs2Var, anonymousClass2, this) == h) {
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
        return ((NotificationsViewModel$collectEvents$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
