package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.br3;
import defpackage.by0;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yn5;
import defpackage.yu3;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class PagingSource {
    private final br3 invalidateCallbackTracker = new br3(new ss2() { // from class: androidx.paging.PagingSource$invalidateCallbackTracker$1
        public final void b(qs2 qs2Var) {
            zq3.h(qs2Var, "it");
            qs2Var.mo865invoke();
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((qs2) obj);
            return ww8.a;
        }
    }, null, 2, 0 == true ? 1 : 0);

    public static abstract class a {
        public static final b c = new b(null);
        private final int a;
        private final boolean b;

        /* renamed from: androidx.paging.PagingSource$a$a, reason: collision with other inner class name */
        public static final class C0104a extends a {
            private final Object d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0104a(Object obj, int i, boolean z) {
                super(i, z, null);
                zq3.h(obj, TransferTable.COLUMN_KEY);
                this.d = obj;
            }

            @Override // androidx.paging.PagingSource.a
            public Object a() {
                return this.d;
            }
        }

        public static final class b {

            /* renamed from: androidx.paging.PagingSource$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0105a {
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

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(LoadType loadType, Object obj, int i, boolean z) {
                zq3.h(loadType, "loadType");
                int i2 = C0105a.a[loadType.ordinal()];
                if (i2 == 1) {
                    return new d(obj, i, z);
                }
                if (i2 == 2) {
                    if (obj != null) {
                        return new c(obj, i, z);
                    }
                    throw new IllegalArgumentException("key cannot be null for prepend");
                }
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (obj != null) {
                    return new C0104a(obj, i, z);
                }
                throw new IllegalArgumentException("key cannot be null for append");
            }

            private b() {
            }
        }

        public static final class c extends a {
            private final Object d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Object obj, int i, boolean z) {
                super(i, z, null);
                zq3.h(obj, TransferTable.COLUMN_KEY);
                this.d = obj;
            }

            @Override // androidx.paging.PagingSource.a
            public Object a() {
                return this.d;
            }
        }

        public static final class d extends a {
            private final Object d;

            public d(Object obj, int i, boolean z) {
                super(i, z, null);
                this.d = obj;
            }

            @Override // androidx.paging.PagingSource.a
            public Object a() {
                return this.d;
            }
        }

        public /* synthetic */ a(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z);
        }

        public abstract Object a();

        public final int b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        private a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }
    }

    public static abstract class b {

        public static final class a extends b {
            private final Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(null);
                zq3.h(th, "throwable");
                this.a = th;
            }

            public final Throwable a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return kotlin.text.h.h("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) ", null, 1, null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }

        /* renamed from: androidx.paging.PagingSource$b$b, reason: collision with other inner class name */
        public static final class C0106b extends b implements Iterable, yu3 {
            public static final a f = new a(null);
            private static final C0106b g = new C0106b(kotlin.collections.i.l(), null, null, 0, 0);
            private final List a;
            private final Object b;
            private final Object c;
            private final int d;
            private final int e;

            /* renamed from: androidx.paging.PagingSource$b$b$a */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C0106b a() {
                    C0106b b = b();
                    zq3.f(b, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
                    return b;
                }

                public final C0106b b() {
                    return C0106b.g;
                }

                private a() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0106b(List list, Object obj, Object obj2, int i, int i2) {
                super(null);
                zq3.h(list, "data");
                this.a = list;
                this.b = obj;
                this.c = obj2;
                this.d = i;
                this.e = i2;
                if (i != Integer.MIN_VALUE && i < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                }
                if (i2 != Integer.MIN_VALUE && i2 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            public final List c() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0106b)) {
                    return false;
                }
                C0106b c0106b = (C0106b) obj;
                return zq3.c(this.a, c0106b.a) && zq3.c(this.b, c0106b.b) && zq3.c(this.c, c0106b.c) && this.d == c0106b.d && this.e == c0106b.e;
            }

            public final int f() {
                return this.e;
            }

            public final int g() {
                return this.d;
            }

            public int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Object obj = this.b;
                int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
                Object obj2 = this.c;
                return ((((hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e);
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return this.a.listIterator();
            }

            public final Object j() {
                return this.c;
            }

            public final Object n() {
                return this.b;
            }

            public String toString() {
                return kotlin.text.h.h("LoadResult.Page(\n                    |   data size: " + this.a.size() + "\n                    |   first Item: " + kotlin.collections.i.m0(this.a) + "\n                    |   last Item: " + kotlin.collections.i.y0(this.a) + "\n                    |   nextKey: " + this.c + "\n                    |   prevKey: " + this.b + "\n                    |   itemsBefore: " + this.d + "\n                    |   itemsAfter: " + this.e + "\n                    |) ", null, 1, null);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public C0106b(List list, Object obj, Object obj2) {
                this(list, obj, obj2, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
                zq3.h(list, "data");
            }
        }
    }

    public final boolean getInvalid() {
        return this.invalidateCallbackTracker.b();
    }

    public final int getInvalidateCallbackCount$paging_common_release() {
        return this.invalidateCallbackTracker.a();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Object getRefreshKey(m mVar);

    public final void invalidate() {
        if (this.invalidateCallbackTracker.c()) {
            yn5 yn5Var = yn5.a;
            if (yn5Var.a(3)) {
                yn5Var.b(3, "Invalidated PagingSource " + this, null);
            }
        }
    }

    public abstract Object load(a aVar, by0 by0Var);

    public final void registerInvalidatedCallback(qs2 qs2Var) {
        zq3.h(qs2Var, "onInvalidatedCallback");
        this.invalidateCallbackTracker.d(qs2Var);
    }

    public final void unregisterInvalidatedCallback(qs2 qs2Var) {
        zq3.h(qs2Var, "onInvalidatedCallback");
        this.invalidateCallbackTracker.e(qs2Var);
    }
}
