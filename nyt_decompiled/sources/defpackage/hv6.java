package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class hv6 implements h01 {
    private final float a;

    public hv6(float f) {
        this.a = f;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // defpackage.h01
    public float a(RectF rectF) {
        return this.a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv6) && this.a == ((hv6) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
