package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzfho;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dkd implements gqd {
    private final kke a;
    private final msc b;
    private final jxc c;
    private final fkd d;

    public dkd(kke kkeVar, msc mscVar, jxc jxcVar, fkd fkdVar) {
        this.a = kkeVar;
        this.b = mscVar;
        this.c = jxcVar;
        this.d = fkdVar;
    }

    final /* synthetic */ ekd a() {
        List<String> asList = Arrays.asList(((String) pla.c().a(mpa.r1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                s2e c = this.b.c(str, new JSONObject());
                c.c();
                boolean t = this.c.t();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) pla.c().a(mpa.cb)).booleanValue() || t) {
                    try {
                        zzbvg k = c.k();
                        if (k != null) {
                            bundle2.putString("sdk_version", k.toString());
                        }
                    } catch (zzfho unused) {
                    }
                }
                try {
                    zzbvg j = c.j();
                    if (j != null) {
                        bundle2.putString("adapter_version", j.toString());
                    }
                } catch (zzfho unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfho unused3) {
            }
        }
        ekd ekdVar = new ekd(bundle);
        if (((Boolean) pla.c().a(mpa.cb)).booleanValue()) {
            this.d.b(ekdVar);
        }
        return ekdVar;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 1;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        zoa zoaVar = mpa.cb;
        if (((Boolean) pla.c().a(zoaVar)).booleanValue() && this.d.a() != null) {
            ekd a = this.d.a();
            a.getClass();
            return zb.h(a);
        }
        if (ehe.d((String) pla.c().a(mpa.r1)) || (!((Boolean) pla.c().a(zoaVar)).booleanValue() && (this.d.d() || !this.c.t()))) {
            return zb.h(new ekd(new Bundle()));
        }
        this.d.c(true);
        return this.a.j(new Callable() { // from class: ckd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dkd.this.a();
            }
        });
    }
}
