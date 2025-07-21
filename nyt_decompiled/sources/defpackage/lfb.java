package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzl;

/* loaded from: classes3.dex */
public final class lfb {
    final String g;
    private final hie h;
    long a = -1;
    long b = -1;
    int c = -1;
    int d = -1;
    long e = 0;
    private final Object f = new Object();
    int i = 0;
    int j = 0;
    int k = 0;

    public lfb(String str, hie hieVar) {
        this.g = str;
        this.h = hieVar;
    }

    private final void i() {
        if (((Boolean) csa.a.e()).booleanValue()) {
            synchronized (this.f) {
                this.c--;
                this.d--;
            }
        }
    }

    public final int a() {
        int i;
        synchronized (this.f) {
            i = this.k;
        }
        return i;
    }

    public final Bundle b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f) {
            try {
                bundle = new Bundle();
                if (!this.h.g()) {
                    bundle.putString("session_id", this.g);
                }
                bundle.putLong("basets", this.b);
                bundle.putLong("currts", this.a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.c);
                bundle.putInt("preqs_in_session", this.d);
                bundle.putLong("time_in_session", this.e);
                bundle.putInt("pclick", this.i);
                bundle.putInt("pimp", this.j);
                Context a = gab.a(context);
                int identifier = a.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z = false;
                if (identifier == 0) {
                    fgb.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z = true;
                        } else {
                            fgb.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        fgb.g("Fail to fetch AdActivity theme");
                        fgb.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z);
                bundle.putInt("consent_form_action_identifier", a());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void c() {
        synchronized (this.f) {
            this.i++;
        }
    }

    public final void d() {
        synchronized (this.f) {
            this.j++;
        }
    }

    public final void e() {
        i();
    }

    public final void f() {
        i();
    }

    public final void g(zzl zzlVar, long j) {
        Bundle bundle;
        synchronized (this.f) {
            try {
                long zzd = this.h.zzd();
                long currentTimeMillis = dyf.b().currentTimeMillis();
                if (this.b == -1) {
                    if (currentTimeMillis - zzd > ((Long) pla.c().a(mpa.T0)).longValue()) {
                        this.d = -1;
                    } else {
                        this.d = this.h.zzc();
                    }
                    this.b = j;
                    this.a = j;
                } else {
                    this.a = j;
                }
                if (((Boolean) pla.c().a(mpa.t3)).booleanValue() || (bundle = zzlVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.c++;
                    int i = this.d + 1;
                    this.d = i;
                    if (i == 0) {
                        this.e = 0L;
                        this.h.f(currentTimeMillis);
                    } else {
                        this.e = currentTimeMillis - this.h.zze();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f) {
            this.k++;
        }
    }
}
