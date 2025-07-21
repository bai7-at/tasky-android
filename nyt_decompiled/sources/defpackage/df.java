package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.u;
import defpackage.m07;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public abstract class df {

    public static final class a extends m07.e {
        final /* synthetic */ CancellableContinuation a;
        final /* synthetic */ u b;

        a(CancellableContinuation cancellableContinuation, u uVar) {
            this.a = cancellableContinuation;
            this.b = uVar;
        }

        @Override // m07.e
        /* renamed from: h */
        public void f(int i) {
            this.a.cancel(new IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ')'));
        }

        @Override // m07.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            this.a.resumeWith(Result.b(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(u uVar, Context context) {
        Typeface g = m07.g(context, uVar.d());
        zq3.e(g);
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(u uVar, Context context, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        m07.i(context, uVar.d(), new a(cancellableContinuationImpl, uVar), null);
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }
}
