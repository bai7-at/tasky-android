package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class x3 extends v5 {
    private char c;
    private long d;
    private String e;
    private final u3 f;
    private final u3 g;
    private final u3 h;
    private final u3 i;
    private final u3 j;
    private final u3 k;
    private final u3 l;
    private final u3 m;
    private final u3 n;

    x3(a5 a5Var) {
        super(a5Var);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new u3(this, 6, false, false);
        this.g = new u3(this, 6, true, false);
        this.h = new u3(this, 6, false, true);
        this.i = new u3(this, 5, false, false);
        this.j = new u3(this, 5, true, false);
        this.k = new u3(this, 5, false, true);
        this.l = new u3(this, 4, false, false);
        this.m = new u3(this, 3, false, false);
        this.n = new u3(this, 2, false, false);
    }

    static String A(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            String str2 = obj.toString().charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof v3)) {
                return z ? "-" : obj.toString();
            }
            str = ((v3) obj).a;
            return str;
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String F = F(a5.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && F(className).equals(F)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb.toString();
    }

    private static String F(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    protected static Object y(String str) {
        if (str == null) {
            return null;
        }
        return new v3(str);
    }

    static String z(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String A = A(z, obj);
        String A2 = A(z, obj2);
        String A3 = A(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(A)) {
            sb.append(str2);
            sb.append(A);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(A2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(A2);
        }
        if (!TextUtils.isEmpty(A3)) {
            sb.append(str3);
            sb.append(A3);
        }
        return sb.toString();
    }

    protected final String B() {
        String str;
        synchronized (this) {
            try {
                if (this.e == null) {
                    if (this.a.P() != null) {
                        this.e = this.a.P();
                    } else {
                        this.e = this.a.y().v();
                    }
                }
                Preconditions.checkNotNull(this.e);
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    protected final void E(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(B(), i)) {
            Log.println(i, B(), z(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        y4 F = this.a.F();
        if (F == null) {
            Log.println(6, B(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!F.j()) {
                Log.println(6, B(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            F.y(new t3(this, i, str, obj, obj2, obj3));
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final boolean f() {
        return false;
    }

    public final u3 m() {
        return this.m;
    }

    public final u3 n() {
        return this.f;
    }

    public final u3 r() {
        return this.h;
    }

    public final u3 s() {
        return this.g;
    }

    public final u3 t() {
        return this.l;
    }

    public final u3 u() {
        return this.n;
    }

    public final u3 v() {
        return this.i;
    }

    public final u3 w() {
        return this.k;
    }

    public final u3 x() {
        return this.j;
    }
}
