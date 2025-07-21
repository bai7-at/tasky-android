package defpackage;

import com.google.android.gms.internal.ads.zzgaa;
import java.util.List;

/* loaded from: classes3.dex */
public final class mhc {
    public static final mhc b = new mhc(zzgaa.t());
    private static final String c = Integer.toString(0, 36);
    public static final zhf d = new zhf() { // from class: cec
    };
    private final zzgaa a;

    public mhc(List list) {
        this.a = zzgaa.p(list);
    }

    public final zzgaa a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            hgc hgcVar = (hgc) this.a.get(i2);
            if (hgcVar.c() && hgcVar.a() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mhc.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((mhc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
