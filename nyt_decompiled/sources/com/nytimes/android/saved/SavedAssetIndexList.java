package com.nytimes.android.saved;

import defpackage.i54;
import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.s87;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class SavedAssetIndexList {
    public static final Companion Companion = new Companion(null);
    public static final int e = 8;
    private static final KSerializer[] f;
    private final Map a;
    private final Map b;
    private final Map c;
    private final Map d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return SavedAssetIndexList$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        l48 l48Var = l48.a;
        SavedAssetIndex$$serializer savedAssetIndex$$serializer = SavedAssetIndex$$serializer.INSTANCE;
        f = new KSerializer[]{new i54(l48Var, savedAssetIndex$$serializer), new i54(l48Var, savedAssetIndex$$serializer), new i54(l48Var, savedAssetIndex$$serializer), new i54(l48Var, savedAssetIndex$$serializer)};
    }

    public /* synthetic */ SavedAssetIndexList(int i, Map map, Map map2, Map map3, Map map4, mk7 mk7Var) {
        this.a = (i & 1) == 0 ? new LinkedHashMap() : map;
        if ((i & 2) == 0) {
            this.b = new LinkedHashMap();
        } else {
            this.b = map2;
        }
        if ((i & 4) == 0) {
            this.c = new LinkedHashMap();
        } else {
            this.c = map3;
        }
        if ((i & 8) == 0) {
            this.d = new LinkedHashMap();
        } else {
            this.d = map4;
        }
    }

    private final void n(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            m((SavedAssetIndex) it2.next());
        }
    }

    public static final /* synthetic */ void s(SavedAssetIndexList savedAssetIndexList, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f;
        if (dVar.A(serialDescriptor, 0) || !zq3.c(savedAssetIndexList.a, new LinkedHashMap())) {
            dVar.z(serialDescriptor, 0, kSerializerArr[0], savedAssetIndexList.a);
        }
        if (dVar.A(serialDescriptor, 1) || !zq3.c(savedAssetIndexList.b, new LinkedHashMap())) {
            dVar.z(serialDescriptor, 1, kSerializerArr[1], savedAssetIndexList.b);
        }
        if (dVar.A(serialDescriptor, 2) || !zq3.c(savedAssetIndexList.c, new LinkedHashMap())) {
            dVar.z(serialDescriptor, 2, kSerializerArr[2], savedAssetIndexList.c);
        }
        if (!dVar.A(serialDescriptor, 3) && zq3.c(savedAssetIndexList.d, new LinkedHashMap())) {
            return;
        }
        dVar.z(serialDescriptor, 3, kSerializerArr[3], savedAssetIndexList.d);
    }

    public final void b(SavedAssetIndex savedAssetIndex) {
        zq3.h(savedAssetIndex, "savedAssetIndex");
        this.c.remove(savedAssetIndex.getUrl());
        if (this.a.containsKey(savedAssetIndex.getUrl())) {
            return;
        }
        this.b.put(savedAssetIndex.getUrl(), savedAssetIndex);
    }

    public final void c(SavedAssetIndex savedAssetIndex) {
        zq3.h(savedAssetIndex, "savedAssetIndex");
        this.a.put(savedAssetIndex.getUrl(), savedAssetIndex);
    }

    public final void d(String str) {
        zq3.h(str, "itemToRemoveUrl");
        this.d.remove(str);
    }

    public final void e() {
        n(this.d.values());
        this.d.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedAssetIndexList)) {
            return false;
        }
        SavedAssetIndexList savedAssetIndexList = (SavedAssetIndexList) obj;
        return zq3.c(this.a, savedAssetIndexList.a) && zq3.c(this.b, savedAssetIndexList.b) && zq3.c(this.c, savedAssetIndexList.c) && zq3.c(this.d, savedAssetIndexList.d);
    }

    public final List f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.values());
        arrayList.addAll(this.a.values());
        arrayList.removeAll(this.c.values());
        i.z(arrayList);
        return arrayList;
    }

    public final List g() {
        return i.X0(this.b.values());
    }

    public final List h() {
        return i.X0(this.c.values());
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final List i() {
        return i.X0(this.a.values());
    }

    public final boolean j(String str) {
        zq3.h(str, "url");
        return !this.c.containsKey(str) && (this.b.containsKey(str) || this.a.containsKey(str)) && !this.d.containsKey(str);
    }

    public final void k(SavedAssetIndex savedAssetIndex) {
        zq3.h(savedAssetIndex, "savedAssetIndex");
        this.b.remove(savedAssetIndex.getUrl());
        if (this.a.containsKey(savedAssetIndex.getUrl())) {
            this.d.put(savedAssetIndex.getUrl(), savedAssetIndex);
        }
    }

    public final void l(s87 s87Var) {
        zq3.h(s87Var, "savedAssetIndex");
        this.a.remove(s87Var.getUrl());
    }

    public final void m(SavedAssetIndex savedAssetIndex) {
        zq3.h(savedAssetIndex, "savedAssetIndex");
        this.b.remove(savedAssetIndex.getUrl());
        if (this.a.containsKey(savedAssetIndex.getUrl())) {
            this.c.put(savedAssetIndex.getUrl(), savedAssetIndex);
        }
    }

    public final void o(Collection collection) {
        zq3.h(collection, "itemsToRemove");
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            SavedAssetIndex savedAssetIndex = (SavedAssetIndex) it2.next();
            this.a.put(savedAssetIndex.getUrl(), savedAssetIndex);
            this.b.remove(savedAssetIndex.getUrl());
        }
    }

    public final void p(Collection collection) {
        zq3.h(collection, "itemsToRemove");
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            s87 s87Var = (s87) it2.next();
            this.a.remove(s87Var.getUrl());
            this.c.remove(s87Var.getUrl());
        }
    }

    public final int q() {
        return f().size();
    }

    public final void r(List list) {
        zq3.h(list, "itemsToUpdate");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SavedAssetIndex savedAssetIndex = (SavedAssetIndex) it2.next();
            this.a.put(savedAssetIndex.getUrl(), savedAssetIndex);
        }
    }

    public String toString() {
        return "SavedAssetIndexList(syncedItemsTable=" + this.a + ", itemsToAddTable=" + this.b + ", itemsToDeleteTable=" + this.c + ", queuedToDelete=" + this.d + ")";
    }

    public SavedAssetIndexList(Map map, Map map2, Map map3, Map map4) {
        zq3.h(map, "syncedItemsTable");
        zq3.h(map2, "itemsToAddTable");
        zq3.h(map3, "itemsToDeleteTable");
        zq3.h(map4, "queuedToDelete");
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    public /* synthetic */ SavedAssetIndexList(Map map, Map map2, Map map3, Map map4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? new LinkedHashMap() : map2, (i & 4) != 0 ? new LinkedHashMap() : map3, (i & 8) != 0 ? new LinkedHashMap() : map4);
    }
}
