package defpackage;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class h3c implements idc, r8c {
    private final Clock a;
    private final j3c b;
    private final s1e c;
    private final String d;

    h3c(Clock clock, j3c j3cVar, s1e s1eVar, String str) {
        this.a = clock;
        this.b = j3cVar;
        this.c = s1eVar;
        this.d = str;
    }

    @Override // defpackage.idc
    public final void zza() {
        this.b.e(this.d, this.a.elapsedRealtime());
    }

    @Override // defpackage.r8c
    public final void zzr() {
        s1e s1eVar = this.c;
        this.b.d(s1eVar.f, this.d, this.a.elapsedRealtime());
    }
}
