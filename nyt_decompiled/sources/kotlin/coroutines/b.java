package kotlin.coroutines;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class b implements CoroutineContext.b {
    private final ss2 safeCast;
    private final CoroutineContext.b topmostKey;

    public b(CoroutineContext.b bVar, ss2 ss2Var) {
        zq3.h(bVar, "baseKey");
        zq3.h(ss2Var, "safeCast");
        this.safeCast = ss2Var;
        this.topmostKey = bVar instanceof b ? ((b) bVar).topmostKey : bVar;
    }

    public final boolean isSubKey$kotlin_stdlib(CoroutineContext.b bVar) {
        zq3.h(bVar, TransferTable.COLUMN_KEY);
        return bVar == this || this.topmostKey == bVar;
    }

    public final Object tryCast$kotlin_stdlib(CoroutineContext.a aVar) {
        zq3.h(aVar, "element");
        return (CoroutineContext.a) this.safeCast.invoke(aVar);
    }
}
