package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
final class qrb implements fwc {
    private final Long a;
    private final String b;
    private final gqb c;
    private final urb d;
    private final qrb e = this;

    /* synthetic */ qrb(gqb gqbVar, urb urbVar, Long l, String str, prb prbVar) {
        this.c = gqbVar;
        this.d = urbVar;
        this.a = l;
        this.b = str;
    }

    @Override // defpackage.fwc
    public final pwc zza() {
        Context context;
        iwc b;
        urb urbVar = this.d;
        long longValue = this.a.longValue();
        context = urbVar.a;
        b = jwc.b(urbVar.b);
        return qwc.a(longValue, context, b, this.c, this.b);
    }

    @Override // defpackage.fwc
    public final twc zzb() {
        Context context;
        iwc b;
        urb urbVar = this.d;
        long longValue = this.a.longValue();
        context = urbVar.a;
        b = jwc.b(urbVar.b);
        return uwc.a(longValue, context, b, this.c, this.b);
    }
}
