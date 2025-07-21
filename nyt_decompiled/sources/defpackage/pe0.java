package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.exoplayer2.g;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class pe0 {
    public static HashMap a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle == Bundle.EMPTY) {
            return hashMap;
        }
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            if (string != null) {
                hashMap.put(str, string);
            }
        }
        return hashMap;
    }

    public static ImmutableMap b(Bundle bundle) {
        return bundle == Bundle.EMPTY ? ImmutableMap.o() : ImmutableMap.f(a(bundle));
    }

    public static void c(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) z19.j(pe0.class.getClassLoader()));
        }
    }

    public static ImmutableList d(g.a aVar, List list) {
        ImmutableList.a p = ImmutableList.p();
        for (int i = 0; i < list.size(); i++) {
            p.a(aVar.a((Bundle) ur.e((Bundle) list.get(i))));
        }
        return p.k();
    }

    public static SparseArray e(g.a aVar, SparseArray sparseArray) {
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), aVar.a((Bundle) sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    public static Bundle f(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList g(Bundle bundle, String str, ArrayList arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle h(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public static ArrayList i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(((g) it2.next()).a());
        }
        return arrayList;
    }

    public static SparseArray j(SparseArray sparseArray) {
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), ((g) sparseArray.valueAt(i)).a());
        }
        return sparseArray2;
    }
}
