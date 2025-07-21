package com.nytimes.android.ads.sectionfront;

import android.content.Context;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.ads.AdConfig;
import com.nytimes.android.ads.models.CommonAdKeys;
import com.nytimes.android.ads.usecase.FetchAdUseCase;
import com.nytimes.android.ads.utils.AdExtensionsKt;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.du8;
import defpackage.r57;
import defpackage.xc8;
import defpackage.xj6;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class SectionFrontAdsViewModel extends q {
    public static final a Companion = new a(null);
    private final FetchAdUseCase a;
    private final ET2Scope b;
    private final r57 c;
    private Map d;
    private final AdConfig e;
    private int f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SectionFrontAdsViewModel(FetchAdUseCase fetchAdUseCase, ET2Scope eT2Scope, r57 r57Var, AdConfig.Builder builder, AppPreferences appPreferences, AbraManager abraManager, Context context) {
        zq3.h(fetchAdUseCase, "fetchAdUseCase");
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(r57Var, "sfRefresher");
        zq3.h(builder, "adConfigBuilder");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(abraManager, "abraManager");
        zq3.h(context, "context");
        this.a = fetchAdUseCase;
        this.b = eT2Scope;
        this.c = r57Var;
        this.d = new LinkedHashMap();
        String string = context.getString(xj6.com_nytimes_android_ads_AD_KEYWORD);
        zq3.g(string, "getString(...)");
        AdConfig b = builder.c(appPreferences.l(string, "")).b();
        if (DeviceUtils.G(context)) {
            b.p(xc8.e.b, xc8.d.b);
            b.q(((int) DeviceUtils.q(context)) / 2);
        } else {
            b.q((int) DeviceUtils.q(context));
        }
        this.e = b;
        b.c(t.n(du8.a(CommonAdKeys.CONTENT_TYPE.getKey(), "sf"), du8.a(CommonAdKeys.AB_EXPERIMENT.getKey(), AdExtensionsKt.b(abraManager)), du8.a("mraidenv", "true")));
    }

    public final Flow j(int i) {
        return (Flow) this.d.get(Integer.valueOf(i));
    }

    public final void k(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Flow f = this.a.f(this.e, AdExtensionsKt.a(i2, this.f));
            this.d.put(Integer.valueOf(i2), f);
            FlowKt.launchIn(f, r.a(this));
        }
    }

    public final void l(String str) {
        zq3.h(str, "sectionFrontName");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SectionFrontAdsViewModel$initSectionFront$1(this, str, null), 3, null);
    }
}
