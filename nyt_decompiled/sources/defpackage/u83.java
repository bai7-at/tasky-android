package defpackage;

import android.content.Context;
import android.content.Intent;
import com.nytimes.android.share.ShareBroadcastReceiver;

/* loaded from: classes4.dex */
public abstract class u83 extends e83 {
    private volatile boolean a = false;
    private final Object b = new Object();

    protected void a(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.a) {
                    ((op7) vc0.a(context)).m((ShareBroadcastReceiver) nx8.a(this));
                    this.a = true;
                }
            } finally {
            }
        }
    }

    @Override // defpackage.e83, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
        super.onReceive(context, intent);
    }
}
