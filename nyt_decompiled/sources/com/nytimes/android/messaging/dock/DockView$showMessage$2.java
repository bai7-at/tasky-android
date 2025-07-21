package com.nytimes.android.messaging.dock;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.logging.NYTLogger;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
/* synthetic */ class DockView$showMessage$2 extends FunctionReferenceImpl implements ss2 {
    DockView$showMessage$2(Object obj) {
        super(1, obj, NYTLogger.class, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "e(Ljava/lang/Throwable;)V", 0);
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return ww8.a;
    }

    public final void invoke(Throwable th) {
        zq3.h(th, "p0");
        NYTLogger.h(th);
    }
}
