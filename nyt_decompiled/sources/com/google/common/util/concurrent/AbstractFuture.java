package com.google.common.util.concurrent;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import defpackage.b16;
import defpackage.hzf;
import defpackage.j64;
import defpackage.ll8;
import defpackage.oq3;
import defpackage.s48;
import defpackage.v1;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class AbstractFuture extends oq3 implements j64 {
    static final boolean d;
    private static final Logger e;
    private static final b f;
    private static final Object g;
    private volatile Object a;
    private volatile d b;
    private volatile i c;

    private static final class Failure {
        static final Failure b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable a;

        Failure(Throwable th) {
            this.a = (Throwable) b16.k(th);
        }
    }

    private static abstract class b {
        private b() {
        }

        abstract boolean a(AbstractFuture abstractFuture, d dVar, d dVar2);

        abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        abstract boolean c(AbstractFuture abstractFuture, i iVar, i iVar2);

        abstract d d(AbstractFuture abstractFuture, d dVar);

        abstract i e(AbstractFuture abstractFuture, i iVar);

        abstract void f(i iVar, i iVar2);

        abstract void g(i iVar, Thread thread);
    }

    private static final class c {
        static final c c;
        static final c d;
        final boolean a;
        final Throwable b;

        static {
            if (AbstractFuture.d) {
                d = null;
                c = null;
            } else {
                d = new c(false, null);
                c = new c(true, null);
            }
        }

        c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    private static final class e extends b {
        final AtomicReferenceFieldUpdater a;
        final AtomicReferenceFieldUpdater b;
        final AtomicReferenceFieldUpdater c;
        final AtomicReferenceFieldUpdater d;
        final AtomicReferenceFieldUpdater e;

        e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean a(AbstractFuture abstractFuture, d dVar, d dVar2) {
            return v1.a(this.d, abstractFuture, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return v1.a(this.e, abstractFuture, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean c(AbstractFuture abstractFuture, i iVar, i iVar2) {
            return v1.a(this.c, abstractFuture, iVar, iVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        d d(AbstractFuture abstractFuture, d dVar) {
            return (d) this.d.getAndSet(abstractFuture, dVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        i e(AbstractFuture abstractFuture, i iVar) {
            return (i) this.c.getAndSet(abstractFuture, iVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void f(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void g(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    private static final class f extends b {
        private f() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean a(AbstractFuture abstractFuture, d dVar, d dVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.b != dVar) {
                        return false;
                    }
                    abstractFuture.b = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.a != obj) {
                        return false;
                    }
                    abstractFuture.a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean c(AbstractFuture abstractFuture, i iVar, i iVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.c != iVar) {
                        return false;
                    }
                    abstractFuture.c = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        d d(AbstractFuture abstractFuture, d dVar) {
            d dVar2;
            synchronized (abstractFuture) {
                try {
                    dVar2 = abstractFuture.b;
                    if (dVar2 != dVar) {
                        abstractFuture.b = dVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        i e(AbstractFuture abstractFuture, i iVar) {
            i iVar2;
            synchronized (abstractFuture) {
                try {
                    iVar2 = abstractFuture.c;
                    if (iVar2 != iVar) {
                        abstractFuture.c = iVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void f(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void g(i iVar, Thread thread) {
            iVar.a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abstract class g extends AbstractFuture implements j64 {
        g() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, defpackage.j64
        public final void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return super.get(j, timeUnit);
        }
    }

    private static final class h extends b {
        static final Unsafe a;
        static final long b;
        static final long c;
        static final long d;
        static final long e;
        static final long f;

        class a implements PrivilegedExceptionAction {
            a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(QueryKeys.TIME_ON_VIEW_IN_MINUTES));
                b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(Tag.A));
                e = unsafe.objectFieldOffset(i.class.getDeclaredField(Tag.A));
                f = unsafe.objectFieldOffset(i.class.getDeclaredField("b"));
                a = unsafe;
            } catch (Exception e3) {
                ll8.e(e3);
                throw new RuntimeException(e3);
            }
        }

        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean a(AbstractFuture abstractFuture, d dVar, d dVar2) {
            return hzf.a(a, abstractFuture, b, dVar, dVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return hzf.a(a, abstractFuture, d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        boolean c(AbstractFuture abstractFuture, i iVar, i iVar2) {
            return hzf.a(a, abstractFuture, c, iVar, iVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        d d(AbstractFuture abstractFuture, d dVar) {
            d dVar2;
            do {
                dVar2 = abstractFuture.b;
                if (dVar == dVar2) {
                    return dVar2;
                }
            } while (!a(abstractFuture, dVar2, dVar));
            return dVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        i e(AbstractFuture abstractFuture, i iVar) {
            i iVar2;
            do {
                iVar2 = abstractFuture.c;
                if (iVar == iVar2) {
                    return iVar2;
                }
            } while (!c(abstractFuture, iVar2, iVar));
            return iVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void f(i iVar, i iVar2) {
            a.putObject(iVar, f, iVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.b
        void g(i iVar, Thread thread) {
            a.putObject(iVar, e, thread);
        }
    }

    private static final class i {
        static final i c = new i(false);
        volatile Thread a;
        volatile i b;

        i(boolean z) {
        }

        void a(i iVar) {
            AbstractFuture.f.f(this, iVar);
        }

        void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            AbstractFuture.f.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.common.util.concurrent.AbstractFuture$e] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.common.util.concurrent.AbstractFuture$a] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.common.util.concurrent.AbstractFuture$h] */
    static {
        boolean z;
        f fVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(AbstractFuture.class.getName());
        ?? r4 = 0;
        r4 = 0;
        try {
            fVar = new h();
            th = null;
        } catch (Throwable th) {
            th = th;
            try {
                fVar = new e(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, Tag.A), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, i.class, QueryKeys.TIME_ON_VIEW_IN_MINUTES), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, Tag.A));
            } catch (Throwable th2) {
                fVar = new f();
                r4 = th2;
            }
        }
        f = fVar;
        if (r4 != 0) {
            ?? r0 = e;
            Level level = Level.SEVERE;
            r0.log(level, "UnsafeAtomicHelper is broken!", th);
            r0.log(level, "SafeAtomicHelper is broken!", r4);
        }
        g = new Object();
    }

    protected AbstractFuture() {
    }

    private void i(StringBuilder sb) {
        try {
            Object r = r(this);
            sb.append("SUCCESS, result=[");
            l(sb, r);
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

    private void j(StringBuilder sb) {
        String sb2;
        int length = sb.length();
        sb.append("PENDING");
        try {
            sb2 = s48.a(t());
        } catch (RuntimeException | StackOverflowError e2) {
            String valueOf = String.valueOf(e2.getClass());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 38);
            sb3.append("Exception thrown from implementation: ");
            sb3.append(valueOf);
            sb2 = sb3.toString();
        }
        if (sb2 != null) {
            sb.append(", info=[");
            sb.append(sb2);
            sb.append("]");
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            i(sb);
        }
    }

    private void l(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append(Constants.NULL_VERSION_ID);
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private static CancellationException m(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private d n(d dVar) {
        d d2 = f.d(this, d.d);
        d dVar2 = dVar;
        while (d2 != null) {
            d dVar3 = d2.c;
            d2.c = dVar2;
            dVar2 = d2;
            d2 = dVar3;
        }
        return dVar2;
    }

    private static void o(AbstractFuture abstractFuture) {
        abstractFuture.u();
        abstractFuture.k();
        d n = abstractFuture.n(null);
        while (n != null) {
            d dVar = n.c;
            Runnable runnable = n.a;
            Objects.requireNonNull(runnable);
            Executor executor = n.b;
            Objects.requireNonNull(executor);
            p(runnable, executor);
            n = dVar;
        }
    }

    private static void p(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = e;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), (Throwable) e2);
        }
    }

    private Object q(Object obj) {
        if (obj instanceof c) {
            throw m("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).a);
        }
        return obj == g ? com.google.common.util.concurrent.a.a() : obj;
    }

    private static Object r(Future future) {
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

    private void u() {
        for (i e2 = f.e(this, i.c); e2 != null; e2 = e2.b) {
            e2.b();
        }
    }

    private void v(i iVar) {
        iVar.a = null;
        while (true) {
            i iVar2 = this.c;
            if (iVar2 == i.c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.b;
                if (iVar2.a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.b = iVar4;
                    if (iVar3.a == null) {
                        break;
                    }
                } else if (!f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    @Override // defpackage.j64
    public void a(Runnable runnable, Executor executor) {
        d dVar;
        b16.l(runnable, "Runnable was null.");
        b16.l(executor, "Executor was null.");
        if (!isDone() && (dVar = this.b) != d.d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.c = dVar;
                if (f.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.b;
                }
            } while (dVar != d.d);
        }
        p(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        c cVar;
        Object obj = this.a;
        if (obj == null) {
            if (d) {
                cVar = new c(z, new CancellationException("Future.cancel() was called."));
            } else {
                cVar = z ? c.c : c.d;
                Objects.requireNonNull(cVar);
            }
            if (f.b(this, obj, cVar)) {
                if (z) {
                    s();
                }
                o(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return q(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.c;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f.c(this, iVar, iVar2)) {
                        do {
                            com.google.common.util.concurrent.b.a(this, nanos);
                            if (Thread.interrupted()) {
                                v(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return q(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        v(iVar2);
                    } else {
                        iVar = this.c;
                    }
                } while (iVar != i.c);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return q(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.a;
            if (obj4 != null) {
                return q(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFuture = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = String.valueOf(sb2).concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb3.append(valueOf);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = String.valueOf(sb4).concat(",");
                }
                concat = String.valueOf(sb4).concat(" ");
            }
            if (z) {
                String valueOf2 = String.valueOf(concat);
                StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                sb5.append(valueOf2);
                sb5.append(nanos2);
                sb5.append(" nanoseconds ");
                concat = sb5.toString();
            }
            sb2 = String.valueOf(concat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(abstractFuture).length());
        sb6.append(sb2);
        sb6.append(" for ");
        sb6.append(abstractFuture);
        throw new TimeoutException(sb6.toString());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.a != null;
    }

    protected void k() {
    }

    protected void s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String t() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
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
            i(sb);
        } else {
            j(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    protected boolean w(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.b(this, null, obj)) {
            return false;
        }
        o(this);
        return true;
    }

    protected boolean x(Throwable th) {
        if (!f.b(this, null, new Failure((Throwable) b16.k(th)))) {
            return false;
        }
        o(this);
        return true;
    }

    private static final class d {
        static final d d = new d();
        final Runnable a;
        final Executor b;
        d c;

        d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }

        d() {
            this.a = null;
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return q(obj2);
            }
            i iVar = this.c;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                v(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return q(obj);
                    }
                    iVar = this.c;
                } while (iVar != i.c);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return q(obj3);
        }
        throw new InterruptedException();
    }
}
