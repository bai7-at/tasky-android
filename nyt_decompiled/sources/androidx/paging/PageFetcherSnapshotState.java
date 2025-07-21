package androidx.paging;

import androidx.paging.PageEvent;
import androidx.paging.PagingSource;
import androidx.paging.d;
import androidx.paging.s;
import defpackage.uo6;
import defpackage.xn5;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
public final class PageFetcherSnapshotState {
    private final xn5 a;
    private final List b;
    private final List c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final Channel i;
    private final Channel j;
    private final Map k;
    private f l;

    public static final class a {
        private final xn5 a;
        private final Mutex b;
        private final PageFetcherSnapshotState c;

        public a(xn5 xn5Var) {
            zq3.h(xn5Var, "config");
            this.a = xn5Var;
            this.b = MutexKt.Mutex$default(false, 1, null);
            this.c = new PageFetcherSnapshotState(xn5Var, null);
        }
    }

    public /* synthetic */ class b {
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

    public /* synthetic */ PageFetcherSnapshotState(xn5 xn5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(xn5Var);
    }

    public final Flow e() {
        return FlowKt.onStart(FlowKt.consumeAsFlow(this.j), new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(this, null));
    }

    public final Flow f() {
        return FlowKt.onStart(FlowKt.consumeAsFlow(this.i), new PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1(this, null));
    }

    public final m g(s.a aVar) {
        Integer num;
        List X0 = kotlin.collections.i.X0(this.c);
        if (aVar != null) {
            int o = o();
            int i = -this.d;
            int n = kotlin.collections.i.n(this.c) - this.d;
            int g = aVar.g();
            int i2 = i;
            while (i2 < g) {
                o += i2 > n ? this.a.a : ((PagingSource.b.C0106b) this.c.get(this.d + i2)).c().size();
                i2++;
            }
            int f = o + aVar.f();
            if (aVar.g() < i) {
                f -= this.a.a;
            }
            num = Integer.valueOf(f);
        } else {
            num = null;
        }
        return new m(X0, num, this.a, o());
    }

    public final void h(PageEvent.a aVar) {
        zq3.h(aVar, "event");
        if (aVar.f() > this.c.size()) {
            throw new IllegalStateException(("invalid drop count. have " + this.c.size() + " but wanted to drop " + aVar.f()).toString());
        }
        this.k.remove(aVar.c());
        this.l.c(aVar.c(), d.c.b.b());
        int i = b.a[aVar.c().ordinal()];
        if (i == 2) {
            int f = aVar.f();
            for (int i2 = 0; i2 < f; i2++) {
                this.b.remove(0);
            }
            this.d -= aVar.f();
            t(aVar.g());
            int i3 = this.g + 1;
            this.g = i3;
            this.i.mo129trySendJP2dKIU(Integer.valueOf(i3));
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException("cannot drop " + aVar.c());
        }
        int f2 = aVar.f();
        for (int i4 = 0; i4 < f2; i4++) {
            this.b.remove(this.c.size() - 1);
        }
        s(aVar.g());
        int i5 = this.h + 1;
        this.h = i5;
        this.j.mo129trySendJP2dKIU(Integer.valueOf(i5));
    }

    public final PageEvent.a i(LoadType loadType, s sVar) {
        int size;
        zq3.h(loadType, "loadType");
        zq3.h(sVar, "hint");
        PageEvent.a aVar = null;
        if (this.a.e == Integer.MAX_VALUE || this.c.size() <= 2 || q() <= this.a.e) {
            return null;
        }
        if (loadType == LoadType.REFRESH) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.c.size() && q() - i3 > this.a.e) {
            int[] iArr = b.a;
            if (iArr[loadType.ordinal()] == 2) {
                size = ((PagingSource.b.C0106b) this.c.get(i2)).c().size();
            } else {
                List list = this.c;
                size = ((PagingSource.b.C0106b) list.get(kotlin.collections.i.n(list) - i2)).c().size();
            }
            if (((iArr[loadType.ordinal()] == 2 ? sVar.d() : sVar.c()) - i3) - size < this.a.b) {
                break;
            }
            i3 += size;
            i2++;
        }
        if (i2 != 0) {
            int[] iArr2 = b.a;
            int n = iArr2[loadType.ordinal()] == 2 ? -this.d : (kotlin.collections.i.n(this.c) - this.d) - (i2 - 1);
            int n2 = iArr2[loadType.ordinal()] == 2 ? (i2 - 1) - this.d : kotlin.collections.i.n(this.c) - this.d;
            if (this.a.c) {
                i = (loadType == LoadType.PREPEND ? o() : n()) + i3;
            }
            aVar = new PageEvent.a(loadType, n, n2, i);
        }
        return aVar;
    }

    public final int j(LoadType loadType) {
        zq3.h(loadType, "loadType");
        int i = b.a[loadType.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i == 2) {
            return this.g;
        }
        if (i == 3) {
            return this.h;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Map k() {
        return this.k;
    }

    public final int l() {
        return this.d;
    }

    public final List m() {
        return this.c;
    }

    public final int n() {
        if (this.a.c) {
            return this.f;
        }
        return 0;
    }

    public final int o() {
        if (this.a.c) {
            return this.e;
        }
        return 0;
    }

    public final f p() {
        return this.l;
    }

    public final int q() {
        Iterator it2 = this.c.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((PagingSource.b.C0106b) it2.next()).c().size();
        }
        return i;
    }

    public final boolean r(int i, LoadType loadType, PagingSource.b.C0106b c0106b) {
        zq3.h(loadType, "loadType");
        zq3.h(c0106b, "page");
        int i2 = b.a[loadType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (this.c.isEmpty()) {
                        throw new IllegalStateException("should've received an init before append");
                    }
                    if (i != this.h) {
                        return false;
                    }
                    this.b.add(c0106b);
                    s(c0106b.f() == Integer.MIN_VALUE ? uo6.d(n() - c0106b.c().size(), 0) : c0106b.f());
                    this.k.remove(LoadType.APPEND);
                }
            } else {
                if (this.c.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend");
                }
                if (i != this.g) {
                    return false;
                }
                this.b.add(0, c0106b);
                this.d++;
                t(c0106b.g() == Integer.MIN_VALUE ? uo6.d(o() - c0106b.c().size(), 0) : c0106b.g());
                this.k.remove(LoadType.PREPEND);
            }
        } else {
            if (!this.c.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            this.b.add(c0106b);
            this.d = 0;
            s(c0106b.f());
            t(c0106b.g());
        }
        return true;
    }

    public final void s(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.f = i;
    }

    public final void t(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.e = i;
    }

    public final PageEvent u(PagingSource.b.C0106b c0106b, LoadType loadType) {
        zq3.h(c0106b, "<this>");
        zq3.h(loadType, "loadType");
        int[] iArr = b.a;
        int i = iArr[loadType.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                i2 = 0 - this.d;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = (this.c.size() - this.d) - 1;
            }
        }
        List e = kotlin.collections.i.e(new r(i2, c0106b.c()));
        int i3 = iArr[loadType.ordinal()];
        if (i3 == 1) {
            return PageEvent.Insert.g.c(e, o(), n(), this.l.d(), null);
        }
        if (i3 == 2) {
            return PageEvent.Insert.g.b(e, o(), this.l.d(), null);
        }
        if (i3 == 3) {
            return PageEvent.Insert.g.a(e, n(), this.l.d(), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private PageFetcherSnapshotState(xn5 xn5Var) {
        this.a = xn5Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.i = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.j = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.k = new LinkedHashMap();
        f fVar = new f();
        fVar.c(LoadType.REFRESH, d.b.b);
        this.l = fVar;
    }
}
