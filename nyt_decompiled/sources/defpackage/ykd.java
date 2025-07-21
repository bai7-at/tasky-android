package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zb;

/* loaded from: classes3.dex */
public final class ykd implements gqd {
    private static final Object j = new Object();
    final Context a;
    private final String b;
    private final String c;
    private final w2c d;
    private final c3e e;
    private final s1e f;
    private final hie g = dyf.q().i();
    private final uuc h;
    private final j3c i;

    public ykd(Context context, String str, String str2, w2c w2cVar, c3e c3eVar, s1e s1eVar, uuc uucVar, j3c j3cVar) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = w2cVar;
        this.e = c3eVar;
        this.f = s1eVar;
        this.h = uucVar;
        this.i = j3cVar;
    }

    final /* synthetic */ void a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) pla.c().a(mpa.A5)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) pla.c().a(mpa.z5)).booleanValue()) {
                synchronized (j) {
                    this.d.k(this.f.d);
                    bundle2.putBundle("quality_signals", this.e.a());
                }
            } else {
                this.d.k(this.f.d);
                bundle2.putBundle("quality_signals", this.e.a());
            }
        }
        bundle2.putString("seq_num", this.b);
        if (!this.g.g()) {
            bundle2.putString("session_id", this.c);
        }
        bundle2.putBoolean("client_purpose_one", !this.g.g());
        if (((Boolean) pla.c().a(mpa.B5)).booleanValue()) {
            try {
                dyf.r();
                bundle2.putString("_app_id", wxf.R(this.a));
            } catch (RemoteException e) {
                dyf.q().w(e, "AppStatsSignal_AppId");
            }
        }
        if (((Boolean) pla.c().a(mpa.C5)).booleanValue() && this.f.f != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.i.b(this.f.f));
            bundle3.putInt("pcc", this.i.a(this.f.f));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
        if (!((Boolean) pla.c().a(mpa.y9)).booleanValue() || dyf.q().a() <= 0) {
            return;
        }
        bundle2.putInt("nrwv", dyf.q().a());
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 12;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) pla.c().a(mpa.y7)).booleanValue()) {
            uuc uucVar = this.h;
            uucVar.a().put("seq_num", this.b);
        }
        if (((Boolean) pla.c().a(mpa.A5)).booleanValue()) {
            this.d.k(this.f.d);
            bundle.putAll(this.e.a());
        }
        return zb.h(new fqd() { // from class: xkd
            @Override // defpackage.fqd
            public final void a(Object obj) {
                ykd.this.a(bundle, (Bundle) obj);
            }
        });
    }
}
