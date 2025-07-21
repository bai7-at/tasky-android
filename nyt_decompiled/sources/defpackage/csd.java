package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class csd implements gqd {
    private final Context a;
    private final String b;
    private final kke c;

    public csd(u9b u9bVar, Context context, String str, kke kkeVar) {
        this.a = context;
        this.b = str;
        this.c = kkeVar;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 42;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.c.j(new Callable() { // from class: bsd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new dsd(new JSONObject());
            }
        });
    }
}
