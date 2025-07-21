package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class aaf extends gaf implements Future {
    static final boolean d;
    private static final Logger e;
    private static final r9f f;
    private static final Object g;
    private volatile Object a;
    private volatile u9f b;
    private volatile z9f c;

    static {
        boolean z;
        r9f w9fVar;
        Throwable th;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(aaf.class.getName());
        a aVar = null;
        try {
            th = null;
            w9fVar = new y9f(aVar);
            e = null;
        } catch (Error | RuntimeException e2) {
            e = e2;
            try {
                th = null;
                w9fVar = new v9f(AtomicReferenceFieldUpdater.newUpdater(z9f.class, Thread.class, Tag.A), AtomicReferenceFieldUpdater.newUpdater(z9f.class, z9f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(aaf.class, z9f.class, QueryKeys.TIME_ON_VIEW_IN_MINUTES), AtomicReferenceFieldUpdater.newUpdater(aaf.class, u9f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(aaf.class, Object.class, Tag.A));
            } catch (Error | RuntimeException e3) {
                w9fVar = new w9f(aVar);
                th = e3;
            }
        }
        f = w9fVar;
        if (th != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", e);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    protected aaf() {
    }

    private static Object j(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void k(StringBuilder sb) {
        try {
            Object j = j(this);
            sb.append("SUCCESS, result=[");
            if (j == null) {
                sb.append(Constants.NULL_VERSION_ID);
            } else if (j == this) {
                sb.append("this future");
            } else {
                sb.append(j.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(j)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void l(StringBuilder sb) {
        String concat;
        String str;
        int length = sb.length();
        sb.append("PENDING");
        try {
            if (this instanceof ScheduledFuture) {
                str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
            } else {
                str = null;
            }
            concat = d8f.a(str);
        } catch (RuntimeException | StackOverflowError e2) {
            Class<?> cls = e2.getClass();
            cls.toString();
            concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
        }
        if (concat != null) {
            sb.append(", info=[");
            sb.append(concat);
            sb.append("]");
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            k(sb);
        }
    }

    private static void m(aaf aafVar) {
        for (z9f b = f.b(aafVar, z9f.c); b != null; b = b.b) {
            Thread thread = b.a;
            if (thread != null) {
                b.a = null;
                LockSupport.unpark(thread);
            }
        }
        u9f a2 = f.a(aafVar, u9f.d);
        u9f u9fVar = null;
        while (a2 != null) {
            u9f u9fVar2 = a2.c;
            a2.c = u9fVar;
            u9fVar = a2;
            a2 = u9fVar2;
        }
        while (u9fVar != null) {
            u9f u9fVar3 = u9fVar.c;
            Runnable runnable = u9fVar.a;
            runnable.getClass();
            Executor executor = u9fVar.b;
            executor.getClass();
            try {
                executor.execute(runnable);
            } catch (RuntimeException e2) {
                e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
            }
            u9fVar = u9fVar3;
        }
    }

    private final void n(z9f z9fVar) {
        z9fVar.a = null;
        while (true) {
            z9f z9fVar2 = this.c;
            if (z9fVar2 != z9f.c) {
                z9f z9fVar3 = null;
                while (z9fVar2 != null) {
                    z9f z9fVar4 = z9fVar2.b;
                    if (z9fVar2.a != null) {
                        z9fVar3 = z9fVar2;
                    } else if (z9fVar3 != null) {
                        z9fVar3.b = z9fVar4;
                        if (z9fVar3.a == null) {
                            break;
                        }
                    } else if (!f.f(this, z9fVar2, z9fVar4)) {
                        break;
                    }
                    z9fVar2 = z9fVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object o(Object obj) {
        if (obj instanceof s9f) {
            Throwable th = ((s9f) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof t9f) {
            throw new ExecutionException(((t9f) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        s9f s9fVar;
        Object obj = this.a;
        if (obj == null) {
            if (d) {
                s9fVar = new s9f(z, new CancellationException("Future.cancel() was called."));
            } else {
                s9fVar = z ? s9f.c : s9f.d;
                s9fVar.getClass();
            }
            if (f.e(this, obj, s9fVar)) {
                m(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return o(obj2);
        }
        z9f z9fVar = this.c;
        if (z9fVar != z9f.c) {
            z9f z9fVar2 = new z9f();
            do {
                r9f r9fVar = f;
                r9fVar.c(z9fVar2, z9fVar);
                if (r9fVar.f(this, z9fVar, z9fVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            n(z9fVar2);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (!(obj != null));
                    return o(obj);
                }
                z9fVar = this.c;
            } while (z9fVar != z9f.c);
        }
        Object obj3 = this.a;
        obj3.getClass();
        return o(obj3);
    }

    protected boolean i(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.e(this, null, obj)) {
            return false;
        }
        m(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof s9f;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof s9f) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            l(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            boolean z = true;
            if (obj != null) {
                return o(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                z9f z9fVar = this.c;
                if (z9fVar != z9f.c) {
                    z9f z9fVar2 = new z9f();
                    do {
                        r9f r9fVar = f;
                        r9fVar.c(z9fVar2, z9fVar);
                        if (r9fVar.f(this, z9fVar, z9fVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return o(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    n(z9fVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            n(z9fVar2);
                        } else {
                            z9fVar = this.c;
                        }
                    } while (z9fVar != z9f.c);
                }
                Object obj3 = this.a;
                obj3.getClass();
                return o(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.a;
                if (obj4 != null) {
                    return o(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aafVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + aafVar);
        }
        throw new InterruptedException();
    }
}
