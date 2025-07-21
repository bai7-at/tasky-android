package androidx.compose.runtime;

import androidx.compose.runtime.l;
import defpackage.by0;
import defpackage.gt2;
import defpackage.ss2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
final class SdkStubsFallbackFrameClock implements l {
    public static final SdkStubsFallbackFrameClock a = new SdkStubsFallbackFrameClock();

    private SdkStubsFallbackFrameClock() {
    }

    @Override // androidx.compose.runtime.l
    public Object b(ss2 ss2Var, by0 by0Var) {
        return BuildersKt.withContext(Dispatchers.getMain(), new SdkStubsFallbackFrameClock$withFrameNanos$2(ss2Var, null), by0Var);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, gt2 gt2Var) {
        return l.a.a(this, obj, gt2Var);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext.a get(CoroutineContext.b bVar) {
        return l.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return l.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return l.a.d(this, coroutineContext);
    }
}
