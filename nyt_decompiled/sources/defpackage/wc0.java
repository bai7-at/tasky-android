package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class wc0 extends dv0 {
    private final BroadcastReceiver f;

    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            zq3.h(context, "context");
            zq3.h(intent, "intent");
            wc0.this.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc0(Context context, rg8 rg8Var) {
        super(context, rg8Var);
        zq3.h(context, "context");
        zq3.h(rg8Var, "taskExecutor");
        this.f = new a();
    }

    @Override // defpackage.dv0
    public void h() {
        String str;
        h94 e = h94.e();
        str = xc0.a;
        e.a(str, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f, j());
    }

    @Override // defpackage.dv0
    public void i() {
        String str;
        h94 e = h94.e();
        str = xc0.a;
        e.a(str, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
