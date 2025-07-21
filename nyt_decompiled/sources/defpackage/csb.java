package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes3.dex */
final class csb implements uyd {
    private final gqb a;
    private Context b;
    private String c;
    private zzq d;

    /* synthetic */ csb(gqb gqbVar, bsb bsbVar) {
        this.a = gqbVar;
    }

    @Override // defpackage.uyd
    public final /* synthetic */ uyd a(zzq zzqVar) {
        zzqVar.getClass();
        this.d = zzqVar;
        return this;
    }

    @Override // defpackage.uyd
    public final /* synthetic */ uyd b(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // defpackage.uyd
    public final /* synthetic */ uyd f(String str) {
        str.getClass();
        this.c = str;
        return this;
    }

    @Override // defpackage.uyd
    public final vyd zzd() {
        d4f.c(this.b, Context.class);
        d4f.c(this.c, String.class);
        d4f.c(this.d, zzq.class);
        return new esb(this.a, this.b, this.c, this.d, null);
    }
}
