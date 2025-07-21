package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import defpackage.an3;
import defpackage.kt6;
import defpackage.ss2;
import defpackage.vy4;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;

/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    public static final int b = vy4.d;
    private final vy4 a = new vy4(new ContentInViewNode.a[16], 0);

    public final void b(Throwable th) {
        vy4 vy4Var = this.a;
        int q = vy4Var.q();
        CancellableContinuation[] cancellableContinuationArr = new CancellableContinuation[q];
        for (int i = 0; i < q; i++) {
            cancellableContinuationArr[i] = ((ContentInViewNode.a) vy4Var.p()[i]).a();
        }
        for (int i2 = 0; i2 < q; i2++) {
            cancellableContinuationArr[i2].cancel(th);
        }
        if (!this.a.s()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(final ContentInViewNode.a aVar) {
        kt6 kt6Var = (kt6) aVar.b().mo865invoke();
        if (kt6Var == null) {
            CancellableContinuation a = aVar.a();
            Result.a aVar2 = Result.a;
            a.resumeWith(Result.b(ww8.a));
            return false;
        }
        aVar.a().invokeOnCancellation(new ss2() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$enqueue$1
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
                vy4 vy4Var;
                vy4Var = BringIntoViewRequestPriorityQueue.this.a;
                vy4Var.w(aVar);
            }
        });
        an3 an3Var = new an3(0, this.a.q() - 1);
        int g = an3Var.g();
        int j = an3Var.j();
        if (g <= j) {
            while (true) {
                kt6 kt6Var2 = (kt6) ((ContentInViewNode.a) this.a.p()[j]).b().mo865invoke();
                if (kt6Var2 != null) {
                    kt6 p = kt6Var.p(kt6Var2);
                    if (zq3.c(p, kt6Var)) {
                        this.a.a(j + 1, aVar);
                        return true;
                    }
                    if (!zq3.c(p, kt6Var2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int q = this.a.q() - 1;
                        if (q <= j) {
                            while (true) {
                                ((ContentInViewNode.a) this.a.p()[j]).a().cancel(cancellationException);
                                if (q == j) {
                                    break;
                                }
                                q++;
                            }
                        }
                    }
                }
                if (j == g) {
                    break;
                }
                j--;
            }
        }
        this.a.a(0, aVar);
        return true;
    }

    public final void d() {
        an3 an3Var = new an3(0, this.a.q() - 1);
        int g = an3Var.g();
        int j = an3Var.j();
        if (g <= j) {
            while (true) {
                ((ContentInViewNode.a) this.a.p()[g]).a().resumeWith(Result.b(ww8.a));
                if (g == j) {
                    break;
                } else {
                    g++;
                }
            }
        }
        this.a.h();
    }
}
