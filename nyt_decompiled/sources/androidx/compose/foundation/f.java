package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.bl3;
import defpackage.cl3;
import defpackage.ct0;
import defpackage.dt0;
import defpackage.wl2;

/* loaded from: classes.dex */
final class f extends Modifier.c implements ct0, wl2 {
    private final cl3 e2() {
        return (cl3) dt0.a(this, CompositionLocalsKt.i());
    }

    @Override // defpackage.wl2
    public void P0(FocusProperties focusProperties) {
        focusProperties.g(!bl3.f(e2().a(), bl3.b.b()));
    }
}
