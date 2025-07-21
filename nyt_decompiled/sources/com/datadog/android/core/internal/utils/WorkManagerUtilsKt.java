package com.datadog.android.core.internal.utils;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.c;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.data.upload.UploadWorker;
import defpackage.gv0;
import defpackage.mj9;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public abstract class WorkManagerUtilsKt {
    public static final void a(Context context, String str, InternalLogger internalLogger) {
        zq3.h(context, "context");
        zq3.h(str, "instanceName");
        zq3.h(internalLogger, "internalLogger");
        try {
            mj9 g = mj9.g(context);
            zq3.g(g, "getInstance(context)");
            g.a("DatadogBackgroundUpload/" + str);
        } catch (IllegalStateException e) {
            InternalLogger.b.b(internalLogger, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$cancelUploadWorker$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Error cancelling the UploadWorker";
                }
            }, e, false, null, 48, null);
        }
    }

    public static final void b(Context context, String str, InternalLogger internalLogger) {
        zq3.h(context, "context");
        zq3.h(str, "instanceName");
        zq3.h(internalLogger, "internalLogger");
        try {
            mj9 g = mj9.g(context);
            zq3.g(g, "getInstance(context)");
            c.a aVar = (c.a) ((c.a) ((c.a) new c.a(UploadWorker.class).j(new gv0.a().b(NetworkType.NOT_ROAMING).a())).a("DatadogBackgroundUpload/" + str)).l(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT, TimeUnit.MILLISECONDS);
            Data a = new Data.a().p("_dd.sdk.instanceName", str).a();
            zq3.g(a, "Builder().putString(Uplo…ME, instanceName).build()");
            g.e("DatadogUploadWorker", ExistingWorkPolicy.REPLACE, (c) ((c.a) aVar.m(a)).b());
            InternalLogger.b.a(internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$triggerUploadWorker$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "UploadWorker was scheduled.";
                }
            }, null, false, null, 56, null);
        } catch (Exception e) {
            InternalLogger.b.b(internalLogger, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$triggerUploadWorker$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Error while trying to setup the UploadWorker";
                }
            }, e, false, null, 48, null);
        }
    }
}
