package kotlin.enums;

import defpackage.b22;
import defpackage.zq3;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.collections.d;

/* loaded from: classes5.dex */
final class EnumEntriesList<T extends Enum<T>> extends kotlin.collections.a implements b22, Serializable {
    private final T[] entries;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumEntriesList(Enum[] enumArr) {
        zq3.h(enumArr, "entries");
        this.entries = enumArr;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.entries);
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.entries.length;
    }

    public boolean c(Enum r2) {
        zq3.h(r2, "element");
        return ((Enum) d.f0(this.entries, r2.ordinal())) == r2;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return c((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.a, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Enum get(int i) {
        kotlin.collections.a.a.b(i, this.entries.length);
        return this.entries[i];
    }

    public int g(Enum r2) {
        zq3.h(r2, "element");
        int ordinal = r2.ordinal();
        if (((Enum) d.f0(this.entries, ordinal)) == r2) {
            return ordinal;
        }
        return -1;
    }

    @Override // kotlin.collections.a, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return g((Enum) obj);
        }
        return -1;
    }

    public int j(Enum r2) {
        zq3.h(r2, "element");
        return indexOf(r2);
    }

    @Override // kotlin.collections.a, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return j((Enum) obj);
        }
        return -1;
    }
}
