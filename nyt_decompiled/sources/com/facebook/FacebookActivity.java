package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import com.facebook.login.LoginFragment;
import defpackage.c11;
import defpackage.c25;
import defpackage.g29;
import defpackage.j92;
import defpackage.m12;
import defpackage.ti6;
import defpackage.w92;
import defpackage.xf6;
import defpackage.zq3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class FacebookActivity extends f {
    public static final a b = new a(null);
    private static final String c;
    private Fragment a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String name = FacebookActivity.class.getName();
        zq3.g(name, "FacebookActivity::class.java.name");
        c = name;
    }

    private final void K() {
        Intent intent = getIntent();
        c25 c25Var = c25.a;
        zq3.g(intent, "requestIntent");
        FacebookException t = c25.t(c25.y(intent));
        Intent intent2 = getIntent();
        zq3.g(intent2, "intent");
        setResult(0, c25.n(intent2, null, t));
        finish();
    }

    public final Fragment I() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.Fragment, androidx.fragment.app.e, j92] */
    protected Fragment J() {
        LoginFragment loginFragment;
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        zq3.g(supportFragmentManager, "supportFragmentManager");
        Fragment k0 = supportFragmentManager.k0("SingleFragment");
        if (k0 != null) {
            return k0;
        }
        if (zq3.c("FacebookDialogFragment", intent.getAction())) {
            ?? j92Var = new j92();
            j92Var.setRetainInstance(true);
            j92Var.show(supportFragmentManager, "SingleFragment");
            loginFragment = j92Var;
        } else {
            LoginFragment loginFragment2 = new LoginFragment();
            loginFragment2.setRetainInstance(true);
            supportFragmentManager.p().c(xf6.com_facebook_fragment_container, loginFragment2, "SingleFragment").h();
            loginFragment = loginFragment2;
        }
        return loginFragment;
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(str, "prefix");
            zq3.h(printWriter, "writer");
            m12.a.a();
            if (zq3.c(null, Boolean.TRUE)) {
                return;
            }
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        zq3.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.a;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!w92.E()) {
            g29 g29Var = g29.a;
            g29.f0(c, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            zq3.g(applicationContext, "applicationContext");
            w92.L(applicationContext);
        }
        setContentView(ti6.com_facebook_activity_layout);
        if (zq3.c("PassThrough", intent.getAction())) {
            K();
        } else {
            this.a = J();
        }
    }
}
