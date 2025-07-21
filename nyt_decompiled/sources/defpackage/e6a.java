package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class e6a implements p4a {
    private final x5a a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    public e6a(x5a x5aVar, Map map, Map map2, Map map3) {
        this.a = x5aVar;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        this.b = x5aVar.h();
    }

    @Override // defpackage.p4a
    public final List a(long j) {
        return this.a.e(j, this.c, this.d, this.e);
    }

    @Override // defpackage.p4a
    public final int zza() {
        return this.b.length;
    }

    @Override // defpackage.p4a
    public final long zzb(int i) {
        return this.b[i];
    }
}
