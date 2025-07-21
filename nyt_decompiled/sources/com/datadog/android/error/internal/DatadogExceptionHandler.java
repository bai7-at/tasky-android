package com.datadog.android.error.internal;

import android.content.Context;
import com.chartbeat.androidsdk.QueryKeys;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.ThreadExtKt;
import com.datadog.android.core.internal.utils.WorkManagerUtilsKt;
import com.facebook.AuthenticationTokenClaims;
import defpackage.bl8;
import defpackage.el8;
import defpackage.ib2;
import defpackage.jb2;
import defpackage.kl8;
import defpackage.mj9;
import defpackage.pu3;
import defpackage.qs2;
import defpackage.rq3;
import defpackage.zq3;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class DatadogExceptionHandler implements Thread.UncaughtExceptionHandler {
    public static final a d = new a(null);
    private final jb2 a;
    private final WeakReference b;
    private Thread.UncaughtExceptionHandler c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public DatadogExceptionHandler(jb2 jb2Var, Context context) {
        zq3.h(jb2Var, "sdkCore");
        zq3.h(context, "appContext");
        this.a = jb2Var;
        this.b = new WeakReference(context);
    }

    private final String a(Throwable th) {
        String message = th.getMessage();
        if (message != null && !h.d0(message)) {
            return message;
        }
        String canonicalName = th.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = th.getClass().getSimpleName();
        }
        return "Application crash detected: " + canonicalName;
    }

    private final List b(Thread thread, Throwable th) {
        String name = thread.getName();
        Thread.State state = thread.getState();
        zq3.g(state, "crashedThread.state");
        String a2 = ThreadExtKt.a(state);
        String a3 = kl8.a(th);
        zq3.g(name, AuthenticationTokenClaims.JSON_KEY_NAME);
        List r = i.r(new bl8(name, a2, a3, true));
        Map d2 = d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : d2.entrySet()) {
            if (!zq3.c((Thread) entry.getKey(), thread)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (!(((StackTraceElement[]) entry2.getValue()).length == 0)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Thread thread2 = (Thread) entry3.getKey();
            String name2 = thread2.getName();
            zq3.g(name2, "thread.name");
            Thread.State state2 = thread2.getState();
            zq3.g(state2, "thread.state");
            arrayList.add(new bl8(name2, ThreadExtKt.a(state2), ThreadExtKt.b((StackTraceElement[]) entry3.getValue()), false));
        }
        return i.F0(r, arrayList);
    }

    private final Map d() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            zq3.g(allStackTraces, "{\n            Thread.getAllStackTraces()\n        }");
            return allStackTraces;
        } catch (SecurityException e) {
            InternalLogger.b.a(this.a.f(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.error.internal.DatadogExceptionHandler$safeGetAllStacktraces$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Failed to get all threads dump";
                }
            }, e, false, null, 48, null);
            return t.i();
        }
    }

    public final void c() {
        this.c = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        zq3.h(thread, QueryKeys.TOKEN);
        zq3.h(th, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING);
        List b = b(thread, th);
        ib2 d2 = this.a.d("logs");
        if (d2 != null) {
            String name = thread.getName();
            zq3.g(name, "t.name");
            d2.a(new pu3.a(name, th, System.currentTimeMillis(), a(th), "crash", b));
        } else {
            InternalLogger.b.a(this.a.f(), InternalLogger.Level.INFO, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.error.internal.DatadogExceptionHandler$uncaughtException$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Logs feature is not registered, won't report crash as log.";
                }
            }, null, false, null, 56, null);
        }
        ib2 d3 = this.a.d("rum");
        if (d3 != null) {
            d3.a(new pu3.b(th, a(th), b));
        } else {
            InternalLogger.b.a(this.a.f(), InternalLogger.Level.INFO, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.error.internal.DatadogExceptionHandler$uncaughtException$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "RUM feature is not registered, won't report crash as RUM event.";
                }
            }, null, false, null, 56, null);
        }
        jb2 jb2Var = this.a;
        if (jb2Var instanceof rq3) {
            ExecutorService k = ((rq3) jb2Var).k();
            ThreadPoolExecutor threadPoolExecutor = k instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) k : null;
            if (!(threadPoolExecutor != null ? el8.b(threadPoolExecutor, 100L, this.a.f()) : true)) {
                InternalLogger.b.a(this.a.f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.error.internal.DatadogExceptionHandler$uncaughtException$3
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Datadog SDK is in an unexpected state due to an ongoing crash. Some events could be lost.";
                    }
                }, null, false, null, 56, null);
            }
        }
        Context context = (Context) this.b.get();
        if (context != null && mj9.j()) {
            WorkManagerUtilsKt.b(context, this.a.getName(), this.a.f());
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
