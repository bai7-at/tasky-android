package com.nytimes.android.ads.slideshow;

import android.content.Context;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.ads.AdConfig;
import com.nytimes.android.ads.models.CommonAdKeys;
import com.nytimes.android.ads.usecase.FetchAdUseCase;
import com.nytimes.android.ads.utils.AdExtensionsKt;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.du8;
import defpackage.ru7;
import defpackage.tx1;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes2.dex */
public final class SlideshowAdsViewModel extends q {
    public static final a Companion = new a(null);
    private final FetchAdUseCase a;
    private final AbraManager b;
    private final ET2Scope c;
    private final Map d;
    private final AdConfig e;
    private final MutableStateFlow f;
    private final StateFlow g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SlideshowAdsViewModel(FetchAdUseCase fetchAdUseCase, AbraManager abraManager, ET2Scope eT2Scope, Context context, AdConfig.Builder builder) {
        zq3.h(fetchAdUseCase, "adUseCase");
        zq3.h(abraManager, "abraManager");
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(context, "context");
        zq3.h(builder, "adConfigBuilder");
        this.a = fetchAdUseCase;
        this.b = abraManager;
        this.c = eT2Scope;
        this.d = new LinkedHashMap();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new ru7(null, 1, null));
        this.f = MutableStateFlow;
        this.g = MutableStateFlow;
        AdConfig b = builder.b();
        b.q((int) DeviceUtils.q(context));
        this.e = b;
    }

    public final StateFlow i() {
        return this.g;
    }

    public final void j(String str) {
        PageContext i;
        String g;
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SlideshowAdsViewModel$initializeAdConfig$1(this, str, null), 3, null);
        Map n = t.n(du8.a(CommonAdKeys.CONTENT_TYPE.getKey(), "ss"), du8.a(CommonAdKeys.AB_EXPERIMENT.getKey(), AdExtensionsKt.b(this.b)));
        if (str != null) {
            n.put(CommonAdKeys.CONTENT_URL.getKey(), str);
        }
        tx1 c = this.c.c();
        if (c != null && (i = c.i()) != null && (g = i.g()) != null) {
            n.put(CommonAdKeys.PAGE_VIEW_ID.getKey(), g);
        }
        this.e.c(n);
    }

    public final void k(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null && str.length() > 0) {
            sb.append("/" + str);
        }
        if (str2 != null && str2.length() > 0) {
            sb.append("/" + str2);
        }
        AdConfig adConfig = this.e;
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        String lowerCase = sb2.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        adConfig.a(lowerCase);
        if (i <= 0 || i < 0) {
            return;
        }
        int i2 = 1;
        int i3 = 0;
        while (true) {
            if (m(i3)) {
                Flow f = this.a.f(this.e, "mid" + i2);
                this.d.put(Integer.valueOf(i2), f);
                FlowKt.launchIn(f, r.a(this));
                i2++;
            }
            if (i3 == i) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void l(int i) {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SlideshowAdsViewModel$setAdPosition$1(this, i, null), 3, null);
    }

    public final boolean m(int i) {
        return i == 4 || (i >= 8 && (i - 8) % 8 == 0);
    }
}
