package kotlin.coroutines;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.gt2;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class a implements CoroutineContext.a {
    private final CoroutineContext.b key;

    public a(CoroutineContext.b bVar) {
        zq3.h(bVar, TransferTable.COLUMN_KEY);
        this.key = bVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, gt2 gt2Var) {
        return (R) CoroutineContext.a.C0497a.a(this, r, gt2Var);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b bVar) {
        return (E) CoroutineContext.a.C0497a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public CoroutineContext.b getKey() {
        return this.key;
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
