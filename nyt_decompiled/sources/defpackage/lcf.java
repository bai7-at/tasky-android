package defpackage;

import com.google.android.gms.internal.pal.s7;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class lcf {
    private final Class a;
    private ncf c;
    private ConcurrentMap b = new ConcurrentHashMap();
    private gvf d = gvf.b;

    /* synthetic */ lcf(Class cls, jcf jcfVar) {
        this.a = cls;
    }

    private final lcf e(Object obj, s7 s7Var, boolean z) {
        byte[] array;
        if (this.b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (s7Var.E() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        ConcurrentMap concurrentMap = this.b;
        Integer valueOf = Integer.valueOf(s7Var.s());
        if (s7Var.F() == 5) {
            valueOf = null;
        }
        cbf a = eqf.b().a(frf.e(s7Var.t().x(), s7Var.t().w(), s7Var.t().t(), s7Var.F(), valueOf), tdf.a());
        hcf scfVar = a instanceof jpf ? new scf(s7Var.t().x(), s7Var.F(), null) : a.a();
        int F = s7Var.F() - 2;
        if (F != 1) {
            if (F != 2) {
                if (F == 3) {
                    array = jaf.a;
                } else if (F != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(s7Var.s()).array();
        } else {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(s7Var.s()).array();
        }
        ncf ncfVar = new ncf(obj, array, s7Var.E(), s7Var.F(), s7Var.s(), a, scfVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ncfVar);
        qcf qcfVar = new qcf(ncfVar.d(), null);
        List list = (List) concurrentMap.put(qcfVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(ncfVar);
            concurrentMap.put(qcfVar, Collections.unmodifiableList(arrayList2));
        }
        if (z) {
            if (this.c != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.c = ncfVar;
        }
        return this;
    }

    public final lcf a(Object obj, s7 s7Var) {
        e(obj, s7Var, true);
        return this;
    }

    public final lcf b(Object obj, s7 s7Var) {
        e(obj, s7Var, false);
        return this;
    }

    public final lcf c(gvf gvfVar) {
        if (this.b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.d = gvfVar;
        return this;
    }

    public final jdf d() {
        ConcurrentMap concurrentMap = this.b;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        jdf jdfVar = new jdf(concurrentMap, this.c, this.d, this.a, null);
        this.b = null;
        return jdfVar;
    }
}
