package defpackage;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class os3 extends Service {
    static final Object h = new Object();
    static final HashMap i = new HashMap();
    b a;
    g b;
    a c;
    boolean d = false;
    boolean e = false;
    boolean f = false;
    final ArrayList g = null;

    final class a extends AsyncTask {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                d a = os3.this.a();
                if (a == null) {
                    return null;
                }
                os3.this.g(a.getIntent());
                a.complete();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r1) {
            os3.this.i();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            os3.this.i();
        }
    }

    interface b {
        IBinder a();

        d b();
    }

    final class c implements d {
        final Intent a;
        final int b;

        c(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        @Override // os3.d
        public void complete() {
            os3.this.stopSelf(this.b);
        }

        @Override // os3.d
        public Intent getIntent() {
            return this.a;
        }
    }

    interface d {
        void complete();

        Intent getIntent();
    }

    static final class e extends JobServiceEngine implements b {
        final os3 a;
        final Object b;
        JobParameters c;

        final class a implements d {
            final JobWorkItem a;

            a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            @Override // os3.d
            public void complete() {
                synchronized (e.this.b) {
                    try {
                        JobParameters jobParameters = e.this.c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // os3.d
            public Intent getIntent() {
                return this.a.getIntent();
            }
        }

        e(os3 os3Var) {
            super(os3Var);
            this.b = new Object();
            this.a = os3Var;
        }

        @Override // os3.b
        public IBinder a() {
            return getBinder();
        }

        @Override // os3.b
        public d b() {
            synchronized (this.b) {
                try {
                    JobParameters jobParameters = this.c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork == null) {
                        return null;
                    }
                    dequeueWork.getIntent().setExtrasClassLoader(this.a.getClassLoader());
                    return new a(dequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.a.e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.a.b();
            synchronized (this.b) {
                this.c = null;
            }
            return b;
        }
    }

    static final class f extends g {
        private final JobInfo d;
        private final JobScheduler e;

        f(Context context, ComponentName componentName, int i) {
            super(componentName);
            b(i);
            this.d = new JobInfo.Builder(i, this.a).setOverrideDeadline(0L).build();
            this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // os3.g
        void a(Intent intent) {
            this.e.enqueue(this.d, new JobWorkItem(intent));
        }
    }

    static abstract class g {
        final ComponentName a;
        boolean b;
        int c;

        g(ComponentName componentName) {
            this.a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else {
                if (this.c == i) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public static void c(Context context, ComponentName componentName, int i2, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (h) {
            g f2 = f(context, componentName, true, i2);
            f2.b(i2);
            f2.a(intent);
        }
    }

    public static void d(Context context, Class cls, int i2, Intent intent) {
        c(context, new ComponentName(context, (Class<?>) cls), i2, intent);
    }

    static g f(Context context, ComponentName componentName, boolean z, int i2) {
        HashMap hashMap = i;
        g gVar = (g) hashMap.get(componentName);
        if (gVar != null) {
            return gVar;
        }
        if (!z) {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        f fVar = new f(context, componentName, i2);
        hashMap.put(componentName, fVar);
        return fVar;
    }

    d a() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.g) {
            try {
                if (this.g.size() <= 0) {
                    return null;
                }
                return (d) this.g.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean b() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.cancel(this.d);
        }
        this.e = true;
        return h();
    }

    void e(boolean z) {
        if (this.c == null) {
            this.c = new a();
            g gVar = this.b;
            if (gVar != null && z) {
                gVar.d();
            }
            this.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    protected abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    void i() {
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.c = null;
                    ArrayList arrayList2 = this.g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        e(false);
                    } else if (!this.f) {
                        this.b.c();
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = new e(this);
        this.b = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f = true;
                this.b.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (this.g == null) {
            return 2;
        }
        this.b.e();
        synchronized (this.g) {
            ArrayList arrayList = this.g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new c(intent, i3));
            e(true);
        }
        return 3;
    }
}
