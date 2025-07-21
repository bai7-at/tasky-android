package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class dvd implements gqd {
    private final kke a;

    public dvd(kke kkeVar) {
        this.a = kkeVar;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 51;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: cvd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                String str = (String) pla.c().a(mpa.K);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) pla.c().a(mpa.L)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, ypb.a(str2));
                        }
                    }
                }
                return new evd(hashMap);
            }
        });
    }
}
