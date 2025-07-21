package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import defpackage.by5;
import defpackage.cz3;
import defpackage.fd5;
import defpackage.gy5;
import defpackage.pq3;
import defpackage.ss2;
import defpackage.vx5;
import defpackage.ww8;
import java.util.List;

/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends by5 {
    private PointerInteropFilter.DispatchToViewState b = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter c;

    PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.c = pointerInteropFilter;
    }

    private final void h(c cVar) {
        List c = cVar.c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            if (((vx5) c.get(i)).q()) {
                if (this.b == PointerInteropFilter.DispatchToViewState.Dispatching) {
                    cz3 b = b();
                    if (b == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    long g0 = b.g0(fd5.b.c());
                    final PointerInteropFilter pointerInteropFilter = this.c;
                    gy5.b(cVar, g0, new ss2() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                        {
                            super(1);
                        }

                        public final void b(MotionEvent motionEvent) {
                            PointerInteropFilter.this.r().invoke(motionEvent);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((MotionEvent) obj);
                            return ww8.a;
                        }
                    });
                }
                this.b = PointerInteropFilter.DispatchToViewState.NotDispatching;
                return;
            }
        }
        cz3 b2 = b();
        if (b2 == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        long g02 = b2.g0(fd5.b.c());
        final PointerInteropFilter pointerInteropFilter2 = this.c;
        gy5.c(cVar, g02, new ss2() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    pointerInteropFilter2.r().invoke(motionEvent);
                } else {
                    PointerInteropFilter$pointerInputFilter$1.this.b = ((Boolean) pointerInteropFilter2.r().invoke(motionEvent)).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((MotionEvent) obj);
                return ww8.a;
            }
        });
        if (this.b == PointerInteropFilter.DispatchToViewState.Dispatching) {
            int size2 = c.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((vx5) c.get(i2)).a();
            }
            pq3 d = cVar.d();
            if (d == null) {
                return;
            }
            d.e(!this.c.l());
        }
    }

    private final void i() {
        this.b = PointerInteropFilter.DispatchToViewState.Unknown;
        this.c.t(false);
    }

    @Override // defpackage.by5
    public boolean c() {
        return true;
    }

    @Override // defpackage.by5
    public void d() {
        if (this.b == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long uptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.c;
            gy5.a(uptimeMillis, new ss2() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                public final void b(MotionEvent motionEvent) {
                    PointerInteropFilter.this.r().invoke(motionEvent);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((MotionEvent) obj);
                    return ww8.a;
                }
            });
            i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.by5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(androidx.compose.ui.input.pointer.c r5, androidx.compose.ui.input.pointer.PointerEventPass r6, long r7) {
        /*
            r4 = this;
            java.util.List r7 = r5.c()
            androidx.compose.ui.input.pointer.PointerInteropFilter r8 = r4.c
            boolean r8 = r8.l()
            r0 = 0
            if (r8 != 0) goto L2c
            int r8 = r7.size()
            r1 = r0
        L12:
            if (r1 >= r8) goto L2a
            java.lang.Object r2 = r7.get(r1)
            vx5 r2 = (defpackage.vx5) r2
            boolean r3 = defpackage.nx5.b(r2)
            if (r3 != 0) goto L2c
            boolean r2 = defpackage.nx5.d(r2)
            if (r2 == 0) goto L27
            goto L2c
        L27:
            int r1 = r1 + 1
            goto L12
        L2a:
            r8 = r0
            goto L2d
        L2c:
            r8 = 1
        L2d:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r1 = r4.b
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r2 = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching
            if (r1 == r2) goto L45
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            if (r6 != r1) goto L3c
            if (r8 == 0) goto L3c
            r4.h(r5)
        L3c:
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            if (r6 != r1) goto L45
            if (r8 != 0) goto L45
            r4.h(r5)
        L45:
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            if (r6 != r5) goto L62
            int r5 = r7.size()
        L4d:
            if (r0 >= r5) goto L5f
            java.lang.Object r6 = r7.get(r0)
            vx5 r6 = (defpackage.vx5) r6
            boolean r6 = defpackage.nx5.d(r6)
            if (r6 != 0) goto L5c
            goto L62
        L5c:
            int r0 = r0 + 1
            goto L4d
        L5f:
            r4.i()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.e(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }
}
