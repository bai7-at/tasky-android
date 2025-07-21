package com.datadog.android.core.internal.logger;

import android.util.Log;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class LogcatLogHandler {
    public static final a c = new a(null);
    private final String a;
    private final ss2 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LogcatLogHandler(String str, ss2 ss2Var) {
        zq3.h(str, "tag");
        zq3.h(ss2Var, "predicate");
        this.a = str;
        this.b = ss2Var;
    }

    private final String c() {
        this.a.length();
        return this.a;
    }

    public final boolean a(int i) {
        return ((Boolean) this.b.invoke(Integer.valueOf(i))).booleanValue();
    }

    public final void b(int i, String str, Throwable th) {
        zq3.h(str, "message");
        if (((Boolean) this.b.invoke(Integer.valueOf(i))).booleanValue()) {
            String c2 = c();
            Log.println(i, c2, str);
            if (th != null) {
                Log.println(i, c2, Log.getStackTraceString(th));
            }
        }
    }

    public /* synthetic */ LogcatLogHandler(String str, ss2 ss2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new ss2() { // from class: com.datadog.android.core.internal.logger.LogcatLogHandler.1
            public final Boolean b(int i2) {
                return Boolean.TRUE;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        } : ss2Var);
    }
}
