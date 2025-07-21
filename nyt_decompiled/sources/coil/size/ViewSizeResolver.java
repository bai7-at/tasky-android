package coil.size;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import coil.size.ViewSizeResolver;
import defpackage.au7;
import defpackage.by0;
import defpackage.fu7;
import defpackage.g;
import defpackage.hc1;
import defpackage.oq1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public interface ViewSizeResolver extends fu7 {

    public static final class DefaultImpls {

        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            private boolean a;
            final /* synthetic */ ViewSizeResolver b;
            final /* synthetic */ ViewTreeObserver c;
            final /* synthetic */ CancellableContinuation d;

            a(ViewSizeResolver viewSizeResolver, ViewTreeObserver viewTreeObserver, CancellableContinuation cancellableContinuation) {
                this.b = viewSizeResolver;
                this.c = viewTreeObserver;
                this.d = cancellableContinuation;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                au7 e = DefaultImpls.e(this.b);
                if (e != null) {
                    DefaultImpls.g(this.b, this.c, this);
                    if (!this.a) {
                        this.a = true;
                        this.d.resumeWith(Result.b(e));
                    }
                }
                return true;
            }
        }

        private static oq1 c(ViewSizeResolver viewSizeResolver, int i, int i2, int i3) {
            if (i == -2) {
                return oq1.b.a;
            }
            int i4 = i - i3;
            if (i4 > 0) {
                return g.a(i4);
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return g.a(i5);
            }
            return null;
        }

        private static oq1 d(ViewSizeResolver viewSizeResolver) {
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            return c(viewSizeResolver, layoutParams != null ? layoutParams.height : -1, viewSizeResolver.getView().getHeight(), viewSizeResolver.l() ? viewSizeResolver.getView().getPaddingTop() + viewSizeResolver.getView().getPaddingBottom() : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static au7 e(ViewSizeResolver viewSizeResolver) {
            oq1 d;
            oq1 f = f(viewSizeResolver);
            if (f == null || (d = d(viewSizeResolver)) == null) {
                return null;
            }
            return new au7(f, d);
        }

        private static oq1 f(ViewSizeResolver viewSizeResolver) {
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            return c(viewSizeResolver, layoutParams != null ? layoutParams.width : -1, viewSizeResolver.getView().getWidth(), viewSizeResolver.l() ? viewSizeResolver.getView().getPaddingLeft() + viewSizeResolver.getView().getPaddingRight() : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void g(ViewSizeResolver viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                viewSizeResolver.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }

        public static Object h(final ViewSizeResolver viewSizeResolver, by0 by0Var) {
            au7 e = e(viewSizeResolver);
            if (e != null) {
                return e;
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            final ViewTreeObserver viewTreeObserver = viewSizeResolver.getView().getViewTreeObserver();
            final a aVar = new a(viewSizeResolver, viewTreeObserver, cancellableContinuationImpl);
            viewTreeObserver.addOnPreDrawListener(aVar);
            cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: coil.size.ViewSizeResolver$size$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return ww8.a;
                }

                public final void invoke(Throwable th) {
                    ViewSizeResolver.DefaultImpls.g(ViewSizeResolver.this, viewTreeObserver, aVar);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result;
        }
    }

    View getView();

    boolean l();
}
