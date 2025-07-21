package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import defpackage.du8;
import defpackage.jv4;
import defpackage.kv4;
import defpackage.lv4;

/* loaded from: classes.dex */
final class b extends Modifier.c implements kv4 {
    private boolean n;
    private final jv4 r = lv4.b(du8.a(ScrollableKt.h(), Boolean.TRUE));

    public b(boolean z) {
        this.n = z;
    }

    @Override // defpackage.kv4
    public jv4 V() {
        return this.n ? this.r : lv4.a();
    }

    public final void e2(boolean z) {
        this.n = z;
    }
}
