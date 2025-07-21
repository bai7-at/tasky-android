package androidx.compose.runtime;

import defpackage.a46;
import defpackage.sy4;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
final class o implements a46, sy4 {
    private final CoroutineContext a;
    private final /* synthetic */ sy4 b;

    public o(sy4 sy4Var, CoroutineContext coroutineContext) {
        this.a = coroutineContext;
        this.b = sy4Var;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.a;
    }

    @Override // defpackage.sy4, defpackage.x08
    public Object getValue() {
        return this.b.getValue();
    }

    @Override // defpackage.sy4
    public void setValue(Object obj) {
        this.b.setValue(obj);
    }

    @Override // defpackage.sy4
    public Object y() {
        return this.b.y();
    }
}
