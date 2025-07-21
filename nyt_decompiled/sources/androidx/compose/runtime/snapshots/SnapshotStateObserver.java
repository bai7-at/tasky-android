package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.f;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.runtime.y;
import defpackage.bc7;
import defpackage.gt2;
import defpackage.jy4;
import defpackage.ku8;
import defpackage.kz4;
import defpackage.oy4;
import defpackage.pm1;
import defpackage.py4;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.u5;
import defpackage.vy4;
import defpackage.wc5;
import defpackage.ww8;
import defpackage.y08;
import defpackage.yb5;
import defpackage.z08;
import defpackage.zq3;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int k = 8;
    private final ss2 a;
    private boolean c;
    private wc5 g;
    private boolean h;
    private a i;
    private final AtomicReference b = new AtomicReference(null);
    private final gt2 d = new gt2() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        public final void b(Set set, e eVar) {
            boolean m;
            SnapshotStateObserver.this.i(set);
            m = SnapshotStateObserver.this.m();
            if (m) {
                SnapshotStateObserver.this.r();
            }
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((Set) obj, (e) obj2);
            return ww8.a;
        }
    };
    private final ss2 e = new ss2() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m64invoke(obj);
            return ww8.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m64invoke(Object obj) {
            boolean z;
            vy4 vy4Var;
            SnapshotStateObserver.a aVar;
            z = SnapshotStateObserver.this.h;
            if (z) {
                return;
            }
            vy4Var = SnapshotStateObserver.this.f;
            SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
            synchronized (vy4Var) {
                aVar = snapshotStateObserver.i;
                zq3.e(aVar);
                aVar.k(obj);
                ww8 ww8Var = ww8.a;
            }
        }
    };
    private final vy4 f = new vy4(new a[16], 0);
    private long j = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private final ss2 a;
        private Object b;
        private jy4 c;
        private int j;
        private int d = -1;
        private final bc7 e = new bc7();
        private final oy4 f = new oy4(0, 1, null);
        private final py4 g = new py4(0, 1, null);
        private final vy4 h = new vy4(new androidx.compose.runtime.f[16], 0);
        private final pm1 i = new C0053a();
        private final bc7 k = new bc7();
        private final HashMap l = new HashMap();

        /* renamed from: androidx.compose.runtime.snapshots.SnapshotStateObserver$a$a, reason: collision with other inner class name */
        public static final class C0053a implements pm1 {
            C0053a() {
            }

            @Override // defpackage.pm1
            public void a(androidx.compose.runtime.f fVar) {
                a aVar = a.this;
                aVar.j--;
            }

            @Override // defpackage.pm1
            public void b(androidx.compose.runtime.f fVar) {
                a.this.j++;
            }
        }

        public a(ss2 ss2Var) {
            this.a = ss2Var;
        }

        private final void d(Object obj) {
            int i = this.d;
            jy4 jy4Var = this.c;
            if (jy4Var == null) {
                return;
            }
            long[] jArr = jy4Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = jy4Var.b[i5];
                            boolean z = jy4Var.c[i5] != i;
                            if (z) {
                                m(obj, obj2);
                            }
                            if (z) {
                                jy4Var.o(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        private final void l(Object obj, int i, Object obj2, jy4 jy4Var) {
            int i2;
            int i3;
            if (this.j > 0) {
                return;
            }
            int n = jy4Var.n(obj, i, -1);
            if (!(obj instanceof androidx.compose.runtime.f) || n == i) {
                i2 = -1;
            } else {
                f.a z = ((androidx.compose.runtime.f) obj).z();
                this.l.put(obj, z.a());
                yb5 b = z.b();
                bc7 bc7Var = this.k;
                bc7Var.f(obj);
                Object[] objArr = b.b;
                long[] jArr = b.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    y08 y08Var = (y08) objArr[(i4 << 3) + i7];
                                    if (y08Var instanceof z08) {
                                        ((z08) y08Var).B(c.a(2));
                                    }
                                    bc7Var.a(y08Var, obj);
                                    i3 = 8;
                                } else {
                                    i3 = i5;
                                }
                                j >>= i3;
                                i7++;
                                i5 = i3;
                            }
                            if (i6 != i5) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                i2 = -1;
            }
            if (n == i2) {
                if (obj instanceof z08) {
                    ((z08) obj).B(c.a(2));
                }
                this.e.a(obj, obj2);
            }
        }

        private final void m(Object obj, Object obj2) {
            this.e.e(obj2, obj);
            if (!(obj2 instanceof androidx.compose.runtime.f) || this.e.c(obj2)) {
                return;
            }
            this.k.f(obj2);
            this.l.remove(obj2);
        }

        public final void c() {
            this.e.b();
            this.f.h();
            this.k.b();
            this.l.clear();
        }

        public final void e(Object obj) {
            jy4 jy4Var = (jy4) this.f.n(obj);
            if (jy4Var == null) {
                return;
            }
            Object[] objArr = jy4Var.b;
            int[] iArr = jy4Var.c;
            long[] jArr = jy4Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            m(obj, obj2);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        public final ss2 f() {
            return this.a;
        }

        public final boolean g() {
            return this.f.f();
        }

        public final void h() {
            py4 py4Var = this.g;
            ss2 ss2Var = this.a;
            Object[] objArr = py4Var.b;
            long[] jArr = py4Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ss2Var.invoke(objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            py4Var.i();
        }

        public final void i(Object obj, ss2 ss2Var, qs2 qs2Var) {
            Object obj2 = this.b;
            jy4 jy4Var = this.c;
            int i = this.d;
            this.b = obj;
            this.c = (jy4) this.f.b(obj);
            if (this.d == -1) {
                this.d = SnapshotKt.H().f();
            }
            pm1 pm1Var = this.i;
            vy4 c = y.c();
            try {
                c.b(pm1Var);
                e.e.f(ss2Var, null, qs2Var);
                c.y(c.q() - 1);
                Object obj3 = this.b;
                zq3.e(obj3);
                d(obj3);
                this.b = obj2;
                this.c = jy4Var;
                this.d = i;
            } catch (Throwable th) {
                c.y(c.q() - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:73:0x027e  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x02d7 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean j(java.util.Set r37) {
            /*
                Method dump skipped, instructions count: 1534
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.a.j(java.util.Set):boolean");
        }

        public final void k(Object obj) {
            Object obj2 = this.b;
            zq3.e(obj2);
            int i = this.d;
            jy4 jy4Var = this.c;
            if (jy4Var == null) {
                jy4Var = new jy4(0, 1, null);
                this.c = jy4Var;
                this.f.q(obj2, jy4Var);
                ww8 ww8Var = ww8.a;
            }
            l(obj, i, obj2, jy4Var);
        }

        public final void n(ss2 ss2Var) {
            long[] jArr;
            int i;
            long[] jArr2;
            int i2;
            long j;
            int i3;
            long j2;
            int i4;
            oy4 oy4Var = this.f;
            long[] jArr3 = oy4Var.a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j3 = jArr3[i5];
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & 255) < 128) {
                            int i9 = (i5 << 3) + i8;
                            Object obj = oy4Var.b[i9];
                            jy4 jy4Var = (jy4) oy4Var.c[i9];
                            Boolean bool = (Boolean) ss2Var.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = jy4Var.b;
                                int[] iArr = jy4Var.c;
                                long[] jArr4 = jy4Var.a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i3 = i7;
                                    int i10 = 0;
                                    while (true) {
                                        long j5 = jArr4[i10];
                                        i2 = i5;
                                        j = j3;
                                        j2 = -9187201950435737472L;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                if ((j5 & 255) < 128) {
                                                    int i13 = (i10 << 3) + i12;
                                                    Object obj2 = objArr[i13];
                                                    int i14 = iArr[i13];
                                                    m(obj, obj2);
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i11 != 8) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        i5 = i2;
                                        j3 = j;
                                    }
                                } else {
                                    i2 = i5;
                                    j = j3;
                                    i3 = i7;
                                    j2 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                j = j3;
                                i3 = i7;
                                j2 = j4;
                            }
                            if (bool.booleanValue()) {
                                oy4Var.o(i9);
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr3;
                            i2 = i5;
                            j = j3;
                            i3 = i7;
                            j2 = j4;
                            i4 = i6;
                        }
                        j3 = j >> i4;
                        i8++;
                        i6 = i4;
                        j4 = j2;
                        jArr3 = jArr2;
                        i7 = i3;
                        i5 = i2;
                    }
                    jArr = jArr3;
                    int i15 = i5;
                    if (i7 != i6) {
                        return;
                    } else {
                        i = i15;
                    }
                } else {
                    jArr = jArr3;
                    i = i5;
                }
                if (i == length) {
                    return;
                }
                i5 = i + 1;
                jArr3 = jArr;
            }
        }

        public final void o(androidx.compose.runtime.f fVar) {
            long[] jArr;
            long[] jArr2;
            int i;
            jy4 jy4Var;
            oy4 oy4Var = this.f;
            int f = SnapshotKt.H().f();
            Object b = this.e.d().b(fVar);
            if (b == null) {
                return;
            }
            if (!(b instanceof py4)) {
                jy4 jy4Var2 = (jy4) oy4Var.b(b);
                if (jy4Var2 == null) {
                    jy4Var2 = new jy4(0, 1, null);
                    oy4Var.q(b, jy4Var2);
                    ww8 ww8Var = ww8.a;
                }
                l(fVar, f, b, jy4Var2);
                return;
            }
            py4 py4Var = (py4) b;
            Object[] objArr = py4Var.b;
            long[] jArr3 = py4Var.a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            Object obj = objArr[(i2 << 3) + i5];
                            jy4 jy4Var3 = (jy4) oy4Var.b(obj);
                            jArr2 = jArr3;
                            if (jy4Var3 == null) {
                                jy4Var = new jy4(0, 1, null);
                                oy4Var.q(obj, jy4Var);
                                ww8 ww8Var2 = ww8.a;
                            } else {
                                jy4Var = jy4Var3;
                            }
                            l(fVar, f, obj, jy4Var);
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }
    }

    public SnapshotStateObserver(ss2 ss2Var) {
        this.a = ss2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Set set) {
        Object obj;
        List F0;
        do {
            obj = this.b.get();
            if (obj == null) {
                F0 = set;
            } else if (obj instanceof Set) {
                F0 = kotlin.collections.i.o(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new KotlinNothingValueException();
                }
                F0 = kotlin.collections.i.F0((Collection) obj, kotlin.collections.i.e(set));
            }
        } while (!kz4.a(this.b, obj, F0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        boolean z;
        synchronized (this.f) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set p = p();
            if (p == null) {
                return z2;
            }
            synchronized (this.f) {
                try {
                    vy4 vy4Var = this.f;
                    int q = vy4Var.q();
                    if (q > 0) {
                        Object[] p2 = vy4Var.p();
                        int i = 0;
                        do {
                            if (!((a) p2[i]).j(p) && !z2) {
                                z2 = false;
                                i++;
                            }
                            z2 = true;
                            i++;
                        } while (i < q);
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final a n(ss2 ss2Var) {
        Object obj;
        vy4 vy4Var = this.f;
        int q = vy4Var.q();
        if (q > 0) {
            Object[] p = vy4Var.p();
            int i = 0;
            do {
                obj = p[i];
                if (((a) obj).f() == ss2Var) {
                    break;
                }
                i++;
            } while (i < q);
        }
        obj = null;
        a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        zq3.f(ss2Var, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar2 = new a((ss2) ku8.f(ss2Var, 1));
        this.f.b(aVar2);
        return aVar2;
    }

    private final Set p() {
        Object obj;
        Object obj2;
        Set set;
        do {
            obj = this.b.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!kz4.a(this.b, obj, obj2));
        return set;
    }

    private final Void q() {
        androidx.compose.runtime.b.t("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.a.invoke(new qs2() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m65invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m65invoke() {
                vy4 vy4Var;
                boolean z;
                boolean m;
                vy4 vy4Var2;
                do {
                    vy4Var = SnapshotStateObserver.this.f;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (vy4Var) {
                        try {
                            z = snapshotStateObserver.c;
                            if (!z) {
                                snapshotStateObserver.c = true;
                                try {
                                    vy4Var2 = snapshotStateObserver.f;
                                    int q = vy4Var2.q();
                                    if (q > 0) {
                                        Object[] p = vy4Var2.p();
                                        int i = 0;
                                        do {
                                            ((SnapshotStateObserver.a) p[i]).h();
                                            i++;
                                        } while (i < q);
                                    }
                                    snapshotStateObserver.c = false;
                                } finally {
                                }
                            }
                            ww8 ww8Var = ww8.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    m = SnapshotStateObserver.this.m();
                } while (m);
            }
        });
    }

    public final void j() {
        synchronized (this.f) {
            try {
                vy4 vy4Var = this.f;
                int q = vy4Var.q();
                if (q > 0) {
                    Object[] p = vy4Var.p();
                    int i = 0;
                    do {
                        ((a) p[i]).c();
                        i++;
                    } while (i < q);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Object obj) {
        synchronized (this.f) {
            try {
                vy4 vy4Var = this.f;
                int q = vy4Var.q();
                int i = 0;
                for (int i2 = 0; i2 < q; i2++) {
                    a aVar = (a) vy4Var.p()[i2];
                    aVar.e(obj);
                    if (!aVar.g()) {
                        i++;
                    } else if (i > 0) {
                        vy4Var.p()[i2 - i] = vy4Var.p()[i2];
                    }
                }
                int i3 = q - i;
                kotlin.collections.d.t(vy4Var.p(), null, i3, q);
                vy4Var.C(i3);
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(ss2 ss2Var) {
        synchronized (this.f) {
            try {
                vy4 vy4Var = this.f;
                int q = vy4Var.q();
                int i = 0;
                for (int i2 = 0; i2 < q; i2++) {
                    a aVar = (a) vy4Var.p()[i2];
                    aVar.n(ss2Var);
                    if (!aVar.g()) {
                        i++;
                    } else if (i > 0) {
                        vy4Var.p()[i2 - i] = vy4Var.p()[i2];
                    }
                }
                int i3 = q - i;
                kotlin.collections.d.t(vy4Var.p(), null, i3, q);
                vy4Var.C(i3);
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(Object obj, ss2 ss2Var, qs2 qs2Var) {
        a n;
        synchronized (this.f) {
            n = n(ss2Var);
        }
        boolean z = this.h;
        a aVar = this.i;
        long j = this.j;
        if (j == -1 || j == u5.a()) {
            try {
                this.h = false;
                this.i = n;
                this.j = Thread.currentThread().getId();
                n.i(obj, this.e, qs2Var);
                return;
            } finally {
                this.i = aVar;
                this.h = z;
                this.j = j;
            }
        }
        throw new IllegalArgumentException(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + u5.a() + ", name=" + u5.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.").toString());
    }

    public final void s() {
        this.g = e.e.g(this.d);
    }

    public final void t() {
        wc5 wc5Var = this.g;
        if (wc5Var != null) {
            wc5Var.dispose();
        }
    }
}
