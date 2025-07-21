package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.AuthenticationTokenClaims;
import defpackage.gi3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class gi3 {
    public static final gi3 a = new gi3();
    private static final String b = gi3.class.getCanonicalName();
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static Boolean d;
    private static Boolean e;
    private static ServiceConnection f;
    private static Application.ActivityLifecycleCallbacks g;
    private static Intent h;
    private static Object i;

    public static final class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zq3.h(componentName, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(iBinder, "service");
            gi3 gi3Var = gi3.a;
            oi3 oi3Var = oi3.a;
            gi3.i = oi3.a(w92.l(), iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            zq3.h(componentName, AuthenticationTokenClaims.JSON_KEY_NAME);
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e() {
            Context l = w92.l();
            oi3 oi3Var = oi3.a;
            ArrayList i = oi3.i(l, gi3.i);
            gi3 gi3Var = gi3.a;
            gi3Var.f(l, i, false);
            gi3Var.f(l, oi3.j(l, gi3.i), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f() {
            Context l = w92.l();
            oi3 oi3Var = oi3.a;
            ArrayList i = oi3.i(l, gi3.i);
            if (i.isEmpty()) {
                i = oi3.g(l, gi3.i);
            }
            gi3.a.f(l, i, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            zq3.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            zq3.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            zq3.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            zq3.h(activity, "activity");
            try {
                w92.t().execute(new Runnable() { // from class: ii3
                    @Override // java.lang.Runnable
                    public final void run() {
                        gi3.b.e();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zq3.h(activity, "activity");
            zq3.h(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            zq3.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            zq3.h(activity, "activity");
            try {
                if (zq3.c(gi3.e, Boolean.TRUE) && zq3.c(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    w92.t().execute(new Runnable() { // from class: hi3
                        @Override // java.lang.Runnable
                        public final void run() {
                            gi3.b.f();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    private gi3() {
    }

    private final void e() {
        if (d != null) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(si3.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        d = valueOf;
        if (zq3.c(valueOf, Boolean.FALSE)) {
            return;
        }
        e = Boolean.valueOf(si3.a("com.android.billingclient.api.ProxyBillingActivity") != null);
        oi3.b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        zq3.g(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        h = intent;
        f = new a();
        g = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Context context, ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            try {
                String string = new JSONObject(str).getString("productId");
                zq3.g(string, "sku");
                zq3.g(str, "purchase");
                hashMap.put(string, str);
                arrayList2.add(string);
            } catch (JSONException e2) {
                Log.e(b, "Error parsing in-app purchase data.", e2);
            }
        }
        oi3 oi3Var = oi3.a;
        for (Map.Entry entry : oi3.k(context, arrayList2, i, z).entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String str4 = (String) hashMap.get(str2);
            if (str4 != null) {
                s20.f(str4, str3, z);
            }
        }
    }

    public static final void g() {
        gi3 gi3Var = a;
        gi3Var.e();
        if (!zq3.c(d, Boolean.FALSE) && s20.c()) {
            gi3Var.h();
        }
    }

    private final void h() {
        if (c.compareAndSet(false, true)) {
            Context l = w92.l();
            if (l instanceof Application) {
                Application application = (Application) l;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = g;
                if (activityLifecycleCallbacks == null) {
                    zq3.z("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = h;
                if (intent == null) {
                    zq3.z("intent");
                    throw null;
                }
                ServiceConnection serviceConnection = f;
                if (serviceConnection != null) {
                    l.bindService(intent, serviceConnection, 1);
                } else {
                    zq3.z("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
