package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class p1c extends tra {
    public Long b;
    public Long c;
    public Long d;

    public p1c(String str) {
        HashMap a = tra.a(str);
        if (a != null) {
            this.b = (Long) a.get(0);
            this.c = (Long) a.get(1);
            this.d = (Long) a.get(2);
        }
    }

    @Override // defpackage.tra
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.b);
        hashMap.put(1, this.c);
        hashMap.put(2, this.d);
        return hashMap;
    }
}
