package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import defpackage.by0;
import defpackage.cc0;
import defpackage.dy4;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.hm5;
import defpackage.it2;
import defpackage.iv4;
import defpackage.iy5;
import defpackage.n76;
import defpackage.qc7;
import defpackage.qk2;
import defpackage.qs2;
import defpackage.sc7;
import defpackage.ss2;
import defpackage.tc7;
import defpackage.uc0;
import defpackage.vx5;
import defpackage.zv4;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class ScrollableKt {
    private static final ss2 a = new ss2() { // from class: androidx.compose.foundation.gestures.ScrollableKt$CanDragCalculation$1
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(vx5 vx5Var) {
            return Boolean.valueOf(!iy5.g(vx5Var.o(), iy5.a.b()));
        }
    };
    private static final it2 b = new ScrollableKt$NoOpOnDragStarted$1(null);
    private static final qc7 c = new c();
    private static final n76 d = iv4.a(new qs2() { // from class: androidx.compose.foundation.gestures.ScrollableKt$ModifierLocalScrollableContainer$1
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Boolean mo865invoke() {
            return Boolean.FALSE;
        }
    });
    private static final qk2 e = new b();
    private static final zv4 f = new a();
    private static final d g = new d();

    public static final class a implements zv4 {
        a() {
        }

        @Override // defpackage.zv4
        public float d() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext
        public Object fold(Object obj, gt2 gt2Var) {
            return zv4.a.a(this, obj, gt2Var);
        }

        @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
        public CoroutineContext.a get(CoroutineContext.b bVar) {
            return zv4.a.b(this, bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext minusKey(CoroutineContext.b bVar) {
            return zv4.a.c(this, bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext plus(CoroutineContext coroutineContext) {
            return zv4.a.d(this, coroutineContext);
        }
    }

    public static final class b implements qk2 {
        b() {
        }

        @Override // defpackage.qk2
        public Object a(qc7 qc7Var, float f, by0 by0Var) {
            return cc0.b(0.0f);
        }
    }

    public static final class c implements qc7 {
        c() {
        }

        @Override // defpackage.qc7
        public float a(float f) {
            return f;
        }
    }

    public static final class d implements fm1 {
        d() {
        }

        @Override // defpackage.an2
        public float c1() {
            return 1.0f;
        }

        @Override // defpackage.fm1
        public float getDensity() {
            return 1.0f;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.a30 r5, defpackage.by0 r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            a30 r5 = (defpackage.a30) r5
            kotlin.f.b(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
        L38:
            r0.L$0 = r5
            r0.label = r3
            r6 = 0
            java.lang.Object r6 = defpackage.a30.d0(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.c r6 = (androidx.compose.ui.input.pointer.c) r6
            int r2 = r6.f()
            androidx.compose.ui.input.pointer.d$a r4 = androidx.compose.ui.input.pointer.d.a
            int r4 = r4.f()
            boolean r2 = androidx.compose.ui.input.pointer.d.i(r2, r4)
            if (r2 == 0) goto L38
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.f(a30, by0):java.lang.Object");
    }

    public static final zv4 g() {
        return f;
    }

    public static final n76 h() {
        return d;
    }

    public static final Modifier i(Modifier modifier, tc7 tc7Var, Orientation orientation, hm5 hm5Var, boolean z, boolean z2, qk2 qk2Var, dy4 dy4Var, uc0 uc0Var) {
        return modifier.h(new ScrollableElement(tc7Var, orientation, hm5Var, z, z2, qk2Var, dy4Var, uc0Var));
    }

    public static final Modifier j(Modifier modifier, tc7 tc7Var, Orientation orientation, boolean z, boolean z2, qk2 qk2Var, dy4 dy4Var) {
        return k(modifier, tc7Var, orientation, null, z, z2, qk2Var, dy4Var, null, 128, null);
    }

    public static /* synthetic */ Modifier k(Modifier modifier, tc7 tc7Var, Orientation orientation, hm5 hm5Var, boolean z, boolean z2, qk2 qk2Var, dy4 dy4Var, uc0 uc0Var, int i, Object obj) {
        return i(modifier, tc7Var, orientation, hm5Var, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : qk2Var, (i & 64) != 0 ? null : dy4Var, (i & 128) != 0 ? sc7.a.a() : uc0Var);
    }

    public static /* synthetic */ Modifier l(Modifier modifier, tc7 tc7Var, Orientation orientation, boolean z, boolean z2, qk2 qk2Var, dy4 dy4Var, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return j(modifier, tc7Var, orientation, z3, z2, (i & 16) != 0 ? null : qk2Var, (i & 32) != 0 ? null : dy4Var);
    }
}
