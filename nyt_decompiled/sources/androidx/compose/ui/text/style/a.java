package androidx.compose.ui.text.style;

import defpackage.ho7;
import defpackage.nn0;
import defpackage.yc0;
import defpackage.zq3;

/* loaded from: classes.dex */
final class a implements TextForegroundStyle {
    private final ho7 b;
    private final float c;

    public a(ho7 ho7Var, float f) {
        this.b = ho7Var;
        this.c = f;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float a() {
        return this.c;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public long b() {
        return nn0.b.g();
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public yc0 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return zq3.c(this.b, aVar.b) && Float.compare(this.c, aVar.c) == 0;
    }

    public final ho7 f() {
        return this.b;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + Float.hashCode(this.c);
    }

    public String toString() {
        return "BrushStyle(value=" + this.b + ", alpha=" + this.c + ')';
    }
}
