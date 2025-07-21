package com.comscore.android.task;

/* loaded from: classes2.dex */
class b extends Thread {
    private boolean a = false;
    private Object b = new Object();
    private TaskExecutor c;
    private TaskExceptionHandler d;

    b(TaskExecutor taskExecutor, TaskExceptionHandler taskExceptionHandler) {
        this.d = taskExceptionHandler;
        this.c = taskExecutor;
    }

    void a() {
        synchronized (this.b) {
            this.b.notify();
        }
    }

    void b() {
        this.a = true;
    }

    boolean c() {
        return this.a;
    }

    void d() {
        long b = this.c.b();
        if (b > 0) {
            a(b);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        TaskExceptionHandler taskExceptionHandler;
        while (!c()) {
            a a = this.c.a();
            if (a != null) {
                a.run();
                if (a.b() != null && (taskExceptionHandler = this.d) != null) {
                    taskExceptionHandler.exception(a.b(), this.c, a.f());
                }
                this.c.a(a);
                if (a.j()) {
                    this.c.execute(a.f(), a.e(), a.e());
                }
            } else {
                d();
            }
        }
    }

    private void a(long j) {
        synchronized (this.b) {
            try {
                this.b.wait(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
