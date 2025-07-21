package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;
import defpackage.gu1;
import defpackage.iu1;
import defpackage.ku1;
import defpackage.ls8;
import defpackage.ms8;
import defpackage.rl1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public final class DragAndDropNode extends Modifier.c implements ls8, iu1 {
    public static final a u = new a(null);
    public static final int w = 8;
    private final ss2 n;
    private final Object r = a.C0055a.a;
    private iu1 s;
    private ku1 t;

    public static final class a {

        /* renamed from: androidx.compose.ui.draganddrop.DragAndDropNode$a$a, reason: collision with other inner class name */
        private static final class C0055a {
            public static final C0055a a = new C0055a();

            private C0055a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public DragAndDropNode(ss2 ss2Var) {
        this.n = ss2Var;
    }

    @Override // defpackage.ku1
    public void C(gu1 gu1Var) {
        ku1 ku1Var = this.t;
        if (ku1Var != null) {
            ku1Var.C(gu1Var);
            return;
        }
        iu1 iu1Var = this.s;
        if (iu1Var != null) {
            iu1Var.C(gu1Var);
        }
    }

    @Override // defpackage.ku1
    public void H(final gu1 gu1Var) {
        if (c0().L1()) {
            ms8.b(this, new ss2() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(DragAndDropNode dragAndDropNode) {
                    dragAndDropNode.H(gu1.this);
                    return Boolean.TRUE;
                }
            });
            ku1 ku1Var = this.t;
            if (ku1Var != null) {
                ku1Var.H(gu1Var);
            }
            this.t = null;
            this.s = null;
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        this.t = null;
        this.s = null;
    }

    public boolean e2(final gu1 gu1Var) {
        if (!L1()) {
            return false;
        }
        if (this.t != null) {
            throw new IllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        this.t = (ku1) this.n.invoke(gu1Var);
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ms8.b(this, new ss2() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(DragAndDropNode dragAndDropNode) {
                Ref$BooleanRef ref$BooleanRef2 = Ref$BooleanRef.this;
                boolean z = ref$BooleanRef2.element;
                boolean e2 = dragAndDropNode.e2(gu1Var);
                DragAndDropNode dragAndDropNode2 = this;
                if (e2) {
                    rl1.l(dragAndDropNode2).getDragAndDropManager().a(dragAndDropNode);
                }
                ww8 ww8Var = ww8.a;
                ref$BooleanRef2.element = z | e2;
                return Boolean.TRUE;
            }
        });
        return ref$BooleanRef.element || this.t != null;
    }

    @Override // defpackage.ku1
    public void g1(gu1 gu1Var) {
        ku1 ku1Var = this.t;
        if (ku1Var != null) {
            ku1Var.g1(gu1Var);
        }
        iu1 iu1Var = this.s;
        if (iu1Var != null) {
            iu1Var.g1(gu1Var);
        }
        this.s = null;
    }

    @Override // defpackage.ku1
    public void h0(gu1 gu1Var) {
        ku1 ku1Var = this.t;
        if (ku1Var != null) {
            ku1Var.h0(gu1Var);
            return;
        }
        iu1 iu1Var = this.s;
        if (iu1Var != null) {
            iu1Var.h0(gu1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // defpackage.ku1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p1(final defpackage.gu1 r5) {
        /*
            r4 = this;
            iu1 r0 = r4.s
            if (r0 == 0) goto L11
            long r1 = defpackage.mu1.a(r5)
            boolean r1 = defpackage.ju1.a(r0, r1)
            r2 = 1
            if (r1 != r2) goto L11
            r1 = r0
            goto L30
        L11:
            androidx.compose.ui.Modifier$c r1 = r4.c0()
            boolean r1 = r1.L1()
            if (r1 != 0) goto L1d
            r1 = 0
            goto L30
        L1d:
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            androidx.compose.ui.draganddrop.DragAndDropNode$a$a r2 = androidx.compose.ui.draganddrop.DragAndDropNode.a.C0055a.a
            androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstChildOrNull$1 r3 = new androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstChildOrNull$1
            r3.<init>()
            defpackage.ms8.c(r4, r2, r3)
            T r1 = r1.element
            iu1 r1 = (defpackage.iu1) r1
        L30:
            if (r1 == 0) goto L3f
            if (r0 != 0) goto L3f
            ku1 r0 = r4.t
            if (r0 == 0) goto L3b
            r0.g1(r5)
        L3b:
            defpackage.ju1.b(r1, r5)
            goto L6c
        L3f:
            if (r1 != 0) goto L4e
            if (r0 == 0) goto L4e
            r0.g1(r5)
            ku1 r0 = r4.t
            if (r0 == 0) goto L6c
            defpackage.ju1.b(r0, r5)
            goto L6c
        L4e:
            boolean r2 = defpackage.zq3.c(r1, r0)
            if (r2 != 0) goto L5f
            if (r0 == 0) goto L59
            r0.g1(r5)
        L59:
            if (r1 == 0) goto L6c
            defpackage.ju1.b(r1, r5)
            goto L6c
        L5f:
            if (r1 == 0) goto L65
            r1.p1(r5)
            goto L6c
        L65:
            ku1 r0 = r4.t
            if (r0 == 0) goto L6c
            r0.p1(r5)
        L6c:
            r4.s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draganddrop.DragAndDropNode.p1(gu1):void");
    }

    @Override // defpackage.ku1
    public boolean x0(gu1 gu1Var) {
        iu1 iu1Var = this.s;
        if (iu1Var != null) {
            return iu1Var.x0(gu1Var);
        }
        ku1 ku1Var = this.t;
        if (ku1Var != null) {
            return ku1Var.x0(gu1Var);
        }
        return false;
    }

    @Override // defpackage.ls8
    public Object y() {
        return this.r;
    }
}
