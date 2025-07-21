package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class fl8 extends BroadcastReceiver {
    public static final a b = new a(null);
    private final AtomicBoolean a = new AtomicBoolean(false);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final Intent d(Context context, IntentFilter intentFilter) {
        zq3.h(context, "context");
        zq3.h(intentFilter, "filter");
        Intent registerReceiver = Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(this, intentFilter, 4) : context.registerReceiver(this, intentFilter, 4);
        this.a.set(true);
        return registerReceiver;
    }

    public final void e(Context context) {
        zq3.h(context, "context");
        if (this.a.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }
}
