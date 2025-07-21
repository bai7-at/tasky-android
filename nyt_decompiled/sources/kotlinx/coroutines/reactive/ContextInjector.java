package kotlinx.coroutines.reactive;

import defpackage.g86;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.InternalCoroutinesApi;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public interface ContextInjector {
    <T> g86 injectCoroutineContext(g86 g86Var, CoroutineContext coroutineContext);
}
