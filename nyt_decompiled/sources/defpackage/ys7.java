package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.nytimes.android.MainActivity;
import com.nytimes.android.SingleArticleActivity;

/* loaded from: classes4.dex */
public final class ys7 implements at7 {
    public static final ys7 a = new ys7();

    private ys7() {
    }

    private final sn3 d(Context context, String str, String str2) {
        return new sn3(SingleArticleActivity.class, context).c(str).r(str2);
    }

    @Override // defpackage.at7
    public PendingIntent a(Context context, String str, int i, String str2, String str3, String str4, String str5, String str6) {
        zq3.h(context, "context");
        return wq5.d(e(context, str, str2, str3, str4, str5, str6), context, i, SingleArticleActivity.class, 0, 8, null);
    }

    @Override // defpackage.at7
    public Intent b(Context context, String str, String str2) {
        zq3.h(context, "context");
        zq3.h(str, "assetUri");
        zq3.h(str2, "assetUrl");
        return d(context, str, "Recently Viewed").d(str2).f("recentlyViewed").q("Recently Viewed").e();
    }

    @Override // defpackage.at7
    public Intent c(Context context, String str, String str2, boolean z, boolean z2, String str3) {
        zq3.h(context, "context");
        zq3.h(str, "assetUrl");
        zq3.h(str2, "referringSource");
        if (str3 == null) {
            str3 = "";
        }
        return d(context, null, str3).d(str).q(str2).p(z2).t(z).l().m(rb5.r(str)).e();
    }

    public Intent e(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        zq3.h(context, "context");
        return zs7.a(d(context, str, "").q("BNA notification"), b65.Companion.a(str2, str3, str4, str5, str6, str)).e();
    }

    public Intent f(Context context, String str, String str2, boolean z, boolean z2) {
        zq3.h(context, "context");
        zq3.h(str, "assetUri");
        zq3.h(str2, "referringSource");
        return context instanceof MainActivity ? d(context, str, "").q(str2).f("discover").p(z2).t(z).l().e() : d(context, str, "").q(str2).p(z2).t(z).l().e();
    }

    public Intent g(Context context, String str, String str2, String str3, String str4) {
        zq3.h(context, "context");
        zq3.h(str, "sectionFriendly");
        zq3.h(str2, "uri");
        zq3.h(str3, "referringSource");
        zq3.h(str4, "url");
        return d(context, str2, str).f("follow").q(str3).d(str4).e();
    }

    public Intent h(Context context, String str, String str2, String str3, String str4) {
        zq3.h(context, "context");
        zq3.h(str, "sectionFriendly");
        zq3.h(str2, "uri");
        zq3.h(str3, "referringSource");
        zq3.h(str4, "url");
        return d(context, str2, str).f("you").q(str3).d(str4).e();
    }

    public Intent i(Context context, String str, String str2) {
        zq3.h(context, "context");
        zq3.h(str, "assetUri");
        zq3.h(str2, "assetUrl");
        return d(context, str, "Saved for Later").d(str2).f("saveMgr").q("Saved for Later").e();
    }

    public Intent j(Context context, String str, String str2, String str3, String str4) {
        zq3.h(context, "context");
        zq3.h(str2, "assetUri");
        zq3.h(str3, "sectionTitle");
        zq3.h(str4, "referringSource");
        return d(context, str2, str3).d(str).c(str2).q(str4).m(rb5.r(str)).e();
    }
}
