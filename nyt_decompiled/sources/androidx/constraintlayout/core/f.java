package androidx.constraintlayout.core;

/* loaded from: classes.dex */
class f implements e {
    private final Object[] a;
    private int b;

    f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    @Override // androidx.constraintlayout.core.e
    public boolean a(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.b = i + 1;
        return true;
    }

    @Override // androidx.constraintlayout.core.e
    public Object b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return obj;
    }

    @Override // androidx.constraintlayout.core.e
    public void c(Object[] objArr, int i) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.b;
            Object[] objArr2 = this.a;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.b = i3 + 1;
            }
        }
    }
}
