package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rsd implements gqd {
    final kke a;
    final Context b;
    final xma c;

    public rsd(xma xmaVar, kke kkeVar, Context context) {
        this.c = xmaVar;
        this.a = kkeVar;
        this.b = context;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 45;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: qsd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ssd(new JSONObject());
            }
        });
    }
}
