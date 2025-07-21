package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f9 implements h01 {
    private final h01 a;
    private final float b;

    public f9(float f, h01 h01Var) {
        while (h01Var instanceof f9) {
            h01Var = ((f9) h01Var).a;
            f += ((f9) h01Var).b;
        }
        this.a = h01Var;
        this.b = f;
    }

    @Override // defpackage.h01
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9)) {
            return false;
        }
        f9 f9Var = (f9) obj;
        return this.a.equals(f9Var.a) && this.b == f9Var.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
