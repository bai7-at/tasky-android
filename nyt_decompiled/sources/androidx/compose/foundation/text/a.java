package androidx.compose.foundation.text;

import defpackage.gt2;
import defpackage.zv4;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
final class a implements zv4 {
    public static final a a = new a();

    private a() {
    }

    @Override // defpackage.zv4
    public float d() {
        return 1.0f;
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
