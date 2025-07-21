package defpackage;

import androidx.compose.ui.text.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes.dex */
public final class hp5 implements kc9 {
    private final char b;

    public hp5(char c) {
        this.b = c;
    }

    @Override // defpackage.kc9
    public ar8 a(a aVar) {
        return new ar8(new a(h.B(String.valueOf(this.b), aVar.j().length()), null, null, 6, null), id5.a.a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp5) && this.b == ((hp5) obj).b;
    }

    public int hashCode() {
        return Character.hashCode(this.b);
    }

    public /* synthetic */ hp5(char c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (char) 8226 : c);
    }
}
