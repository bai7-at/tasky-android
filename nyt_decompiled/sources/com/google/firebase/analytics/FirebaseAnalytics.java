package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.installations.c;
import defpackage.a8f;
import defpackage.j4d;
import defpackage.vg8;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics b;
    private final j4d a;

    public FirebaseAnalytics(j4d j4dVar) {
        Preconditions.checkNotNull(j4dVar);
        this.a = j4dVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(j4d.v(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Keep
    public static a8f getScionFrontendApiImplementation(Context context, Bundle bundle) {
        j4d v = j4d.v(context, null, null, null, bundle);
        if (v == null) {
            return null;
        }
        return new a(v);
    }

    public void a(String str, Bundle bundle) {
        this.a.K(str, bundle);
    }

    public void b(boolean z) {
        this.a.f(Boolean.valueOf(z));
    }

    public void c(String str) {
        this.a.g(str);
    }

    public void d(String str, String str2) {
        this.a.h(null, str, str2, false);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) vg8.b(c.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.a.e(activity, str, str2);
    }
}
