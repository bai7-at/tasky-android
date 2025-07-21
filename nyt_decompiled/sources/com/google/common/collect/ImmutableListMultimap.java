package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import defpackage.a64;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements a64 {
    private static final long serialVersionUID = 0;

    public static final class a extends ImmutableMultimap.c {
        public ImmutableListMultimap d() {
            return (ImmutableListMultimap) super.a();
        }

        public a e(Object obj, Object obj2) {
            super.c(obj, obj2);
            return this;
        }
    }

    ImmutableListMultimap(ImmutableMap immutableMap, int i) {
        super(immutableMap, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Invalid key count ");
            sb.append(readInt);
            throw new InvalidObjectException(sb.toString());
        }
        ImmutableMap.a a2 = ImmutableMap.a();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid value count ");
                sb2.append(readInt2);
                throw new InvalidObjectException(sb2.toString());
            }
            ImmutableList.a p = ImmutableList.p();
            for (int i3 = 0; i3 < readInt2; i3++) {
                p.a(objectInputStream.readObject());
            }
            a2.f(readObject, p.k());
            i += readInt2;
        }
        try {
            ImmutableMultimap.d.a.b(this, a2.c());
            ImmutableMultimap.d.b.a(this, i);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    static ImmutableListMultimap s(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return u();
        }
        ImmutableMap.a aVar = new ImmutableMap.a(collection.size());
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            ImmutableList t = comparator == null ? ImmutableList.t(collection2) : ImmutableList.C(comparator, collection2);
            if (!t.isEmpty()) {
                aVar.f(key, t);
                i += t.size();
            }
        }
        return new ImmutableListMultimap(aVar.c(), i);
    }

    public static ImmutableListMultimap u() {
        return EmptyImmutableListMultimap.g;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        q.e(this, objectOutputStream);
    }

    @Override // defpackage.tx4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ImmutableList get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.e.get(obj);
        return immutableList == null ? ImmutableList.x() : immutableList;
    }
}
