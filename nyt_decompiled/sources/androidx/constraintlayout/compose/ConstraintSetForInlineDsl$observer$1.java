package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class ConstraintSetForInlineDsl$observer$1 extends Lambda implements ss2 {
    final /* synthetic */ ConstraintSetForInlineDsl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintSetForInlineDsl$observer$1(ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(1);
        this.this$0 = constraintSetForInlineDsl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(qs2 qs2Var) {
        zq3.h(qs2Var, "$tmp0");
        qs2Var.mo865invoke();
    }

    public final void c(final qs2 qs2Var) {
        Handler handler;
        zq3.h(qs2Var, "it");
        if (zq3.c(Looper.myLooper(), Looper.getMainLooper())) {
            qs2Var.mo865invoke();
            return;
        }
        handler = this.this$0.b;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.this$0.b = handler;
        }
        handler.post(new Runnable() { // from class: androidx.constraintlayout.compose.e
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintSetForInlineDsl$observer$1.d(qs2.this);
            }
        });
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        c((qs2) obj);
        return ww8.a;
    }
}
