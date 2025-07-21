package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
class a {
    private static a e;
    private final Object a = new Object();
    private final Handler b = new Handler(Looper.getMainLooper(), new C0206a());
    private c c;
    private c d;

    /* renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    class C0206a implements Handler.Callback {
        C0206a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    interface b {
        void a();

        void b(int i);
    }

    private static class c {
        final WeakReference a;
        int b;
        boolean c;

        c(int i, b bVar) {
            this.a = new WeakReference(bVar);
            this.b = i;
        }

        boolean a(b bVar) {
            return bVar != null && this.a.get() == bVar;
        }
    }

    private a() {
    }

    private boolean a(c cVar, int i) {
        b bVar = (b) cVar.a.get();
        if (bVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(cVar);
        bVar.b(i);
        return true;
    }

    static a c() {
        if (e == null) {
            e = new a();
        }
        return e;
    }

    private boolean f(b bVar) {
        c cVar = this.c;
        return cVar != null && cVar.a(bVar);
    }

    private boolean g(b bVar) {
        c cVar = this.d;
        return cVar != null && cVar.a(bVar);
    }

    private void l(c cVar) {
        int i = cVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.b.removeCallbacksAndMessages(cVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    private void n() {
        c cVar = this.d;
        if (cVar != null) {
            this.c = cVar;
            this.d = null;
            b bVar = (b) cVar.a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.c = null;
            }
        }
    }

    public void b(b bVar, int i) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    a(this.c, i);
                } else if (g(bVar)) {
                    a(this.d, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(c cVar) {
        synchronized (this.a) {
            try {
                if (this.c != cVar) {
                    if (this.d == cVar) {
                    }
                }
                a(cVar, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z;
        synchronized (this.a) {
            try {
                z = f(bVar) || g(bVar);
            } finally {
            }
        }
        return z;
    }

    public void h(b bVar) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    this.c = null;
                    if (this.d != null) {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    l(this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    c cVar = this.c;
                    if (!cVar.c) {
                        cVar.c = true;
                        this.b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    c cVar = this.c;
                    if (cVar.c) {
                        cVar.c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(int i, b bVar) {
        synchronized (this.a) {
            try {
                if (f(bVar)) {
                    c cVar = this.c;
                    cVar.b = i;
                    this.b.removeCallbacksAndMessages(cVar);
                    l(this.c);
                    return;
                }
                if (g(bVar)) {
                    this.d.b = i;
                } else {
                    this.d = new c(i, bVar);
                }
                c cVar2 = this.c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.c = null;
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
