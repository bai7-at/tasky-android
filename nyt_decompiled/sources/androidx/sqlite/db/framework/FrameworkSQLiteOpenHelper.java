package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import defpackage.c04;
import defpackage.nc8;
import defpackage.pc8;
import defpackage.qs2;
import defpackage.sc8;
import defpackage.t36;
import defpackage.tc8;
import defpackage.zq3;
import java.io.File;
import java.util.UUID;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper implements tc8 {
    public static final a h = new a(null);
    private final Context a;
    private final String b;
    private final tc8.a c;
    private final boolean d;
    private final boolean e;
    private final c04 f;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: private */
    static final class OpenHelper extends SQLiteOpenHelper {
        public static final a h = new a(null);
        private final Context a;
        private final b b;
        private final tc8.a c;
        private final boolean d;
        private boolean e;
        private final t36 f;
        private boolean g;

        private static final class CallbackException extends RuntimeException {
            private final CallbackName callbackName;
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(CallbackName callbackName, Throwable th) {
                super(th);
                zq3.h(callbackName, "callbackName");
                zq3.h(th, "cause");
                this.callbackName = callbackName;
                this.cause = th;
            }

            public final CallbackName a() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }
        }

        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FrameworkSQLiteDatabase a(b bVar, SQLiteDatabase sQLiteDatabase) {
                zq3.h(bVar, "refHolder");
                zq3.h(sQLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase a = bVar.a();
                if (a != null && a.d(sQLiteDatabase)) {
                    return a;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sQLiteDatabase);
                bVar.b(frameworkSQLiteDatabase);
                return frameworkSQLiteDatabase;
            }

            private a() {
            }
        }

        public /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final b bVar, final tc8.a aVar, boolean z) {
            super(context, str, null, aVar.a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.a
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    FrameworkSQLiteOpenHelper.OpenHelper.b(tc8.a.this, bVar, sQLiteDatabase);
                }
            });
            zq3.h(context, "context");
            zq3.h(bVar, "dbRef");
            zq3.h(aVar, "callback");
            this.a = context;
            this.b = bVar;
            this.c = aVar;
            this.d = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                zq3.g(str, "randomUUID().toString()");
            }
            this.f = new t36(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(tc8.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            zq3.h(aVar, "$callback");
            zq3.h(bVar, "$dbRef");
            a aVar2 = h;
            zq3.g(sQLiteDatabase, "dbObj");
            aVar.c(aVar2.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase i(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                zq3.g(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            zq3.g(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase j(boolean z) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.g;
            if (databaseName != null && !z2 && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return i(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return this.i(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        Throwable cause = callbackException.getCause();
                        int i = b.a[callbackException.a().ordinal()];
                        if (i == 1) {
                            throw cause;
                        }
                        if (i == 2) {
                            throw cause;
                        }
                        if (i == 3) {
                            throw cause;
                        }
                        if (i == 4) {
                            throw cause;
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else {
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                        if (databaseName == null || !this.d) {
                            throw th;
                        }
                    }
                    this.a.deleteDatabase(databaseName);
                    try {
                        return this.i(z);
                    } catch (CallbackException e) {
                        throw e.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                t36.c(this.f, false, 1, null);
                super.close();
                this.b.b(null);
                this.g = false;
            } finally {
                this.f.d();
            }
        }

        public final sc8 d(boolean z) {
            try {
                this.f.b((this.g || getDatabaseName() == null) ? false : true);
                this.e = false;
                SQLiteDatabase j = j(z);
                if (!this.e) {
                    FrameworkSQLiteDatabase h2 = h(j);
                    this.f.d();
                    return h2;
                }
                close();
                sc8 d = d(z);
                this.f.d();
                return d;
            } catch (Throwable th) {
                this.f.d();
                throw th;
            }
        }

        public final FrameworkSQLiteDatabase h(SQLiteDatabase sQLiteDatabase) {
            zq3.h(sQLiteDatabase, "sqLiteDatabase");
            return h.a(this.b, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            zq3.h(sQLiteDatabase, "db");
            if (!this.e && this.c.a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                this.c.b(h(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            zq3.h(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.c.d(h(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            zq3.h(sQLiteDatabase, "db");
            this.e = true;
            try {
                this.c.e(h(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            zq3.h(sQLiteDatabase, "db");
            if (!this.e) {
                try {
                    this.c.f(h(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            zq3.h(sQLiteDatabase, "sqLiteDatabase");
            this.e = true;
            try {
                this.c.g(h(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        private FrameworkSQLiteDatabase a;

        public b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.a = frameworkSQLiteDatabase;
        }

        public final FrameworkSQLiteDatabase a() {
            return this.a;
        }

        public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.a = frameworkSQLiteDatabase;
        }
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, tc8.a aVar, boolean z, boolean z2) {
        zq3.h(context, "context");
        zq3.h(aVar, "callback");
        this.a = context;
        this.b = str;
        this.c = aVar;
        this.d = z;
        this.e = z2;
        this.f = c.a(new qs2() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FrameworkSQLiteOpenHelper.OpenHelper mo865invoke() {
                String str2;
                FrameworkSQLiteOpenHelper.OpenHelper openHelper;
                Context context2;
                String str3;
                tc8.a aVar2;
                boolean z3;
                boolean z4;
                boolean z5;
                Context context3;
                String str4;
                Context context4;
                tc8.a aVar3;
                boolean z6;
                str2 = FrameworkSQLiteOpenHelper.this.b;
                if (str2 != null) {
                    z5 = FrameworkSQLiteOpenHelper.this.d;
                    if (z5) {
                        context3 = FrameworkSQLiteOpenHelper.this.a;
                        File a2 = pc8.a(context3);
                        str4 = FrameworkSQLiteOpenHelper.this.b;
                        File file = new File(a2, str4);
                        context4 = FrameworkSQLiteOpenHelper.this.a;
                        String absolutePath = file.getAbsolutePath();
                        FrameworkSQLiteOpenHelper.b bVar = new FrameworkSQLiteOpenHelper.b(null);
                        aVar3 = FrameworkSQLiteOpenHelper.this.c;
                        z6 = FrameworkSQLiteOpenHelper.this.e;
                        openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context4, absolutePath, bVar, aVar3, z6);
                        z4 = FrameworkSQLiteOpenHelper.this.g;
                        nc8.f(openHelper, z4);
                        return openHelper;
                    }
                }
                context2 = FrameworkSQLiteOpenHelper.this.a;
                str3 = FrameworkSQLiteOpenHelper.this.b;
                FrameworkSQLiteOpenHelper.b bVar2 = new FrameworkSQLiteOpenHelper.b(null);
                aVar2 = FrameworkSQLiteOpenHelper.this.c;
                z3 = FrameworkSQLiteOpenHelper.this.e;
                openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context2, str3, bVar2, aVar2, z3);
                z4 = FrameworkSQLiteOpenHelper.this.g;
                nc8.f(openHelper, z4);
                return openHelper;
            }
        });
    }

    private final OpenHelper l() {
        return (OpenHelper) this.f.getValue();
    }

    @Override // defpackage.tc8, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f.a()) {
            l().close();
        }
    }

    @Override // defpackage.tc8
    public String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.tc8
    public sc8 o() {
        return l().d(true);
    }

    @Override // defpackage.tc8
    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f.a()) {
            nc8.f(l(), z);
        }
        this.g = z;
    }
}
