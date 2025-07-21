package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import defpackage.cy0;
import defpackage.gh4;
import defpackage.hi2;
import defpackage.nz8;
import defpackage.o37;
import defpackage.og8;
import defpackage.q76;
import defpackage.uh2;
import defpackage.vg8;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
class m {
    private final uh2 a;
    private final o b;
    private final o37 c;
    private final q76 d;
    private final q76 e;
    private final hi2 f;

    m(uh2 uh2Var, o oVar, q76 q76Var, q76 q76Var2, hi2 hi2Var) {
        this(uh2Var, oVar, new o37(uh2Var.j()), q76Var, q76Var2, hi2Var);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private og8 c(og8 og8Var) {
        return og8Var.i(new gh4(), new cy0() { // from class: com.google.firebase.messaging.l
            @Override // defpackage.cy0
            public final Object then(og8 og8Var2) {
                String h;
                h = m.this.h(og8Var2);
                return h;
            }
        });
    }

    private String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.a.l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String h(og8 og8Var) {
        return f((Bundle) og8Var.n(IOException.class));
    }

    private void i(String str, String str2, Bundle bundle) {
        HeartBeatInfo.HeartBeat b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.a.m().c());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b2 = ((com.google.firebase.installations.f) vg8.a(this.f.a(false))).b();
            if (TextUtils.isEmpty(b2)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) vg8.a(this.f.getId()));
        bundle.putString("cliv", "fcm-23.0.4");
        HeartBeatInfo heartBeatInfo = (HeartBeatInfo) this.e.get();
        nz8 nz8Var = (nz8) this.d.get();
        if (heartBeatInfo == null || nz8Var == null || (b = heartBeatInfo.b("fire-iid")) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(b.getCode()));
        bundle.putString("Firebase-Client", nz8Var.a());
    }

    private og8 j(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.c.a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return vg8.d(e);
        }
    }

    og8 e() {
        return c(j(o.c(this.a), "*", new Bundle()));
    }

    og8 k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(j(str, "/topics/" + str2, bundle));
    }

    og8 l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        return c(j(str, "/topics/" + str2, bundle));
    }

    m(uh2 uh2Var, o oVar, o37 o37Var, q76 q76Var, q76 q76Var2, hi2 hi2Var) {
        this.a = uh2Var;
        this.b = oVar;
        this.c = o37Var;
        this.d = q76Var;
        this.e = q76Var2;
        this.f = hi2Var;
    }
}
