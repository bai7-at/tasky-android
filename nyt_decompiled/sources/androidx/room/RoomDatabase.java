package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import defpackage.a67;
import defpackage.ar2;
import defpackage.c00;
import defpackage.oc8;
import defpackage.ps7;
import defpackage.qq8;
import defpackage.sc8;
import defpackage.ss2;
import defpackage.tc8;
import defpackage.vc8;
import defpackage.vl1;
import defpackage.vn;
import defpackage.wc8;
import defpackage.wt4;
import defpackage.xz;
import defpackage.yz;
import defpackage.zq3;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class RoomDatabase {
    public static final c Companion = new c(null);
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private xz autoCloser;
    private final Map<String, Object> backingFieldMap;
    private tc8 internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<? extends b> mCallbacks;
    protected volatile sc8 mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final androidx.room.d invalidationTracker = createInvalidationTracker();
    private Map<Class<? extends c00>, c00> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return oc8.b(activityManager);
        }

        public final JournalMode resolve$room_runtime_release(Context context) {
            zq3.h(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class a {
        private final Context a;
        private final Class b;
        private final String c;
        private final List d;
        private final List e;
        private List f;
        private Executor g;
        private Executor h;
        private tc8.c i;
        private boolean j;
        private JournalMode k;
        private Intent l;
        private boolean m;
        private boolean n;
        private long o;
        private TimeUnit p;
        private final d q;
        private Set r;
        private Set s;
        private String t;
        private File u;
        private Callable v;

        public a(Context context, Class cls, String str) {
            zq3.h(context, "context");
            zq3.h(cls, "klass");
            this.a = context;
            this.b = cls;
            this.c = str;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.k = JournalMode.AUTOMATIC;
            this.m = true;
            this.o = -1L;
            this.q = new d();
            this.r = new LinkedHashSet();
        }

        public a a(b bVar) {
            zq3.h(bVar, "callback");
            this.d.add(bVar);
            return this;
        }

        public a b(wt4... wt4VarArr) {
            zq3.h(wt4VarArr, "migrations");
            if (this.s == null) {
                this.s = new HashSet();
            }
            for (wt4 wt4Var : wt4VarArr) {
                Set set = this.s;
                zq3.e(set);
                set.add(Integer.valueOf(wt4Var.startVersion));
                Set set2 = this.s;
                zq3.e(set2);
                set2.add(Integer.valueOf(wt4Var.endVersion));
            }
            this.q.b((wt4[]) Arrays.copyOf(wt4VarArr, wt4VarArr.length));
            return this;
        }

        public a c() {
            this.j = true;
            return this;
        }

        public RoomDatabase d() {
            Executor executor = this.g;
            if (executor == null && this.h == null) {
                Executor f = vn.f();
                this.h = f;
                this.g = f;
            } else if (executor != null && this.h == null) {
                this.h = executor;
            } else if (executor == null) {
                this.g = this.h;
            }
            Set set = this.s;
            if (set != null) {
                zq3.e(set);
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    int intValue = ((Number) it2.next()).intValue();
                    if (this.r.contains(Integer.valueOf(intValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            tc8.c cVar = this.i;
            if (cVar == null) {
                cVar = new ar2();
            }
            if (cVar != null) {
                if (this.o > 0) {
                    if (this.c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j = this.o;
                    TimeUnit timeUnit = this.p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cVar = new yz(cVar, new xz(j, timeUnit, executor2));
                }
                String str = this.t;
                if (str != null || this.u != null || this.v != null) {
                    if (this.c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i = str == null ? 0 : 1;
                    File file = this.u;
                    int i2 = file == null ? 0 : 1;
                    Callable callable = this.v;
                    if (i + i2 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    cVar = new a67(str, file, callable, cVar);
                }
            } else {
                cVar = null;
            }
            tc8.c cVar2 = cVar;
            if (cVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.a;
            String str2 = this.c;
            d dVar = this.q;
            List list = this.d;
            boolean z = this.j;
            JournalMode resolve$room_runtime_release = this.k.resolve$room_runtime_release(context);
            Executor executor3 = this.g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            androidx.room.a aVar = new androidx.room.a(context, str2, cVar2, dVar, list, z, resolve$room_runtime_release, executor3, executor4, this.l, this.m, this.n, this.r, this.t, this.u, this.v, null, this.e, this.f);
            RoomDatabase roomDatabase = (RoomDatabase) f.b(this.b, "_Impl");
            roomDatabase.init(aVar);
            return roomDatabase;
        }

        public a e() {
            this.m = false;
            this.n = true;
            return this;
        }

        public a f(int... iArr) {
            zq3.h(iArr, "startVersions");
            for (int i : iArr) {
                this.r.add(Integer.valueOf(i));
            }
            return this;
        }

        public a g() {
            this.m = true;
            this.n = true;
            return this;
        }

        public a h(tc8.c cVar) {
            this.i = cVar;
            return this;
        }

        public a i(Executor executor) {
            zq3.h(executor, "executor");
            this.g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
        }

        public void b(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
        }

        public void c(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static class d {
        private final Map a = new LinkedHashMap();

        private final void a(wt4 wt4Var) {
            int i = wt4Var.startVersion;
            int i2 = wt4Var.endVersion;
            Map map = this.a;
            Integer valueOf = Integer.valueOf(i);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i2)) + " with " + wt4Var);
            }
            treeMap.put(Integer.valueOf(i2), wt4Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.util.List e(java.util.List r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L63
                goto L7
            L5:
                if (r9 <= r10) goto L63
            L7:
                java.util.Map r0 = r6.a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L5f
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.lang.String r4 = "targetVersion"
                if (r8 == 0) goto L44
                int r5 = r9 + 1
                defpackage.zq3.g(r3, r4)
                int r4 = r3.intValue()
                if (r5 > r4) goto L26
                if (r4 > r10) goto L26
                goto L4f
            L44:
                defpackage.zq3.g(r3, r4)
                int r4 = r3.intValue()
                if (r10 > r4) goto L26
                if (r4 >= r9) goto L26
            L4f:
                java.lang.Object r9 = r0.get(r3)
                defpackage.zq3.e(r9)
                r7.add(r9)
                int r9 = r3.intValue()
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 != 0) goto L0
                return r1
            L63:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.d.e(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(wt4... wt4VarArr) {
            zq3.h(wt4VarArr, "migrations");
            for (wt4 wt4Var : wt4VarArr) {
                a(wt4Var);
            }
        }

        public final boolean c(int i, int i2) {
            Map f = f();
            if (!f.containsKey(Integer.valueOf(i))) {
                return false;
            }
            Map map = (Map) f.get(Integer.valueOf(i));
            if (map == null) {
                map = t.i();
            }
            return map.containsKey(Integer.valueOf(i2));
        }

        public List d(int i, int i2) {
            if (i == i2) {
                return kotlin.collections.i.l();
            }
            return e(new ArrayList(), i2 > i, i, i2);
        }

        public Map f() {
            return this.a;
        }
    }

    public static abstract class e {
    }

    public RoomDatabase() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        zq3.g(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        assertNotMainThread();
        sc8 o = getOpenHelper().o();
        getInvalidationTracker().x(o);
        if (o.o1()) {
            o.T();
        } else {
            o.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        getOpenHelper().o().Z();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().n();
    }

    private final Object c(Class cls, tc8 tc8Var) {
        if (cls.isInstance(tc8Var)) {
            return tc8Var;
        }
        if (tc8Var instanceof vl1) {
            return c(cls, ((vl1) tc8Var).getDelegate());
        }
        return null;
    }

    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, vc8 vc8Var, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(vc8Var, cancellationSignal);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        xz xzVar = this.autoCloser;
        if (xzVar == null) {
            a();
        } else {
            xzVar.g(new ss2() { // from class: androidx.room.RoomDatabase$beginTransaction$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(sc8 sc8Var) {
                    zq3.h(sc8Var, "it");
                    RoomDatabase.this.a();
                    return null;
                }
            });
        }
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            zq3.g(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().u();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public wc8 compileStatement(String str) {
        zq3.h(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().o().A0(str);
    }

    protected abstract androidx.room.d createInvalidationTracker();

    protected abstract tc8 createOpenHelper(androidx.room.a aVar);

    public void endTransaction() {
        xz xzVar = this.autoCloser;
        if (xzVar == null) {
            b();
        } else {
            xzVar.g(new ss2() { // from class: androidx.room.RoomDatabase$endTransaction$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(sc8 sc8Var) {
                    zq3.h(sc8Var, "it");
                    RoomDatabase.this.b();
                    return null;
                }
            });
        }
    }

    protected final Map<Class<? extends c00>, c00> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public List<wt4> getAutoMigrations(Map<Class<? extends c00>, c00> map) {
        zq3.h(map, "autoMigrationSpecs");
        return kotlin.collections.i.l();
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        zq3.g(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public androidx.room.d getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public tc8 getOpenHelper() {
        tc8 tc8Var = this.internalOpenHelper;
        if (tc8Var != null) {
            return tc8Var;
        }
        zq3.z("internalOpenHelper");
        return null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        zq3.z("internalQueryExecutor");
        return null;
    }

    public Set<Class<? extends c00>> getRequiredAutoMigrationSpecs() {
        return b0.e();
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return t.i();
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        zq3.z("internalTransactionExecutor");
        return null;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        zq3.h(cls, "klass");
        return (T) this.typeConverters.get(cls);
    }

    public boolean inTransaction() {
        return getOpenHelper().o().g1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init(androidx.room.a aVar) {
        zq3.h(aVar, "configuration");
        this.internalOpenHelper = createOpenHelper(aVar);
        Set<Class<? extends c00>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends c00>> it2 = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i = -1;
            if (it2.hasNext()) {
                Class<? extends c00> next = it2.next();
                int size = aVar.r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(aVar.r.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, aVar.r.get(i));
            } else {
                int size2 = aVar.r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                for (wt4 wt4Var : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!aVar.d.c(wt4Var.startVersion, wt4Var.endVersion)) {
                        aVar.d.b(wt4Var);
                    }
                }
                h hVar = (h) c(h.class, getOpenHelper());
                if (hVar != null) {
                    hVar.d(aVar);
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) c(AutoClosingRoomOpenHelper.class, getOpenHelper());
                if (autoClosingRoomOpenHelper != null) {
                    this.autoCloser = autoClosingRoomOpenHelper.b;
                    getInvalidationTracker().r(autoClosingRoomOpenHelper.b);
                }
                boolean z = aVar.g == JournalMode.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z);
                this.mCallbacks = aVar.e;
                this.internalQueryExecutor = aVar.h;
                this.internalTransactionExecutor = new qq8(aVar.i);
                this.allowMainThreadQueries = aVar.f;
                this.writeAheadLoggingEnabled = z;
                if (aVar.j != null) {
                    if (aVar.b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    getInvalidationTracker().s(aVar.a, aVar.b, aVar.j);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = aVar.q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
                                if (cls.isAssignableFrom(aVar.q.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i4 < 0) {
                                    break;
                                } else {
                                    size3 = i4;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, aVar.q.get(size3));
                    }
                }
                int size4 = aVar.q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i5 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + aVar.q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i5 < 0) {
                        return;
                    } else {
                        size4 = i5;
                    }
                }
            }
        }
    }

    protected void internalInitInvalidationTracker(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        getInvalidationTracker().k(sc8Var);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean bool;
        boolean isOpen;
        xz xzVar = this.autoCloser;
        if (xzVar != null) {
            isOpen = xzVar.l();
        } else {
            sc8 sc8Var = this.mDatabase;
            if (sc8Var == null) {
                bool = null;
                return zq3.c(bool, Boolean.TRUE);
            }
            isOpen = sc8Var.isOpen();
        }
        bool = Boolean.valueOf(isOpen);
        return zq3.c(bool, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        sc8 sc8Var = this.mDatabase;
        return sc8Var != null && sc8Var.isOpen();
    }

    public final Cursor query(vc8 vc8Var) {
        zq3.h(vc8Var, "query");
        return query$default(this, vc8Var, null, 2, null);
    }

    public void runInTransaction(Runnable runnable) {
        zq3.h(runnable, "body");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    protected final void setAutoMigrationSpecs(Map<Class<? extends c00>, c00> map) {
        zq3.h(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    public void setTransactionSuccessful() {
        getOpenHelper().o().R();
    }

    public Cursor query(String str, Object[] objArr) {
        zq3.h(str, "query");
        return getOpenHelper().o().v(new ps7(str, objArr));
    }

    public Cursor query(vc8 vc8Var, CancellationSignal cancellationSignal) {
        zq3.h(vc8Var, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().o().O0(vc8Var, cancellationSignal);
        }
        return getOpenHelper().o().v(vc8Var);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        zq3.h(callable, "body");
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
