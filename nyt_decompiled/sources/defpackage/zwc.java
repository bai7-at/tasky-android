package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zwc extends tra {
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;

    public zwc(String str) {
        HashMap a = tra.a(str);
        if (a != null) {
            this.b = (Long) a.get(0);
            this.c = (Long) a.get(1);
            this.d = (Long) a.get(2);
            this.e = (Long) a.get(3);
            this.f = (Long) a.get(4);
        }
    }

    @Override // defpackage.tra
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.b);
        hashMap.put(1, this.c);
        hashMap.put(2, this.d);
        hashMap.put(3, this.e);
        hashMap.put(4, this.f);
        return hashMap;
    }
}
