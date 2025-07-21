package com.nytimes.android.assetretriever;

import android.content.Context;
import android.content.Intent;
import com.nytimes.android.logging.NYTLogger;
import defpackage.os3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes.dex */
public final class AssetRetrieverJobIntentService extends m {
    public static final a Companion = new a(null);
    public AssetDownloader assetDownloader;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, Intent intent) {
            zq3.h(context, "context");
            zq3.h(intent, "intent");
            os3.d(context, AssetRetrieverJobIntentService.class, 1234, intent);
        }

        private a() {
        }
    }

    @Override // defpackage.os3
    protected void g(Intent intent) {
        zq3.h(intent, "intent");
        NYTLogger.d("Executing AssetRetrieverJobIntentService", new Object[0]);
        BuildersKt__BuildersKt.runBlocking$default(null, new AssetRetrieverJobIntentService$onHandleWork$1(this, null), 1, null);
    }

    public final AssetDownloader m() {
        AssetDownloader assetDownloader = this.assetDownloader;
        if (assetDownloader != null) {
            return assetDownloader;
        }
        zq3.z("assetDownloader");
        return null;
    }
}
