package com.nytimes.android.deeplink.types;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.navigation.factory.LoginActivityIntentFactory;
import com.nytimes.android.navigation.factory.SectionFrontIntentDispatcher;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource;
import defpackage.at7;
import defpackage.by0;
import defpackage.hk6;
import defpackage.kt7;
import defpackage.ms;
import defpackage.qs2;
import defpackage.td4;
import defpackage.uy3;
import defpackage.ww8;
import defpackage.ys7;
import defpackage.yt6;
import defpackage.z58;
import defpackage.zq3;
import kotlin.text.h;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class RealAssetLaunchIntentFactoryWrapper implements ms {
    private final FeedStore a;
    private final uy3 b;
    private final td4 c;
    private final z58 d;
    private final CoroutineScope e;

    public RealAssetLaunchIntentFactoryWrapper(FeedStore feedStore, uy3 uy3Var, td4 td4Var, z58 z58Var, CoroutineScope coroutineScope) {
        zq3.h(feedStore, "feedStore");
        zq3.h(uy3Var, "landingHelper");
        zq3.h(td4Var, "intentFactory");
        zq3.h(z58Var, "subauthClient");
        zq3.h(coroutineScope, "applicationScope");
        this.a = feedStore;
        this.b = uy3Var;
        this.c = td4Var;
        this.d = z58Var;
        this.e = coroutineScope;
    }

    @Override // defpackage.ms
    public Intent a(Context context, String str, String str2, boolean z, boolean z2) {
        zq3.h(context, "context");
        zq3.h(str, "assetUri");
        zq3.h(str2, "referringSource");
        return ys7.a.f(context, str, str2, z, z2);
    }

    @Override // defpackage.ms
    public Intent b(Context context, String str, String str2) {
        zq3.h(context, "context");
        zq3.h(str, "pageName");
        zq3.h(str2, "referringSource");
        return this.c.e(context, str, str2);
    }

    @Override // defpackage.ms
    public Intent c(Context context, String str, String str2, boolean z, boolean z2) {
        zq3.h(context, "context");
        zq3.h(str, "assetUrl");
        zq3.h(str2, "referringSource");
        return at7.a.a(ys7.a, context, str, str2, z, z2, null, 32, null);
    }

    @Override // defpackage.ms
    public Intent d(Context context, String str, String str2, String str3, boolean z, boolean z2, long j, String str4) {
        zq3.h(context, "context");
        zq3.h(str2, "assetUrl");
        zq3.h(str3, "referringSource");
        return kt7.a.a(context, str, str2, j, z);
    }

    @Override // defpackage.ms
    public Intent e(Context context, String str, String str2, boolean z) {
        zq3.h(context, "context");
        zq3.h(str, "assetUrl");
        zq3.h(str2, "referringSource");
        return at7.a.a(ys7.a, context, str, str2, yt6.b(str2), z, null, 32, null);
    }

    @Override // defpackage.ms
    public Object f(Context context, String str, String str2, by0 by0Var) {
        return SectionFrontIntentDispatcher.a(this.a, context, str, str2, by0Var);
    }

    @Override // defpackage.ms
    public Intent g(Context context, String str, String str2) {
        zq3.h(context, "context");
        zq3.h(str, "assetUri");
        zq3.h(str2, "referringSource");
        String string = context.getResources().getString(hk6.notifications_deep_link);
        zq3.g(string, "getString(...)");
        return new Intent("android.intent.action.VIEW", Uri.parse(string));
    }

    @Override // defpackage.ms
    public Intent h(Context context, long j, String str, String str2, boolean z) {
        zq3.h(context, "context");
        zq3.h(str2, "referringSource");
        return this.c.a(context, Asset.Companion.generateUri(j, AssetConstants.AUDIO_TYPE), null, str2, z);
    }

    @Override // defpackage.ms
    public Object i(final Context context, String str, by0 by0Var) {
        return LoginActivityIntentFactory.a(this.d, context, str, this.e, new qs2() { // from class: com.nytimes.android.deeplink.types.RealAssetLaunchIntentFactoryWrapper$getIntentForLoginDeepLink$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m334invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m334invoke() {
                td4 td4Var;
                td4Var = RealAssetLaunchIntentFactoryWrapper.this.c;
                td4Var.b(context, null);
            }
        }, by0Var);
    }

    @Override // defpackage.ms
    public Intent j(Context context, String str, String str2) {
        zq3.h(context, "context");
        zq3.h(str, "path");
        zq3.h(str2, "referringSource");
        if (!h.P(str, "/", false, 2, null) || h.v0(str, "/subscribe/").length() <= 0) {
            return uy3.a.b(this.b, CampaignCodeSource.SUBSCRIBE, RegiInterface.LinkDlSubscribe, str2, null, 8, null);
        }
        return this.b.h(CampaignCodeSource.SUBSCRIBE, RegiInterface.LinkDlSubscribe, str2, h.v0(str, "/subscribe/"));
    }

    @Override // defpackage.ms
    public Intent k(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "path");
        return this.b.a();
    }
}
