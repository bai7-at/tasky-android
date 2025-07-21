package androidx.paging;

import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import androidx.paging.d;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.zq3;
import defpackage.zt5;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public abstract class PagedList extends AbstractList {
    public static final Companion j = new Companion(null);
    private final PagingSource a;
    private final CoroutineScope b;
    private final CoroutineDispatcher c;
    private final j d;
    private final c e;
    private Runnable f;
    private final int g;
    private final List h;
    private final List i;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PagedList a(PagingSource pagingSource, PagingSource.b.C0106b c0106b, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, a aVar, c cVar, Object obj) {
            PagingSource.b.C0106b c0106b2;
            Object runBlocking$default;
            zq3.h(pagingSource, "pagingSource");
            zq3.h(coroutineScope, "coroutineScope");
            zq3.h(coroutineDispatcher, "notifyDispatcher");
            zq3.h(coroutineDispatcher2, "fetchDispatcher");
            zq3.h(cVar, "config");
            if (c0106b == null) {
                runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new PagedList$Companion$create$resolvedInitialPage$1(pagingSource, new PagingSource.a.d(obj, cVar.d, cVar.c), null), 1, null);
                c0106b2 = (PagingSource.b.C0106b) runBlocking$default;
            } else {
                c0106b2 = c0106b;
            }
            return new ContiguousPagedList(pagingSource, coroutineScope, coroutineDispatcher, coroutineDispatcher2, aVar, cVar, c0106b2, obj);
        }

        private Companion() {
        }
    }

    public static abstract class a {
    }

    public static abstract class b {
        public abstract void a(int i, int i2);

        public abstract void b(int i, int i2);

        public abstract void c(int i, int i2);
    }

    public static final class c {
        public static final b f = new b(null);
        public final int a;
        public final int b;
        public final boolean c;
        public final int d;
        public final int e;

        public static final class a {
            public static final C0103a f = new C0103a(null);
            private int a = -1;
            private int b = -1;
            private int c = -1;
            private boolean d = true;
            private int e = Integer.MAX_VALUE;

            /* renamed from: androidx.paging.PagedList$c$a$a, reason: collision with other inner class name */
            public static final class C0103a {
                public /* synthetic */ C0103a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C0103a() {
                }
            }

            public final c a() {
                if (this.b < 0) {
                    this.b = this.a;
                }
                if (this.c < 0) {
                    this.c = this.a * 3;
                }
                if (!this.d && this.b == 0) {
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                int i = this.e;
                if (i == Integer.MAX_VALUE || i >= this.a + (this.b * 2)) {
                    return new c(this.a, this.b, this.d, this.c, this.e);
                }
                throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.a + ", prefetchDist=" + this.b + ", maxSize=" + this.e);
            }

            public final a b(int i) {
                if (i < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                this.a = i;
                return this;
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public c(int i, int i2, boolean z, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
            this.e = i4;
        }
    }

    public static abstract class d {
        private androidx.paging.d a;
        private androidx.paging.d b;
        private androidx.paging.d c;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[LoadType.values().length];
                try {
                    iArr[LoadType.REFRESH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoadType.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LoadType.APPEND.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public d() {
            d.c.a aVar = d.c.b;
            this.a = aVar.b();
            this.b = aVar.b();
            this.c = aVar.b();
        }

        public final void a(gt2 gt2Var) {
            zq3.h(gt2Var, "callback");
            gt2Var.invoke(LoadType.REFRESH, this.a);
            gt2Var.invoke(LoadType.PREPEND, this.b);
            gt2Var.invoke(LoadType.APPEND, this.c);
        }

        public final androidx.paging.d b() {
            return this.c;
        }

        public final androidx.paging.d c() {
            return this.b;
        }

        public abstract void d(LoadType loadType, androidx.paging.d dVar);

        public final void e(LoadType loadType, androidx.paging.d dVar) {
            zq3.h(loadType, TransferTable.COLUMN_TYPE);
            zq3.h(dVar, TransferTable.COLUMN_STATE);
            int i = a.a[loadType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (zq3.c(this.c, dVar)) {
                            return;
                        } else {
                            this.c = dVar;
                        }
                    }
                } else if (zq3.c(this.b, dVar)) {
                    return;
                } else {
                    this.b = dVar;
                }
            } else if (zq3.c(this.a, dVar)) {
                return;
            } else {
                this.a = dVar;
            }
            d(loadType, dVar);
        }
    }

    public PagedList(PagingSource pagingSource, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, j jVar, c cVar) {
        zq3.h(pagingSource, "pagingSource");
        zq3.h(coroutineScope, "coroutineScope");
        zq3.h(coroutineDispatcher, "notifyDispatcher");
        zq3.h(jVar, "storage");
        zq3.h(cVar, "config");
        this.a = pagingSource;
        this.b = coroutineScope;
        this.c = coroutineDispatcher;
        this.d = jVar;
        this.e = cVar;
        this.g = (cVar.b * 2) + cVar.a;
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public final int A() {
        return this.g;
    }

    public int B() {
        return this.d.size();
    }

    public final j C() {
        return this.d;
    }

    public abstract boolean D();

    public boolean E() {
        return D();
    }

    public final int F() {
        return this.d.o();
    }

    public final void H(int i) {
        if (i >= 0 && i < size()) {
            this.d.B(i);
            I(i);
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
    }

    public abstract void I(int i);

    public final void J(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator it2 = kotlin.collections.i.H0(this.h).iterator();
        while (it2.hasNext()) {
            b bVar = (b) ((WeakReference) it2.next()).get();
            if (bVar != null) {
                bVar.a(i, i2);
            }
        }
    }

    public final void K(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator it2 = kotlin.collections.i.H0(this.h).iterator();
        while (it2.hasNext()) {
            b bVar = (b) ((WeakReference) it2.next()).get();
            if (bVar != null) {
                bVar.b(i, i2);
            }
        }
    }

    public final void L(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator it2 = kotlin.collections.i.H0(this.h).iterator();
        while (it2.hasNext()) {
            b bVar = (b) ((WeakReference) it2.next()).get();
            if (bVar != null) {
                bVar.c(i, i2);
            }
        }
    }

    public /* bridge */ Object M(int i) {
        return super.remove(i);
    }

    public final void N(final b bVar) {
        zq3.h(bVar, "callback");
        kotlin.collections.i.I(this.h, new ss2() { // from class: androidx.paging.PagedList$removeWeakCallback$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference weakReference) {
                zq3.h(weakReference, "it");
                return Boolean.valueOf(weakReference.get() == null || weakReference.get() == PagedList.b.this);
            }
        });
    }

    public final void O(final gt2 gt2Var) {
        zq3.h(gt2Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        kotlin.collections.i.I(this.i, new ss2() { // from class: androidx.paging.PagedList$removeWeakLoadStateListener$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference weakReference) {
                zq3.h(weakReference, "it");
                return Boolean.valueOf(weakReference.get() == null || weakReference.get() == gt2.this);
            }
        });
    }

    public void Q(LoadType loadType, androidx.paging.d dVar) {
        zq3.h(loadType, "loadType");
        zq3.h(dVar, "loadState");
    }

    public final void R(Runnable runnable) {
        this.f = runnable;
    }

    public final List S() {
        return E() ? this : new q(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.d.get(i);
    }

    public final void o(b bVar) {
        zq3.h(bVar, "callback");
        kotlin.collections.i.I(this.h, new ss2() { // from class: androidx.paging.PagedList$addWeakCallback$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference weakReference) {
                zq3.h(weakReference, "it");
                return Boolean.valueOf(weakReference.get() == null);
            }
        });
        this.h.add(new WeakReference(bVar));
    }

    public final void p(gt2 gt2Var) {
        zq3.h(gt2Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        kotlin.collections.i.I(this.i, new ss2() { // from class: androidx.paging.PagedList$addWeakLoadStateListener$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference weakReference) {
                zq3.h(weakReference, "it");
                return Boolean.valueOf(weakReference.get() == null);
            }
        });
        this.i.add(new WeakReference(gt2Var));
        q(gt2Var);
    }

    public abstract void q(gt2 gt2Var);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return M(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return B();
    }

    public final void t(LoadType loadType, androidx.paging.d dVar) {
        zq3.h(loadType, TransferTable.COLUMN_TYPE);
        zq3.h(dVar, TransferTable.COLUMN_STATE);
        BuildersKt__Builders_commonKt.launch$default(this.b, this.c, null, new PagedList$dispatchStateChangeAsync$1(this, loadType, dVar, null), 2, null);
    }

    public final c u() {
        return this.e;
    }

    public final CoroutineScope v() {
        return this.b;
    }

    public abstract Object w();

    public final CoroutineDispatcher x() {
        return this.c;
    }

    public PagingSource y() {
        return this.a;
    }

    public final zt5 z() {
        return this.d;
    }
}
