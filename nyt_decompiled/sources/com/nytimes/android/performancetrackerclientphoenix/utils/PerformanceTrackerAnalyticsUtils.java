package com.nytimes.android.performancetrackerclientphoenix.utils;

import com.datadog.android.log.Logger;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.performancetrackerclientphoenix.utils.PerformanceTrackerAnalyticsUtils;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlinx.coroutines.rx2.RxConvertKt;

/* loaded from: classes4.dex */
public final class PerformanceTrackerAnalyticsUtils {
    public static final PerformanceTrackerAnalyticsUtils a = new PerformanceTrackerAnalyticsUtils();

    private PerformanceTrackerAnalyticsUtils() {
    }

    private final void d(final Logger logger, final a aVar) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        Observable onErrorReturnItem = RxConvertKt.asObservable$default(aVar.c(), null, 1, null).onErrorReturnItem(Boolean.FALSE);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.performancetrackerclientphoenix.utils.PerformanceTrackerAnalyticsUtils$subscribeToSubscriptionStatusChanges$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return ww8.a;
            }

            public final void invoke(boolean z) {
                PerformanceTrackerAnalyticsUtils.a.f(Logger.this, aVar, z);
            }
        };
        compositeDisposable.add(onErrorReturnItem.subscribe(new Consumer() { // from class: br5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PerformanceTrackerAnalyticsUtils.e(ss2.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Logger logger, a aVar, boolean z) {
        if (z) {
            logger.h("status");
            logger.b("status", aVar.a() ? "subscribed" : aVar.q() ? "registered" : "anonymous");
        }
    }

    public final void c(Logger logger, Map map, Map map2, a aVar, String str) {
        zq3.h(logger, "<this>");
        zq3.h(map, "deviceConfigTags");
        zq3.h(map2, "deviceConfigAttributes");
        zq3.h(aVar, "eCommClient");
        zq3.h(str, "versionCode");
        for (Map.Entry entry : map.entrySet()) {
            logger.b((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            logger.a((String) entry2.getKey(), (String) entry2.getValue());
        }
        logger.b("build_number", str);
        f(logger, aVar, true);
        d(logger, aVar);
    }
}
