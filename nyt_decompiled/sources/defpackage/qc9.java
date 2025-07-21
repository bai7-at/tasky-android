package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class qc9 {
    private static final long r = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService s = null;
    private static final Object t = new Object();
    private static volatile i5c u = new yka();
    private final Object a;
    private final PowerManager.WakeLock b;
    private int c;
    private Future d;
    private long e;
    private final Set f;
    private boolean g;
    private int h;
    xka i;
    private Clock j;
    private WorkSource k;
    private final String l;
    private final String m;
    private final Context n;
    private final Map o;
    private AtomicInteger p;
    private final ScheduledExecutorService q;

    public qc9(Context context, int i, String str) {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.j = DefaultClock.getInstance();
        this.o = new HashMap();
        this.p = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.n = context.getApplicationContext();
        this.m = str;
        this.i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
        this.b = newWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource fromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            this.k = fromPackage;
            if (fromPackage != null) {
                i(newWakeLock, fromPackage);
            }
        }
        ScheduledExecutorService scheduledExecutorService = s;
        if (scheduledExecutorService == null) {
            synchronized (t) {
                try {
                    scheduledExecutorService = s;
                    if (scheduledExecutorService == null) {
                        u0f.a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        s = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.q = scheduledExecutorService;
    }

    public static /* synthetic */ void e(qc9 qc9Var) {
        synchronized (qc9Var.a) {
            try {
                if (qc9Var.b()) {
                    Log.e("WakeLock", String.valueOf(qc9Var.l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    qc9Var.g();
                    if (qc9Var.b()) {
                        qc9Var.c = 1;
                        qc9Var.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f);
        this.f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        lh4.a(arrayList.get(0));
        throw null;
    }

    private final void h(int i) {
        synchronized (this.a) {
            try {
                if (b()) {
                    if (this.g) {
                        int i2 = this.c - 1;
                        this.c = i2;
                        if (i2 > 0) {
                            return;
                        }
                    } else {
                        this.c = 0;
                    }
                    g();
                    Iterator it2 = this.o.values().iterator();
                    while (it2.hasNext()) {
                        ((zab) it2.next()).a = 0;
                    }
                    this.o.clear();
                    Future future = this.d;
                    if (future != null) {
                        future.cancel(false);
                        this.d = null;
                        this.e = 0L;
                    }
                    this.h = 0;
                    if (this.b.isHeld()) {
                        try {
                            try {
                                this.b.release();
                                if (this.i != null) {
                                    this.i = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.l).concat(" failed to release!"), e);
                                if (this.i != null) {
                                    this.i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.i != null) {
                                this.i = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public void a(long j) {
        this.p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, r), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.a) {
            try {
                yka ykaVar = null;
                if (!b()) {
                    this.i = xka.a(false, null);
                    this.b.acquire();
                    this.j.elapsedRealtime();
                }
                this.c++;
                this.h++;
                f(null);
                zab zabVar = (zab) this.o.get(null);
                if (zabVar == null) {
                    zabVar = new zab(ykaVar);
                    this.o.put(null, zabVar);
                }
                zabVar.a++;
                long elapsedRealtime = this.j.elapsedRealtime();
                long j2 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j2 > this.e) {
                    this.e = j2;
                    Future future = this.d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.d = this.q.schedule(new Runnable() { // from class: aq9
                        @Override // java.lang.Runnable
                        public final void run() {
                            qc9.e(qc9.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c > 0;
        }
        return z;
    }

    public void c() {
        if (this.p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.l).concat(" release without a matched acquire!"));
        }
        synchronized (this.a) {
            try {
                f(null);
                if (this.o.containsKey(null)) {
                    zab zabVar = (zab) this.o.get(null);
                    if (zabVar != null) {
                        int i = zabVar.a - 1;
                        zabVar.a = i;
                        if (i == 0) {
                            this.o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z) {
        synchronized (this.a) {
            this.g = z;
        }
    }
}
