package com.nytimes.android.assetretriever;

import android.content.Context;
import android.content.Intent;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.nytimes.android.assetretriever.AssetRetrieverJobIntentService;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class AssetRetrieverWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetRetrieverWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zq3.h(context, "appContext");
        zq3.h(workerParameters, "params");
    }

    @Override // androidx.work.CoroutineWorker
    public Object b(by0 by0Var) {
        NYTLogger.d("Scheduling AssetRetrieverJobIntentService", new Object[0]);
        AssetRetrieverJobIntentService.a aVar = AssetRetrieverJobIntentService.Companion;
        Context applicationContext = getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext(...)");
        aVar.a(applicationContext, new Intent());
        b.a c = b.a.c();
        zq3.g(c, "success(...)");
        return c;
    }
}
