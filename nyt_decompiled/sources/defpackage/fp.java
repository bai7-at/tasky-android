package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.nytimes.android.analytics.event.values.EnabledOrDisabled;
import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.meter.MeterServiceResponse;
import com.nytimes.android.push.BreakingNewsAlertManager;
import defpackage.e52;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* loaded from: classes3.dex */
public final class fp {
    private final jc a;
    private final BreakingNewsAlertManager b;
    private final z58 c;
    private final jq d;
    private final String e;
    private final Disposable f;
    private MeterServiceResponse g;

    public static final class a extends d05 {
        a(Class cls) {
            super(cls);
        }

        @Override // io.reactivex.Observer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(MeterServiceResponse meterServiceResponse) {
            zq3.h(meterServiceResponse, "meterServiceResponse");
            fp.this.g = meterServiceResponse;
        }
    }

    public fp(jc jcVar, BreakingNewsAlertManager breakingNewsAlertManager, z58 z58Var, jq jqVar, Resources resources, gt4 gt4Var) {
        zq3.h(jcVar, "analyticsClient");
        zq3.h(breakingNewsAlertManager, "breakingNewsAlertManager");
        zq3.h(z58Var, "subauthClient");
        zq3.h(jqVar, "articleEventReporter");
        zq3.h(resources, "resources");
        zq3.h(gt4Var, "meterServiceDAO");
        this.a = jcVar;
        this.b = breakingNewsAlertManager;
        this.c = z58Var;
        this.d = jqVar;
        String string = resources.getString(jk6.sectionName_topStories);
        zq3.g(string, "getString(...)");
        this.e = string;
        Observer subscribeWith = gt4Var.b().subscribeWith(new a(fp.class));
        zq3.g(subscribeWith, "subscribeWith(...)");
        this.f = (Disposable) subscribeWith;
    }

    private final Integer b() {
        MeterServiceResponse meterServiceResponse;
        if (this.c.F() || (meterServiceResponse = this.g) == null) {
            return null;
        }
        return Integer.valueOf(meterServiceResponse.viewsUsed());
    }

    private final boolean c(ArticleAsset articleAsset, String str) {
        if (!zq3.c("BNA notification", str)) {
            return false;
        }
        boolean isBNA = this.b.isBNA(articleAsset.getAssetId());
        if (isBNA) {
            return isBNA;
        }
        NYTLogger.s(new RuntimeException("NARLS-145: Referring source was BNA but " + articleAsset.getSafeUri() + " is not a BNA."));
        return isBNA;
    }

    private final boolean e(ArticleAsset articleAsset, String str) {
        return c(articleAsset, str) || zq3.c("Daily Rich Notification", str);
    }

    private final void g(ArticleAsset articleAsset, String str) {
        if (str != null) {
            h(str, zq3.c("Daily Rich Notification", str) ? "Daily Rich Notification" : String.valueOf(this.b.getBNA(articleAsset.getAssetId())));
        }
    }

    private final void h(String str, String str2) {
        String str3 = zq3.c("Daily Rich Notification", str) ? "Daily Rich Notification" : "breaking-news";
        EventTracker.a.h(new PageContext(null, null, null, null, 0, 31, null), new e52.e(), new u95(TransferService.INTENT_KEY_NOTIFICATION, str3, str3, str2).a());
    }

    public final void d() {
        this.f.dispose();
    }

    public final void f(ArticleAsset articleAsset, String str, Intent intent) {
        zq3.h(articleAsset, AssetConstants.ARTICLE_TYPE);
        zq3.h(str, "pageViewId");
        zq3.h(intent, "intent");
        String stringExtra = intent.getStringExtra("com.nytimes.android.extra.SECTION_NAME_FRIENDLY");
        String urlOrEmpty = articleAsset.getUrlOrEmpty();
        h90 a2 = gd.a(intent);
        String stringExtra2 = intent.getStringExtra("ARTICLE_REFERRING_SOURCE");
        if (zq3.c("BNA banner", stringExtra2)) {
            stringExtra = this.e;
        } else if (stringExtra2 != null && e(articleAsset, stringExtra2)) {
            stringExtra = this.e;
            this.a.s(stringExtra2);
            g(articleAsset, stringExtra2);
        }
        String str2 = stringExtra;
        if (zq3.c("Article Front", stringExtra2)) {
            return;
        }
        this.d.b(stringExtra2, urlOrEmpty, str2, EnabledOrDisabled.ENABLED, Long.valueOf(articleAsset.getAssetId()), articleAsset.getAssetType(), str, a2, b());
    }
}
