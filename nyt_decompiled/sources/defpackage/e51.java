package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;

/* loaded from: classes2.dex */
public final class e51 {
    public static final e51 a = new e51();
    private static final String[] b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private e51() {
    }

    public static final String a() {
        if (c11.d(e51.class)) {
            return null;
        }
        try {
            Context l = w92.l();
            List<ResolveInfo> queryIntentServices = l.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                HashSet B0 = d.B0(b);
                Iterator<ResolveInfo> it2 = queryIntentServices.iterator();
                while (it2.hasNext()) {
                    ServiceInfo serviceInfo = it2.next().serviceInfo;
                    if (serviceInfo != null && B0.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, e51.class);
            return null;
        }
    }

    public static final String b() {
        if (c11.d(e51.class)) {
            return null;
        }
        try {
            return zq3.q("fbconnect://cct.", w92.l().getPackageName());
        } catch (Throwable th) {
            c11.b(th, e51.class);
            return null;
        }
    }

    public static final String c(String str) {
        if (c11.d(e51.class)) {
            return null;
        }
        try {
            zq3.h(str, "developerDefinedRedirectURI");
            v29 v29Var = v29.a;
            return v29.e(w92.l(), str) ? str : v29.e(w92.l(), b()) ? b() : "";
        } catch (Throwable th) {
            c11.b(th, e51.class);
            return null;
        }
    }
}
