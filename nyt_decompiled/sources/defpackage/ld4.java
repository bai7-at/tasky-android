package defpackage;

import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ld4 {
    public static final a d = new a(null);
    private int[] a;
    private int b;
    private float[] c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int[] iArr) {
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i = iArr[0];
            int c0 = d.c0(iArr);
            int i2 = 1;
            if (1 <= c0) {
                while (true) {
                    i *= iArr[i2];
                    if (i2 == c0) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }

        private a() {
        }
    }

    public ld4(int[] iArr) {
        zq3.h(iArr, "shape");
        this.a = iArr;
        int b = d.b(iArr);
        this.b = b;
        this.c = new float[b];
    }

    public final float[] a() {
        return this.c;
    }

    public final int b(int i) {
        return this.a[i];
    }

    public final int c() {
        return this.a.length;
    }

    public final void d(int[] iArr) {
        zq3.h(iArr, "shape");
        this.a = iArr;
        int b = d.b(iArr);
        float[] fArr = new float[b];
        System.arraycopy(this.c, 0, fArr, 0, Math.min(this.b, b));
        this.c = fArr;
        this.b = b;
    }
}
