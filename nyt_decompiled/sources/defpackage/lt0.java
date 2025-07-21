package defpackage;

import defpackage.m62;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class lt0 implements m62.b {
    public static final a e = new a(null);
    private final CoroutineDispatcher c;
    private final CoroutineScope d;

    public static final class a implements m62.c {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public lt0(CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope) {
        zq3.h(coroutineDispatcher, "dispatcher");
        zq3.h(coroutineScope, "coroutineScope");
        this.c = coroutineDispatcher;
        this.d = coroutineScope;
    }

    public final CoroutineScope f() {
        return this.d;
    }

    public final CoroutineDispatcher g() {
        return this.c;
    }

    @Override // m62.b
    public m62.c getKey() {
        return e;
    }
}
