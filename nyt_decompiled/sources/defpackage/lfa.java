package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class lfa extends hda {
    public long b;
    public long c;

    public lfa(String str) {
        this.b = -1L;
        this.c = -1L;
        HashMap a = hda.a(str);
        if (a != null) {
            this.b = ((Long) a.get(0)).longValue();
            this.c = ((Long) a.get(1)).longValue();
        }
    }

    @Override // defpackage.hda
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.b));
        hashMap.put(1, Long.valueOf(this.c));
        return hashMap;
    }
}
