package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class c91 {
    private final SharedPreferences a;
    private final uh2 b;
    private final Object c;
    qg8 d;
    boolean e;
    private boolean f;
    private Boolean g;
    private final qg8 h;

    public c91(uh2 uh2Var) {
        Object obj = new Object();
        this.c = obj;
        this.d = new qg8();
        this.e = false;
        this.f = false;
        this.h = new qg8();
        Context j = uh2Var.j();
        this.b = uh2Var;
        this.a = CommonUtils.r(j);
        Boolean b = b();
        this.g = b == null ? a(j) : b;
        synchronized (obj) {
            try {
                if (d()) {
                    this.d.e(null);
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean f = f(context);
        if (f == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f));
    }

    private Boolean b() {
        if (!this.a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f = false;
        return Boolean.valueOf(this.a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private void e(boolean z) {
        m94.f().b(String.format("Crashlytics automatic data collection %s by %s.", z ? "ENABLED" : "DISABLED", this.g == null ? "global Firebase setting" : this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            m94.f().e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    public void c(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.h.e(null);
    }

    public synchronized boolean d() {
        boolean booleanValue;
        try {
            Boolean bool = this.g;
            booleanValue = bool != null ? bool.booleanValue() : this.b.s();
            e(booleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return booleanValue;
    }

    public og8 g() {
        og8 a;
        synchronized (this.c) {
            a = this.d.a();
        }
        return a;
    }

    public og8 h(Executor executor) {
        return k29.j(executor, this.h.a(), g());
    }
}
