package com.comscore.android.task;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public class TaskExecutor {
    private static final long a = 50000;
    private com.comscore.android.task.b b;
    private BlockingQueue<com.comscore.android.task.a> c;
    private boolean d;
    private TaskExceptionHandler e;

    class a implements TaskExceptionHandler {
        a() {
        }

        @Override // com.comscore.android.task.TaskExceptionHandler
        public void exception(Exception exc, TaskExecutor taskExecutor, Runnable runnable) {
            exc.printStackTrace();
        }
    }

    class b implements Runnable {
        final /* synthetic */ Runnable a;

        b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } catch (Exception e) {
                if (TaskExecutor.this.e != null) {
                    TaskExecutor.this.e.exception(e, TaskExecutor.this, this.a);
                }
            }
        }
    }

    public TaskExecutor() {
        this(new a());
    }

    long b() {
        Iterator<com.comscore.android.task.a> it2 = this.c.iterator();
        long j = a;
        while (it2.hasNext()) {
            j = Math.min(j, it2.next().d());
        }
        return j;
    }

    public boolean containsTask(Runnable runnable) {
        for (com.comscore.android.task.a aVar : this.c) {
            if (aVar.f() == runnable) {
                return true;
            }
            if ((runnable instanceof com.comscore.android.task.a) && aVar == runnable) {
                return true;
            }
        }
        return false;
    }

    public boolean execute(Runnable runnable) {
        return execute(runnable, true);
    }

    public boolean executeInMainThread(Runnable runnable) {
        if (this.d) {
            return new Handler(Looper.getMainLooper()).post(new b(runnable));
        }
        return false;
    }

    public boolean isEnabled() {
        return this.d;
    }

    public void removeAllEnqueuedTasks() {
        ArrayList arrayList = new ArrayList();
        for (com.comscore.android.task.a aVar : this.c) {
            if (aVar.g()) {
                arrayList.add(aVar);
            }
        }
        this.c.removeAll(arrayList);
    }

    public boolean removeEnqueuedTask(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        for (com.comscore.android.task.a aVar : this.c) {
            if (aVar.f() == runnable) {
                return this.c.remove(aVar);
            }
        }
        return false;
    }

    public void setEnabled(boolean z) {
        this.d = z;
    }

    public int size() {
        return this.c.size();
    }

    public void waitForLastNonDelayedTaskToFinish() {
        com.comscore.android.task.a aVar;
        int size = this.c.size();
        com.comscore.android.task.a[] aVarArr = new com.comscore.android.task.a[size];
        this.c.toArray(aVarArr);
        int i = size - 1;
        while (true) {
            if (i >= 0) {
                com.comscore.android.task.a aVar2 = aVarArr[i];
                if (aVar2 != null && !aVar2.h()) {
                    aVar = aVarArr[i];
                    break;
                }
                i--;
            } else {
                aVar = null;
                break;
            }
        }
        waitForTaskToFinish(aVar, 0L);
    }

    public void waitForTaskToFinish(Runnable runnable, long j) {
        com.comscore.android.task.a aVar;
        if (!(runnable instanceof com.comscore.android.task.a)) {
            Iterator<com.comscore.android.task.a> it2 = this.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    aVar = null;
                    break;
                } else {
                    aVar = it2.next();
                    if (aVar.f() == runnable) {
                        break;
                    }
                }
            }
        } else {
            aVar = (com.comscore.android.task.a) runnable;
        }
        if (aVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            while (this.c.contains(aVar)) {
                if (j > 0 && System.currentTimeMillis() >= currentTimeMillis + j) {
                    return;
                }
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void waitForTasks() {
        while (this.c.size() != 0) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public TaskExecutor(TaskExceptionHandler taskExceptionHandler) {
        this.d = true;
        this.e = taskExceptionHandler;
        this.c = new LinkedBlockingQueue();
        com.comscore.android.task.b bVar = new com.comscore.android.task.b(this, this.e);
        this.b = bVar;
        bVar.start();
    }

    com.comscore.android.task.a a() {
        for (com.comscore.android.task.a aVar : this.c) {
            if (aVar.c() <= System.currentTimeMillis()) {
                return aVar;
            }
        }
        return null;
    }

    public boolean execute(Runnable runnable, long j) {
        return execute(runnable, j, 0L);
    }

    void a(com.comscore.android.task.a aVar) {
        this.c.remove(aVar);
    }

    public boolean execute(Runnable runnable, long j, long j2) {
        return execute(runnable, j, j2, false);
    }

    public boolean execute(Runnable runnable, long j, long j2, boolean z) {
        if (!this.d) {
            return false;
        }
        for (com.comscore.android.task.a aVar : this.c) {
            if (aVar != null && aVar.f() == runnable) {
                return false;
            }
        }
        this.c.add(new com.comscore.android.task.a(runnable, j, j2, z));
        this.b.a();
        return true;
    }

    public boolean execute(Runnable runnable, boolean z) {
        if (z) {
            return execute(runnable, 0L);
        }
        if (!this.d) {
            return false;
        }
        try {
            runnable.run();
            return true;
        } catch (Exception e) {
            if (this.e == null) {
                return true;
            }
            this.e.exception(e, this, runnable);
            return true;
        }
    }
}
