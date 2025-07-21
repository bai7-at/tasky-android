package defpackage;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class ixd implements e4e {
    public final fyd a;
    public final hyd b;
    public final zzl c;
    public final String d;
    public final Executor e;
    public final zzw f;
    public final t3e g;

    public ixd(fyd fydVar, hyd hydVar, zzl zzlVar, String str, Executor executor, zzw zzwVar, t3e t3eVar) {
        this.a = fydVar;
        this.b = hydVar;
        this.c = zzlVar;
        this.d = str;
        this.e = executor;
        this.f = zzwVar;
        this.g = t3eVar;
    }

    @Override // defpackage.e4e
    public final t3e zza() {
        return this.g;
    }

    @Override // defpackage.e4e
    public final Executor zzb() {
        return this.e;
    }
}
