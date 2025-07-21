package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class x0 implements h01 {
    private final float a;

    public x0(float f) {
        this.a = f;
    }

    @Override // defpackage.h01
    public float a(RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && this.a == ((x0) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
