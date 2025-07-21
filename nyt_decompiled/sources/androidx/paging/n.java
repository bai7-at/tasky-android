package androidx.paging;

import androidx.paging.DataSource;
import defpackage.by0;
import defpackage.hc1;
import defpackage.zq3;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public abstract class n extends DataSource {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(c cVar, int i) {
            zq3.h(cVar, "params");
            int i2 = cVar.a;
            int i3 = cVar.b;
            int i4 = cVar.c;
            return Math.max(0, Math.min(((((i - i3) + i4) - 1) / i4) * i4, (i2 / i4) * i4));
        }

        public final int b(c cVar, int i, int i2) {
            zq3.h(cVar, "params");
            return Math.min(i2 - i, cVar.b);
        }

        private a() {
        }
    }

    public static abstract class b {
        public abstract void a(List list, int i, int i2);
    }

    public static class c {
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;

        public c(int i, int i2, int i3, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
            if (i < 0) {
                throw new IllegalStateException(("invalid start position: " + i).toString());
            }
            if (i2 < 0) {
                throw new IllegalStateException(("invalid load size: " + i2).toString());
            }
            if (i3 >= 0) {
                return;
            }
            throw new IllegalStateException(("invalid page size: " + i3).toString());
        }
    }

    public static abstract class d {
        public abstract void a(List list);
    }

    public static class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static final class f extends b {
        final /* synthetic */ CancellableContinuation b;
        final /* synthetic */ c c;

        f(CancellableContinuation cancellableContinuation, c cVar) {
            this.b = cancellableContinuation;
            this.c = cVar;
        }

        private final void b(c cVar, DataSource.a aVar) {
            if (cVar.d) {
                aVar.e(cVar.c);
            }
            this.b.resumeWith(Result.b(aVar));
        }

        @Override // androidx.paging.n.b
        public void a(List list, int i, int i2) {
            zq3.h(list, "data");
            if (!n.this.e()) {
                int size = list.size() + i;
                b(this.c, new DataSource.a(list, i == 0 ? null : Integer.valueOf(i), size == i2 ? null : Integer.valueOf(size), i, (i2 - list.size()) - i));
            } else {
                CancellableContinuation cancellableContinuation = this.b;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(DataSource.a.f.a()));
            }
        }
    }

    public static final class g extends d {
        final /* synthetic */ e a;
        final /* synthetic */ n b;
        final /* synthetic */ CancellableContinuation c;

        g(e eVar, n nVar, CancellableContinuation cancellableContinuation) {
            this.a = eVar;
            this.b = nVar;
            this.c = cancellableContinuation;
        }

        @Override // androidx.paging.n.d
        public void a(List list) {
            zq3.h(list, "data");
            int i = this.a.a;
            Integer valueOf = i == 0 ? null : Integer.valueOf(i);
            if (this.b.e()) {
                CancellableContinuation cancellableContinuation = this.c;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(DataSource.a.f.a()));
            } else {
                CancellableContinuation cancellableContinuation2 = this.c;
                Result.a aVar2 = Result.a;
                cancellableContinuation2.resumeWith(Result.b(new DataSource.a(list, valueOf, Integer.valueOf(this.a.a + list.size()), 0, 0, 24, null)));
            }
        }
    }

    public n() {
        super(DataSource.KeyType.POSITIONAL);
    }

    public static final int h(c cVar, int i) {
        return Companion.a(cVar, i);
    }

    public static final int i(c cVar, int i, int i2) {
        return Companion.b(cVar, i, i2);
    }

    private final Object m(e eVar, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        n(eVar, new g(eVar, this, cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    @Override // androidx.paging.DataSource
    public final Object f(DataSource.d dVar, by0 by0Var) {
        if (dVar.e() != LoadType.REFRESH) {
            Object b2 = dVar.b();
            zq3.e(b2);
            int intValue = ((Number) b2).intValue();
            int c2 = dVar.c();
            if (dVar.e() == LoadType.PREPEND) {
                c2 = Math.min(c2, intValue);
                intValue -= c2;
            }
            return m(new e(intValue, c2), by0Var);
        }
        int a2 = dVar.a();
        int i = 0;
        if (dVar.b() != null) {
            int intValue2 = ((Number) dVar.b()).intValue();
            if (dVar.d()) {
                a2 = Math.max(a2 / dVar.c(), 2) * dVar.c();
                i = Math.max(0, ((intValue2 - (a2 / 2)) / dVar.c()) * dVar.c());
            } else {
                i = Math.max(0, intValue2 - (a2 / 2));
            }
        }
        return l(new c(i, a2, dVar.c(), dVar.d()), by0Var);
    }

    @Override // androidx.paging.DataSource
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Integer b(Object obj) {
        zq3.h(obj, "item");
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    public abstract void k(c cVar, b bVar);

    public final Object l(c cVar, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        k(cVar, new f(cancellableContinuationImpl, cVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    public abstract void n(e eVar, d dVar);
}
