package defpackage;

import androidx.paging.LoadType;
import androidx.paging.s;

/* loaded from: classes.dex */
public abstract class v83 {
    public static final boolean a(s sVar, s sVar2, LoadType loadType) {
        zq3.h(sVar, "<this>");
        zq3.h(loadType, "loadType");
        if (sVar2 == null) {
            return true;
        }
        if ((sVar2 instanceof s.b) && (sVar instanceof s.a)) {
            return true;
        }
        return (((sVar instanceof s.b) && (sVar2 instanceof s.a)) || (sVar.a() == sVar2.a() && sVar.b() == sVar2.b() && sVar2.e(loadType) <= sVar.e(loadType))) ? false : true;
    }
}
