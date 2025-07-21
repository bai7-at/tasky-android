package defpackage;

import com.google.android.gms.internal.ads.zzgaa;

/* loaded from: classes3.dex */
public final class z2g {
    public static final z2g d = new z2g(new v3c[0]);
    private static final String e = Integer.toString(0, 36);
    public static final zhf f = new zhf() { // from class: y2g
    };
    public final int a;
    private final zzgaa b;
    private int c;

    /* JADX WARN: Multi-variable type inference failed */
    public z2g(v3c... v3cVarArr) {
        this.b = zzgaa.q(v3cVarArr);
        this.a = v3cVarArr.length;
        int i = 0;
        while (i < this.b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.b.size(); i3++) {
                if (((v3c) this.b.get(i)).equals(this.b.get(i3))) {
                    ezd.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final int a(v3c v3cVar) {
        int indexOf = this.b.indexOf(v3cVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v3c b(int i) {
        return (v3c) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z2g.class == obj.getClass()) {
            z2g z2gVar = (z2g) obj;
            if (this.a == z2gVar.a && this.b.equals(z2gVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.b.hashCode();
        this.c = hashCode;
        return hashCode;
    }
}
