package androidx.compose.ui.text.style;

import defpackage.nn0;
import defpackage.yc0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class b implements TextForegroundStyle {
    private final long b;

    public /* synthetic */ b(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float a() {
        return nn0.u(b());
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public long b() {
        return this.b;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public yc0 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && nn0.t(this.b, ((b) obj).b);
    }

    public int hashCode() {
        return nn0.z(this.b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) nn0.A(this.b)) + ')';
    }

    private b(long j) {
        this.b = j;
        if (j == nn0.b.g()) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
