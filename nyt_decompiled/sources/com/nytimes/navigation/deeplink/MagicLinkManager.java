package com.nytimes.navigation.deeplink;

import android.content.Intent;
import android.net.Uri;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import defpackage.bd1;
import defpackage.zq3;
import io.reactivex.Single;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.rx2.RxSingleKt;

/* loaded from: classes4.dex */
public final class MagicLinkManager {
    public static final a b = new a(null);
    public static final int c = 8;
    private final Subauth a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public MagicLinkManager(Subauth subauth) {
        zq3.h(subauth, "subauth");
        this.a = subauth;
    }

    private final Uri a(Intent intent) {
        if (zq3.c("android.intent.action.VIEW", intent.getAction())) {
            return intent.getData();
        }
        return null;
    }

    private final Single c(Uri uri) {
        if (!bd1.h(String.valueOf(uri))) {
            Single just = Single.just(Boolean.FALSE);
            zq3.e(just);
            return just;
        }
        NYTLogger.d("Attempting to magic link with link " + uri, new Object[0]);
        zq3.e(uri);
        String queryParameter = uri.getQueryParameter("code");
        zq3.e(queryParameter);
        return RxSingleKt.rxSingle$default(null, new MagicLinkManager$login$1(this, queryParameter, null), 1, null);
    }

    public final Subauth b() {
        return this.a;
    }

    public final Single d(Intent intent) {
        zq3.h(intent, "intent");
        return c(a(intent));
    }
}
