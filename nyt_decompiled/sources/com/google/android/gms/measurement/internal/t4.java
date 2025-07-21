package com.google.android.gms.measurement.internal;

import defpackage.zkf;
import java.util.Map;

/* loaded from: classes3.dex */
final class t4 implements zkf {
    final /* synthetic */ String a;
    final /* synthetic */ u4 b;

    t4(u4 u4Var, String str) {
        this.b = u4Var;
        this.a = str;
    }

    @Override // defpackage.zkf
    public final String a(String str) {
        Map map;
        map = this.b.d;
        Map map2 = (Map) map.get(this.a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
