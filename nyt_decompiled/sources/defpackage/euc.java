package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzdkv;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class euc implements jcc, jq9, t7c, d7c {
    private final Context a;
    private final j2e b;
    private final zuc c;
    private final g1e d;
    private final v0e e;
    private final a8d f;
    private Boolean g;
    private final boolean h = ((Boolean) pla.c().a(mpa.R6)).booleanValue();

    public euc(Context context, j2e j2eVar, zuc zucVar, g1e g1eVar, v0e v0eVar, a8d a8dVar) {
        this.a = context;
        this.b = j2eVar;
        this.c = zucVar;
        this.d = g1eVar;
        this.e = v0eVar;
        this.f = a8dVar;
    }

    private final yuc a(String str) {
        yuc a = this.c.a();
        a.e(this.d.b.b);
        a.d(this.e);
        a.b("action", str);
        if (!this.e.u.isEmpty()) {
            a.b("ancn", (String) this.e.u.get(0));
        }
        if (this.e.j0) {
            a.b("device_connectivity", true != dyf.q().z(this.a) ? "offline" : "online");
            a.b("event_timestamp", String.valueOf(dyf.b().currentTimeMillis()));
            a.b("offline_ad", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (((Boolean) pla.c().a(mpa.a7)).booleanValue()) {
            boolean z = ktd.e(this.d.a.a) != 1;
            a.b("scar", String.valueOf(z));
            if (z) {
                zzl zzlVar = this.d.a.a.d;
                a.c("ragent", zzlVar.zzp);
                a.c("rtype", ktd.a(ktd.b(zzlVar)));
            }
        }
        return a;
    }

    private final void c(yuc yucVar) {
        if (!this.e.j0) {
            yucVar.g();
            return;
        }
        this.f.h(new c8d(dyf.b().currentTimeMillis(), this.d.b.b.b, yucVar.f(), 2));
    }

    private final boolean n() {
        String str;
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
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
                    this.g = Boolean.valueOf(z);
                }
            }
        }
        return this.g.booleanValue();
    }

    @Override // defpackage.d7c
    public final void k(zze zzeVar) {
        zze zzeVar2;
        if (this.h) {
            yuc a = a("ifts");
            a.b("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals("com.google.android.gms.ads") && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals("com.google.android.gms.ads")) {
                zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                a.b("arec", String.valueOf(i));
            }
            String a2 = this.b.a(str);
            if (a2 != null) {
                a.b("areec", a2);
            }
            a.g();
        }
    }

    @Override // defpackage.d7c
    public final void l(zzdkv zzdkvVar) {
        if (this.h) {
            yuc a = a("ifts");
            a.b("reason", "exception");
            if (!TextUtils.isEmpty(zzdkvVar.getMessage())) {
                a.b("msg", zzdkvVar.getMessage());
            }
            a.g();
        }
    }

    @Override // defpackage.jq9
    public final void v() {
        if (this.e.j0) {
            c(a("click"));
        }
    }

    @Override // defpackage.d7c
    public final void zzb() {
        if (this.h) {
            yuc a = a("ifts");
            a.b("reason", "blocked");
            a.g();
        }
    }

    @Override // defpackage.jcc
    public final void zzi() {
        if (n()) {
            a("adapter_shown").g();
        }
    }

    @Override // defpackage.jcc
    public final void zzj() {
        if (n()) {
            a("adapter_impression").g();
        }
    }

    @Override // defpackage.t7c
    public final void zzq() {
        if (n() || this.e.j0) {
            c(a("impression"));
        }
    }
}
