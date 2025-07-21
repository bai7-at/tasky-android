package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import defpackage.by0;
import defpackage.fd5;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.vx5;
import defpackage.ww8;
import defpackage.xh8;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public abstract class LongPressTextDragObserverKt {
    public static final Object c(fy5 fy5Var, xh8 xh8Var, by0 by0Var) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(fy5Var, xh8Var, null), by0Var);
        return coroutineScope == kotlin.coroutines.intrinsics.a.h() ? coroutineScope : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(fy5 fy5Var, final xh8 xh8Var, by0 by0Var) {
        Object d = DragGestureDetectorKt.d(fy5Var, new ss2() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$2
            {
                super(1);
            }

            public final void b(long j) {
                xh8.this.d(j);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((fd5) obj).x());
                return ww8.a;
            }
        }, new qs2() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m25invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25invoke() {
                xh8.this.a();
            }
        }, new qs2() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$4
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m26invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26invoke() {
                xh8.this.b();
            }
        }, new gt2() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$5
            {
                super(2);
            }

            public final void b(vx5 vx5Var, long j) {
                xh8.this.f(j);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((vx5) obj, ((fd5) obj2).x());
                return ww8.a;
            }
        }, by0Var);
        return d == kotlin.coroutines.intrinsics.a.h() ? d : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(fy5 fy5Var, xh8 xh8Var, by0 by0Var) {
        Object c = ForEachGestureKt.c(fy5Var, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(xh8Var, null), by0Var);
        return c == kotlin.coroutines.intrinsics.a.h() ? c : ww8.a;
    }
}
