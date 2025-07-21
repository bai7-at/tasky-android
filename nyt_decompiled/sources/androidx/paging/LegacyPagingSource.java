package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.by0;
import defpackage.lt2;
import defpackage.qs2;
import defpackage.st2;
import defpackage.ww8;
import defpackage.yp0;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes.dex */
public final class LegacyPagingSource extends PagingSource implements yp0 {
    private static final b d = new b(null);
    private final CoroutineContext a;
    private final DataSource b;
    private int c;

    /* synthetic */ class a implements DataSource.c, st2 {
        a() {
        }

        @Override // androidx.paging.DataSource.c
        public final void a() {
            LegacyPagingSource.this.invalidate();
        }

        @Override // defpackage.st2
        public final lt2 b() {
            return new FunctionReferenceImpl(0, LegacyPagingSource.this, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof DataSource.c) && (obj instanceof st2)) {
                return zq3.c(b(), ((st2) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DataSource.KeyType.values().length];
            try {
                iArr[DataSource.KeyType.POSITIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataSource.KeyType.PAGE_KEYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataSource.KeyType.ITEM_KEYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public LegacyPagingSource(CoroutineContext coroutineContext, DataSource dataSource) {
        zq3.h(coroutineContext, "fetchContext");
        zq3.h(dataSource, "dataSource");
        this.a = coroutineContext;
        this.b = dataSource;
        this.c = RecyclerView.UNDEFINED_DURATION;
        dataSource.a(new a());
        registerInvalidatedCallback(new qs2() { // from class: androidx.paging.LegacyPagingSource.2

            /* renamed from: androidx.paging.LegacyPagingSource$2$a */
            /* synthetic */ class a implements DataSource.c, st2 {
                final /* synthetic */ LegacyPagingSource a;

                a(LegacyPagingSource legacyPagingSource) {
                    this.a = legacyPagingSource;
                }

                @Override // androidx.paging.DataSource.c
                public final void a() {
                    this.a.invalidate();
                }

                @Override // defpackage.st2
                public final lt2 b() {
                    return new FunctionReferenceImpl(0, this.a, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof DataSource.c) && (obj instanceof st2)) {
                        return zq3.c(b(), ((st2) obj).b());
                    }
                    return false;
                }

                public final int hashCode() {
                    return b().hashCode();
                }
            }

            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m122invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m122invoke() {
                LegacyPagingSource.this.b().g(new a(LegacyPagingSource.this));
                LegacyPagingSource.this.b().d();
            }
        });
    }

    private final int c(PagingSource.a aVar) {
        return ((aVar instanceof PagingSource.a.d) && aVar.b() % 3 == 0) ? aVar.b() / 3 : aVar.b();
    }

    @Override // defpackage.yp0
    public void a(int i) {
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE || i == i2) {
            this.c = i;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.c + '.').toString());
    }

    public final DataSource b() {
        return this.b;
    }

    @Override // androidx.paging.PagingSource
    public boolean getJumpingSupported() {
        return this.b.c() == DataSource.KeyType.POSITIONAL;
    }

    @Override // androidx.paging.PagingSource
    public Object getRefreshKey(m mVar) {
        Object obj;
        Object b2;
        zq3.h(mVar, TransferTable.COLUMN_STATE);
        int i = c.a[this.b.c().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Integer d2 = mVar.d();
            if (d2 == null || (b2 = mVar.b(d2.intValue())) == null) {
                return null;
            }
            return this.b.b(b2);
        }
        Integer d3 = mVar.d();
        if (d3 == null) {
            return null;
        }
        int intValue = d3.intValue();
        int i2 = intValue - mVar.d;
        for (int i3 = 0; i3 < kotlin.collections.i.n(mVar.e()) && i2 > kotlin.collections.i.n(((PagingSource.b.C0106b) mVar.e().get(i3)).c()); i3++) {
            i2 -= ((PagingSource.b.C0106b) mVar.e().get(i3)).c().size();
        }
        PagingSource.b.C0106b c2 = mVar.c(intValue);
        if (c2 == null || (obj = c2.n()) == null) {
            obj = 0;
        }
        zq3.f(obj, "null cannot be cast to non-null type kotlin.Int");
        return Integer.valueOf(((Integer) obj).intValue() + i2);
    }

    @Override // androidx.paging.PagingSource
    public Object load(PagingSource.a aVar, by0 by0Var) {
        LoadType loadType;
        if (aVar instanceof PagingSource.a.d) {
            loadType = LoadType.REFRESH;
        } else if (aVar instanceof PagingSource.a.C0104a) {
            loadType = LoadType.APPEND;
        } else {
            if (!(aVar instanceof PagingSource.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            loadType = LoadType.PREPEND;
        }
        LoadType loadType2 = loadType;
        if (this.c == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.c = c(aVar);
        }
        return BuildersKt.withContext(this.a, new LegacyPagingSource$load$2(this, new DataSource.d(loadType2, aVar.a(), aVar.b(), aVar.c(), this.c), aVar, null), by0Var);
    }
}
