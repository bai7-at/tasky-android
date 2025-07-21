package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class lld implements gqd {
    private final kke a;
    private final Context b;

    lld(kke kkeVar, Context context) {
        this.a = kkeVar;
        this.b = context;
    }

    final /* synthetic */ mld a() {
        double d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) pla.c().a(mpa.wa)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.b.registerReceiver(null, intentFilter) : this.b.registerReceiver(null, intentFilter, 4);
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            double intExtra2 = registerReceiver.getIntExtra("level", -1);
            double intExtra3 = registerReceiver.getIntExtra("scale", -1);
            r0 = intExtra == 2 || intExtra == 5;
            d = intExtra2 / intExtra3;
        } else {
            d = -1.0d;
        }
        return new mld(d, r0);
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 14;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: kld
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lld.this.a();
            }
        });
    }
}
