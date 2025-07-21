package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class lga extends hda {
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public Long l;

    public lga(String str) {
        HashMap a = hda.a(str);
        if (a != null) {
            this.b = (Long) a.get(0);
            this.c = (Long) a.get(1);
            this.d = (Long) a.get(2);
            this.e = (Long) a.get(3);
            this.f = (Long) a.get(4);
            this.g = (Long) a.get(5);
            this.h = (Long) a.get(6);
            this.i = (Long) a.get(7);
            this.j = (Long) a.get(8);
            this.k = (Long) a.get(9);
            this.l = (Long) a.get(10);
        }
    }

    @Override // defpackage.hda
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.b);
        hashMap.put(1, this.c);
        hashMap.put(2, this.d);
        hashMap.put(3, this.e);
        hashMap.put(4, this.f);
        hashMap.put(5, this.g);
        hashMap.put(6, this.h);
        hashMap.put(7, this.i);
        hashMap.put(8, this.j);
        hashMap.put(9, this.k);
        hashMap.put(10, this.l);
        return hashMap;
    }
}
