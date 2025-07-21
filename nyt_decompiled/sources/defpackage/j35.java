package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.nytimes.android.readerhybrid.a;

/* loaded from: classes4.dex */
public final class j35 implements h35 {
    private int b;
    private int c;
    private final i35 f;
    private boolean a = true;
    private final int[] d = new int[2];
    private final int[] e = new int[2];

    public j35(View view) {
        this.f = new i35(view);
        d(true);
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f.c(i, i2, iArr, iArr2);
    }

    public boolean b(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f.f(i, i2, i3, i4, iArr);
    }

    public boolean c(MotionEvent motionEvent, a aVar) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int a = bw4.a(obtain);
        if (a == 0) {
            this.c = 0;
        }
        int y = (int) obtain.getY();
        obtain.offsetLocation(0.0f, this.c);
        if (a == 0) {
            boolean c = aVar.c(obtain);
            if (this.a) {
                this.b = y - 5;
                this.a = false;
            } else {
                this.b = y;
            }
            e(2);
            return c;
        }
        if (a != 2) {
            boolean c2 = aVar.c(obtain);
            f();
            return c2;
        }
        int i = this.b - y;
        if (a(0, i, this.e, this.d)) {
            i -= this.e[1];
            this.b = y - this.d[1];
            obtain.offsetLocation(0.0f, -r1);
            this.c += this.d[1];
        }
        boolean c3 = aVar.c(obtain);
        int[] iArr = this.d;
        if (b(0, iArr[1], 0, i, iArr)) {
            obtain.offsetLocation(0.0f, this.d[1]);
            int i2 = this.c;
            int i3 = this.d[1];
            this.c = i2 + i3;
            this.b -= i3;
        }
        return c3;
    }

    public void d(boolean z) {
        this.f.n(z);
    }

    public boolean e(int i) {
        return this.f.p(i);
    }

    public void f() {
        this.f.r();
    }
}
