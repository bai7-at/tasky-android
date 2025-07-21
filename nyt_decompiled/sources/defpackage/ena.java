package defpackage;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.internal.ads.zzbbb;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class ena {
    private vma a;
    private boolean b;
    private final Context c;
    private final Object d = new Object();

    ena(Context context) {
        this.c = context;
    }

    static /* bridge */ /* synthetic */ void e(ena enaVar) {
        synchronized (enaVar.d) {
            try {
                vma vmaVar = enaVar.a;
                if (vmaVar == null) {
                    return;
                }
                vmaVar.disconnect();
                enaVar.a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final Future c(zzbbb zzbbbVar) {
        yma ymaVar = new yma(this);
        cna cnaVar = new cna(this, zzbbbVar, ymaVar);
        dna dnaVar = new dna(this, ymaVar);
        synchronized (this.d) {
            vma vmaVar = new vma(this.c, dyf.v().b(), cnaVar, dnaVar);
            this.a = vmaVar;
            vmaVar.checkAvailabilityAndConnect();
        }
        return ymaVar;
    }
}
