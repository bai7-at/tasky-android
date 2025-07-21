package com.nytimes.android.features.settings.push;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.a;
import com.nytimes.android.features.settings.push.c;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.o33;
import defpackage.ss2;
import defpackage.wl6;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class NotificationsFragment$observeNotificationEvents$1 extends Lambda implements ss2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ NotificationsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsFragment$observeNotificationEvents$1(NotificationsFragment notificationsFragment, Context context) {
        super(1);
        this.this$0 = notificationsFragment;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public final void c(c cVar) {
        o33 o33Var;
        zq3.h(cVar, "event");
        if (cVar instanceof c.a) {
            SnackbarUtil.y(this.this$0.getSnackbarUtil(), wl6.notification_load_failed, 0, 2, null);
        } else if (cVar instanceof c.b) {
            new a.C0012a(this.$context).e(wl6.notification_change_failed).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.nytimes.android.features.settings.push.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    NotificationsFragment$observeNotificationEvents$1.d(dialogInterface, i);
                }
            }).p();
            o33Var = this.this$0.g;
            o33Var.r();
        }
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        c((c) obj);
        return ww8.a;
    }
}
