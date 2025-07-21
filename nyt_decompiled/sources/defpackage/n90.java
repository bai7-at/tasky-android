package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class n90 extends BroadcastReceiver {
    private static n90 c;
    private final Context a;
    public static final a b = new a(null);
    private static final String d = "com.parse.bolts.measurement_event";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n90 a(Context context) {
            zq3.h(context, "context");
            if (n90.a() != null) {
                return n90.a();
            }
            n90 n90Var = new n90(context, null);
            n90.b(n90Var);
            n90.c(n90Var);
            return n90.a();
        }

        private a() {
        }
    }

    public /* synthetic */ n90(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final /* synthetic */ n90 a() {
        if (c11.d(n90.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            c11.b(th, n90.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(n90 n90Var) {
        if (c11.d(n90.class)) {
            return;
        }
        try {
            n90Var.e();
        } catch (Throwable th) {
            c11.b(th, n90.class);
        }
    }

    public static final /* synthetic */ void c(n90 n90Var) {
        if (c11.d(n90.class)) {
            return;
        }
        try {
            c = n90Var;
        } catch (Throwable th) {
            c11.b(th, n90.class);
        }
    }

    private final void d() {
        if (c11.d(this)) {
            return;
        }
        try {
            b74 b2 = b74.b(this.a);
            zq3.g(b2, "getInstance(applicationContext)");
            b2.e(this);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void e() {
        if (c11.d(this)) {
            return;
        }
        try {
            b74 b2 = b74.b(this.a);
            zq3.g(b2, "getInstance(applicationContext)");
            b2.c(this, new IntentFilter(d));
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final void finalize() {
        if (c11.d(this)) {
            return;
        }
        try {
            d();
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (c11.d(this)) {
            return;
        }
        try {
            kq3 kq3Var = new kq3(context);
            Set<String> set = null;
            String q = zq3.q("bf_", intent == null ? null : intent.getStringExtra("event_name"));
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String str : set) {
                    zq3.g(str, TransferTable.COLUMN_KEY);
                    bundle.putString(new Regex("[ -]*$").e(new Regex("^[ -]*").e(new Regex("[^0-9a-zA-Z _-]").e(str, "-"), ""), ""), (String) bundleExtra.get(str));
                }
            }
            kq3Var.d(q, bundle);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private n90(Context context) {
        Context applicationContext = context.getApplicationContext();
        zq3.g(applicationContext, "context.applicationContext");
        this.a = applicationContext;
    }
}
