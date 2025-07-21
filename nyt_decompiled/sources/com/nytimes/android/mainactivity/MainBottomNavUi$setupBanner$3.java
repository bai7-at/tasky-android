package com.nytimes.android.mainactivity;

import android.content.res.Resources;
import android.widget.TextView;
import com.nytimes.android.api.config.model.NotificationsBannerMessaging;
import com.nytimes.android.mainactivity.banner.NotificationsBannerViewModel;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ml6;
import defpackage.u14;
import defpackage.wl6;
import defpackage.ww8;
import defpackage.yz3;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.mainactivity.MainBottomNavUi$setupBanner$3", f = "MainBottomNavUi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MainBottomNavUi$setupBanner$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ yz3 $bannerBinding;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainBottomNavUi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainBottomNavUi$setupBanner$3(MainBottomNavUi mainBottomNavUi, yz3 yz3Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = mainBottomNavUi;
        this.$bannerBinding = yz3Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(u14 u14Var, by0 by0Var) {
        return ((MainBottomNavUi$setupBanner$3) create(u14Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        MainBottomNavUi$setupBanner$3 mainBottomNavUi$setupBanner$3 = new MainBottomNavUi$setupBanner$3(this.this$0, this.$bannerBinding, by0Var);
        mainBottomNavUi$setupBanner$3.L$0 = obj;
        return mainBottomNavUi$setupBanner$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NotificationsBannerViewModel h;
        Resources resources;
        SnackbarUtil snackbarUtil;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        u14 u14Var = (u14) this.L$0;
        if (u14Var instanceof u14.a) {
            snackbarUtil = this.this$0.d;
            snackbarUtil.u(wl6.notification_change_failed, 0);
        } else if (u14Var instanceof u14.c) {
            TextView textView = this.$bannerBinding.d;
            MainBottomNavUi mainBottomNavUi = this.this$0;
            StringBuilder sb = new StringBuilder();
            h = mainBottomNavUi.h();
            NotificationsBannerMessaging notificationsBannerMessaging = (NotificationsBannerMessaging) h.n().getValue();
            sb.append(notificationsBannerMessaging != null ? notificationsBannerMessaging.getConfirmationMessage() : null);
            sb.append(" ");
            resources = mainBottomNavUi.c;
            sb.append(resources.getString(ml6.banner_update_settings_text));
            ww8 ww8Var = ww8.a;
            String sb2 = sb.toString();
            zq3.g(sb2, "toString(...)");
            textView.setText(mainBottomNavUi.g(sb2));
            this.$bannerBinding.b.setVisibility(8);
            this.$bannerBinding.c.setVisibility(8);
        } else {
            boolean z = u14Var instanceof u14.b;
        }
        return ww8.a;
    }
}
