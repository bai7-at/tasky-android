package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import defpackage.j64;
import defpackage.rg8;
import defpackage.sk9;
import defpackage.wo2;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class b {
    private Context a;
    private WorkerParameters b;
    private final AtomicInteger c = new AtomicInteger(-256);
    private boolean d;

    public static abstract class a {

        /* renamed from: androidx.work.b$a$a, reason: collision with other inner class name */
        public static final class C0121a extends a {
            private final Data a;

            public C0121a() {
                this(Data.c);
            }

            public Data e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0121a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0121a) obj).a);
            }

            public int hashCode() {
                return (C0121a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }

            public C0121a(Data data) {
                this.a = data;
            }
        }

        /* renamed from: androidx.work.b$a$b, reason: collision with other inner class name */
        public static final class C0122b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C0122b.class == obj.getClass();
            }

            public int hashCode() {
                return C0122b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {
            private final Data a;

            public c() {
                this(Data.c);
            }

            public Data e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }

            public c(Data data) {
                this.a = data;
            }
        }

        a() {
        }

        public static a a() {
            return new C0121a();
        }

        public static a b() {
            return new C0122b();
        }

        public static a c() {
            return new c();
        }

        public static a d(Data data) {
            return new c(data);
        }
    }

    public b(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context;
        this.b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.a;
    }

    public Executor getBackgroundExecutor() {
        return this.b.a();
    }

    public abstract j64 getForegroundInfoAsync();

    public final UUID getId() {
        return this.b.c();
    }

    public final Data getInputData() {
        return this.b.d();
    }

    public final Network getNetwork() {
        return this.b.e();
    }

    public final int getRunAttemptCount() {
        return this.b.g();
    }

    public final int getStopReason() {
        return this.c.get();
    }

    public final Set<String> getTags() {
        return this.b.h();
    }

    public rg8 getTaskExecutor() {
        return this.b.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.b.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.b.k();
    }

    public sk9 getWorkerFactory() {
        return this.b.m();
    }

    public final boolean isStopped() {
        return this.c.get() != -256;
    }

    public final boolean isUsed() {
        return this.d;
    }

    public void onStopped() {
    }

    public final j64 setForegroundAsync(wo2 wo2Var) {
        return this.b.b().a(getApplicationContext(), getId(), wo2Var);
    }

    public j64 setProgressAsync(Data data) {
        return this.b.f().a(getApplicationContext(), getId(), data);
    }

    public final void setUsed() {
        this.d = true;
    }

    public abstract j64 startWork();

    public final void stop(int i) {
        if (this.c.compareAndSet(-256, i)) {
            onStopped();
        }
    }
}
