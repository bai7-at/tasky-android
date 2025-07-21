package com.nytimes.android.mainactivity;

import android.view.View;
import android.widget.Button;
import com.nytimes.android.api.config.model.NotificationsBannerMessaging;
import com.nytimes.android.mainactivity.banner.NotificationsBannerViewModel;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.yz3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.mainactivity.MainBottomNavUi$setupBanner$4", f = "MainBottomNavUi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MainBottomNavUi$setupBanner$4 extends SuspendLambda implements gt2 {
    final /* synthetic */ yz3 $bannerBinding;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainBottomNavUi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainBottomNavUi$setupBanner$4(yz3 yz3Var, MainBottomNavUi mainBottomNavUi, by0 by0Var) {
        super(2, by0Var);
        this.$bannerBinding = yz3Var;
        this.this$0 = mainBottomNavUi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MainBottomNavUi mainBottomNavUi, NotificationsBannerMessaging notificationsBannerMessaging, View view) {
        NotificationsBannerViewModel h;
        h = mainBottomNavUi.h();
        h.s(notificationsBannerMessaging != null ? notificationsBannerMessaging.getPromotedChannelTag() : null);
    }

    @Override // defpackage.gt2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(NotificationsBannerMessaging notificationsBannerMessaging, by0 by0Var) {
        return ((MainBottomNavUi$setupBanner$4) create(notificationsBannerMessaging, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        MainBottomNavUi$setupBanner$4 mainBottomNavUi$setupBanner$4 = new MainBottomNavUi$setupBanner$4(this.$bannerBinding, this.this$0, by0Var);
        mainBottomNavUi$setupBanner$4.L$0 = obj;
        return mainBottomNavUi$setupBanner$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String secondaryCopy;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        final NotificationsBannerMessaging notificationsBannerMessaging = (NotificationsBannerMessaging) this.L$0;
        this.$bannerBinding.d.setText((notificationsBannerMessaging == null || (secondaryCopy = notificationsBannerMessaging.getSecondaryCopy()) == null) ? null : this.this$0.g(secondaryCopy));
        Button button = this.$bannerBinding.c;
        final MainBottomNavUi mainBottomNavUi = this.this$0;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.nytimes.android.mainactivity.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainBottomNavUi$setupBanner$4.d(MainBottomNavUi.this, notificationsBannerMessaging, view);
            }
        });
        return ww8.a;
    }
}
