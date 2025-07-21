package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class t3g implements o6g {
    protected final v3c a;
    protected final int b;
    protected final int[] c;
    private final l6a[] d;
    private int e;

    public t3g(v3c v3cVar, int[] iArr, int i) {
        int length = iArr.length;
        wad.f(length > 0);
        v3cVar.getClass();
        this.a = v3cVar;
        this.b = length;
        this.d = new l6a[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = v3cVar.b(iArr[i2]);
        }
        Arrays.sort(this.d, new Comparator() { // from class: s3g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((l6a) obj2).h - ((l6a) obj).h;
            }
        });
        this.c = new int[this.b];
        for (int i3 = 0; i3 < this.b; i3++) {
            this.c[i3] = v3cVar.a(this.d[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            t3g t3gVar = (t3g) obj;
            if (this.a.equals(t3gVar.a) && Arrays.equals(this.c, t3gVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        this.e = identityHashCode;
        return identityHashCode;
    }

    @Override // defpackage.w6g
    public final int zza(int i) {
        return this.c[0];
    }

    @Override // defpackage.w6g
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.w6g
    public final int zzc() {
        return this.c.length;
    }

    @Override // defpackage.w6g
    public final l6a zzd(int i) {
        return this.d[i];
    }

    @Override // defpackage.w6g
    public final v3c zze() {
        return this.a;
    }
}
