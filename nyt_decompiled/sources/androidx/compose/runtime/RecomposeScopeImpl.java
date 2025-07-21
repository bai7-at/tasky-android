package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import defpackage.cc7;
import defpackage.ft6;
import defpackage.gt2;
import defpackage.hd;
import defpackage.ht6;
import defpackage.jy4;
import defpackage.oy4;
import defpackage.ss2;
import defpackage.tw7;
import defpackage.ws0;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements cc7, ft6 {
    public static final a h = new a(null);
    public static final int i = 8;
    private int a;
    private ht6 b;
    private hd c;
    private gt2 d;
    private int e;
    private jy4 f;
    private oy4 g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(t tVar, List list, ht6 ht6Var) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object X0 = tVar.X0((hd) list.get(i), 0);
                RecomposeScopeImpl recomposeScopeImpl = X0 instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) X0 : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.g(ht6Var);
                }
            }
        }

        private a() {
        }
    }

    public RecomposeScopeImpl(ht6 ht6Var) {
        this.b = ht6Var;
    }

    private final void F(boolean z) {
        if (z) {
            this.a |= 32;
        } else {
            this.a &= -33;
        }
    }

    private final void G(boolean z) {
        if (z) {
            this.a |= 16;
        } else {
            this.a &= -17;
        }
    }

    private final boolean p() {
        return (this.a & 32) != 0;
    }

    public final void A(hd hdVar) {
        this.c = hdVar;
    }

    public final void B(boolean z) {
        if (z) {
            this.a |= 2;
        } else {
            this.a &= -3;
        }
    }

    public final void C(boolean z) {
        if (z) {
            this.a |= 4;
        } else {
            this.a &= -5;
        }
    }

    public final void D(boolean z) {
        if (z) {
            this.a |= 64;
        } else {
            this.a &= -65;
        }
    }

    public final void E(boolean z) {
        if (z) {
            this.a |= 8;
        } else {
            this.a &= -9;
        }
    }

    public final void H(boolean z) {
        if (z) {
            this.a |= 1;
        } else {
            this.a &= -2;
        }
    }

    public final void I(int i2) {
        this.e = i2;
        G(false);
    }

    @Override // defpackage.cc7
    public void a(gt2 gt2Var) {
        this.d = gt2Var;
    }

    public final void g(ht6 ht6Var) {
        this.b = ht6Var;
    }

    public final void h(Composer composer) {
        ww8 ww8Var;
        gt2 gt2Var = this.d;
        if (gt2Var != null) {
            gt2Var.invoke(composer, 1);
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    public final ss2 i(final int i2) {
        final jy4 jy4Var = this.f;
        if (jy4Var == null || q()) {
            return null;
        }
        Object[] objArr = jy4Var.b;
        int[] iArr = jy4Var.c;
        long[] jArr = jy4Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        int i6 = (i3 << 3) + i5;
                        Object obj = objArr[i6];
                        if (iArr[i6] != i2) {
                            return new ss2() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void b(ws0 ws0Var) {
                                    int i7;
                                    jy4 jy4Var2;
                                    int i8;
                                    oy4 oy4Var;
                                    ws0 ws0Var2 = ws0Var;
                                    i7 = RecomposeScopeImpl.this.e;
                                    if (i7 == i2) {
                                        jy4 jy4Var3 = jy4Var;
                                        jy4Var2 = RecomposeScopeImpl.this.f;
                                        if (zq3.c(jy4Var3, jy4Var2) && (ws0Var2 instanceof d)) {
                                            jy4 jy4Var4 = jy4Var;
                                            int i9 = i2;
                                            RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this;
                                            long[] jArr2 = jy4Var4.a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i10 = 0;
                                                while (true) {
                                                    long j2 = jArr2[i10];
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i11 = 8;
                                                        int i12 = 8 - ((~(i10 - length2)) >>> 31);
                                                        int i13 = 0;
                                                        while (i13 < i12) {
                                                            if ((255 & j2) < 128) {
                                                                int i14 = (i10 << 3) + i13;
                                                                Object obj2 = jy4Var4.b[i14];
                                                                boolean z = jy4Var4.c[i14] != i9;
                                                                if (z) {
                                                                    d dVar = (d) ws0Var2;
                                                                    dVar.K(obj2, recomposeScopeImpl);
                                                                    f fVar = obj2 instanceof f ? (f) obj2 : null;
                                                                    if (fVar != null) {
                                                                        dVar.J(fVar);
                                                                        oy4Var = recomposeScopeImpl.g;
                                                                        if (oy4Var != null) {
                                                                            oy4Var.n(fVar);
                                                                            if (oy4Var.d() == 0) {
                                                                                recomposeScopeImpl.g = null;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (z) {
                                                                    jy4Var4.o(i14);
                                                                }
                                                                i8 = 8;
                                                            } else {
                                                                i8 = i11;
                                                            }
                                                            j2 >>= i8;
                                                            i13++;
                                                            i11 = i8;
                                                            ws0Var2 = ws0Var;
                                                        }
                                                        if (i12 != i11) {
                                                            break;
                                                        }
                                                    }
                                                    if (i10 == length2) {
                                                        break;
                                                    }
                                                    i10++;
                                                    ws0Var2 = ws0Var;
                                                }
                                            }
                                            if (jy4Var.e() == 0) {
                                                RecomposeScopeImpl.this.f = null;
                                            }
                                        }
                                    }
                                }

                                @Override // defpackage.ss2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    b((ws0) obj2);
                                    return ww8.a;
                                }
                            };
                        }
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return null;
                }
            }
            if (i3 == length) {
                return null;
            }
            i3++;
        }
    }

    @Override // defpackage.ft6
    public void invalidate() {
        ht6 ht6Var = this.b;
        if (ht6Var != null) {
            ht6Var.h(this, null);
        }
    }

    public final hd j() {
        return this.c;
    }

    public final boolean k() {
        return this.d != null;
    }

    public final boolean l() {
        return (this.a & 2) != 0;
    }

    public final boolean m() {
        return (this.a & 4) != 0;
    }

    public final boolean n() {
        return (this.a & 64) != 0;
    }

    public final boolean o() {
        return (this.a & 8) != 0;
    }

    public final boolean q() {
        return (this.a & 16) != 0;
    }

    public final boolean r() {
        return (this.a & 1) != 0;
    }

    public final boolean s() {
        if (this.b == null) {
            return false;
        }
        hd hdVar = this.c;
        return hdVar != null ? hdVar.b() : false;
    }

    public final InvalidationResult t(Object obj) {
        InvalidationResult h2;
        ht6 ht6Var = this.b;
        return (ht6Var == null || (h2 = ht6Var.h(this, obj)) == null) ? InvalidationResult.IGNORED : h2;
    }

    public final boolean u() {
        return this.g != null;
    }

    public final boolean v(IdentityArraySet identityArraySet) {
        oy4 oy4Var;
        if (identityArraySet != null && (oy4Var = this.g) != null && identityArraySet.n()) {
            if (identityArraySet.isEmpty()) {
                return false;
            }
            for (Object obj : identityArraySet) {
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    tw7 c = fVar.c();
                    if (c == null) {
                        c = y.q();
                    }
                    if (c.b(fVar.z().a(), oy4Var.b(fVar))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean w(Object obj) {
        if (p()) {
            return false;
        }
        jy4 jy4Var = this.f;
        if (jy4Var == null) {
            jy4Var = new jy4(0, 1, null);
            this.f = jy4Var;
        }
        if (jy4Var.n(obj, this.e, -1) == this.e) {
            return true;
        }
        if (obj instanceof f) {
            oy4 oy4Var = this.g;
            if (oy4Var == null) {
                oy4Var = new oy4(0, 1, null);
                this.g = oy4Var;
            }
            oy4Var.q(obj, ((f) obj).z().a());
        }
        return false;
    }

    public final void x() {
        ht6 ht6Var = this.b;
        if (ht6Var != null) {
            ht6Var.g(this);
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void y() {
        jy4 jy4Var;
        ht6 ht6Var = this.b;
        if (ht6Var == null || (jy4Var = this.f) == null) {
            return;
        }
        F(true);
        try {
            Object[] objArr = jy4Var.b;
            int[] iArr = jy4Var.c;
            long[] jArr = jy4Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                int i6 = iArr[i5];
                                ht6Var.a(obj);
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        } finally {
            F(false);
        }
    }

    public final void z() {
        G(true);
    }
}
