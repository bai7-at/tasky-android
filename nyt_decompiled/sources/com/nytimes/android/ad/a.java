package com.nytimes.android.ad;

import android.app.Application;
import android.os.Handler;
import android.widget.Toast;
import com.nytimes.android.ad.DFPEnvironmentProvider;
import com.nytimes.android.ad.a;
import com.nytimes.android.ad.params.DFPContentType;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.api.config.model.Ad;
import com.nytimes.android.utils.AppPreferences;
import defpackage.at5;
import defpackage.du8;
import defpackage.xl6;
import defpackage.zq3;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class a {
    public static final C0233a Companion = new C0233a(null);
    private final Application a;
    private final AppPreferences b;
    private final at5 c;

    /* renamed from: com.nytimes.android.ad.a$a, reason: collision with other inner class name */
    public static final class C0233a {
        public /* synthetic */ C0233a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0233a() {
        }
    }

    public a(Application application, AppPreferences appPreferences, at5 at5Var) {
        zq3.h(application, "context");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(at5Var, "dfpEnvironment");
        this.a = application;
        this.b = appPreferences;
        this.c = at5Var;
    }

    private final String b(String str) {
        String lowerCase = new Regex("[^0-9a-zA-Z]").e(str, "").toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final Pair c(Pair pair, String str, LatestFeed latestFeed) {
        if (DFPEnvironmentProvider.Environment.GOOGLE == this.c.a()) {
            return du8.a("banner", null);
        }
        Ad ad = latestFeed.getAd();
        Map<String, String> dfpTaxonomyExceptions = ad != null ? ad.getDfpTaxonomyExceptions() : null;
        if (dfpTaxonomyExceptions == null) {
            dfpTaxonomyExceptions = t.i();
        }
        String str2 = dfpTaxonomyExceptions.get(g(pair));
        if (str2 != null) {
            String[] strArr = (String[]) new Regex("/").g(str2, 0).toArray(new String[0]);
            Pair a = du8.a(d.f0(strArr, 0), d.f0(strArr, 1));
            if (a != null) {
                pair = a;
            }
        }
        i(str, pair);
        return pair;
    }

    private final String e(Pair pair, String str, LatestFeed latestFeed) {
        return h(c(pair, str, latestFeed));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String g(Pair pair) {
        return i.u0(i.q(pair.c(), pair.d()), "/", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String h(Pair pair) {
        return i.u0(i.q(pair.c(), pair.d()), "/", null, null, 0, null, null, 62, null);
    }

    private final void i(String str, Pair pair) {
        AppPreferences appPreferences = this.b;
        String string = this.a.getString(xl6.com_nytimes_android_phoenix_beta_TOAST_AD_PARAMS);
        zq3.g(string, "getString(...)");
        if (appPreferences.n(string, false)) {
            final String f = h.f("\n                * DFP Call *\n                Asset Type: " + str + "\n                Level1: " + pair.c() + "\n                Level2: " + pair.d() + "\n            ");
            new Handler(this.a.getMainLooper()).post(new Runnable() { // from class: y7
                @Override // java.lang.Runnable
                public final void run() {
                    a.j(a.this, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(a aVar, String str) {
        zq3.h(aVar, "this$0");
        zq3.h(str, "$debugToastText");
        Toast.makeText(aVar.a, str, 1).show();
    }

    public final String d(String str, String str2, String str3, String str4, LatestFeed latestFeed, boolean z) {
        zq3.h(str, "sectionName");
        zq3.h(latestFeed, "feed");
        String e = e(du8.a(b(str), str2), DFPContentType.a.b(this.a, str), latestFeed);
        if (h.K(e, "homepage", false, 2, null)) {
            return e + "/" + DFPEditionProvider$Edition.us;
        }
        if (h.K(e, AssetConstants.VIDEO_TYPE, false, 2, null)) {
            return "video/" + h(du8.a(str3, str4));
        }
        if (!z) {
            return e;
        }
        return e + "/sectionfront";
    }

    public final String f(VideoAsset videoAsset, LatestFeed latestFeed) {
        zq3.h(videoAsset, "asset");
        zq3.h(latestFeed, "feed");
        return e(du8.a(videoAsset.getSectionNameOptional(), videoAsset.getSubSectionNameOptional()), DFPContentType.a.a(videoAsset), latestFeed);
    }
}
