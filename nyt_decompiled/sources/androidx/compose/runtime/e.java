package androidx.compose.runtime;

import defpackage.ov6;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public final class e implements ov6 {
    private final CoroutineScope a;

    public e(CoroutineScope coroutineScope) {
        this.a = coroutineScope;
    }

    public final CoroutineScope a() {
        return this.a;
    }

    @Override // defpackage.ov6
    public void c() {
    }

    @Override // defpackage.ov6
    public void d() {
        CoroutineScopeKt.cancel(this.a, new LeftCompositionCancellationException());
    }

    @Override // defpackage.ov6
    public void e() {
        CoroutineScopeKt.cancel(this.a, new LeftCompositionCancellationException());
    }
}
