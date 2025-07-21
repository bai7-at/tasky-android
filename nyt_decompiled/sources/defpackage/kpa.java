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
public final class kpa implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context g;
    private final Object a = new Object();
    private final ConditionVariable b = new ConditionVariable();
    private volatile boolean c = false;
    volatile boolean d = false;
    private SharedPreferences e = null;
    private Bundle f = new Bundle();
    private JSONObject h = new JSONObject();

    private final void d(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.h = new JSONObject((String) rpa.a(new fhe() { // from class: cpa
                @Override // defpackage.fhe
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final Object a(final zoa zoaVar) {
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
                return zoaVar.m();
            }
        }
        if (zoaVar.e() != 2) {
            return (zoaVar.e() == 1 && this.h.has(zoaVar.n())) ? zoaVar.a(this.h) : rpa.a(new fhe() { // from class: dpa
                @Override // defpackage.fhe
                public final Object zza() {
                    return kpa.this.b(zoaVar);
                }
            });
        }
        Bundle bundle = this.f;
        return bundle == null ? zoaVar.m() : zoaVar.b(bundle);
    }

    final /* synthetic */ Object b(zoa zoaVar) {
        return zoaVar.c(this.e);
    }

    public final void c(Context context) {
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
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.g = context;
                try {
                    this.f = Wrappers.packageManager(context).getApplicationInfo(this.g.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context2 = this.g;
                    Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context2);
                    if (remoteContext != null || context2 == null || (remoteContext = context2.getApplicationContext()) != null) {
                        context2 = remoteContext;
                    }
                    if (context2 == null) {
                        return;
                    }
                    pla.b();
                    SharedPreferences a = bpa.a(context2);
                    this.e = a;
                    if (a != null) {
                        a.registerOnSharedPreferenceChangeListener(this);
                    }
                    nsa.c(new epa(this, this.e));
                    d(this.e);
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
            d(sharedPreferences);
        }
    }
}
