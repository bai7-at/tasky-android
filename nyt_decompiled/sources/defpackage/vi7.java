package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class vi7 {
    private final Handle a;
    private final long b;
    private final SelectionHandleAnchor c;
    private final boolean d;

    public /* synthetic */ vi7(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(handle, j, selectionHandleAnchor, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi7)) {
            return false;
        }
        vi7 vi7Var = (vi7) obj;
        return this.a == vi7Var.a && fd5.l(this.b, vi7Var.b) && this.c == vi7Var.c && this.d == vi7Var.d;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + fd5.q(this.b)) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) fd5.v(this.b)) + ", anchor=" + this.c + ", visible=" + this.d + ')';
    }

    private vi7(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.a = handle;
        this.b = j;
        this.c = selectionHandleAnchor;
        this.d = z;
    }
}
