package androidx.paging;

import androidx.paging.d;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class e {
    public static final a f = new a(null);
    private static final e g;
    private final d a;
    private final d b;
    private final d c;
    private final boolean d;
    private final boolean e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.g;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    static {
        d.c.a aVar = d.c.b;
        g = new e(aVar.b(), aVar.b(), aVar.b());
    }

    public e(d dVar, d dVar2, d dVar3) {
        zq3.h(dVar, "refresh");
        zq3.h(dVar2, "prepend");
        zq3.h(dVar3, "append");
        this.a = dVar;
        this.b = dVar2;
        this.c = dVar3;
        this.d = (dVar instanceof d.a) || (dVar3 instanceof d.a) || (dVar2 instanceof d.a);
        this.e = (dVar instanceof d.c) && (dVar3 instanceof d.c) && (dVar2 instanceof d.c);
    }

    public static /* synthetic */ e c(e eVar, d dVar, d dVar2, d dVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = eVar.a;
        }
        if ((i & 2) != 0) {
            dVar2 = eVar.b;
        }
        if ((i & 4) != 0) {
            dVar3 = eVar.c;
        }
        return eVar.b(dVar, dVar2, dVar3);
    }

    public final e b(d dVar, d dVar2, d dVar3) {
        zq3.h(dVar, "refresh");
        zq3.h(dVar2, "prepend");
        zq3.h(dVar3, "append");
        return new e(dVar, dVar2, dVar3);
    }

    public final d d() {
        return this.c;
    }

    public final d e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b) && zq3.c(this.c, eVar.c);
    }

    public final d f() {
        return this.a;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.e;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final e i(LoadType loadType, d dVar) {
        zq3.h(loadType, "loadType");
        zq3.h(dVar, "newState");
        int i = b.a[loadType.ordinal()];
        if (i == 1) {
            return c(this, null, null, dVar, 3, null);
        }
        if (i == 2) {
            return c(this, null, dVar, null, 5, null);
        }
        if (i == 3) {
            return c(this, dVar, null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return "LoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}
