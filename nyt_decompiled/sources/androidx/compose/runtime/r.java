package androidx.compose.runtime;

import defpackage.hd;
import defpackage.ov7;
import defpackage.q33;
import defpackage.ww8;
import defpackage.ys0;
import defpackage.yu3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class r implements ys0, Iterable, yu3 {
    private int b;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private HashMap i;
    private int[] a = new int[0];
    private Object[] c = new Object[0];
    private ArrayList h = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = defpackage.ov7.U(r3.h, r4.a(), r3.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(defpackage.hd r4) {
        /*
            r3 = this;
            boolean r0 = r4.b()
            if (r0 == 0) goto L22
            java.util.ArrayList r0 = r3.h
            int r1 = r4.a()
            int r2 = r3.b
            int r0 = defpackage.ov7.t(r0, r1, r2)
            if (r0 < 0) goto L22
            java.util.ArrayList r3 = r3.h
            java.lang.Object r3 = r3.get(r0)
            boolean r3 = defpackage.zq3.c(r3, r4)
            if (r3 == 0) goto L22
            r3 = 1
            goto L23
        L22:
            r3 = 0
        L23:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.r.A(hd):boolean");
    }

    public final void B(int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList, HashMap hashMap) {
        this.a = iArr;
        this.b = i;
        this.c = objArr;
        this.d = i2;
        this.h = arrayList;
        this.i = hashMap;
    }

    public final q33 C(int i) {
        hd D;
        HashMap hashMap = this.i;
        if (hashMap == null || (D = D(i)) == null) {
            return null;
        }
        return (q33) hashMap.get(D);
    }

    public final hd D(int i) {
        int i2;
        hd G;
        if (this.f) {
            b.t("use active SlotWriter to crate an anchor for location instead");
            throw new KotlinNothingValueException();
        }
        if (i < 0 || i >= (i2 = this.b)) {
            return null;
        }
        G = ov7.G(this.h, i, i2);
        return G;
    }

    public final hd a(int i) {
        int i2;
        int U;
        if (this.f) {
            b.t("use active SlotWriter to create an anchor location instead");
            throw new KotlinNothingValueException();
        }
        if (i < 0 || i >= (i2 = this.b)) {
            throw new IllegalArgumentException("Parameter index is out of range");
        }
        ArrayList arrayList = this.h;
        U = ov7.U(arrayList, i, i2);
        if (U >= 0) {
            return (hd) arrayList.get(U);
        }
        hd hdVar = new hd(i);
        arrayList.add(-(U + 1), hdVar);
        return hdVar;
    }

    public final int c(hd hdVar) {
        if (this.f) {
            b.t("Use active SlotWriter to determine anchor location instead");
            throw new KotlinNothingValueException();
        }
        if (hdVar.b()) {
            return hdVar.a();
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed");
    }

    public final void f(q qVar, HashMap hashMap) {
        if (!(qVar.v() == this && this.e > 0)) {
            b.t("Unexpected reader close()");
            throw new KotlinNothingValueException();
        }
        this.e--;
        if (hashMap != null) {
            synchronized (this) {
                try {
                    HashMap hashMap2 = this.i;
                    if (hashMap2 != null) {
                        hashMap2.putAll(hashMap);
                    } else {
                        this.i = hashMap;
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(t tVar, int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList, HashMap hashMap) {
        if (tVar.e0() != this || !this.f) {
            throw new IllegalArgumentException("Unexpected writer close()");
        }
        this.f = false;
        B(iArr, i, objArr, i2, arrayList, hashMap);
    }

    public boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new h(this, 0, this.b);
    }

    public final boolean j() {
        boolean D;
        if (this.b <= 0) {
            return false;
        }
        D = ov7.D(this.a, 0);
        return D;
    }

    public final ArrayList n() {
        return this.h;
    }

    public final int[] o() {
        return this.a;
    }

    public final int p() {
        return this.b;
    }

    public final Object[] q() {
        return this.c;
    }

    public final int t() {
        return this.d;
    }

    public final HashMap u() {
        return this.i;
    }

    public final int v() {
        return this.g;
    }

    public final boolean w() {
        return this.f;
    }

    public final boolean x(int i, hd hdVar) {
        int I;
        if (this.f) {
            b.t("Writer is active");
            throw new KotlinNothingValueException();
        }
        if (!(i >= 0 && i < this.b)) {
            b.t("Invalid group index");
            throw new KotlinNothingValueException();
        }
        if (A(hdVar)) {
            I = ov7.I(this.a, i);
            int i2 = I + i;
            int a = hdVar.a();
            if (i <= a && a < i2) {
                return true;
            }
        }
        return false;
    }

    public final q y() {
        if (this.f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.e++;
        return new q(this);
    }

    public final t z() {
        if (this.f) {
            b.t("Cannot start a writer when another writer is pending");
            throw new KotlinNothingValueException();
        }
        if (!(this.e <= 0)) {
            b.t("Cannot start a writer when a reader is pending");
            throw new KotlinNothingValueException();
        }
        this.f = true;
        this.g++;
        return new t(this);
    }
}
