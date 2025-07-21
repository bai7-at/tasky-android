package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.d3b;
import defpackage.fc5;
import defpackage.kgc;
import defpackage.kia;
import defpackage.vi6;
import defpackage.yf6;

@KeepForSdk
/* loaded from: classes2.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        kgc f = kia.a().f(this, new d3b());
        if (f == null) {
            finish();
            return;
        }
        setContentView(vi6.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(yf6.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            f.B1(stringExtra, fc5.l3(this), fc5.l3(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
