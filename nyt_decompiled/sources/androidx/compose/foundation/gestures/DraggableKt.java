package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.Modifier;
import defpackage.a30;
import defpackage.by0;
import defpackage.dy4;
import defpackage.fd5;
import defpackage.hd5;
import defpackage.it2;
import defpackage.nx5;
import defpackage.qs2;
import defpackage.qu1;
import defpackage.ss2;
import defpackage.u49;
import defpackage.vu1;
import defpackage.vx5;
import defpackage.ww8;
import defpackage.y49;
import kotlinx.coroutines.channels.SendChannel;

/* loaded from: classes.dex */
public abstract class DraggableKt {
    private static final qu1 a = new a();

    public static final class a implements qu1 {
        a() {
        }

        @Override // defpackage.qu1
        public void c(float f) {
        }
    }

    public static final vu1 a(ss2 ss2Var) {
        return new DefaultDraggableState(ss2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01fb -> B:17:0x0171). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0244 -> B:13:0x0248). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x027d -> B:16:0x0251). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.a30 r20, defpackage.ss2 r21, defpackage.qs2 r22, androidx.compose.ui.input.pointer.util.a r23, defpackage.mx5 r24, defpackage.by0 r25) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.h(a30, ss2, qs2, androidx.compose.ui.input.pointer.util.a, mx5, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(a30 a30Var, vx5 vx5Var, long j, final androidx.compose.ui.input.pointer.util.a aVar, final SendChannel sendChannel, final boolean z, ss2 ss2Var, by0 by0Var) {
        sendChannel.mo129trySendJP2dKIU(new a.c(fd5.s(vx5Var.i(), hd5.a(fd5.o(j) * Math.signum(fd5.o(vx5Var.i())), fd5.p(j) * Math.signum(fd5.p(vx5Var.i())))), null));
        sendChannel.mo129trySendJP2dKIU(new a.b(z ? fd5.u(j, -1.0f) : j, null));
        return l(a30Var, ss2Var, vx5Var.g(), new ss2() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(vx5 vx5Var2) {
                y49.c(androidx.compose.ui.input.pointer.util.a.this, vx5Var2);
                if (nx5.d(vx5Var2)) {
                    return;
                }
                long g = nx5.g(vx5Var2);
                vx5Var2.a();
                SendChannel<a> sendChannel2 = sendChannel;
                if (z) {
                    g = fd5.u(g, -1.0f);
                }
                sendChannel2.mo129trySendJP2dKIU(new a.b(g, null));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((vx5) obj);
                return ww8.a;
            }
        }, by0Var);
    }

    public static final Modifier j(Modifier modifier, vu1 vu1Var, Orientation orientation, boolean z, dy4 dy4Var, final boolean z2, it2 it2Var, it2 it2Var2, boolean z3) {
        return modifier.h(new DraggableElement(vu1Var, new ss2() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$3
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(vx5 vx5Var) {
                return Boolean.TRUE;
            }
        }, orientation, z, dy4Var, new qs2() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.valueOf(z2);
            }
        }, it2Var, new DraggableKt$draggable$5(it2Var2, orientation, null), z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (((java.lang.Boolean) r1.invoke(r14)).booleanValue() != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0085 -> B:10:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.a30 r17, defpackage.ss2 r18, long r19, defpackage.ss2 r21, defpackage.by0 r22) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.l(a30, ss2, long, ss2, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float m(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? fd5.p(j) : fd5.o(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float n(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? u49.i(j) : u49.h(j);
    }
}
