package androidx.compose.ui.viewinterop;

import android.os.Handler;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends Lambda implements ss2 {
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 a = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1();

    AndroidViewHolder$Companion$OnCommitAffectingUpdate$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(qs2 qs2Var) {
        qs2Var.mo865invoke();
    }

    public final void c(AndroidViewHolder androidViewHolder) {
        final qs2 qs2Var;
        Handler handler = androidViewHolder.getHandler();
        qs2Var = androidViewHolder.r;
        handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.d(qs2.this);
            }
        });
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        c((AndroidViewHolder) obj);
        return ww8.a;
    }
}
