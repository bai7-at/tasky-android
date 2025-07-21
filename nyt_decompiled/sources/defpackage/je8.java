package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.r63;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class je8 implements r63 {
    private static final List b = new ArrayList(50);
    private final Handler a;

    private static final class b implements r63.a {
        private Message a;
        private je8 b;

        private b() {
        }

        private void b() {
            this.a = null;
            this.b = null;
            je8.n(this);
        }

        @Override // r63.a
        public void a() {
            ((Message) ur.e(this.a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) ur.e(this.a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, je8 je8Var) {
            this.a = message;
            this.b = je8Var;
            return this;
        }
    }

    public je8(Handler handler) {
        this.a = handler;
    }

    private static b m() {
        b bVar;
        List list = b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(b bVar) {
        List list = b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r63
    public r63.a a(int i) {
        return m().d(this.a.obtainMessage(i), this);
    }

    @Override // defpackage.r63
    public boolean b(int i) {
        return this.a.hasMessages(i);
    }

    @Override // defpackage.r63
    public r63.a c(int i, Object obj) {
        return m().d(this.a.obtainMessage(i, obj), this);
    }

    @Override // defpackage.r63
    public void d(Object obj) {
        this.a.removeCallbacksAndMessages(obj);
    }

    @Override // defpackage.r63
    public Looper e() {
        return this.a.getLooper();
    }

    @Override // defpackage.r63
    public r63.a f(int i, int i2, int i3) {
        return m().d(this.a.obtainMessage(i, i2, i3), this);
    }

    @Override // defpackage.r63
    public boolean g(r63.a aVar) {
        return ((b) aVar).c(this.a);
    }

    @Override // defpackage.r63
    public boolean h(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // defpackage.r63
    public boolean i(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // defpackage.r63
    public boolean j(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }

    @Override // defpackage.r63
    public void k(int i) {
        this.a.removeMessages(i);
    }
}
