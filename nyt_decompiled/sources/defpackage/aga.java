package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class aga extends hda {
    public Long b;
    public Boolean c;
    public Boolean d;

    public aga(String str) {
        HashMap a = hda.a(str);
        if (a != null) {
            this.b = (Long) a.get(0);
            this.c = (Boolean) a.get(1);
            this.d = (Boolean) a.get(2);
        }
    }

    @Override // defpackage.hda
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.b);
        hashMap.put(1, this.c);
        hashMap.put(2, this.d);
        return hashMap;
    }
}
