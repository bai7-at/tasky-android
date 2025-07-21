package com.datadog.android.core.internal.system;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.system.SystemInfo;
import defpackage.dg4;
import defpackage.fl8;
import defpackage.oe8;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class BroadcastReceiverSystemInfoProvider extends fl8 implements oe8 {
    public static final a e = new a(null);
    private static final Set f = b0.j(SystemInfo.BatteryStatus.CHARGING, SystemInfo.BatteryStatus.FULL);
    private static final Set g = b0.j(1, 4, 2);
    private final InternalLogger c;
    private SystemInfo d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public BroadcastReceiverSystemInfoProvider(InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        this.c = internalLogger;
        this.d = new SystemInfo(false, 0, false, false, 15, null);
    }

    private final void f(Intent intent) {
        boolean z = true;
        int intExtra = intent.getIntExtra("status", 1);
        int intExtra2 = intent.getIntExtra("level", -1);
        int intExtra3 = intent.getIntExtra("scale", 100);
        int intExtra4 = intent.getIntExtra("plugged", -1);
        SystemInfo.BatteryStatus a2 = SystemInfo.BatteryStatus.Companion.a(intExtra);
        boolean booleanExtra = intent.getBooleanExtra("present", true);
        int d = dg4.d((intExtra2 * 100.0f) / intExtra3);
        if (!g.contains(Integer.valueOf(intExtra4)) && booleanExtra) {
            z = false;
        }
        this.d = SystemInfo.b(this.d, f.contains(a2), d, false, z, 4, null);
    }

    private final void g(Context context) {
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        this.d = SystemInfo.b(this.d, false, 0, powerManager != null ? powerManager.isPowerSaveMode() : false, false, 11, null);
    }

    private final void h(Context context, String str) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        Intent d = d(context, intentFilter);
        if (d != null) {
            onReceive(context, d);
        }
    }

    @Override // defpackage.oe8
    public void a(Context context) {
        zq3.h(context, "context");
        h(context, "android.intent.action.BATTERY_CHANGED");
        h(context, "android.os.action.POWER_SAVE_MODE_CHANGED");
    }

    @Override // defpackage.oe8
    public void b(Context context) {
        zq3.h(context, "context");
        e(context);
    }

    @Override // defpackage.oe8
    public SystemInfo c() {
        return this.d;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zq3.h(context, "context");
        final String action = intent != null ? intent.getAction() : null;
        if (zq3.c(action, "android.intent.action.BATTERY_CHANGED")) {
            f(intent);
        } else if (zq3.c(action, "android.os.action.POWER_SAVE_MODE_CHANGED")) {
            g(context);
        } else {
            InternalLogger.b.b(this.c, InternalLogger.Level.DEBUG, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider$onReceive$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Received unknown broadcast intent: [" + action + "]";
                }
            }, null, false, null, 56, null);
        }
    }
}
