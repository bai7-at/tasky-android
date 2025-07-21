package com.google.common.collect;

import defpackage.tx4;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class q {

    static final class b {
        private final Field a;

        void a(Object obj, int i) {
            try {
                this.a.set(obj, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        void b(Object obj, Object obj2) {
            try {
                this.a.set(obj, obj2);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        private b(Field field) {
            this.a = field;
            field.setAccessible(true);
        }
    }

    static b a(Class cls, String str) {
        try {
            return new b(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    static void b(Map map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    static int c(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    static void d(Map map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    static void e(tx4 tx4Var, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(tx4Var.c().size());
        for (Map.Entry entry : tx4Var.c().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it2 = ((Collection) entry.getValue()).iterator();
            while (it2.hasNext()) {
                objectOutputStream.writeObject(it2.next());
            }
        }
    }
}
