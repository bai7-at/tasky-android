package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.FlushResult;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class ql {
    public static final ql a = new ql();
    private static final String b;
    private static final int c;
    private static volatile hl d;
    private static final ScheduledExecutorService e;
    private static ScheduledFuture f;
    private static final Runnable g;

    static {
        String name = ql.class.getName();
        zq3.g(name, "AppEventQueue::class.java.name");
        b = name;
        c = 100;
        d = new hl();
        e = Executors.newSingleThreadScheduledExecutor();
        g = new Runnable() { // from class: kl
            @Override // java.lang.Runnable
            public final void run() {
                ql.o();
            }
        };
    }

    private ql() {
    }

    public static final void g(final AccessTokenAppIdPair accessTokenAppIdPair, final AppEvent appEvent) {
        if (c11.d(ql.class)) {
            return;
        }
        try {
            zq3.h(accessTokenAppIdPair, "accessTokenAppId");
            zq3.h(appEvent, "appEvent");
            e.execute(new Runnable() { // from class: ll
                @Override // java.lang.Runnable
                public final void run() {
                    ql.h(AccessTokenAppIdPair.this, appEvent);
                }
            });
        } catch (Throwable th) {
            c11.b(th, ql.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        if (c11.d(ql.class)) {
            return;
        }
        try {
            zq3.h(accessTokenAppIdPair, "$accessTokenAppId");
            zq3.h(appEvent, "$appEvent");
            d.a(accessTokenAppIdPair, appEvent);
            if (AppEventsLogger.b.d() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && d.d() > c) {
                n(FlushReason.EVENT_THRESHOLD);
            } else if (f == null) {
                f = e.schedule(g, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            c11.b(th, ql.class);
        }
    }

    public static final GraphRequest i(final AccessTokenAppIdPair accessTokenAppIdPair, final el7 el7Var, boolean z, final nl2 nl2Var) {
        if (c11.d(ql.class)) {
            return null;
        }
        try {
            zq3.h(accessTokenAppIdPair, "accessTokenAppId");
            zq3.h(el7Var, "appEvents");
            zq3.h(nl2Var, "flushState");
            String b2 = accessTokenAppIdPair.b();
            rd2 n = FetchedAppSettingsManager.n(b2, false);
            GraphRequest.c cVar = GraphRequest.n;
            z38 z38Var = z38.a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{b2}, 1));
            zq3.g(format, "java.lang.String.format(format, *args)");
            final GraphRequest A = cVar.A(null, format, null, null);
            A.E(true);
            Bundle u = A.u();
            if (u == null) {
                u = new Bundle();
            }
            u.putString(AccessToken.ACCESS_TOKEN_KEY, accessTokenAppIdPair.a());
            String e2 = kq3.b.e();
            if (e2 != null) {
                u.putString("device_token", e2);
            }
            String k = yl.c.k();
            if (k != null) {
                u.putString("install_referrer", k);
            }
            A.H(u);
            int e3 = el7Var.e(A, w92.l(), n != null ? n.m() : false, z);
            if (e3 == 0) {
                return null;
            }
            nl2Var.c(nl2Var.a() + e3);
            A.D(new GraphRequest.b() { // from class: nl
                @Override // com.facebook.GraphRequest.b
                public final void a(m23 m23Var) {
                    ql.j(AccessTokenAppIdPair.this, A, el7Var, nl2Var, m23Var);
                }
            });
            return A;
        } catch (Throwable th) {
            c11.b(th, ql.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, el7 el7Var, nl2 nl2Var, m23 m23Var) {
        if (c11.d(ql.class)) {
            return;
        }
        try {
            zq3.h(accessTokenAppIdPair, "$accessTokenAppId");
            zq3.h(graphRequest, "$postRequest");
            zq3.h(el7Var, "$appEvents");
            zq3.h(nl2Var, "$flushState");
            zq3.h(m23Var, "response");
            q(accessTokenAppIdPair, graphRequest, m23Var, el7Var, nl2Var);
        } catch (Throwable th) {
            c11.b(th, ql.class);
        }
    }

    public static final List k(hl hlVar, nl2 nl2Var) {
        if (c11.d(ql.class)) {
            return null;
        }
        try {
            zq3.h(hlVar, "appEventCollection");
            zq3.h(nl2Var, "flushResults");
            boolean y = w92.y(w92.l());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : hlVar.f()) {
                el7 c2 = hlVar.c(accessTokenAppIdPair);
                if (c2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                GraphRequest i = i(accessTokenAppIdPair, c2, y, nl2Var);
                if (i != null) {
                    arrayList.add(i);
                    if (ul.a.f()) {
                        AppEventsConversionsAPITransformerWebRequests.l(i);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            c11.b(th, ql.class);
            return null;
        }
    }

    public static final void l(final FlushReason flushReason) {
        if (c11.d(ql.class)) {
            return;
        }
        try {
            zq3.h(flushReason, "reason");
            e.execute(new Runnable() { // from class: ml
                @Override // java.lang.Runnable
                public final void run() {
                    ql.m(FlushReason.this);
                }
            });
        } catch (Throwable th) {
            c11.b(th, ql.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(FlushReason flushReason) {
        if (c11.d(ql.class)) {
            return;
        }
        try {
            zq3.h(flushReason, "$reason");
            n(flushReason);
        } catch (Throwable th) {
            c11.b(th, ql.class);
        }
    }

    public static final void n(FlushReason flushReason) {
        if (c11.d(ql.class)) {
            return;
        }
        try {
            zq3.h(flushReason, "reason");
            d.b(il.a());
            try {
                nl2 u = u(flushReason, d);
                if (u != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", u.a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", u.b());
                    b74.b(w92.l()).d(intent);
                }
            } catch (Exception e2) {
                Log.w(b, "Caught unexpected exception while flushing app events: ", e2);
            }
        } catch (Throwable th) {
            c11.b(th, ql.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o() {
        if (c11.d(ql.class)) {
            return;
        }
        try {
            f = null;
            if (AppEventsLogger.b.d() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                n(FlushReason.TIMER);
            }
        } catch (Throwable th) {
            c11.b(th, ql.class);
        }
    }

    public static final Set p() {
        if (c11.d(ql.class)) {
            return null;
        }
        try {
            return d.f();
        } catch (Throwable th) {
            c11.b(th, ql.class);
            return null;
        }
    }

    public static final void q(final AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, m23 m23Var, final el7 el7Var, nl2 nl2Var) {
        String str;
        if (c11.d(ql.class)) {
            return;
        }
        try {
            zq3.h(accessTokenAppIdPair, "accessTokenAppId");
            zq3.h(graphRequest, "request");
            zq3.h(m23Var, "response");
            zq3.h(el7Var, "appEvents");
            zq3.h(nl2Var, "flushState");
            FacebookRequestError b2 = m23Var.b();
            String str2 = "Success";
            FlushResult flushResult = FlushResult.SUCCESS;
            if (b2 != null) {
                if (b2.b() == -1) {
                    str2 = "Failed: No Connectivity";
                    flushResult = FlushResult.NO_CONNECTIVITY;
                } else {
                    z38 z38Var = z38.a;
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{m23Var.toString(), b2.toString()}, 2));
                    zq3.g(str2, "java.lang.String.format(format, *args)");
                    flushResult = FlushResult.SERVER_ERROR;
                }
            }
            w92 w92Var = w92.a;
            if (w92.G(LoggingBehavior.APP_EVENTS)) {
                try {
                    str = new JSONArray((String) graphRequest.w()).toString(2);
                    zq3.g(str, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                k94.e.c(LoggingBehavior.APP_EVENTS, b, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(graphRequest.q()), str2, str);
            }
            el7Var.b(b2 != null);
            FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
            if (flushResult == flushResult2) {
                w92.t().execute(new Runnable() { // from class: pl
                    @Override // java.lang.Runnable
                    public final void run() {
                        ql.r(AccessTokenAppIdPair.this, el7Var);
                    }
                });
            }
            if (flushResult == FlushResult.SUCCESS || nl2Var.b() == flushResult2) {
                return;
            }
            nl2Var.d(flushResult);
        } catch (Throwable th) {
            c11.b(th, ql.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(AccessTokenAppIdPair accessTokenAppIdPair, el7 el7Var) {
        if (c11.d(ql.class)) {
            return;
        }
        try {
            zq3.h(accessTokenAppIdPair, "$accessTokenAppId");
            zq3.h(el7Var, "$appEvents");
            rl.b(accessTokenAppIdPair, el7Var);
        } catch (Throwable th) {
            c11.b(th, ql.class);
        }
    }

    public static final void s() {
        if (c11.d(ql.class)) {
            return;
        }
        try {
            e.execute(new Runnable() { // from class: ol
                @Override // java.lang.Runnable
                public final void run() {
                    ql.t();
                }
            });
        } catch (Throwable th) {
            c11.b(th, ql.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t() {
        if (c11.d(ql.class)) {
            return;
        }
        try {
            rl rlVar = rl.a;
            rl.a(d);
            d = new hl();
        } catch (Throwable th) {
            c11.b(th, ql.class);
        }
    }

    public static final nl2 u(FlushReason flushReason, hl hlVar) {
        if (c11.d(ql.class)) {
            return null;
        }
        try {
            zq3.h(flushReason, "reason");
            zq3.h(hlVar, "appEventCollection");
            nl2 nl2Var = new nl2();
            List k = k(hlVar, nl2Var);
            if (k.isEmpty()) {
                return null;
            }
            k94.e.c(LoggingBehavior.APP_EVENTS, b, "Flushing %d events due to %s.", Integer.valueOf(nl2Var.a()), flushReason.toString());
            Iterator it2 = k.iterator();
            while (it2.hasNext()) {
                ((GraphRequest) it2.next()).k();
            }
            return nl2Var;
        } catch (Throwable th) {
            c11.b(th, ql.class);
            return null;
        }
    }
}
