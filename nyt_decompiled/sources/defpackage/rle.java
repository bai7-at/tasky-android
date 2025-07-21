package defpackage;

import com.google.android.gms.internal.ads.of;
import com.google.android.gms.internal.ads.zzgvz;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class rle {
    private final Class a;
    private sle d;
    private ConcurrentMap b = new ConcurrentHashMap();
    private final List c = new ArrayList();
    private pxe e = pxe.b;

    /* synthetic */ rle(Class cls, qle qleVar) {
        this.a = cls;
    }

    private final rle e(Object obj, Object obj2, of ofVar, boolean z) {
        byte[] array;
        if (this.b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (ofVar.U() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Integer valueOf = Integer.valueOf(ofVar.L());
        if (ofVar.P() == zzgvz.RAW) {
            valueOf = null;
        }
        ble b = ste.d().b(lue.a(ofVar.M().Q(), ofVar.M().P(), ofVar.M().M(), ofVar.P(), valueOf), dme.a());
        int ordinal = ofVar.P().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    array = vke.a;
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(ofVar.L()).array();
        } else {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(ofVar.L()).array();
        }
        sle sleVar = new sle(obj, obj2, array, ofVar.U(), ofVar.P(), ofVar.L(), ofVar.M().Q(), b);
        ConcurrentMap concurrentMap = this.b;
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(sleVar);
        ule uleVar = new ule(sleVar.g(), null);
        List list2 = (List) concurrentMap.put(uleVar, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(sleVar);
            concurrentMap.put(uleVar, Collections.unmodifiableList(arrayList2));
        }
        list.add(sleVar);
        if (z) {
            if (this.d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.d = sleVar;
        }
        return this;
    }

    public final rle a(Object obj, Object obj2, of ofVar) {
        e(obj, obj2, ofVar, false);
        return this;
    }

    public final rle b(Object obj, Object obj2, of ofVar) {
        e(obj, obj2, ofVar, true);
        return this;
    }

    public final rle c(pxe pxeVar) {
        if (this.b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.e = pxeVar;
        return this;
    }

    public final wle d() {
        ConcurrentMap concurrentMap = this.b;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        wle wleVar = new wle(concurrentMap, this.c, this.d, this.e, this.a, null);
        this.b = null;
        return wleVar;
    }
}
