package com.nytimes.android.onboarding.compose.subscribe;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.onboarding.compose.b;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource;
import defpackage.e52;
import defpackage.hi0;
import defpackage.rl6;
import defpackage.s42;
import defpackage.uy3;
import defpackage.ve6;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class SubscriptionOptionsViewModel extends q {
    private final ET2SimpleScope a;
    private final a b;
    private final b c;
    private final uy3 d;
    private final CoroutineDispatcher e;
    private final List f;

    public SubscriptionOptionsViewModel(ET2SimpleScope eT2SimpleScope, a aVar, b bVar, uy3 uy3Var, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(eT2SimpleScope, "et2Scope");
        zq3.h(aVar, "ecommClient");
        zq3.h(bVar, "navStateConductor");
        zq3.h(uy3Var, "launchProductLandingHelper");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = eT2SimpleScope;
        this.b = aVar;
        this.c = bVar;
        this.d = uy3Var;
        this.e = coroutineDispatcher;
        this.f = i.o(new hi0(ve6.ftux_regi_upsell_image_1, rl6.ftux_carousel_copy_1), new hi0(ve6.ftux_regi_upsell_image_2, rl6.ftux_carousel_copy_2), new hi0(ve6.ftux_regi_upsell_image_3, rl6.ftux_carousel_copy_3), new hi0(ve6.ftux_regi_upsell_image_4, rl6.ftux_carousel_copy_4));
    }

    public final List g() {
        return this.f;
    }

    public final void i() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), this.e, null, new SubscriptionOptionsViewModel$nextScreen$1(this, null), 2, null);
    }

    public final void j() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("subscribe", "subscribe", null, null, null, null, null, null, null, 508, null), null, null, 12, null);
        if (this.b.a()) {
            return;
        }
        uy3.a.c(this.d, CampaignCodeSource.SPLASH, RegiInterface.RegiWelcome, "upsellCarousel", null, 8, null);
    }

    public final Job k() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), this.e, null, new SubscriptionOptionsViewModel$trackPage$1(this, null), 2, null);
        return launch$default;
    }
}
