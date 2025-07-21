package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class q7e implements Runnable {
    private final v7e b;
    private String c;
    private String d;
    private f1e e;
    private zze f;
    private Future g;
    private final List a = new ArrayList();
    private int h = 2;

    q7e(v7e v7eVar) {
        this.b = v7eVar;
    }

    public final synchronized q7e a(f7e f7eVar) {
        try {
            if (((Boolean) jra.c.e()).booleanValue()) {
                List list = this.a;
                f7eVar.zzi();
                list.add(f7eVar);
                Future future = this.g;
                if (future != null) {
                    future.cancel(false);
                }
                this.g = pgb.d.schedule(this, ((Integer) pla.c().a(mpa.G8)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized q7e b(String str) {
        if (((Boolean) jra.c.e()).booleanValue() && p7e.e(str)) {
            this.c = str;
        }
        return this;
    }

    public final synchronized q7e c(zze zzeVar) {
        if (((Boolean) jra.c.e()).booleanValue()) {
            this.f = zzeVar;
        }
        return this;
    }

    public final synchronized q7e d(ArrayList arrayList) {
        try {
            if (((Boolean) jra.c.e()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                        if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.h = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                    this.h = 6;
                                }
                            }
                            this.h = 5;
                        }
                        this.h = 8;
                    }
                    this.h = 4;
                }
                this.h = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized q7e e(String str) {
        if (((Boolean) jra.c.e()).booleanValue()) {
            this.d = str;
        }
        return this;
    }

    public final synchronized q7e f(f1e f1eVar) {
        if (((Boolean) jra.c.e()).booleanValue()) {
            this.e = f1eVar;
        }
        return this;
    }

    public final synchronized void g() {
        try {
            if (((Boolean) jra.c.e()).booleanValue()) {
                Future future = this.g;
                if (future != null) {
                    future.cancel(false);
                }
                for (f7e f7eVar : this.a) {
                    int i = this.h;
                    if (i != 2) {
                        f7eVar.c(i);
                    }
                    if (!TextUtils.isEmpty(this.c)) {
                        f7eVar.b(this.c);
                    }
                    if (!TextUtils.isEmpty(this.d) && !f7eVar.zzk()) {
                        f7eVar.I(this.d);
                    }
                    f1e f1eVar = this.e;
                    if (f1eVar != null) {
                        f7eVar.a(f1eVar);
                    } else {
                        zze zzeVar = this.f;
                        if (zzeVar != null) {
                            f7eVar.k(zzeVar);
                        }
                    }
                    this.b.b(f7eVar.zzl());
                }
                this.a.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized q7e h(int i) {
        if (((Boolean) jra.c.e()).booleanValue()) {
            this.h = i;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        g();
    }
}
