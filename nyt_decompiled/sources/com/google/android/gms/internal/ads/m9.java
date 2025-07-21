package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class m9 extends f9 {
    Object[] d;
    private int e;

    m9(int i) {
        super(i);
        this.d = new Object[zzgaf.n(i)];
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final /* bridge */ /* synthetic */ g9 a(Object obj) {
        g(obj);
        return this;
    }

    public final m9 g(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int n = zzgaf.n(this.b);
            Object[] objArr = this.d;
            if (n <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int a = e9.a(hashCode);
                while (true) {
                    int i = a & length;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.e += hashCode;
                        super.c(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.d = null;
        super.c(obj);
        return this;
    }

    public final m9 h(Iterable iterable) {
        iterable.getClass();
        if (this.d != null) {
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                g(it2.next());
            }
        } else {
            super.d(iterable);
        }
        return this;
    }

    public final zzgaf i() {
        zzgaf D;
        boolean E;
        int i = this.b;
        if (i == 0) {
            return zzgbq.i;
        }
        if (i == 1) {
            Object obj = this.a[0];
            Objects.requireNonNull(obj);
            return new zzgcb(obj);
        }
        if (this.d == null || zzgaf.n(i) != this.d.length) {
            D = zzgaf.D(this.b, this.a);
            this.b = D.size();
        } else {
            int i2 = this.b;
            Object[] objArr = this.a;
            E = zzgaf.E(i2, objArr.length);
            if (E) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            D = new zzgbq(objArr, this.e, this.d, r6.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return D;
    }
}
