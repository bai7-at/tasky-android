package androidx.compose.ui.window;

import android.os.Handler;
import android.os.Looper;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class PopupLayout$snapshotStateObserver$1 extends Lambda implements ss2 {
    final /* synthetic */ PopupLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PopupLayout$snapshotStateObserver$1(PopupLayout popupLayout) {
        super(1);
        this.this$0 = popupLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(qs2 qs2Var) {
        qs2Var.mo865invoke();
    }

    public final void c(final qs2 qs2Var) {
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            qs2Var.mo865invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: androidx.compose.ui.window.a
                @Override // java.lang.Runnable
                public final void run() {
                    PopupLayout$snapshotStateObserver$1.d(qs2.this);
                }
            });
        }
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        c((qs2) obj);
        return ww8.a;
    }
}
