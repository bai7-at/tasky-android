package defpackage;

import androidx.compose.ui.layout.ContentScale;

/* loaded from: classes.dex */
public final class uj2 implements ContentScale {
    private final float b;

    public uj2(float f) {
        this.b = f;
    }

    @Override // androidx.compose.ui.layout.ContentScale
    public long a(long j, long j2) {
        float f = this.b;
        return na7.a(f, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uj2) && Float.compare(this.b, ((uj2) obj).b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.b);
    }

    public String toString() {
        return "FixedScale(value=" + this.b + ')';
    }
}
