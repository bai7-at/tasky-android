package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class e8c extends tra {
    public long b;
    public long c;

    public e8c(String str) {
        this.b = -1L;
        this.c = -1L;
        HashMap a = tra.a(str);
        if (a != null) {
            this.b = ((Long) a.get(0)).longValue();
            this.c = ((Long) a.get(1)).longValue();
        }
    }

    @Override // defpackage.tra
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.b));
        hashMap.put(1, Long.valueOf(this.c));
        return hashMap;
    }
}
