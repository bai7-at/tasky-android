package defpackage;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class x49 {
    private final float[] a = new float[20];
    private final long[] b = new long[20];
    private float c = 0.0f;
    private int d = 0;
    private int e = 0;

    x49() {
    }

    private void b() {
        this.d = 0;
        this.c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j;
        int i = this.d;
        if (i < 2) {
            return 0.0f;
        }
        int i2 = this.e;
        int i3 = ((i2 + 20) - (i - 1)) % 20;
        long j2 = this.b[i2];
        while (true) {
            jArr = this.b;
            j = jArr[i3];
            if (j2 - j <= 100) {
                break;
            }
            this.d--;
            i3 = (i3 + 1) % 20;
        }
        int i4 = this.d;
        if (i4 < 2) {
            return 0.0f;
        }
        if (i4 == 2) {
            int i5 = (i3 + 1) % 20;
            if (j == jArr[i5]) {
                return 0.0f;
            }
            return this.a[i5] / (r2 - j);
        }
        float f = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.d - 1; i7++) {
            int i8 = i7 + i3;
            long[] jArr2 = this.b;
            long j3 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j3) {
                i6++;
                float f2 = f(f);
                float f3 = this.a[i9] / (this.b[i9] - j3);
                f += (f3 - f2) * Math.abs(f3);
                if (i6 == 1) {
                    f *= 0.5f;
                }
            }
        }
        return f(f);
    }

    private static float f(float f) {
        return (f < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.d != 0 && eventTime - this.b[this.e] > 40) {
            b();
        }
        int i = (this.e + 1) % 20;
        this.e = i;
        int i2 = this.d;
        if (i2 != 20) {
            this.d = i2 + 1;
        }
        this.a[i] = motionEvent.getAxisValue(26);
        this.b[this.e] = eventTime;
    }

    void c(int i, float f) {
        float e = e() * i;
        this.c = e;
        if (e < (-Math.abs(f))) {
            this.c = -Math.abs(f);
        } else if (this.c > Math.abs(f)) {
            this.c = Math.abs(f);
        }
    }

    float d(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.c;
    }
}
