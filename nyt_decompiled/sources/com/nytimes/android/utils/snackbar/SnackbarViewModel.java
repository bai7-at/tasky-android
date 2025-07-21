package com.nytimes.android.utils.snackbar;

import androidx.compose.runtime.b0;
import androidx.lifecycle.q;
import defpackage.sy4;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SnackbarViewModel extends q {
    private final sy4 a = b0.e(null, null, 2, null);

    private final void g(b bVar) {
        this.a.setValue(bVar);
    }

    public final void e() {
        g(null);
    }

    public final b f() {
        return (b) this.a.getValue();
    }

    public final void i(b bVar) {
        zq3.h(bVar, "content");
        g(bVar);
    }
}
