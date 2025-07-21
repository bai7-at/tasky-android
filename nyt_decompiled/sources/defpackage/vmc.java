package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class vmc extends tra {
    public Long b;
    public Long c;

    public vmc(String str) {
        HashMap a = tra.a(str);
        if (a != null) {
            this.b = (Long) a.get(0);
            this.c = (Long) a.get(1);
        }
    }

    @Override // defpackage.tra
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.b);
        hashMap.put(1, this.c);
        return hashMap;
    }
}
