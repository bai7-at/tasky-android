package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class qmd implements gqd {
    private final Context a;
    private final kke b;

    public qmd(Context context, kke kkeVar) {
        this.a = context;
        this.b = kkeVar;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 19;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.b.j(new Callable() { // from class: pmd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                dyf.r();
                bka zzg = dyf.q().i().zzg();
                Bundle bundle = null;
                if (zzg != null && (!dyf.q().i().zzN() || !dyf.q().i().zzO())) {
                    if (zzg.h()) {
                        zzg.g();
                    }
                    rja a = zzg.a();
                    if (a != null) {
                        zzj = a.d();
                        str = a.e();
                        zzk = a.f();
                        if (zzj != null) {
                            dyf.q().i().o(zzj);
                        }
                        if (zzk != null) {
                            dyf.q().i().s(zzk);
                        }
                    } else {
                        zzj = dyf.q().i().zzj();
                        zzk = dyf.q().i().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!dyf.q().i().zzO()) {
                        if (zzk == null || TextUtils.isEmpty(zzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", zzk);
                        }
                    }
                    if (zzj != null && !dyf.q().i().zzN()) {
                        bundle2.putString("fingerprint", zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new rmd(bundle);
            }
        });
    }
}
