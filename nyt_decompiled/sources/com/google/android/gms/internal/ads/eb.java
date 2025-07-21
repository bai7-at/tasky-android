package com.google.android.gms.internal.ads;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import defpackage.ehe;
import defpackage.j64;
import defpackage.oke;
import defpackage.tge;
import java.util.Locale;
import java.util.Objects;
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
public abstract class eb extends oke implements j64 {
    static final boolean d;
    static final fc e;
    private static final ua f;
    private static final Object g;
    private volatile Object a;
    private volatile wa b;
    private volatile db c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.gms.internal.ads.xa] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.cb] */
    static {
        boolean z;
        za zaVar;
        Throwable th;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new fc(eb.class);
        ?? r3 = 0;
        try {
            th = null;
            zaVar = new cb(null);
            e = null;
        } catch (Error | Exception e2) {
            e = e2;
            try {
                th = null;
                zaVar = new xa(AtomicReferenceFieldUpdater.newUpdater(db.class, Thread.class, Tag.A), AtomicReferenceFieldUpdater.newUpdater(db.class, db.class, "b"), AtomicReferenceFieldUpdater.newUpdater(eb.class, db.class, QueryKeys.TIME_ON_VIEW_IN_MINUTES), AtomicReferenceFieldUpdater.newUpdater(eb.class, wa.class, "b"), AtomicReferenceFieldUpdater.newUpdater(eb.class, Object.class, Tag.A));
            } catch (Error | Exception e3) {
                zaVar = new za(r3 == true ? 1 : 0);
                th = e3;
            }
        }
        f = zaVar;
        if (th != null) {
            fc fcVar = e;
            Logger a = fcVar.a();
            Level level = Level.SEVERE;
            a.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", e);
            fcVar.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    protected eb() {
    }

    private static void A(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e2);
        }
    }

    private final void B(db dbVar) {
        dbVar.a = null;
        while (true) {
            db dbVar2 = this.c;
            if (dbVar2 != db.c) {
                db dbVar3 = null;
                while (dbVar2 != null) {
                    db dbVar4 = dbVar2.b;
                    if (dbVar2.a != null) {
                        dbVar3 = dbVar2;
                    } else if (dbVar3 != null) {
                        dbVar3.b = dbVar4;
                        if (dbVar3.a == null) {
                            break;
                        }
                    } else if (!f.g(this, dbVar2, dbVar4)) {
                        break;
                    }
                    dbVar2 = dbVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object c(Object obj) {
        if (obj instanceof va) {
            Throwable th = ((va) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzgdb$zzc) {
            throw new ExecutionException(((zzgdb$zzc) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(j64 j64Var) {
        Throwable b;
        if (j64Var instanceof ab) {
            Object obj = ((eb) j64Var).a;
            if (obj instanceof va) {
                va vaVar = (va) obj;
                if (vaVar.a) {
                    Throwable th = vaVar.b;
                    obj = th != null ? new va(false, th) : va.d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((j64Var instanceof oke) && (b = ((oke) j64Var).b()) != null) {
            return new zzgdb$zzc(b);
        }
        boolean isCancelled = j64Var.isCancelled();
        if ((!d) && isCancelled) {
            va vaVar2 = va.d;
            Objects.requireNonNull(vaVar2);
            return vaVar2;
        }
        try {
            Object i = i(j64Var);
            if (!isCancelled) {
                return i == null ? g : i;
            }
            return new va(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(j64Var)));
        } catch (Error | Exception e2) {
            return new zzgdb$zzc(e2);
        } catch (CancellationException e3) {
            return !isCancelled ? new zzgdb$zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(j64Var)), e3)) : new va(false, e3);
        } catch (ExecutionException e4) {
            return isCancelled ? new va(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(j64Var)), e4)) : new zzgdb$zzc(e4.getCause());
        }
    }

    private static Object i(Future future) {
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

    private final void w(StringBuilder sb) {
        try {
            Object i = i(this);
            sb.append("SUCCESS, result=[");
            if (i == null) {
                sb.append(Constants.NULL_VERSION_ID);
            } else if (i == this) {
                sb.append("this future");
            } else {
                sb.append(i.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(i)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void x(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.a;
        if (obj instanceof ya) {
            sb.append(", setFuture=[");
            y(sb, ((ya) obj).b);
            sb.append("]");
        } else {
            try {
                concat = ehe.a(d());
            } catch (Exception | StackOverflowError e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            w(sb);
        }
    }

    private final void y(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(eb ebVar, boolean z) {
        wa waVar = null;
        while (true) {
            for (db b = f.b(ebVar, db.c); b != null; b = b.b) {
                Thread thread = b.a;
                if (thread != null) {
                    b.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                ebVar.s();
            }
            ebVar.e();
            wa waVar2 = waVar;
            wa a = f.a(ebVar, wa.d);
            wa waVar3 = waVar2;
            while (a != null) {
                wa waVar4 = a.c;
                a.c = waVar3;
                waVar3 = a;
                a = waVar4;
            }
            while (waVar3 != null) {
                waVar = waVar3.c;
                Runnable runnable = waVar3.a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof ya) {
                    ya yaVar = (ya) runnable2;
                    ebVar = yaVar.a;
                    if (ebVar.a == yaVar) {
                        if (f.f(ebVar, yaVar, h(yaVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = waVar3.b;
                    Objects.requireNonNull(executor);
                    A(runnable2, executor);
                }
                waVar3 = waVar;
            }
            return;
            z = false;
        }
    }

    @Override // defpackage.j64
    public void a(Runnable runnable, Executor executor) {
        wa waVar;
        tge.c(runnable, "Runnable was null.");
        tge.c(executor, "Executor was null.");
        if (!isDone() && (waVar = this.b) != wa.d) {
            wa waVar2 = new wa(runnable, executor);
            do {
                waVar2.c = waVar;
                if (f.e(this, waVar, waVar2)) {
                    return;
                } else {
                    waVar = this.b;
                }
            } while (waVar != wa.d);
        }
        A(runnable, executor);
    }

    @Override // defpackage.oke
    protected final Throwable b() {
        if (!(this instanceof ab)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof zzgdb$zzc) {
            return ((zzgdb$zzc) obj).a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        va vaVar;
        Object obj = this.a;
        if (!(obj instanceof ya) && !(obj == null)) {
            return false;
        }
        if (d) {
            vaVar = new va(z, new CancellationException("Future.cancel() was called."));
        } else {
            vaVar = z ? va.c : va.d;
            Objects.requireNonNull(vaVar);
        }
        boolean z2 = false;
        while (true) {
            if (f.f(this, obj, vaVar)) {
                z(this, z);
                if (!(obj instanceof ya)) {
                    break;
                }
                j64 j64Var = ((ya) obj).b;
                if (!(j64Var instanceof ab)) {
                    j64Var.cancel(z);
                    break;
                }
                this = (eb) j64Var;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof ya)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof ya)) {
                    return z2;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String d() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected void e() {
    }

    protected boolean f(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.f(this, null, obj)) {
            return false;
        }
        z(this, false);
        return true;
    }

    protected boolean g(Throwable th) {
        th.getClass();
        if (!f.f(this, null, new zzgdb$zzc(th))) {
            return false;
        }
        z(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if ((obj2 != null) && (!(obj2 instanceof ya))) {
            return c(obj2);
        }
        db dbVar = this.c;
        if (dbVar != db.c) {
            db dbVar2 = new db();
            do {
                ua uaVar = f;
                uaVar.c(dbVar2, dbVar);
                if (uaVar.g(this, dbVar, dbVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            B(dbVar2);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (!((obj != null) & (!(obj instanceof ya))));
                    return c(obj);
                }
                dbVar = this.c;
            } while (dbVar != db.c);
        }
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        return c(obj3);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof va;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.a != null) & (!(r2 instanceof ya));
    }

    protected void s() {
    }

    final void t(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(v());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            w(sb);
        } else {
            x(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    protected final boolean u(j64 j64Var) {
        zzgdb$zzc zzgdb_zzc;
        j64Var.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (j64Var.isDone()) {
                if (!f.f(this, null, h(j64Var))) {
                    return false;
                }
                z(this, false);
                return true;
            }
            ya yaVar = new ya(this, j64Var);
            if (f.f(this, null, yaVar)) {
                try {
                    j64Var.a(yaVar, zzgeb.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzgdb_zzc = new zzgdb$zzc(th);
                    } catch (Error | Exception unused) {
                        zzgdb_zzc = zzgdb$zzc.b;
                    }
                    f.f(this, yaVar, zzgdb_zzc);
                }
                return true;
            }
            obj = this.a;
        }
        if (obj instanceof va) {
            j64Var.cancel(((va) obj).a);
        }
        return false;
    }

    protected final boolean v() {
        Object obj = this.a;
        return (obj instanceof va) && ((va) obj).a;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof ya))) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                db dbVar = this.c;
                if (dbVar != db.c) {
                    db dbVar2 = new db();
                    do {
                        ua uaVar = f;
                        uaVar.c(dbVar2, dbVar);
                        if (uaVar.g(this, dbVar, dbVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if ((obj2 != null) & (!(obj2 instanceof ya))) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    B(dbVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            B(dbVar2);
                        } else {
                            dbVar = this.c;
                        }
                    } while (dbVar != db.c);
                }
                Object obj3 = this.a;
                Objects.requireNonNull(obj3);
                return c(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.a;
                if ((obj4 != null) & (!(obj4 instanceof ya))) {
                    return c(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String ebVar = toString();
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
            throw new TimeoutException(str + " for " + ebVar);
        }
        throw new InterruptedException();
    }
}
