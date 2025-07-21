package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dg4;
import defpackage.hn3;
import defpackage.in3;
import defpackage.wm3;

/* loaded from: classes.dex */
public final class b implements Alignment {
    private final float b;
    private final float c;

    public static final class a implements Alignment.b {
        private final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // androidx.compose.ui.Alignment.b
        public int a(int i, int i2, LayoutDirection layoutDirection) {
            return dg4.d(((i2 - i) / 2.0f) * (1 + this.a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.a + ')';
        }
    }

    public b(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // androidx.compose.ui.Alignment
    public long a(long j, long j2, LayoutDirection layoutDirection) {
        long a2 = in3.a(hn3.g(j2) - hn3.g(j), hn3.f(j2) - hn3.f(j));
        float f = 1;
        return wm3.a(dg4.d((hn3.g(a2) / 2.0f) * (this.b + f)), dg4.d((hn3.f(a2) / 2.0f) * (f + this.c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.b) * 31) + Float.hashCode(this.c);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.b + ", verticalBias=" + this.c + ')';
    }
}
