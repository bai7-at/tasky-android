package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import defpackage.cg0;
import defpackage.u18;

/* loaded from: classes4.dex */
class t {
    final HandlerThread a;
    final cg0 b;
    final Handler c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    long k;
    int l;
    int m;
    int n;

    private static class a extends Handler {
        private final t a;

        /* renamed from: com.squareup.picasso.t$a$a, reason: collision with other inner class name */
        class RunnableC0474a implements Runnable {
            final /* synthetic */ Message a;

            RunnableC0474a(Message message) {
                this.a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.a.what);
            }
        }

        a(Looper looper, t tVar) {
            super(looper);
            this.a = tVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.a.j();
                return;
            }
            if (i == 1) {
                this.a.k();
                return;
            }
            if (i == 2) {
                this.a.h(message.arg1);
                return;
            }
            if (i == 3) {
                this.a.i(message.arg1);
            } else if (i != 4) {
                Picasso.o.post(new RunnableC0474a(message));
            } else {
                this.a.l((Long) message.obj);
            }
        }
    }

    t(cg0 cg0Var) {
        this.b = cg0Var;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.a = handlerThread;
        handlerThread.start();
        w.i(handlerThread.getLooper());
        this.c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i, long j) {
        return j / i;
    }

    private void m(Bitmap bitmap, int i) {
        int j = w.j(bitmap);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(i, j, 0));
    }

    u18 a() {
        return new u18(this.b.a(), this.b.size(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, System.currentTimeMillis());
    }

    void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    void d() {
        this.c.sendEmptyMessage(0);
    }

    void e() {
        this.c.sendEmptyMessage(1);
    }

    void f(long j) {
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    void h(long j) {
        int i = this.m + 1;
        this.m = i;
        long j2 = this.g + j;
        this.g = j2;
        this.j = g(i, j2);
    }

    void i(long j) {
        this.n++;
        long j2 = this.h + j;
        this.h = j2;
        this.k = g(this.m, j2);
    }

    void j() {
        this.d++;
    }

    void k() {
        this.e++;
    }

    void l(Long l) {
        this.l++;
        long longValue = this.f + l.longValue();
        this.f = longValue;
        this.i = g(this.l, longValue);
    }
}
