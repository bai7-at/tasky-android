package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import defpackage.kv0;
import defpackage.ur;

/* loaded from: classes2.dex */
final class f0 {
    private final kv0 c;
    private final SparseArray b = new SparseArray();
    private int a = -1;

    public f0(kv0 kv0Var) {
        this.c = kv0Var;
    }

    public void a(int i, Object obj) {
        if (this.a == -1) {
            ur.g(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray sparseArray = this.b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            ur.a(i >= keyAt);
            if (keyAt == i) {
                kv0 kv0Var = this.c;
                SparseArray sparseArray2 = this.b;
                kv0Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.b.append(i, obj);
    }

    public void b() {
        for (int i = 0; i < this.b.size(); i++) {
            this.c.accept(this.b.valueAt(i));
        }
        this.a = -1;
        this.b.clear();
    }

    public void c(int i) {
        for (int size = this.b.size() - 1; size >= 0 && i < this.b.keyAt(size); size--) {
            this.c.accept(this.b.valueAt(size));
            this.b.removeAt(size);
        }
        this.a = this.b.size() > 0 ? Math.min(this.a, this.b.size() - 1) : -1;
    }

    public void d(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.b.keyAt(i3)) {
                return;
            }
            this.c.accept(this.b.valueAt(i2));
            this.b.removeAt(i2);
            int i4 = this.a;
            if (i4 > 0) {
                this.a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public Object e(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public Object f() {
        return this.b.valueAt(r1.size() - 1);
    }

    public boolean g() {
        return this.b.size() == 0;
    }
}
