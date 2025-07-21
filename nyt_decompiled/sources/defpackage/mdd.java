package defpackage;

import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
final class mdd implements gke {
    final /* synthetic */ long a;
    final /* synthetic */ y0e b;
    final /* synthetic */ v0e c;
    final /* synthetic */ String d;
    final /* synthetic */ z7e e;
    final /* synthetic */ g1e f;
    final /* synthetic */ odd g;

    mdd(odd oddVar, long j, y0e y0eVar, v0e v0eVar, String str, z7e z7eVar, g1e g1eVar) {
        this.a = j;
        this.b = y0eVar;
        this.c = v0eVar;
        this.d = str;
        this.e = z7eVar;
        this.f = g1eVar;
        this.g = oddVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.gke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdd.zza(java.lang.Throwable):void");
    }

    @Override // defpackage.gke
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        boolean z2;
        boolean q;
        LinkedHashMap linkedHashMap;
        k9d k9dVar;
        LinkedHashMap linkedHashMap2;
        qdd qddVar;
        clock = this.g.a;
        long elapsedRealtime = clock.elapsedRealtime() - this.a;
        synchronized (this.g) {
            try {
                odd oddVar = this.g;
                z = oddVar.e;
                if (z) {
                    qddVar = oddVar.b;
                    qddVar.a(this.b, this.c, 0, null, elapsedRealtime);
                }
                odd oddVar2 = this.g;
                z2 = oddVar2.g;
                if (z2) {
                    return;
                }
                q = oddVar2.q(this.c);
                if (q) {
                    linkedHashMap2 = this.g.d;
                    ((ndd) linkedHashMap2.get(this.c)).d = elapsedRealtime;
                } else {
                    linkedHashMap = this.g.d;
                    v0e v0eVar = this.c;
                    linkedHashMap.put(v0eVar, new ndd(this.d, v0eVar.g0, 0, elapsedRealtime, null));
                }
                k9dVar = this.g.f;
                k9dVar.g(this.c, elapsedRealtime, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
