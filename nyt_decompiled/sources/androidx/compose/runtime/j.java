package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;

/* loaded from: classes.dex */
final class j {
    private final RecomposeScopeImpl a;
    private final int b;
    private IdentityArraySet c;

    public j(RecomposeScopeImpl recomposeScopeImpl, int i, IdentityArraySet identityArraySet) {
        this.a = recomposeScopeImpl;
        this.b = i;
        this.c = identityArraySet;
    }

    public final IdentityArraySet a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final RecomposeScopeImpl c() {
        return this.a;
    }

    public final boolean d() {
        return this.a.v(this.c);
    }

    public final void e(IdentityArraySet identityArraySet) {
        this.c = identityArraySet;
    }
}
