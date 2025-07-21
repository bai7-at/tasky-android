package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzdkv;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class v5d implements jcc, jq9, t7c, d7c {
    private final Context a;
    private final j2e b;
    private final g1e c;
    private final v0e d;
    private final a8d e;
    private Boolean f;
    private final boolean g = ((Boolean) pla.c().a(mpa.R6)).booleanValue();
    private final k6e h;
    private final String i;

    public v5d(Context context, j2e j2eVar, g1e g1eVar, v0e v0eVar, a8d a8dVar, k6e k6eVar, String str) {
        this.a = context;
        this.b = j2eVar;
        this.c = g1eVar;
        this.d = v0eVar;
        this.e = a8dVar;
        this.h = k6eVar;
        this.i = str;
    }

    private final j6e a(String str) {
        j6e b = j6e.b(str);
        b.h(this.c, null);
        b.f(this.d);
        b.a("request_id", this.i);
        if (!this.d.u.isEmpty()) {
            b.a("ancn", (String) this.d.u.get(0));
        }
        if (this.d.j0) {
            b.a("device_connectivity", true != dyf.q().z(this.a) ? "offline" : "online");
            b.a("event_timestamp", String.valueOf(dyf.b().currentTimeMillis()));
            b.a("offline_ad", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        return b;
    }

    private final void c(j6e j6eVar) {
        if (!this.d.j0) {
            this.h.a(j6eVar);
            return;
        }
        this.e.h(new c8d(dyf.b().currentTimeMillis(), this.c.b.b.b, this.h.b(j6eVar), 2));
    }

    private final boolean n() {
        String str;
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    String str2 = (String) pla.c().a(mpa.t1);
                    dyf.r();
                    try {
                        str = wxf.R(this.a);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (str2 != null && str != null) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            dyf.q().w(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f = Boolean.valueOf(z);
                }
            }
        }
        return this.f.booleanValue();
    }

    @Override // defpackage.d7c
    public final void k(zze zzeVar) {
        zze zzeVar2;
        if (this.g) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals("com.google.android.gms.ads") && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals("com.google.android.gms.ads")) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String a = this.b.a(str);
            j6e a2 = a("ifts");
            a2.a("reason", "adapter");
            if (i >= 0) {
                a2.a("arec", String.valueOf(i));
            }
            if (a != null) {
                a2.a("areec", a);
            }
            this.h.a(a2);
        }
    }

    @Override // defpackage.d7c
    public final void l(zzdkv zzdkvVar) {
        if (this.g) {
            j6e a = a("ifts");
            a.a("reason", "exception");
            if (!TextUtils.isEmpty(zzdkvVar.getMessage())) {
                a.a("msg", zzdkvVar.getMessage());
            }
            this.h.a(a);
        }
    }

    @Override // defpackage.jq9
    public final void v() {
        if (this.d.j0) {
            c(a("click"));
        }
    }

    @Override // defpackage.d7c
    public final void zzb() {
        if (this.g) {
            k6e k6eVar = this.h;
            j6e a = a("ifts");
            a.a("reason", "blocked");
            k6eVar.a(a);
        }
    }

    @Override // defpackage.jcc
    public final void zzi() {
        if (n()) {
            this.h.a(a("adapter_shown"));
        }
    }

    @Override // defpackage.jcc
    public final void zzj() {
        if (n()) {
            this.h.a(a("adapter_impression"));
        }
    }

    @Override // defpackage.t7c
    public final void zzq() {
        if (n() || this.d.j0) {
            c(a("impression"));
        }
    }
}
