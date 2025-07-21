package com.skydoves.balloon;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class f {
    public static final a a = new a(null);
    private static volatile f b;
    private static SharedPreferences c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Context context) {
            zq3.h(context, "context");
            f fVar = f.b;
            if (fVar == null) {
                synchronized (this) {
                    fVar = f.b;
                    if (fVar == null) {
                        fVar = new f(null);
                        f.b = fVar;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.skydoves.balloon", 0);
                        zq3.g(sharedPreferences, "getSharedPreferences(...)");
                        f.c = sharedPreferences;
                    }
                }
            }
            return fVar;
        }

        public final String b(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return "SHOWED_UP" + str;
        }

        private a() {
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int d(String str) {
        SharedPreferences sharedPreferences = c;
        if (sharedPreferences == null) {
            zq3.z("sharedPreferenceManager");
            sharedPreferences = null;
        }
        return sharedPreferences.getInt(a.b(str), 0);
    }

    private final void e(String str, int i) {
        SharedPreferences sharedPreferences = c;
        if (sharedPreferences == null) {
            zq3.z("sharedPreferenceManager");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zq3.g(edit, "editor");
        edit.putInt(a.b(str), i);
        edit.apply();
    }

    public final void f(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        e(str, d(str) + 1);
    }

    public final boolean g(String str, int i) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return d(str) < i;
    }

    private f() {
    }
}
