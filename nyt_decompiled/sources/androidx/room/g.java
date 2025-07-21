package androidx.room;

import android.database.Cursor;
import defpackage.gm0;
import defpackage.o27;
import defpackage.ps7;
import defpackage.sc8;
import defpackage.tc8;
import defpackage.wt4;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class g extends tc8.a {
    public static final a g = new a(null);
    private androidx.room.a c;
    private final b d;
    private final String e;
    private final String f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
            Cursor T0 = sc8Var.T0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (T0.moveToFirst()) {
                    if (T0.getInt(0) == 0) {
                        z = true;
                    }
                }
                gm0.a(T0, null);
                return z;
            } finally {
            }
        }

        public final boolean b(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
            Cursor T0 = sc8Var.T0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z = false;
                if (T0.moveToFirst()) {
                    if (T0.getInt(0) != 0) {
                        z = true;
                    }
                }
                gm0.a(T0, null);
                return z;
            } finally {
            }
        }

        private a() {
        }
    }

    public static abstract class b {
        public final int version;

        public b(int i) {
            this.version = i;
        }

        public abstract void createAllTables(sc8 sc8Var);

        public abstract void dropAllTables(sc8 sc8Var);

        public abstract void onCreate(sc8 sc8Var);

        public abstract void onOpen(sc8 sc8Var);

        public abstract void onPostMigrate(sc8 sc8Var);

        public abstract void onPreMigrate(sc8 sc8Var);

        public abstract c onValidateSchema(sc8 sc8Var);

        protected void validateMigration(sc8 sc8Var) {
            zq3.h(sc8Var, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    public static class c {
        public final boolean a;
        public final String b;

        public c(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.room.a aVar, b bVar, String str, String str2) {
        super(bVar.version);
        zq3.h(aVar, "configuration");
        zq3.h(bVar, "delegate");
        zq3.h(str, "identityHash");
        zq3.h(str2, "legacyHash");
        this.c = aVar;
        this.d = bVar;
        this.e = str;
        this.f = str2;
    }

    private final void h(sc8 sc8Var) {
        if (!g.b(sc8Var)) {
            c onValidateSchema = this.d.onValidateSchema(sc8Var);
            if (onValidateSchema.a) {
                this.d.onPostMigrate(sc8Var);
                j(sc8Var);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.b);
            }
        }
        Cursor v = sc8Var.v(new ps7("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = v.moveToFirst() ? v.getString(0) : null;
            gm0.a(v, null);
            if (zq3.c(this.e, string) || zq3.c(this.f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.e + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                gm0.a(v, th);
                throw th2;
            }
        }
    }

    private final void i(sc8 sc8Var) {
        sc8Var.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(sc8 sc8Var) {
        i(sc8Var);
        sc8Var.B(o27.a(this.e));
    }

    @Override // tc8.a
    public void b(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        super.b(sc8Var);
    }

    @Override // tc8.a
    public void d(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        boolean a2 = g.a(sc8Var);
        this.d.createAllTables(sc8Var);
        if (!a2) {
            c onValidateSchema = this.d.onValidateSchema(sc8Var);
            if (!onValidateSchema.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.b);
            }
        }
        j(sc8Var);
        this.d.onCreate(sc8Var);
    }

    @Override // tc8.a
    public void e(sc8 sc8Var, int i, int i2) {
        zq3.h(sc8Var, "db");
        g(sc8Var, i, i2);
    }

    @Override // tc8.a
    public void f(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        super.f(sc8Var);
        h(sc8Var);
        this.d.onOpen(sc8Var);
        this.c = null;
    }

    @Override // tc8.a
    public void g(sc8 sc8Var, int i, int i2) {
        List d;
        zq3.h(sc8Var, "db");
        androidx.room.a aVar = this.c;
        if (aVar == null || (d = aVar.d.d(i, i2)) == null) {
            androidx.room.a aVar2 = this.c;
            if (aVar2 != null && !aVar2.a(i, i2)) {
                this.d.dropAllTables(sc8Var);
                this.d.createAllTables(sc8Var);
                return;
            }
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.d.onPreMigrate(sc8Var);
        Iterator it2 = d.iterator();
        while (it2.hasNext()) {
            ((wt4) it2.next()).a(sc8Var);
        }
        c onValidateSchema = this.d.onValidateSchema(sc8Var);
        if (onValidateSchema.a) {
            this.d.onPostMigrate(sc8Var);
            j(sc8Var);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.b);
        }
    }
}
