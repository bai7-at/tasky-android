package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.k;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a85;
import defpackage.em2;
import defpackage.gy4;
import defpackage.kt6;
import defpackage.lh4;
import defpackage.ov4;
import defpackage.ql1;
import defpackage.ql2;
import defpackage.rl1;
import defpackage.ss2;
import defpackage.ul1;
import defpackage.v27;
import defpackage.vl2;
import defpackage.vv3;
import defpackage.vy4;
import defpackage.w27;
import defpackage.wl2;
import defpackage.wv3;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zv3;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class FocusOwnerImpl implements vl2 {
    private final FocusInvalidationManager b;
    public LayoutDirection e;
    private gy4 f;
    private FocusTargetNode a = new FocusTargetNode();
    private final em2 c = new em2();
    private final Modifier d = new ov4() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // defpackage.ov4
        public int hashCode() {
            return FocusOwnerImpl.this.r().hashCode();
        }

        @Override // defpackage.ov4
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode l() {
            return FocusOwnerImpl.this.r();
        }

        @Override // defpackage.ov4
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void r(FocusTargetNode focusTargetNode) {
        }
    };

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public FocusOwnerImpl(ss2 ss2Var) {
        this.b = new FocusInvalidationManager(ss2Var);
    }

    private final Modifier.c s(ql1 ql1Var) {
        int a2 = a85.a(1024) | a85.a(8192);
        if (!ql1Var.c0().L1()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.c c0 = ql1Var.c0();
        Modifier.c cVar = null;
        if ((c0.B1() & a2) != 0) {
            for (Modifier.c C1 = c0.C1(); C1 != null; C1 = C1.C1()) {
                if ((C1.G1() & a2) != 0) {
                    if ((a85.a(1024) & C1.G1()) != 0) {
                        return cVar;
                    }
                    cVar = C1;
                }
            }
        }
        return cVar;
    }

    private final boolean t(KeyEvent keyEvent) {
        long a2 = wv3.a(keyEvent);
        int b = wv3.b(keyEvent);
        vv3.a aVar = vv3.a;
        if (vv3.e(b, aVar.a())) {
            gy4 gy4Var = this.f;
            if (gy4Var == null) {
                gy4Var = new gy4(3);
                this.f = gy4Var;
            }
            gy4Var.k(a2);
        } else if (vv3.e(b, aVar.b())) {
            gy4 gy4Var2 = this.f;
            if (gy4Var2 == null || !gy4Var2.a(a2)) {
                return false;
            }
            gy4 gy4Var3 = this.f;
            if (gy4Var3 != null) {
                gy4Var3.l(a2);
            }
        }
        return true;
    }

    private final boolean u(int i) {
        if (this.a.l2().getHasFocus() && !this.a.l2().isFocused()) {
            d.a aVar = d.b;
            if (d.l(i, aVar.e()) ? true : d.l(i, aVar.f())) {
                o(false);
                if (this.a.l2().isFocused()) {
                    return f(i);
                }
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.vl2
    public void a(LayoutDirection layoutDirection) {
        this.e = layoutDirection;
    }

    @Override // defpackage.vl2
    public void b() {
        if (this.a.l2() == FocusStateImpl.Inactive) {
            this.a.o2(FocusStateImpl.Active);
        }
    }

    @Override // defpackage.vl2
    public void c(boolean z, boolean z2) {
        boolean z3;
        FocusStateImpl focusStateImpl;
        em2 e = e();
        try {
            z3 = e.c;
            if (z3) {
                e.g();
            }
            e.f();
            if (!z) {
                int i = a.a[FocusTransactionsKt.e(this.a, d.b.c()).ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    e.h();
                    return;
                }
            }
            FocusStateImpl l2 = this.a.l2();
            if (FocusTransactionsKt.c(this.a, z, z2)) {
                FocusTargetNode focusTargetNode = this.a;
                int i2 = a.b[l2.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    focusStateImpl = FocusStateImpl.Active;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    focusStateImpl = FocusStateImpl.Inactive;
                }
                focusTargetNode.o2(focusStateImpl);
            }
            ww8 ww8Var = ww8.a;
            e.h();
        } catch (Throwable th) {
            e.h();
            throw th;
        }
    }

    @Override // defpackage.vl2
    public void d(ql2 ql2Var) {
        this.b.d(ql2Var);
    }

    @Override // defpackage.vl2
    public em2 e() {
        return this.c;
    }

    @Override // defpackage.ul2
    public boolean f(final int i) {
        final FocusTargetNode b = h.b(this.a);
        if (b == null) {
            return false;
        }
        FocusRequester a2 = h.a(b, i, q());
        FocusRequester.a aVar = FocusRequester.b;
        if (a2 != aVar.b()) {
            return a2 != aVar.a() && a2.c();
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        boolean e = h.e(this.a, i, q(), new ss2() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$foundNextItem$1

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[CustomDestinationResult.values().length];
                    try {
                        iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CustomDestinationResult.None.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Modifier.c cVar;
                boolean z;
                boolean z2;
                k h0;
                if (zq3.c(focusTargetNode, FocusTargetNode.this)) {
                    return Boolean.FALSE;
                }
                int a3 = a85.a(1024);
                if (!focusTargetNode.c0().L1()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.c I1 = focusTargetNode.c0().I1();
                LayoutNode k = rl1.k(focusTargetNode);
                loop0: while (true) {
                    cVar = null;
                    z = true;
                    if (k == null) {
                        break;
                    }
                    if ((k.h0().k().B1() & a3) != 0) {
                        while (I1 != null) {
                            if ((I1.G1() & a3) != 0) {
                                Modifier.c cVar2 = I1;
                                vy4 vy4Var = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof FocusTargetNode) {
                                        cVar = cVar2;
                                        break loop0;
                                    }
                                    if ((cVar2.G1() & a3) != 0 && (cVar2 instanceof ul1)) {
                                        int i2 = 0;
                                        for (Modifier.c f2 = ((ul1) cVar2).f2(); f2 != null; f2 = f2.C1()) {
                                            if ((f2.G1() & a3) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cVar2 = f2;
                                                } else {
                                                    if (vy4Var == null) {
                                                        vy4Var = new vy4(new Modifier.c[16], 0);
                                                    }
                                                    if (cVar2 != null) {
                                                        vy4Var.b(cVar2);
                                                        cVar2 = null;
                                                    }
                                                    vy4Var.b(f2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    cVar2 = rl1.g(vy4Var);
                                }
                            }
                            I1 = I1.I1();
                        }
                    }
                    k = k.k0();
                    I1 = (k == null || (h0 = k.h0()) == null) ? null : h0.o();
                }
                if (cVar == null) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                em2 e2 = this.e();
                int i3 = i;
                Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                try {
                    z2 = e2.c;
                    if (z2) {
                        e2.g();
                    }
                    e2.f();
                    int i4 = a.a[FocusTransactionsKt.h(focusTargetNode, i3).ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2 || i4 == 3) {
                            ref$BooleanRef2.element = true;
                        } else {
                            if (i4 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = FocusTransactionsKt.i(focusTargetNode);
                        }
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    e2.h();
                    return valueOf;
                } catch (Throwable th) {
                    e2.h();
                    throw th;
                }
            }
        });
        if (ref$BooleanRef.element) {
            return false;
        }
        return e || u(i);
    }

    @Override // defpackage.vl2
    public boolean g(KeyEvent keyEvent) {
        k h0;
        FocusTargetNode b = h.b(this.a);
        if (b != null) {
            int a2 = a85.a(131072);
            if (!b.c0().L1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.c I1 = b.c0().I1();
            LayoutNode k = rl1.k(b);
            while (k != null) {
                if ((k.h0().k().B1() & a2) != 0) {
                    while (I1 != null) {
                        if ((I1.G1() & a2) != 0) {
                            Modifier.c cVar = I1;
                            vy4 vy4Var = null;
                            while (cVar != null) {
                                if ((cVar.G1() & a2) != 0 && (cVar instanceof ul1)) {
                                    int i = 0;
                                    for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                        if ((f2.G1() & a2) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVar = f2;
                                            } else {
                                                if (vy4Var == null) {
                                                    vy4Var = new vy4(new Modifier.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    vy4Var.b(cVar);
                                                    cVar = null;
                                                }
                                                vy4Var.b(f2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVar = rl1.g(vy4Var);
                            }
                        }
                        I1 = I1.I1();
                    }
                }
                k = k.k0();
                I1 = (k == null || (h0 = k.h0()) == null) ? null : h0.o();
            }
            lh4.a(null);
        }
        return false;
    }

    @Override // defpackage.vl2
    public void i(FocusTargetNode focusTargetNode) {
        this.b.f(focusTargetNode);
    }

    @Override // defpackage.vl2
    public Modifier j() {
        return this.d;
    }

    @Override // defpackage.vl2
    public kt6 k() {
        FocusTargetNode b = h.b(this.a);
        if (b != null) {
            return h.d(b);
        }
        return null;
    }

    @Override // defpackage.vl2
    public void l(wl2 wl2Var) {
        this.b.e(wl2Var);
    }

    @Override // defpackage.vl2
    public void m() {
        FocusTransactionsKt.c(this.a, true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [vy4] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [vy4] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [vy4] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [vy4] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [vy4] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [vy4] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // defpackage.vl2
    public boolean n(w27 w27Var) {
        v27 v27Var;
        int size;
        k h0;
        ul1 ul1Var;
        k h02;
        FocusTargetNode b = h.b(this.a);
        if (b != null) {
            int a2 = a85.a(Http2.INITIAL_MAX_FRAME_SIZE);
            if (!b.c0().L1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.c I1 = b.c0().I1();
            LayoutNode k = rl1.k(b);
            loop0: while (true) {
                if (k == null) {
                    ul1Var = 0;
                    break;
                }
                if ((k.h0().k().B1() & a2) != 0) {
                    while (I1 != null) {
                        if ((I1.G1() & a2) != 0) {
                            ?? r9 = 0;
                            ul1Var = I1;
                            while (ul1Var != 0) {
                                if (ul1Var instanceof v27) {
                                    break loop0;
                                }
                                if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                                    Modifier.c f2 = ul1Var.f2();
                                    int i = 0;
                                    ul1Var = ul1Var;
                                    r9 = r9;
                                    while (f2 != null) {
                                        if ((f2.G1() & a2) != 0) {
                                            i++;
                                            r9 = r9;
                                            if (i == 1) {
                                                ul1Var = f2;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new vy4(new Modifier.c[16], 0);
                                                }
                                                if (ul1Var != 0) {
                                                    r9.b(ul1Var);
                                                    ul1Var = 0;
                                                }
                                                r9.b(f2);
                                            }
                                        }
                                        f2 = f2.C1();
                                        ul1Var = ul1Var;
                                        r9 = r9;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ul1Var = rl1.g(r9);
                            }
                        }
                        I1 = I1.I1();
                    }
                }
                k = k.k0();
                I1 = (k == null || (h02 = k.h0()) == null) ? null : h02.o();
            }
            v27Var = (v27) ul1Var;
        } else {
            v27Var = null;
        }
        if (v27Var != null) {
            int a3 = a85.a(Http2.INITIAL_MAX_FRAME_SIZE);
            if (!v27Var.c0().L1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.c I12 = v27Var.c0().I1();
            LayoutNode k2 = rl1.k(v27Var);
            ArrayList arrayList = null;
            while (k2 != null) {
                if ((k2.h0().k().B1() & a3) != 0) {
                    while (I12 != null) {
                        if ((I12.G1() & a3) != 0) {
                            Modifier.c cVar = I12;
                            vy4 vy4Var = null;
                            while (cVar != null) {
                                if (cVar instanceof v27) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVar);
                                } else if ((cVar.G1() & a3) != 0 && (cVar instanceof ul1)) {
                                    int i2 = 0;
                                    for (Modifier.c f22 = ((ul1) cVar).f2(); f22 != null; f22 = f22.C1()) {
                                        if ((f22.G1() & a3) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar = f22;
                                            } else {
                                                if (vy4Var == null) {
                                                    vy4Var = new vy4(new Modifier.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    vy4Var.b(cVar);
                                                    cVar = null;
                                                }
                                                vy4Var.b(f22);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar = rl1.g(vy4Var);
                            }
                        }
                        I12 = I12.I1();
                    }
                }
                k2 = k2.k0();
                I12 = (k2 == null || (h0 = k2.h0()) == null) ? null : h0.o();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((v27) arrayList.get(size)).W(w27Var)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            ul1 c0 = v27Var.c0();
            ?? r1 = 0;
            while (c0 != 0) {
                if (c0 instanceof v27) {
                    if (((v27) c0).W(w27Var)) {
                        return true;
                    }
                } else if ((c0.G1() & a3) != 0 && (c0 instanceof ul1)) {
                    Modifier.c f23 = c0.f2();
                    int i4 = 0;
                    c0 = c0;
                    r1 = r1;
                    while (f23 != null) {
                        if ((f23.G1() & a3) != 0) {
                            i4++;
                            r1 = r1;
                            if (i4 == 1) {
                                c0 = f23;
                            } else {
                                if (r1 == 0) {
                                    r1 = new vy4(new Modifier.c[16], 0);
                                }
                                if (c0 != 0) {
                                    r1.b(c0);
                                    c0 = 0;
                                }
                                r1.b(f23);
                            }
                        }
                        f23 = f23.C1();
                        c0 = c0;
                        r1 = r1;
                    }
                    if (i4 == 1) {
                    }
                }
                c0 = rl1.g(r1);
            }
            ul1 c02 = v27Var.c0();
            ?? r12 = 0;
            while (c02 != 0) {
                if (c02 instanceof v27) {
                    if (((v27) c02).v0(w27Var)) {
                        return true;
                    }
                } else if ((c02.G1() & a3) != 0 && (c02 instanceof ul1)) {
                    Modifier.c f24 = c02.f2();
                    int i5 = 0;
                    c02 = c02;
                    r12 = r12;
                    while (f24 != null) {
                        if ((f24.G1() & a3) != 0) {
                            i5++;
                            r12 = r12;
                            if (i5 == 1) {
                                c02 = f24;
                            } else {
                                if (r12 == 0) {
                                    r12 = new vy4(new Modifier.c[16], 0);
                                }
                                if (c02 != 0) {
                                    r12.b(c02);
                                    c02 = 0;
                                }
                                r12.b(f24);
                            }
                        }
                        f24 = f24.C1();
                        c02 = c02;
                        r12 = r12;
                    }
                    if (i5 == 1) {
                    }
                }
                c02 = rl1.g(r12);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((v27) arrayList.get(i6)).v0(w27Var)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ul2
    public void o(boolean z) {
        c(z, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r13v6, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [vy4] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [vy4] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [vy4] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [vy4] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [vy4] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [vy4] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // defpackage.vl2
    public boolean p(KeyEvent keyEvent) {
        int size;
        k h0;
        ul1 ul1Var;
        k h02;
        if (!t(keyEvent)) {
            return false;
        }
        FocusTargetNode b = h.b(this.a);
        if (b == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.");
        }
        Modifier.c s = s(b);
        if (s == null) {
            int a2 = a85.a(8192);
            if (!b.c0().L1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.c I1 = b.c0().I1();
            LayoutNode k = rl1.k(b);
            loop0: while (true) {
                if (k == null) {
                    ul1Var = 0;
                    break;
                }
                if ((k.h0().k().B1() & a2) != 0) {
                    while (I1 != null) {
                        if ((I1.G1() & a2) != 0) {
                            ?? r9 = 0;
                            ul1Var = I1;
                            while (ul1Var != 0) {
                                if (ul1Var instanceof zv3) {
                                    break loop0;
                                }
                                if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                                    Modifier.c f2 = ul1Var.f2();
                                    int i = 0;
                                    ul1Var = ul1Var;
                                    r9 = r9;
                                    while (f2 != null) {
                                        if ((f2.G1() & a2) != 0) {
                                            i++;
                                            r9 = r9;
                                            if (i == 1) {
                                                ul1Var = f2;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new vy4(new Modifier.c[16], 0);
                                                }
                                                if (ul1Var != 0) {
                                                    r9.b(ul1Var);
                                                    ul1Var = 0;
                                                }
                                                r9.b(f2);
                                            }
                                        }
                                        f2 = f2.C1();
                                        ul1Var = ul1Var;
                                        r9 = r9;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ul1Var = rl1.g(r9);
                            }
                        }
                        I1 = I1.I1();
                    }
                }
                k = k.k0();
                I1 = (k == null || (h02 = k.h0()) == null) ? null : h02.o();
            }
            zv3 zv3Var = (zv3) ul1Var;
            s = zv3Var != null ? zv3Var.c0() : null;
        }
        if (s != null) {
            int a3 = a85.a(8192);
            if (!s.c0().L1()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.c I12 = s.c0().I1();
            LayoutNode k2 = rl1.k(s);
            ArrayList arrayList = null;
            while (k2 != null) {
                if ((k2.h0().k().B1() & a3) != 0) {
                    while (I12 != null) {
                        if ((I12.G1() & a3) != 0) {
                            Modifier.c cVar = I12;
                            vy4 vy4Var = null;
                            while (cVar != null) {
                                if (cVar instanceof zv3) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVar);
                                } else if ((cVar.G1() & a3) != 0 && (cVar instanceof ul1)) {
                                    int i2 = 0;
                                    for (Modifier.c f22 = ((ul1) cVar).f2(); f22 != null; f22 = f22.C1()) {
                                        if ((f22.G1() & a3) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar = f22;
                                            } else {
                                                if (vy4Var == null) {
                                                    vy4Var = new vy4(new Modifier.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    vy4Var.b(cVar);
                                                    cVar = null;
                                                }
                                                vy4Var.b(f22);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar = rl1.g(vy4Var);
                            }
                        }
                        I12 = I12.I1();
                    }
                }
                k2 = k2.k0();
                I12 = (k2 == null || (h0 = k2.h0()) == null) ? null : h0.o();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((zv3) arrayList.get(size)).B0(keyEvent)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            ul1 c0 = s.c0();
            ?? r3 = 0;
            while (c0 != 0) {
                if (c0 instanceof zv3) {
                    if (((zv3) c0).B0(keyEvent)) {
                        return true;
                    }
                } else if ((c0.G1() & a3) != 0 && (c0 instanceof ul1)) {
                    Modifier.c f23 = c0.f2();
                    int i4 = 0;
                    c0 = c0;
                    r3 = r3;
                    while (f23 != null) {
                        if ((f23.G1() & a3) != 0) {
                            i4++;
                            r3 = r3;
                            if (i4 == 1) {
                                c0 = f23;
                            } else {
                                if (r3 == 0) {
                                    r3 = new vy4(new Modifier.c[16], 0);
                                }
                                if (c0 != 0) {
                                    r3.b(c0);
                                    c0 = 0;
                                }
                                r3.b(f23);
                            }
                        }
                        f23 = f23.C1();
                        c0 = c0;
                        r3 = r3;
                    }
                    if (i4 == 1) {
                    }
                }
                c0 = rl1.g(r3);
            }
            ul1 c02 = s.c0();
            ?? r2 = 0;
            while (c02 != 0) {
                if (c02 instanceof zv3) {
                    if (((zv3) c02).S0(keyEvent)) {
                        return true;
                    }
                } else if ((c02.G1() & a3) != 0 && (c02 instanceof ul1)) {
                    Modifier.c f24 = c02.f2();
                    int i5 = 0;
                    r2 = r2;
                    c02 = c02;
                    while (f24 != null) {
                        if ((f24.G1() & a3) != 0) {
                            i5++;
                            r2 = r2;
                            if (i5 == 1) {
                                c02 = f24;
                            } else {
                                if (r2 == 0) {
                                    r2 = new vy4(new Modifier.c[16], 0);
                                }
                                if (c02 != 0) {
                                    r2.b(c02);
                                    c02 = 0;
                                }
                                r2.b(f24);
                            }
                        }
                        f24 = f24.C1();
                        r2 = r2;
                        c02 = c02;
                    }
                    if (i5 == 1) {
                    }
                }
                c02 = rl1.g(r2);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((zv3) arrayList.get(i6)).S0(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public LayoutDirection q() {
        LayoutDirection layoutDirection = this.e;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        zq3.z("layoutDirection");
        return null;
    }

    public final FocusTargetNode r() {
        return this.a;
    }
}
