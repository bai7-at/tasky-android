package androidx.compose.ui.platform;

import defpackage.gt2;
import defpackage.t26;
import defpackage.yx4;
import defpackage.zv4;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
final class r implements zv4 {
    private final yx4 a = t26.a(1.0f);

    public void a(float f) {
        this.a.r(f);
    }

    @Override // defpackage.zv4
    public float d() {
        return this.a.a();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, gt2 gt2Var) {
        return zv4.a.a(this, obj, gt2Var);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext.a get(CoroutineContext.b bVar) {
        return zv4.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return zv4.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return zv4.a.d(this, coroutineContext);
    }
}
