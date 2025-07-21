package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes3.dex */
final class yqb implements axd {
    private final gqb a;
    private Context b;
    private String c;
    private zzq d;

    /* synthetic */ yqb(gqb gqbVar, xqb xqbVar) {
        this.a = gqbVar;
    }

    @Override // defpackage.axd
    public final /* synthetic */ axd a(zzq zzqVar) {
        zzqVar.getClass();
        this.d = zzqVar;
        return this;
    }

    @Override // defpackage.axd
    public final /* synthetic */ axd b(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // defpackage.axd
    public final /* synthetic */ axd f(String str) {
        str.getClass();
        this.c = str;
        return this;
    }

    @Override // defpackage.axd
    public final bxd zzd() {
        d4f.c(this.b, Context.class);
        d4f.c(this.c, String.class);
        d4f.c(this.d, zzq.class);
        return new arb(this.a, this.b, this.c, this.d, null);
    }
}
