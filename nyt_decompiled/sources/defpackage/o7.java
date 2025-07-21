package defpackage;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.MobileAds;
import com.nytimes.android.ads.AdConfig;
import com.nytimes.android.ads.models.CommonAdKeys;
import com.nytimes.android.ads.network.response.AdError;
import defpackage.r6;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class o7 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends o6 {
        final /* synthetic */ s6 a;
        final /* synthetic */ gt2 b;
        final /* synthetic */ String c;
        final /* synthetic */ gt2 d;
        final /* synthetic */ ss2 e;

        b(s6 s6Var, gt2 gt2Var, String str, gt2 gt2Var2, ss2 ss2Var) {
            this.a = s6Var;
            this.b = gt2Var;
            this.c = str;
            this.d = gt2Var2;
            this.e = ss2Var;
        }

        @Override // defpackage.o6
        public void n(t64 t64Var) {
            zq3.h(t64Var, "error");
            super.n(t64Var);
            this.d.invoke(this.c, AdError.Companion.a(t64Var.a()));
        }

        @Override // defpackage.o6
        public void s() {
            super.s();
            this.e.invoke(this.c);
            this.a.requestLayout();
        }

        @Override // defpackage.o6
        public void t() {
            super.t();
            this.a.getRootView().requestLayout();
            this.b.invoke(this.c, this.a);
        }
    }

    public final void a(String str, AdConfig adConfig, s6 s6Var, gt2 gt2Var, gt2 gt2Var2, ss2 ss2Var) {
        zq3.h(str, "adPosition");
        zq3.h(adConfig, "adConfig");
        zq3.h(s6Var, "adManager");
        zq3.h(gt2Var, "onAdLoaded");
        zq3.h(gt2Var2, "onAdFailedToLoad");
        zq3.h(ss2Var, "onAdImpression");
        adConfig.b(CommonAdKeys.AD_POSITION.getKey(), str);
        if (!adConfig.m()) {
            gt2Var2.invoke(str, AdError.MISSING_CRITICAL_AD_TARGETING);
            return;
        }
        s7[] i = adConfig.i();
        if (i == null) {
            i = l6.b(adConfig);
        }
        s6Var.setAdSizes((s7[]) Arrays.copyOf(i, i.length));
        s6Var.setAdUnitId(adConfig.g());
        s6Var.setAdListener(new b(s6Var, gt2Var, str, gt2Var2, ss2Var));
        Bundle e = AdConfig.e(adConfig, null, 1, null);
        e.putString("gma_sdk", MobileAds.a().toString());
        e.putString("purr", adConfig.l());
        r6.a aVar = new r6.a();
        String h = adConfig.h();
        if (h != null) {
        }
        aVar.b(AdMobAdapter.class, e);
        s6Var.e(aVar.h());
    }
}
