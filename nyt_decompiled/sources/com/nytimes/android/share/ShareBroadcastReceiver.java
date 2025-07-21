package com.nytimes.android.share;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.nytimes.android.logging.NYTLogger;
import defpackage.m17;
import defpackage.u83;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ShareBroadcastReceiver extends u83 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    public m17 reviewStorage;
    public ShareAnalyticsReporter shareAnalyticsReporter;
    public SharedPreferences sharedPreferences;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final ComponentName b(Intent intent) {
        Object parcelableExtra;
        parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
        return (ComponentName) parcelableExtra;
    }

    private final ComponentName c(Intent intent) {
        return (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
    }

    public final m17 d() {
        m17 m17Var = this.reviewStorage;
        if (m17Var != null) {
            return m17Var;
        }
        zq3.z("reviewStorage");
        return null;
    }

    @Override // defpackage.u83, defpackage.e83, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zq3.h(context, "context");
        zq3.h(intent, "intent");
        super.onReceive(context, intent);
        Bundle extras = intent.getExtras();
        zq3.e(extras);
        NYTLogger.d("Share action received: intent = %s", extras);
        if (intent.getExtras() != null) {
            Bundle extras2 = intent.getExtras();
            zq3.e(extras2);
            if (extras2.containsKey("android.intent.extra.CHOSEN_COMPONENT")) {
                d().e();
                String stringExtra = intent.getStringExtra("com.nytimes.android.extra.BLOCK_CONTEXT");
                String stringExtra2 = intent.getStringExtra("com.nytimes.android.extra.SHARE_ASSET_URL");
                String stringExtra3 = intent.getStringExtra("com.nytimes.android.extra.SHARE_ASSET_URI");
                String stringExtra4 = intent.getStringExtra("com.nytimes.android.extra.SHARE_ASSET_REGION");
                ComponentName b = Build.VERSION.SDK_INT >= 33 ? b(intent) : c(intent);
                if (b == null) {
                    b = null;
                }
                ShareAnalyticsReporter shareAnalyticsReporter = this.shareAnalyticsReporter;
                zq3.e(shareAnalyticsReporter);
                shareAnalyticsReporter.h(context, b, stringExtra, stringExtra2, stringExtra3, stringExtra4);
            }
        }
    }
}
