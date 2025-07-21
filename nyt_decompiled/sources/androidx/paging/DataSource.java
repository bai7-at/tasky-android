package androidx.paging;

import androidx.paging.DataSource;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.br3;
import defpackage.by0;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public abstract class DataSource {
    public static final b Companion = new b(null);
    private final KeyType a;
    private final br3 b;
    private final boolean c;
    private final boolean d;

    public static abstract class Factory {
        public final qs2 a(final CoroutineDispatcher coroutineDispatcher) {
            zq3.h(coroutineDispatcher, "fetchDispatcher");
            return new SuspendingPagingSourceFactory(coroutineDispatcher, new qs2() { // from class: androidx.paging.DataSource$Factory$asPagingSourceFactory$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final PagingSource mo865invoke() {
                    return new LegacyPagingSource(CoroutineDispatcher.this, this.b());
                }
            });
        }

        public abstract DataSource b();
    }

    public enum KeyType {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        void a();
    }

    public static final class d {
        private final LoadType a;
        private final Object b;
        private final int c;
        private final boolean d;
        private final int e;

        public d(LoadType loadType, Object obj, int i, boolean z, int i2) {
            zq3.h(loadType, TransferTable.COLUMN_TYPE);
            this.a = loadType;
            this.b = obj;
            this.c = i;
            this.d = z;
            this.e = i2;
            if (loadType != LoadType.REFRESH && obj == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }

        public final int a() {
            return this.c;
        }

        public final Object b() {
            return this.b;
        }

        public final int c() {
            return this.e;
        }

        public final boolean d() {
            return this.d;
        }

        public final LoadType e() {
            return this.a;
        }
    }

    public DataSource(KeyType keyType) {
        zq3.h(keyType, TransferTable.COLUMN_TYPE);
        this.a = keyType;
        this.b = new br3(new ss2() { // from class: androidx.paging.DataSource$invalidateCallbackTracker$1
            public final void b(DataSource.c cVar) {
                zq3.h(cVar, "it");
                cVar.a();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((DataSource.c) obj);
                return ww8.a;
            }
        }, new qs2() { // from class: androidx.paging.DataSource$invalidateCallbackTracker$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.valueOf(DataSource.this.e());
            }
        });
        this.c = true;
        this.d = true;
    }

    public void a(c cVar) {
        zq3.h(cVar, "onInvalidatedCallback");
        this.b.d(cVar);
    }

    public abstract Object b(Object obj);

    public final KeyType c() {
        return this.a;
    }

    public void d() {
        this.b.c();
    }

    public boolean e() {
        return this.b.b();
    }

    public abstract Object f(d dVar, by0 by0Var);

    public void g(c cVar) {
        zq3.h(cVar, "onInvalidatedCallback");
        this.b.e(cVar);
    }

    public static final class a {
        public static final C0100a f = new C0100a(null);
        public final List a;
        private final Object b;
        private final Object c;
        private final int d;
        private final int e;

        /* renamed from: androidx.paging.DataSource$a$a, reason: collision with other inner class name */
        public static final class C0100a {
            public /* synthetic */ C0100a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return new a(kotlin.collections.i.l(), null, null, 0, 0);
            }

            private C0100a() {
            }
        }

        public a(List list, Object obj, Object obj2, int i, int i2) {
            zq3.h(list, "data");
            this.a = list;
            this.b = obj;
            this.c = obj2;
            this.d = i;
            this.e = i2;
            if (i < 0 && i != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if (list.isEmpty() && (i > 0 || i2 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            if (i2 < 0 && i2 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        public final int a() {
            return this.e;
        }

        public final int b() {
            return this.d;
        }

        public final Object c() {
            return this.c;
        }

        public final Object d() {
            return this.b;
        }

        public final void e(int i) {
            int i2;
            if (this.d == Integer.MIN_VALUE || (i2 = this.e) == Integer.MIN_VALUE) {
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            }
            if (i2 <= 0 || this.a.size() % i == 0) {
                if (this.d % i == 0) {
                    return;
                }
                throw new IllegalArgumentException("Initial load must be pageSize aligned.Position = " + this.d + ", pageSize = " + i);
            }
            throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + this.a.size() + ", position " + this.d + ", totalCount " + (this.d + this.a.size() + this.e) + ", pageSize " + i);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public /* synthetic */ a(List list, Object obj, Object obj2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, obj, obj2, (i3 & 8) != 0 ? Integer.MIN_VALUE : i, (i3 & 16) != 0 ? Integer.MIN_VALUE : i2);
        }
    }
}
