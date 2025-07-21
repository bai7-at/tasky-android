package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public final class te5 {
    public static final te5 a = new te5();
    private static final Set b = b0.j("fb_mobile_purchase", "StartTrial", "Subscribe");

    private te5() {
    }

    private final boolean c(AppEvent appEvent) {
        if (c11.d(this)) {
            return false;
        }
        try {
            return !appEvent.h() || (appEvent.h() && b.contains(appEvent.f()));
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    public static final boolean d() {
        if (c11.d(te5.class)) {
            return false;
        }
        try {
            if (w92.y(w92.l()) || g29.V()) {
                return false;
            }
            return RemoteServiceWrapper.b();
        } catch (Throwable th) {
            c11.b(th, te5.class);
            return false;
        }
    }

    public static final void e(final String str, final AppEvent appEvent) {
        if (c11.d(te5.class)) {
            return;
        }
        try {
            zq3.h(str, "applicationId");
            zq3.h(appEvent, "event");
            if (a.c(appEvent)) {
                w92.t().execute(new Runnable() { // from class: re5
                    @Override // java.lang.Runnable
                    public final void run() {
                        te5.f(str, appEvent);
                    }
                });
            }
        } catch (Throwable th) {
            c11.b(th, te5.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(String str, AppEvent appEvent) {
        if (c11.d(te5.class)) {
            return;
        }
        try {
            zq3.h(str, "$applicationId");
            zq3.h(appEvent, "$event");
            RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.a;
            RemoteServiceWrapper.c(str, i.e(appEvent));
        } catch (Throwable th) {
            c11.b(th, te5.class);
        }
    }

    public static final void g(final String str, final String str2) {
        if (c11.d(te5.class)) {
            return;
        }
        try {
            final Context l = w92.l();
            if (l == null || str == null || str2 == null) {
                return;
            }
            w92.t().execute(new Runnable() { // from class: se5
                @Override // java.lang.Runnable
                public final void run() {
                    te5.h(l, str2, str);
                }
            });
        } catch (Throwable th) {
            c11.b(th, te5.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Context context, String str, String str2) {
        if (c11.d(te5.class)) {
            return;
        }
        try {
            zq3.h(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String q = zq3.q(str2, "pingForOnDevice");
            if (sharedPreferences.getLong(q, 0L) == 0) {
                RemoteServiceWrapper.e(str2);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(q, System.currentTimeMillis());
                edit.apply();
            }
        } catch (Throwable th) {
            c11.b(th, te5.class);
        }
    }
}
