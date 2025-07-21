package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class vk2 extends o26 {
    private float[] a;
    private int b;

    public vk2(float[] fArr) {
        zq3.h(fArr, "bufferWithData");
        this.a = fArr;
        this.b = fArr.length;
        b(10);
    }

    @Override // defpackage.o26
    public void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            float[] copyOf = Arrays.copyOf(fArr, uo6.d(i, fArr.length * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    @Override // defpackage.o26
    public int d() {
        return this.b;
    }

    public final void e(float f) {
        o26.c(this, 0, 1, null);
        float[] fArr = this.a;
        int d = d();
        this.b = d + 1;
        fArr[d] = f;
    }

    @Override // defpackage.o26
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
