package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.login.LoginTargetApp;
import defpackage.b74;
import defpackage.c25;
import defpackage.g29;
import defpackage.nl3;
import defpackage.z41;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class CustomTabMainActivity extends Activity {
    public static final a c = new a(null);
    public static final String d = zq3.q(CustomTabMainActivity.class.getSimpleName(), ".extra_action");
    public static final String e = zq3.q(CustomTabMainActivity.class.getSimpleName(), ".extra_params");
    public static final String f = zq3.q(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");
    public static final String g = zq3.q(CustomTabMainActivity.class.getSimpleName(), ".extra_url");
    public static final String h = zq3.q(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");
    public static final String i = zq3.q(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");
    public static final String j = zq3.q(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");
    private boolean a = true;
    private BroadcastReceiver b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle b(String str) {
            Uri parse = Uri.parse(str);
            g29 g29Var = g29.a;
            Bundle k0 = g29.k0(parse.getQuery());
            k0.putAll(g29.k0(parse.getFragment()));
            return k0;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoginTargetApp.valuesCustom().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            a = iArr;
        }
    }

    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            zq3.h(context, "context");
            zq3.h(intent, "intent");
            Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.i);
            String str = CustomTabMainActivity.g;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    private final void a(int i2, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver != null) {
            b74.b(this).e(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(g);
            Bundle b2 = stringExtra != null ? c.b(stringExtra) : new Bundle();
            c25 c25Var = c25.a;
            Intent intent2 = getIntent();
            zq3.g(intent2, "intent");
            Intent n = c25.n(intent2, b2, null);
            if (n != null) {
                intent = n;
            }
            setResult(i2, intent);
        } else {
            c25 c25Var2 = c25.a;
            Intent intent3 = getIntent();
            zq3.g(intent3, "intent");
            setResult(i2, c25.n(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        String str = CustomTabActivity.c;
        if (zq3.c(str, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra(d)) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(e);
        boolean a2 = (b.a[LoginTargetApp.Companion.a(getIntent().getStringExtra(h)).ordinal()] == 1 ? new nl3(stringExtra, bundleExtra) : new z41(stringExtra, bundleExtra)).a(this, getIntent().getStringExtra(f));
        this.a = false;
        if (!a2) {
            setResult(0, getIntent().putExtra(j, true));
            finish();
        } else {
            c cVar = new c();
            this.b = cVar;
            b74.b(this).c(cVar, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        zq3.h(intent, "intent");
        super.onNewIntent(intent);
        if (zq3.c(i, intent.getAction())) {
            b74.b(this).d(new Intent(CustomTabActivity.d));
            a(-1, intent);
        } else if (zq3.c(CustomTabActivity.c, intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.a) {
            a(0, null);
        }
        this.a = true;
    }
}
