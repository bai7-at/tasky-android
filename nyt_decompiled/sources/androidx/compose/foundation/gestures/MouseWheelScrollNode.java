package androidx.compose.foundation.gestures;

import defpackage.a30;
import defpackage.bd8;
import defpackage.by0;
import defpackage.ct0;
import defpackage.fc1;
import defpackage.fy5;
import defpackage.gg;
import defpackage.gt2;
import defpackage.oc7;
import defpackage.ul1;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

/* loaded from: classes.dex */
final class MouseWheelScrollNode extends ul1 implements ct0 {
    private final ScrollingLogic s;
    private oc7 t;

    @fc1(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1", f = "Scrollable.kt", l = {669}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        private /* synthetic */ Object L$0;
        int label;

        @fc1(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1", f = "Scrollable.kt", l = {671}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00221 extends RestrictedSuspendLambda implements gt2 {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MouseWheelScrollNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00221(MouseWheelScrollNode mouseWheelScrollNode, by0 by0Var) {
                super(2, by0Var);
                this.this$0 = mouseWheelScrollNode;
            }

            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(a30 a30Var, by0 by0Var) {
                return ((C00221) create(a30Var, by0Var)).invokeSuspend(ww8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                C00221 c00221 = new C00221(this.this$0, by0Var);
                c00221.L$0 = obj;
                return c00221;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[EDGE_INSN: B:15:0x004c->B:16:0x004c BREAK  A[LOOP:0: B:6:0x003a->B:9:0x0049], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                    int r1 = r14.label
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r14.L$0
                    a30 r1 = (defpackage.a30) r1
                    kotlin.f.b(r15)
                    goto L2e
                L13:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r15)
                    throw r14
                L1b:
                    kotlin.f.b(r15)
                    java.lang.Object r15 = r14.L$0
                    a30 r15 = (defpackage.a30) r15
                    r1 = r15
                L23:
                    r14.L$0 = r1
                    r14.label = r2
                    java.lang.Object r15 = androidx.compose.foundation.gestures.ScrollableKt.a(r1, r14)
                    if (r15 != r0) goto L2e
                    return r0
                L2e:
                    androidx.compose.ui.input.pointer.c r15 = (androidx.compose.ui.input.pointer.c) r15
                    java.util.List r3 = r15.c()
                    int r4 = r3.size()
                    r5 = 0
                    r6 = r5
                L3a:
                    if (r6 >= r4) goto L4c
                    java.lang.Object r7 = r3.get(r6)
                    vx5 r7 = (defpackage.vx5) r7
                    boolean r7 = r7.q()
                    if (r7 == 0) goto L49
                    goto L23
                L49:
                    int r6 = r6 + 1
                    goto L3a
                L4c:
                    androidx.compose.foundation.gestures.MouseWheelScrollNode r3 = r14.this$0
                    oc7 r3 = r3.k2()
                    defpackage.zq3.e(r3)
                    androidx.compose.foundation.gestures.MouseWheelScrollNode r4 = r14.this$0
                    long r6 = r1.a()
                    long r6 = r3.a(r1, r15, r6)
                    androidx.compose.foundation.gestures.ScrollingLogic r3 = androidx.compose.foundation.gestures.MouseWheelScrollNode.j2(r4)
                    kotlinx.coroutines.CoroutineScope r8 = r4.E1()
                    androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1 r11 = new androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1
                    r4 = 0
                    r11.<init>(r3, r6, r4)
                    r12 = 3
                    r13 = 0
                    r9 = 0
                    r10 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r8, r9, r10, r11, r12, r13)
                    java.util.List r15 = r15.c()
                    int r3 = r15.size()
                L7c:
                    if (r5 >= r3) goto L23
                    java.lang.Object r4 = r15.get(r5)
                    vx5 r4 = (defpackage.vx5) r4
                    r4.a()
                    int r5 = r5 + 1
                    goto L7c
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollNode.AnonymousClass1.C00221.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fy5 fy5Var, by0 by0Var) {
            return ((AnonymousClass1) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = MouseWheelScrollNode.this.new AnonymousClass1(by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                fy5 fy5Var = (fy5) this.L$0;
                C00221 c00221 = new C00221(MouseWheelScrollNode.this, null);
                this.label = 1;
                if (fy5Var.X(c00221, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }
    }

    public MouseWheelScrollNode(ScrollingLogic scrollingLogic) {
        this.s = scrollingLogic;
        e2(bd8.a(new AnonymousClass1(null)));
    }

    @Override // androidx.compose.ui.Modifier.c
    public void O1() {
        this.t = gg.a(this);
    }

    public final oc7 k2() {
        return this.t;
    }
}
