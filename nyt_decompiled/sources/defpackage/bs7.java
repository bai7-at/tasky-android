package defpackage;

import android.content.Context;
import com.google.ads.interactivemedia.pal.PlatformSignalCollector;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class bs7 implements PlatformSignalCollector {
    private final b5c a = new b5c();

    @Override // com.google.ads.interactivemedia.pal.PlatformSignalCollector
    public og8 collectSignals(final Context context, ExecutorService executorService) {
        final qg8 qg8Var = new qg8();
        context.getClass();
        executorService.getClass();
        executorService.execute(new Runnable() { // from class: cie
            @Override // java.lang.Runnable
            public final void run() {
                qg8 qg8Var2 = qg8Var;
                try {
                    qg8Var2.c(b5c.b(context));
                } catch (IllegalStateException e) {
                    qg8Var2.b(e);
                }
            }
        });
        return qg8Var.a();
    }
}
