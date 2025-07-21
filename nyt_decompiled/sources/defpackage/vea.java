package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.google.ads.interactivemedia.pal.zzx;
import com.google.android.gms.internal.pal.zzagc;
import com.google.android.gms.internal.pal.zzil;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class vea extends ipa {
    private final zzx e;
    private final og8 f;
    private final Context g;

    public vea(Handler handler, ExecutorService executorService, Context context, og8 og8Var, zzx zzxVar) {
        super(handler, executorService, zzagc.b(2L));
        this.g = context;
        this.f = og8Var;
        this.e = zzxVar;
    }

    @Override // defpackage.ipa
    final zzil a() {
        try {
            return zzil.f(((o6e) vg8.a(this.f)).b(this.g, null));
        } catch (RemoteException | InterruptedException | ExecutionException unused) {
            Log.e("NonceGenerator", "Unexpected exception while gathering request signals.");
            this.e.zza(1);
            return zzil.e();
        }
    }
}
