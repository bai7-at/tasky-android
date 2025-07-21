package com.google.firebase.installations;

import android.text.TextUtils;
import defpackage.fe8;
import defpackage.wl0;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class h {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    private static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static h d;
    private final wl0 a;

    private h(wl0 wl0Var) {
        this.a = wl0Var;
    }

    public static h c() {
        return d(fe8.a());
    }

    public static h d(wl0 wl0Var) {
        if (d == null) {
            d = new h(wl0Var);
        }
        return d;
    }

    static boolean g(String str) {
        return c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(com.google.firebase.installations.local.b bVar) {
        return TextUtils.isEmpty(bVar.b()) || bVar.h() + bVar.c() < b() + b;
    }
}
