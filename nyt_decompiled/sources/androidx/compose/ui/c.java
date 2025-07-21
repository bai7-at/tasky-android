package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dg4;
import defpackage.hn3;
import defpackage.wm3;

/* loaded from: classes.dex */
public final class c implements Alignment {
    private final float b;
    private final float c;

    public static final class a implements Alignment.b {
        private final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // androidx.compose.ui.Alignment.b
        public int a(int i, int i2, LayoutDirection layoutDirection) {
            float f;
            float f2 = (i2 - i) / 2.0f;
            if (layoutDirection == LayoutDirection.Ltr) {
                f = this.a;
            } else {
                f = this.a * (-1);
            }
            return dg4.d(f2 * (1 + f));
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

    public static final class b implements Alignment.c {
        private final float a;

        public b(float f) {
            this.a = f;
        }

        @Override // androidx.compose.ui.Alignment.c
        public int a(int i, int i2) {
            return dg4.d(((i2 - i) / 2.0f) * (1 + this.a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.a);
        }

        public String toString() {
            return "Vertical(bias=" + this.a + ')';
        }
    }

    public c(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // androidx.compose.ui.Alignment
    public long a(long j, long j2, LayoutDirection layoutDirection) {
        float g = (hn3.g(j2) - hn3.g(j)) / 2.0f;
        float f = (hn3.f(j2) - hn3.f(j)) / 2.0f;
        float f2 = 1;
        return wm3.a(dg4.d(g * ((layoutDirection == LayoutDirection.Ltr ? this.b : (-1) * this.b) + f2)), dg4.d(f * (f2 + this.c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.b, cVar.b) == 0 && Float.compare(this.c, cVar.c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.b) * 31) + Float.hashCode(this.c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.b + ", verticalBias=" + this.c + ')';
    }
}
