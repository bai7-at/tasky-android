package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcef;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class ona {
    qia a;
    boolean b;
    private final ExecutorService c;

    public ona() {
        this.c = pfb.b;
    }

    public ona(final Context context) {
        ExecutorService executorService = pfb.b;
        this.c = executorService;
        executorService.execute(new Runnable() { // from class: jna
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) pla.c().a(mpa.O4)).booleanValue();
                ona onaVar = ona.this;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        onaVar.a = (qia) igb.b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new hgb() { // from class: kna
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.hgb
                            public final Object zza(Object obj) {
                                return pia.w6(obj);
                            }
                        });
                        onaVar.a.zze(fc5.l3(context2), "GMA_SDK");
                        onaVar.b = true;
                    } catch (RemoteException | zzcef | NullPointerException unused) {
                        fgb.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
