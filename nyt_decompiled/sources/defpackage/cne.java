package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cne implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context g;
    private final Object a = new Object();
    private final ConditionVariable b = new ConditionVariable();
    private volatile boolean c = false;
    volatile boolean d = false;
    private SharedPreferences e = null;
    private Bundle f = new Bundle();
    private JSONObject h = new JSONObject();

    private final void f() {
        if (this.e == null) {
            return;
        }
        try {
            this.h = new JSONObject((String) hqe.a(new f8f() { // from class: yke
                @Override // defpackage.f8f
                public final Object zza() {
                    return cne.this.d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final Object b(final xie xieVar) {
        if (!this.b.block(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT)) {
            synchronized (this.a) {
                try {
                    if (!this.d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.c || this.e == null) {
            synchronized (this.a) {
                if (this.c && this.e != null) {
                }
                return xieVar.k();
            }
        }
        if (xieVar.d() != 2) {
            return (xieVar.d() == 1 && this.h.has(xieVar.l())) ? xieVar.a(this.h) : hqe.a(new f8f() { // from class: lke
                @Override // defpackage.f8f
                public final Object zza() {
                    return cne.this.c(xieVar);
                }
            });
        }
        Bundle bundle = this.f;
        return bundle == null ? xieVar.k() : xieVar.b(bundle);
    }

    final /* synthetic */ Object c(xie xieVar) {
        return xieVar.c(this.e);
    }

    final /* synthetic */ String d() {
        return this.e.getString("flag_configuration", "{}");
    }

    public final void e(Context context) {
        if (this.c) {
            return;
        }
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                if (!this.d) {
                    this.d = true;
                }
                Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                this.g = applicationContext;
                try {
                    this.f = Wrappers.packageManager(applicationContext).getApplicationInfo(this.g.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                    if (remoteContext != null || (remoteContext = context.getApplicationContext()) != null) {
                        context = remoteContext;
                    }
                    if (context == null) {
                        return;
                    }
                    lee.b();
                    SharedPreferences sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
                    this.e = sharedPreferences;
                    if (sharedPreferences != null) {
                        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                    }
                    rwe.c(new zle(this));
                    f();
                    this.c = true;
                } finally {
                    this.d = false;
                    this.b.open();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            f();
        }
    }
}
