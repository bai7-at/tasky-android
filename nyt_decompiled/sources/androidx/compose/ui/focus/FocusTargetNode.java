package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.l;
import com.amazonaws.event.ProgressEvent;
import defpackage.a85;
import defpackage.b80;
import defpackage.bm2;
import defpackage.ct0;
import defpackage.dm2;
import defpackage.em2;
import defpackage.kv4;
import defpackage.ov4;
import defpackage.ql2;
import defpackage.qs2;
import defpackage.rl1;
import defpackage.rl2;
import defpackage.ul1;
import defpackage.vy4;
import defpackage.wl2;
import defpackage.ww8;
import defpackage.xc5;
import defpackage.zq3;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.c implements ct0, bm2, xc5, kv4 {
    private boolean n;
    private boolean r;
    private FocusStateImpl s = FocusStateImpl.Inactive;

    public static final class FocusTargetElement extends ov4 {
        public static final FocusTargetElement b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // defpackage.ov4
        public int hashCode() {
            return 1739042953;
        }

        @Override // defpackage.ov4
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode l() {
            return new FocusTargetNode();
        }

        @Override // defpackage.ov4
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void r(FocusTargetNode focusTargetNode) {
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void Q1() {
        boolean z;
        int i = a.a[l2().ordinal()];
        if (i == 1 || i == 2) {
            rl1.l(this).getFocusOwner().o(true);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            n2();
            return;
        }
        n2();
        em2 d = dm2.d(this);
        try {
            z = d.c;
            if (z) {
                d.g();
            }
            d.f();
            o2(FocusStateImpl.Inactive);
            ww8 ww8Var = ww8.a;
            d.h();
        } catch (Throwable th) {
            d.h();
            throw th;
        }
    }

    @Override // defpackage.xc5
    public void g0() {
        FocusStateImpl l2 = l2();
        m2();
        if (l2 != l2()) {
            rl2.c(this);
        }
    }

    public final void i2() {
        FocusStateImpl i = dm2.d(this).i(this);
        if (i == null) {
            throw new IllegalStateException("committing a node that was not updated in the current transaction");
        }
        this.s = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final FocusProperties j2() {
        k h0;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int a2 = a85.a(ProgressEvent.PART_COMPLETED_EVENT_CODE);
        int a3 = a85.a(1024);
        Modifier.c c0 = c0();
        int i = a2 | a3;
        if (!c0().L1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.c c02 = c0();
        LayoutNode k = rl1.k(this);
        loop0: while (k != null) {
            if ((k.h0().k().B1() & i) != 0) {
                while (c02 != null) {
                    if ((c02.G1() & i) != 0) {
                        if (c02 != c0 && (c02.G1() & a3) != 0) {
                            break loop0;
                        }
                        if ((c02.G1() & a2) != 0) {
                            ul1 ul1Var = c02;
                            ?? r8 = 0;
                            while (ul1Var != 0) {
                                if (ul1Var instanceof wl2) {
                                    ((wl2) ul1Var).P0(focusPropertiesImpl);
                                } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                                    Modifier.c f2 = ul1Var.f2();
                                    int i2 = 0;
                                    ul1Var = ul1Var;
                                    r8 = r8;
                                    while (f2 != null) {
                                        if ((f2.G1() & a2) != 0) {
                                            i2++;
                                            r8 = r8;
                                            if (i2 == 1) {
                                                ul1Var = f2;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new vy4(new Modifier.c[16], 0);
                                                }
                                                if (ul1Var != 0) {
                                                    r8.b(ul1Var);
                                                    ul1Var = 0;
                                                }
                                                r8.b(f2);
                                            }
                                        }
                                        f2 = f2.C1();
                                        ul1Var = ul1Var;
                                        r8 = r8;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ul1Var = rl1.g(r8);
                            }
                        }
                    }
                    c02 = c02.I1();
                }
            }
            k = k.k0();
            c02 = (k == null || (h0 = k.h0()) == null) ? null : h0.o();
        }
        return focusPropertiesImpl;
    }

    public final b80 k2() {
        return (b80) l(BeyondBoundsLayoutKt.a());
    }

    public FocusStateImpl l2() {
        em2 b;
        FocusStateImpl i;
        b = dm2.b(this);
        return (b == null || (i = b.i(this)) == null) ? this.s : i;
    }

    public final void m2() {
        FocusProperties focusProperties;
        int i = a.a[l2().ordinal()];
        if (i == 1 || i == 2) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            l.a(this, new qs2() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m68invoke();
                    return ww8.a;
                }

                /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.ui.focus.FocusProperties] */
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m68invoke() {
                    Ref$ObjectRef.this.element = this.j2();
                }
            });
            T t = ref$ObjectRef.element;
            if (t == 0) {
                zq3.z("focusProperties");
                focusProperties = null;
            } else {
                focusProperties = (FocusProperties) t;
            }
            if (focusProperties.i()) {
                return;
            }
            rl1.l(this).getFocusOwner().o(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [vy4] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [vy4] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void n2() {
        k h0;
        ul1 c0 = c0();
        int a2 = a85.a(ProgressEvent.PART_FAILED_EVENT_CODE);
        ?? r4 = 0;
        while (c0 != 0) {
            if (c0 instanceof ql2) {
                rl2.b((ql2) c0);
            } else if ((c0.G1() & a2) != 0 && (c0 instanceof ul1)) {
                Modifier.c f2 = c0.f2();
                int i = 0;
                c0 = c0;
                r4 = r4;
                while (f2 != null) {
                    if ((f2.G1() & a2) != 0) {
                        i++;
                        r4 = r4;
                        if (i == 1) {
                            c0 = f2;
                        } else {
                            if (r4 == 0) {
                                r4 = new vy4(new Modifier.c[16], 0);
                            }
                            if (c0 != 0) {
                                r4.b(c0);
                                c0 = 0;
                            }
                            r4.b(f2);
                        }
                    }
                    f2 = f2.C1();
                    c0 = c0;
                    r4 = r4;
                }
                if (i == 1) {
                }
            }
            c0 = rl1.g(r4);
        }
        int a3 = a85.a(ProgressEvent.PART_FAILED_EVENT_CODE) | a85.a(1024);
        if (!c0().L1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.c I1 = c0().I1();
        LayoutNode k = rl1.k(this);
        while (k != null) {
            if ((k.h0().k().B1() & a3) != 0) {
                while (I1 != null) {
                    if ((I1.G1() & a3) != 0 && (a85.a(1024) & I1.G1()) == 0 && I1.L1()) {
                        int a4 = a85.a(ProgressEvent.PART_FAILED_EVENT_CODE);
                        ?? r10 = 0;
                        ul1 ul1Var = I1;
                        while (ul1Var != 0) {
                            if (ul1Var instanceof ql2) {
                                rl2.b((ql2) ul1Var);
                            } else if ((ul1Var.G1() & a4) != 0 && (ul1Var instanceof ul1)) {
                                Modifier.c f22 = ul1Var.f2();
                                int i2 = 0;
                                ul1Var = ul1Var;
                                r10 = r10;
                                while (f22 != null) {
                                    if ((f22.G1() & a4) != 0) {
                                        i2++;
                                        r10 = r10;
                                        if (i2 == 1) {
                                            ul1Var = f22;
                                        } else {
                                            if (r10 == 0) {
                                                r10 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (ul1Var != 0) {
                                                r10.b(ul1Var);
                                                ul1Var = 0;
                                            }
                                            r10.b(f22);
                                        }
                                    }
                                    f22 = f22.C1();
                                    ul1Var = ul1Var;
                                    r10 = r10;
                                }
                                if (i2 == 1) {
                                }
                            }
                            ul1Var = rl1.g(r10);
                        }
                    }
                    I1 = I1.I1();
                }
            }
            k = k.k0();
            I1 = (k == null || (h0 = k.h0()) == null) ? null : h0.o();
        }
    }

    public void o2(FocusStateImpl focusStateImpl) {
        dm2.d(this).j(this, focusStateImpl);
    }
}
