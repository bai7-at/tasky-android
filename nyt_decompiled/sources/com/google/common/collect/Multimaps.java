package com.google.common.collect;

import defpackage.a64;
import defpackage.b16;
import defpackage.gc8;
import defpackage.tx4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class Multimaps {

    private static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient gc8 g;

        CustomListMultimap(Map map, gc8 gc8Var) {
            super(map);
            this.g = (gc8) b16.k(gc8Var);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.g = (gc8) objectInputStream.readObject();
            y((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.g);
            objectOutputStream.writeObject(r());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractMapBasedMultimap
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public List s() {
            return (List) this.g.get();
        }

        @Override // com.google.common.collect.c
        Map e() {
            return u();
        }

        @Override // com.google.common.collect.c
        Set g() {
            return v();
        }
    }

    static abstract class a extends AbstractCollection {
        a() {
        }

        abstract tx4 a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().b(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static boolean a(tx4 tx4Var, Object obj) {
        if (obj == tx4Var) {
            return true;
        }
        if (obj instanceof tx4) {
            return tx4Var.c().equals(((tx4) obj).c());
        }
        return false;
    }

    public static a64 b(Map map, gc8 gc8Var) {
        return new CustomListMultimap(map, gc8Var);
    }
}
