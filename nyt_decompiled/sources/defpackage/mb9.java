package defpackage;

import android.view.View;
import kotlinx.coroutines.Deferred;

/* loaded from: classes.dex */
public final class mb9 implements ks1 {
    private final View a;
    private volatile Deferred b;

    public mb9(View view, Deferred deferred) {
        this.a = view;
        this.b = deferred;
    }

    public void a(Deferred deferred) {
        this.b = deferred;
    }
}
