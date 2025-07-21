package androidx.room;

import defpackage.gt2;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class i implements CoroutineContext.a {
    public static final a c = new a(null);
    private final kotlin.coroutines.c a;
    private final AtomicInteger b = new AtomicInteger(0);

    public static final class a implements CoroutineContext.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(kotlin.coroutines.c cVar) {
        this.a = cVar;
    }

    public final void a() {
        this.b.incrementAndGet();
    }

    public final kotlin.coroutines.c c() {
        return this.a;
    }

    public final void e() {
        if (this.b.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, gt2 gt2Var) {
        return CoroutineContext.a.C0497a.a(this, obj, gt2Var);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext.a get(CoroutineContext.b bVar) {
        return CoroutineContext.a.C0497a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public CoroutineContext.b getKey() {
        return c;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return CoroutineContext.a.C0497a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.C0497a.d(this, coroutineContext);
    }
}
