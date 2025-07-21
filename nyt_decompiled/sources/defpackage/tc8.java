package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes.dex */
public interface tc8 extends Closeable {

    public static abstract class a {
        public static final C0541a b = new C0541a(null);
        public final int a;

        /* renamed from: tc8$a$a, reason: collision with other inner class name */
        public static final class C0541a {
            public /* synthetic */ C0541a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0541a() {
            }
        }

        public a(int i) {
            this.a = i;
        }

        private final void a(String str) {
            if (h.w(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = zq3.j(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                nc8.c(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        public void b(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
        }

        public void c(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + sc8Var + ".path");
            if (!sc8Var.isOpen()) {
                String path = sc8Var.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List list = null;
            try {
                try {
                    list = sc8Var.x();
                } catch (SQLiteException unused) {
                }
                try {
                    sc8Var.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            } finally {
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Object obj = ((Pair) it2.next()).second;
                        zq3.g(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String path2 = sc8Var.getPath();
                    if (path2 != null) {
                        a(path2);
                    }
                }
            }
        }

        public abstract void d(sc8 sc8Var);

        public abstract void e(sc8 sc8Var, int i, int i2);

        public void f(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
        }

        public abstract void g(sc8 sc8Var, int i, int i2);
    }

    public static final class b {
        public static final C0542b f = new C0542b(null);
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;
        public final boolean e;

        public static class a {
            private final Context a;
            private String b;
            private a c;
            private boolean d;
            private boolean e;

            public a(Context context) {
                zq3.h(context, "context");
                this.a = context;
            }

            public a a(boolean z) {
                this.e = z;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.d && ((str = this.b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.a, this.b, aVar, this.d, this.e);
            }

            public a c(a aVar) {
                zq3.h(aVar, "callback");
                this.c = aVar;
                return this;
            }

            public a d(String str) {
                this.b = str;
                return this;
            }

            public a e(boolean z) {
                this.d = z;
                return this;
            }
        }

        /* renamed from: tc8$b$b, reason: collision with other inner class name */
        public static final class C0542b {
            public /* synthetic */ C0542b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                zq3.h(context, "context");
                return new a(context);
            }

            private C0542b() {
            }
        }

        public b(Context context, String str, a aVar, boolean z, boolean z2) {
            zq3.h(context, "context");
            zq3.h(aVar, "callback");
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
            this.e = z2;
        }

        public static final a a(Context context) {
            return f.a(context);
        }
    }

    public interface c {
        tc8 a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    sc8 o();

    void setWriteAheadLoggingEnabled(boolean z);
}
