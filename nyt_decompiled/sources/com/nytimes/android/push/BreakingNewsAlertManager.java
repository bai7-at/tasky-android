package com.nytimes.android.push;

import android.app.Application;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.google.gson.Gson;
import com.nytimes.android.logging.NYTLogger;
import defpackage.ai4;
import defpackage.by0;
import defpackage.d9;
import defpackage.e9;
import defpackage.f95;
import defpackage.fl6;
import defpackage.g80;
import defpackage.ge2;
import defpackage.jl6;
import defpackage.kc0;
import defpackage.tb6;
import defpackage.wl6;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class BreakingNewsAlertManager {
    public static final long ARTICLE_ID_MISSING = -1024;
    public static final String KEY_BREAKING_NEWS_ALERTS = "com.nytimes.android.push.BNA";
    public static final String SECTION_NAME = "bna";
    public static final String SECTION_TITLE = "Breaking News";
    public static final String SECTION_TITLE_FRIENDLY = "";
    private final d9 additionalActionDecorator;
    private final e9 additionalActionProvider;
    private Queue<BreakingNewsAlert> alerts;
    private final g80 bigTextStyleFactory;
    private final Application context;
    private final ge2 fileIdProvider;
    private final Gson gson;
    private final CoroutineDispatcher ioDispatcher;
    private final ai4 mediaFetcher;
    private final NotificationManager notificationManager;
    private final SharedPreferences prefs;
    private final f95 provider;
    private final PushClientManager pushClientManager;
    public static final a Companion = new a(null);
    private static final long ALERT_IN_MINUTES = 30;
    private static final long alertTtlInMs = TimeUnit.MILLISECONDS.convert(ALERT_IN_MINUTES, TimeUnit.MINUTES);
    public static final long[] BNA_VIBRATE_PATTERN = {0, 300, 200, 300, 200};

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(BreakingNewsAlert breakingNewsAlert) {
            zq3.h(breakingNewsAlert, BreakingNewsAlertManager.SECTION_NAME);
            return breakingNewsAlert.m() + BreakingNewsAlertManager.alertTtlInMs >= System.currentTimeMillis();
        }

        public final boolean b(Map map) {
            zq3.h(map, "data");
            return map.containsKey("title");
        }

        private a() {
        }
    }

    public BreakingNewsAlertManager(Application application, ge2 ge2Var, Gson gson, SharedPreferences sharedPreferences, f95 f95Var, g80 g80Var, e9 e9Var, ai4 ai4Var, PushClientManager pushClientManager, CoroutineDispatcher coroutineDispatcher) {
        kc0 kc0Var;
        zq3.h(application, "context");
        zq3.h(ge2Var, "fileIdProvider");
        zq3.h(gson, "gson");
        zq3.h(sharedPreferences, "prefs");
        zq3.h(f95Var, "provider");
        zq3.h(g80Var, "bigTextStyleFactory");
        zq3.h(e9Var, "additionalActionProvider");
        zq3.h(ai4Var, "mediaFetcher");
        zq3.h(pushClientManager, "pushClientManager");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.context = application;
        this.fileIdProvider = ge2Var;
        this.gson = gson;
        this.prefs = sharedPreferences;
        this.provider = f95Var;
        this.bigTextStyleFactory = g80Var;
        this.additionalActionProvider = e9Var;
        this.mediaFetcher = ai4Var;
        this.pushClientManager = pushClientManager;
        this.ioDispatcher = coroutineDispatcher;
        ConcurrentLinkedQueue a2 = tb6.a();
        zq3.g(a2, "newConcurrentLinkedQueue(...)");
        this.alerts = a2;
        this.additionalActionDecorator = new d9();
        Object systemService = application.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        zq3.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.notificationManager = (NotificationManager) systemService;
        String c = ge2Var.c(kc0.class, KEY_BREAKING_NEWS_ALERTS);
        if (c == null || c.length() == 0) {
            return;
        }
        try {
            kc0Var = (kc0) gson.fromJson(c, kc0.class);
        } catch (Exception e) {
            NYTLogger.i(e, "failed to load alerts", new Object[0]);
            kc0Var = new kc0();
        }
        Queue<BreakingNewsAlert> queue = this.alerts;
        List a3 = kc0Var.a();
        zq3.g(a3, "getAlerts(...)");
        queue.addAll(a3);
    }

    private final boolean bnaShouldVibrate(Uri uri) {
        String string = this.context.getString(jl6.key_bna_vibrate);
        zq3.g(string, "getString(...)");
        String string2 = this.context.getString(wl6.only_when_silent);
        zq3.g(string2, "getString(...)");
        String string3 = this.context.getString(wl6.always);
        zq3.g(string3, "getString(...)");
        String string4 = this.prefs.getString(string, string2);
        String uri2 = uri != null ? uri.toString() : null;
        boolean z = uri2 == null || uri2.length() == 0;
        if (zq3.c(string4, string3)) {
            return true;
        }
        return zq3.c(string4, string2) && z;
    }

    public static final boolean isBNACurrent(BreakingNewsAlert breakingNewsAlert) {
        return Companion.a(breakingNewsAlert);
    }

    public static final boolean isBNAIntent(Map<String, String> map) {
        return Companion.b(map);
    }

    private final String parseTitle(String str) {
        if (str == null || h.d0(str)) {
            str = this.context.getString(fl6.app_name);
        }
        zq3.e(str);
        return str;
    }

    private final void storeAlerts() {
        kc0 kc0Var = new kc0(new ArrayList(this.alerts));
        try {
            ge2 ge2Var = this.fileIdProvider;
            String json = this.gson.toJson(kc0Var);
            zq3.g(json, "toJson(...)");
            ge2Var.d(kc0.class, KEY_BREAKING_NEWS_ALERTS, json);
        } catch (Exception e) {
            NYTLogger.i(e, "failed to add alert", new Object[0]);
        }
    }

    public final void addAlert(BreakingNewsAlert breakingNewsAlert) {
        zq3.h(breakingNewsAlert, SECTION_NAME);
        this.alerts.add(breakingNewsAlert);
        storeAlerts();
    }

    public final void cancelNotification(int i) {
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.cancel(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object generateNotification(android.app.PendingIntent r8, com.nytimes.android.push.BreakingNewsAlert r9, defpackage.by0<? super defpackage.ww8> r10) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.push.BreakingNewsAlertManager.generateNotification(android.app.PendingIntent, com.nytimes.android.push.BreakingNewsAlert, by0):java.lang.Object");
    }

    public final BreakingNewsAlert getBNA(long j) {
        Object obj;
        Iterator<T> it2 = this.alerts.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((BreakingNewsAlert) obj).d() == j) {
                break;
            }
        }
        return (BreakingNewsAlert) obj;
    }

    public final String getName() {
        return SECTION_NAME;
    }

    public final String getTitle() {
        return SECTION_TITLE;
    }

    public final boolean isBNA(long j) {
        return getBNA(j) != null;
    }

    public final Object obtainResizedImage(String str, by0<? super Bitmap> by0Var) {
        return BuildersKt.withContext(this.ioDispatcher, new BreakingNewsAlertManager$obtainResizedImage$2(str, this, null), by0Var);
    }
}
