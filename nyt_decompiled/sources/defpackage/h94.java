package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class h94 {
    private static final Object a = new Object();
    private static volatile h94 b = null;
    private static final int c = 20;

    public static class a extends h94 {
        private final int d;

        public a(int i) {
            super(i);
            this.d = i;
        }

        @Override // defpackage.h94
        public void a(String str, String str2) {
            if (this.d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // defpackage.h94
        public void b(String str, String str2, Throwable th) {
            if (this.d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // defpackage.h94
        public void c(String str, String str2) {
            if (this.d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // defpackage.h94
        public void d(String str, String str2, Throwable th) {
            if (this.d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // defpackage.h94
        public void f(String str, String str2) {
            if (this.d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // defpackage.h94
        public void g(String str, String str2, Throwable th) {
            if (this.d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // defpackage.h94
        public void j(String str, String str2) {
            if (this.d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // defpackage.h94
        public void k(String str, String str2) {
            if (this.d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // defpackage.h94
        public void l(String str, String str2, Throwable th) {
            if (this.d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public h94(int i) {
    }

    public static h94 e() {
        h94 h94Var;
        synchronized (a) {
            try {
                if (b == null) {
                    b = new a(3);
                }
                h94Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h94Var;
    }

    public static void h(h94 h94Var) {
        synchronized (a) {
            try {
                if (b == null) {
                    b = h94Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = c;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
