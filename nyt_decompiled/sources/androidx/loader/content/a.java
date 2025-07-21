package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import defpackage.jm8;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class a extends b {
    private final Executor i;
    volatile RunnableC0088a j;
    volatile RunnableC0088a k;
    long l;
    long m;
    Handler n;

    /* renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    final class RunnableC0088a extends ModernAsyncTask implements Runnable {
        private final CountDownLatch k = new CountDownLatch(1);
        boolean l;

        RunnableC0088a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void g(Object obj) {
            try {
                a.this.x(this, obj);
            } finally {
                this.k.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void h(Object obj) {
            try {
                a.this.y(this, obj);
            } finally {
                this.k.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Object b(Void... voidArr) {
            try {
                return a.this.C();
            } catch (OperationCanceledException e) {
                if (this.f()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.l = false;
            a.this.z();
        }
    }

    public a(Context context) {
        this(context, ModernAsyncTask.h);
    }

    public abstract Object A();

    public void B(Object obj) {
    }

    protected Object C() {
        return A();
    }

    @Override // androidx.loader.content.b
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            printWriter.println(this.j.l);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.l);
        }
        if (this.l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            jm8.c(this.l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            jm8.b(this.m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // androidx.loader.content.b
    protected boolean k() {
        if (this.j == null) {
            return false;
        }
        if (!this.d) {
            this.g = true;
        }
        if (this.k != null) {
            if (this.j.l) {
                this.j.l = false;
                this.n.removeCallbacks(this.j);
            }
            this.j = null;
            return false;
        }
        if (this.j.l) {
            this.j.l = false;
            this.n.removeCallbacks(this.j);
            this.j = null;
            return false;
        }
        boolean a = this.j.a(false);
        if (a) {
            this.k = this.j;
            w();
        }
        this.j = null;
        return a;
    }

    @Override // androidx.loader.content.b
    protected void m() {
        super.m();
        b();
        this.j = new RunnableC0088a();
        z();
    }

    public void w() {
    }

    void x(RunnableC0088a runnableC0088a, Object obj) {
        B(obj);
        if (this.k == runnableC0088a) {
            s();
            this.m = SystemClock.uptimeMillis();
            this.k = null;
            e();
            z();
        }
    }

    void y(RunnableC0088a runnableC0088a, Object obj) {
        if (this.j != runnableC0088a) {
            x(runnableC0088a, obj);
            return;
        }
        if (i()) {
            B(obj);
            return;
        }
        c();
        this.m = SystemClock.uptimeMillis();
        this.j = null;
        f(obj);
    }

    void z() {
        if (this.k != null || this.j == null) {
            return;
        }
        if (this.j.l) {
            this.j.l = false;
            this.n.removeCallbacks(this.j);
        }
        if (this.l <= 0 || SystemClock.uptimeMillis() >= this.m + this.l) {
            this.j.c(this.i, null);
        } else {
            this.j.l = true;
            this.n.postAtTime(this.j, this.m + this.l);
        }
    }

    private a(Context context, Executor executor) {
        super(context);
        this.m = -10000L;
        this.i = executor;
    }
}
