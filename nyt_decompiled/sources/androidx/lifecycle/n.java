package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.lifecycle.n;
import androidx.savedstate.a;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.du8;
import defpackage.fy4;
import defpackage.le0;
import defpackage.lh4;
import defpackage.zq3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes.dex */
public final class n {
    public static final a f = new a(null);
    private static final Class[] g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    private final Map a;
    private final Map b;
    private final Map c;
    private final Map d;
    private final a.c e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new n();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    zq3.g(str, TransferTable.COLUMN_KEY);
                    hashMap.put(str, bundle2.get(str));
                }
                return new n(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                zq3.f(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new n(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : n.g) {
                zq3.e(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public n(Map map) {
        zq3.h(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a.c() { // from class: v97
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle h;
                h = n.h(n.this);
                return h;
            }
        };
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle h(n nVar) {
        zq3.h(nVar, "this$0");
        for (Map.Entry entry : kotlin.collections.t.v(nVar.b).entrySet()) {
            nVar.i((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = nVar.a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(nVar.a.get(str));
        }
        return le0.a(du8.a("keys", arrayList), du8.a("values", arrayList2));
    }

    public final boolean c(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return this.a.containsKey(str);
    }

    public final Object d(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        try {
            return this.a.get(str);
        } catch (ClassCastException unused) {
            this.f(str);
            return null;
        }
    }

    public final StateFlow e(String str, Object obj) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        Map map = this.d;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, obj);
            }
            obj2 = StateFlowKt.MutableStateFlow(this.a.get(str));
            this.d.put(str, obj2);
            map.put(str, obj2);
        }
        StateFlow asStateFlow = FlowKt.asStateFlow((MutableStateFlow) obj2);
        zq3.f(asStateFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return asStateFlow;
    }

    public final Object f(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        Object remove = this.a.remove(str);
        lh4.a(this.c.remove(str));
        this.d.remove(str);
        return remove;
    }

    public final a.c g() {
        return this.e;
    }

    public final void i(String str, Object obj) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        if (!f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            zq3.e(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.c.get(str);
        fy4 fy4Var = obj2 instanceof fy4 ? (fy4) obj2 : null;
        if (fy4Var != null) {
            fy4Var.p(obj);
        } else {
            this.a.put(str, obj);
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.d.get(str);
        if (mutableStateFlow == null) {
            return;
        }
        mutableStateFlow.setValue(obj);
    }

    public n() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a.c() { // from class: v97
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle h;
                h = n.h(n.this);
                return h;
            }
        };
    }
}
