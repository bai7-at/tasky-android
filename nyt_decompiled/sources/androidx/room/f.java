package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class f {
    public static final f a = new f();

    private f() {
    }

    public static final RoomDatabase.a a(Context context, Class cls, String str) {
        zq3.h(context, "context");
        zq3.h(cls, "klass");
        if (str == null || kotlin.text.h.d0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new RoomDatabase.a(context, cls, str);
    }

    public static final Object b(Class cls, String str) {
        String str2;
        zq3.h(cls, "klass");
        zq3.h(str, "suffix");
        Package r0 = cls.getPackage();
        zq3.e(r0);
        String name = r0.getName();
        String canonicalName = cls.getCanonicalName();
        zq3.e(canonicalName);
        zq3.g(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            zq3.g(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = kotlin.text.h.E(canonicalName, '.', '_', false, 4, null) + str;
        try {
            if (name.length() == 0) {
                str2 = str3;
            } else {
                str2 = name + '.' + str3;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            zq3.f(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    public static final RoomDatabase.a c(Context context, Class cls) {
        zq3.h(context, "context");
        zq3.h(cls, "klass");
        return new RoomDatabase.a(context, cls, null);
    }
}
