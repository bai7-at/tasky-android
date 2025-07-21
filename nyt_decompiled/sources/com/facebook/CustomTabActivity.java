package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import defpackage.b74;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class CustomTabActivity extends Activity {
    public static final a b = new a(null);
    public static final String c = zq3.q(CustomTabActivity.class.getSimpleName(), ".action_customTabRedirect");
    public static final String d = zq3.q(CustomTabActivity.class.getSimpleName(), ".action_destroy");
    private BroadcastReceiver a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            zq3.h(context, "context");
            zq3.h(intent, "intent");
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(c);
            intent2.putExtra(CustomTabMainActivity.g, getIntent().getDataString());
            b74.b(this).d(intent2);
            b bVar = new b();
            b74.b(this).c(bVar, new IntentFilter(d));
            this.a = bVar;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(c);
        intent.putExtra(CustomTabMainActivity.g, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            b74.b(this).e(broadcastReceiver);
        }
        super.onDestroy();
    }
}
