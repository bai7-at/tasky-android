package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.ads.interactivemedia.pal.zzat;
import com.google.android.gms.internal.pal.zzagc;
import com.google.android.gms.internal.pal.zzil;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class iia extends ipa {
    private final vm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iia(Handler handler, ExecutorService executorService, Context context) {
        super(handler, executorService, zzagc.b(2L));
        vm g = g(context);
        this.e = g;
    }

    private static vm g(Context context) {
        try {
            return um.a(context);
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            Log.e("NonceGenerator", "Failed to contact the App Set SDK.", e);
            return null;
        }
    }

    @Override // defpackage.ipa
    final zzil a() {
        vm vmVar = this.e;
        if (vmVar == null) {
            return zzil.e();
        }
        try {
            return zzil.f((wm) vg8.b(vmVar.b(), zzat.zzd.zzd(), TimeUnit.MILLISECONDS));
        } catch (InterruptedException | NoClassDefFoundError | NoSuchMethodError | ExecutionException | TimeoutException e) {
            Log.e("NonceGenerator", "Failed to get the App Set ID.", e);
            return zzil.e();
        }
    }
}
