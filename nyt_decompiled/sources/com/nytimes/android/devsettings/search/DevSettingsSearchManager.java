package com.nytimes.android.devsettings.search;

import defpackage.g48;
import defpackage.i74;
import defpackage.tp0;
import defpackage.vn1;
import defpackage.wn1;
import defpackage.zq3;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.text.h;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class DevSettingsSearchManager {
    private final List a;
    private final MutableStateFlow b;
    private final StateFlow c;
    private final Map d;

    public static final class DevSettingSearchManagerException extends RuntimeException {
        private final String message;

        public DevSettingSearchManagerException(String str) {
            this.message = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(((wn1) obj).b(), ((wn1) obj2).b());
        }
    }

    public DevSettingsSearchManager(Set set) {
        zq3.h(set, "installedItems");
        Set set2 = set;
        this.a = i.X0(set2);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.b = MutableStateFlow;
        this.c = FlowKt.asStateFlow(MutableStateFlow);
        this.d = new HashMap();
        c(i.X0(set2));
    }

    private final void c(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            wn1 wn1Var = (wn1) it2.next();
            String a2 = g48.a(wn1Var.getTitle(), i74.b.a());
            if (this.d.containsKey(a2)) {
                throw new DevSettingSearchManagerException("ERROR in DEV SETTINGS Setup!! There is a circular reference in your dependencies or one of your items has a name already used!. Look for: " + a2);
            }
            this.d.put(a2, wn1Var);
            if (wn1Var instanceof vn1) {
                vn1 vn1Var = (vn1) wn1Var;
                if (vn1Var.g()) {
                    c(vn1Var.a());
                }
            }
        }
    }

    public final List a() {
        return this.a;
    }

    public final StateFlow b() {
        return this.c;
    }

    public final void d(String str) {
        zq3.h(str, "searchTerm");
        String a2 = g48.a(h.c1(str).toString(), i74.b.a());
        MutableStateFlow mutableStateFlow = this.b;
        List list = null;
        if (a2.length() > 0) {
            Map map = this.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (h.P((String) entry.getKey(), str, false, 2, null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            list = i.N0(linkedHashMap.values(), new a());
        }
        mutableStateFlow.setValue(list);
    }
}
