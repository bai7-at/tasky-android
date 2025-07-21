package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes2.dex */
public abstract class a84 {
    private static int b = 0;
    private static boolean c = true;
    private static final Object a = new Object();
    private static a d = a.a;

    public interface a {
        public static final a a = new C0000a();

        /* renamed from: a84$a$a, reason: collision with other inner class name */
        class C0000a implements a {
            C0000a() {
            }

            @Override // a84.a
            public void d(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // a84.a
            public void e(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // a84.a
            public void i(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // a84.a
            public void w(String str, String str2) {
                Log.w(str, str2);
            }
        }

        void d(String str, String str2);

        void e(String str, String str2);

        void i(String str, String str2);

        void w(String str, String str2);
    }

    private static String a(String str, Throwable th) {
        String f = f(th);
        if (TextUtils.isEmpty(f)) {
            return str;
        }
        return str + "\n  " + f.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (a) {
            try {
                if (b == 0) {
                    d.d(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    public static void d(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 3) {
                    d.e(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    public static String f(Throwable th) {
        synchronized (a) {
            try {
                if (th == null) {
                    return null;
                }
                if (i(th)) {
                    return "UnknownHostException (no network)";
                }
                if (c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void g(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 1) {
                    d.i(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h(String str, String str2, Throwable th) {
        g(str, a(str2, th));
    }

    private static boolean i(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void j(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 2) {
                    d.w(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k(String str, String str2, Throwable th) {
        j(str, a(str2, th));
    }
}
