package androidx.paging;

import androidx.paging.DataSource;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.by0;
import defpackage.hc1;
import defpackage.zq3;
import java.util.List;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public abstract class g extends DataSource {

    public static abstract class a {
        public abstract void a(List list, Object obj);
    }

    public static abstract class b {
        public abstract void a(List list, int i, int i2, Object obj, Object obj2);
    }

    public static class c {
        public final int a;
        public final boolean b;

        public c(int i, boolean z) {
            this.a = i;
            this.b = z;
        }
    }

    public static class d {
        public final Object a;
        public final int b;

        public d(Object obj, int i) {
            zq3.h(obj, TransferTable.COLUMN_KEY);
            this.a = obj;
            this.b = i;
        }
    }

    public static final class e extends a {
        final /* synthetic */ CancellableContinuation a;
        final /* synthetic */ boolean b;

        e(CancellableContinuation cancellableContinuation, boolean z) {
            this.a = cancellableContinuation;
            this.b = z;
        }

        @Override // androidx.paging.g.a
        public void a(List list, Object obj) {
            zq3.h(list, "data");
            CancellableContinuation cancellableContinuation = this.a;
            Result.a aVar = Result.a;
            boolean z = this.b;
            cancellableContinuation.resumeWith(Result.b(new DataSource.a(list, z ? null : obj, z ? obj : null, 0, 0, 24, null)));
        }
    }

    public static final class f extends b {
        final /* synthetic */ CancellableContinuation a;

        f(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // androidx.paging.g.b
        public void a(List list, int i, int i2, Object obj, Object obj2) {
            zq3.h(list, "data");
            CancellableContinuation cancellableContinuation = this.a;
            Result.a aVar = Result.a;
            cancellableContinuation.resumeWith(Result.b(new DataSource.a(list, obj, obj2, i, (i2 - list.size()) - i)));
        }
    }

    public g() {
        super(DataSource.KeyType.PAGE_KEYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a i(CancellableContinuation cancellableContinuation, boolean z) {
        return new e(cancellableContinuation, z);
    }

    private final Object j(d dVar, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        k(dVar, i(cancellableContinuationImpl, true));
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    private final Object l(d dVar, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        m(dVar, i(cancellableContinuationImpl, false));
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    private final Object n(c cVar, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        o(cVar, new f(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    @Override // androidx.paging.DataSource
    public Object b(Object obj) {
        zq3.h(obj, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // androidx.paging.DataSource
    public final Object f(DataSource.d dVar, by0 by0Var) {
        if (dVar.e() == LoadType.REFRESH) {
            return n(new c(dVar.a(), dVar.d()), by0Var);
        }
        if (dVar.b() == null) {
            return DataSource.a.f.a();
        }
        if (dVar.e() == LoadType.PREPEND) {
            return l(new d(dVar.b(), dVar.c()), by0Var);
        }
        if (dVar.e() == LoadType.APPEND) {
            return j(new d(dVar.b(), dVar.c()), by0Var);
        }
        throw new IllegalArgumentException("Unsupported type " + dVar.e());
    }

    public abstract void k(d dVar, a aVar);

    public abstract void m(d dVar, a aVar);

    public abstract void o(c cVar, b bVar);
}
