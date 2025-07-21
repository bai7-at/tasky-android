package androidx.compose.foundation.gestures;

import defpackage.bu1;
import defpackage.by0;
import defpackage.fd5;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.hd5;
import defpackage.iy5;
import defpackage.mx5;
import defpackage.qs2;
import defpackage.r99;
import defpackage.ss2;
import defpackage.tx5;
import defpackage.vx5;
import defpackage.ww8;
import java.util.List;

/* loaded from: classes.dex */
public abstract class DragGestureDetectorKt {
    private static final mx5 a = new b();
    private static final mx5 b = new c();
    private static final mx5 c = new a();
    private static final float d;
    private static final float e;
    private static final float f;

    public static final class a implements mx5 {
        a() {
        }

        @Override // defpackage.mx5
        public long a(long j, float f) {
            return fd5.s(j, fd5.u(fd5.j(j, b(j)), f));
        }

        @Override // defpackage.mx5
        public float b(long j) {
            return fd5.m(j);
        }
    }

    public static final class b implements mx5 {
        b() {
        }

        @Override // defpackage.mx5
        public long a(long j, float f) {
            return hd5.a(fd5.o(j) - (Math.signum(fd5.o(j)) * f), fd5.p(j));
        }

        @Override // defpackage.mx5
        public float b(long j) {
            return Math.abs(fd5.o(j));
        }
    }

    public static final class c implements mx5 {
        c() {
        }

        @Override // defpackage.mx5
        public long a(long j, float f) {
            return hd5.a(fd5.o(j), fd5.p(j) - (Math.signum(fd5.p(j)) * f));
        }

        @Override // defpackage.mx5
        public float b(long j) {
            return Math.abs(fd5.p(j));
        }
    }

    static {
        float g = bu1.g((float) 0.125d);
        d = g;
        float g2 = bu1.g(18);
        e = g2;
        f = g / g2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (defpackage.nx5.j(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.a30 r17, long r18, defpackage.by0 r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.b(a30, long, by0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Object, vx5] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [vx5] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.a30 r9, long r10, defpackage.by0 r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref$ObjectRef) r9
            java.lang.Object r10 = r0.L$0
            vx5 r10 = (defpackage.vx5) r10
            kotlin.f.b(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9b
            goto La4
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlin.f.b(r12)
            androidx.compose.ui.input.pointer.c r12 = r9.I0()
            boolean r12 = h(r12, r10)
            if (r12 == 0) goto L49
            return r4
        L49:
            androidx.compose.ui.input.pointer.c r12 = r9.I0()
            java.util.List r12 = r12.c()
            int r2 = r12.size()
            r5 = 0
        L56:
            if (r5 >= r2) goto L6d
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            vx5 r7 = (defpackage.vx5) r7
            long r7 = r7.g()
            boolean r7 = defpackage.tx5.d(r7, r10)
            if (r7 == 0) goto L6a
            goto L6e
        L6a:
            int r5 = r5 + 1
            goto L56
        L6d:
            r6 = r4
        L6e:
            r10 = r6
            vx5 r10 = (defpackage.vx5) r10
            if (r10 != 0) goto L74
            return r4
        L74:
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.element = r10
            r99 r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r2.<init>(r12, r11, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.L$0 = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.L$1 = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            java.lang.Object r9 = r9.A0(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9a
            if (r9 != r1) goto La4
            return r1
        L9a:
            r9 = r11
        L9b:
            T r9 = r9.element
            vx5 r9 = (defpackage.vx5) r9
            if (r9 != 0) goto La3
            r4 = r10
            goto La4
        La3:
            r4 = r9
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.c(a30, long, by0):java.lang.Object");
    }

    public static final Object d(fy5 fy5Var, ss2 ss2Var, qs2 qs2Var, qs2 qs2Var2, gt2 gt2Var, by0 by0Var) {
        Object c2 = ForEachGestureKt.c(fy5Var, new DragGestureDetectorKt$detectDragGestures$5(ss2Var, gt2Var, qs2Var2, qs2Var, null), by0Var);
        return c2 == kotlin.coroutines.intrinsics.a.h() ? c2 : ww8.a;
    }

    public static final Object e(fy5 fy5Var, ss2 ss2Var, qs2 qs2Var, qs2 qs2Var2, gt2 gt2Var, by0 by0Var) {
        Object c2 = ForEachGestureKt.c(fy5Var, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(ss2Var, qs2Var, qs2Var2, gt2Var, null), by0Var);
        return c2 == kotlin.coroutines.intrinsics.a.h() ? c2 : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.a30 r4, long r5, defpackage.ss2 r7, defpackage.by0 r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            ss2 r4 = (defpackage.ss2) r4
            java.lang.Object r5 = r0.L$0
            a30 r5 = (defpackage.a30) r5
            kotlin.f.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.f.b(r8)
        L3e:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            vx5 r8 = (defpackage.vx5) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = defpackage.cc0.a(r4)
            return r4
        L55:
            boolean r5 = defpackage.nx5.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = defpackage.cc0.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.g()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.f(a30, long, ss2, by0):java.lang.Object");
    }

    public static final mx5 g() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(androidx.compose.ui.input.pointer.c cVar, long j) {
        Object obj;
        List c2 = cVar.c();
        int size = c2.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = c2.get(i);
            if (tx5.d(((vx5) obj).g(), j)) {
                break;
            }
            i++;
        }
        vx5 vx5Var = (vx5) obj;
        if (vx5Var != null && vx5Var.j()) {
            z = true;
        }
        return true ^ z;
    }

    public static final float i(r99 r99Var, int i) {
        return iy5.g(i, iy5.a.b()) ? r99Var.f() * f : r99Var.f();
    }

    public static final mx5 j(Orientation orientation) {
        return orientation == Orientation.Vertical ? b : a;
    }
}
