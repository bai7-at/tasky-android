package com.google.android.gms.internal.measurement;

import defpackage.cef;
import defpackage.gcf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class p1 implements cef {
    protected int zzb = 0;

    protected static void c(Iterable iterable, List list) {
        l2.e(iterable);
        if (iterable instanceof gcf) {
            List zzh = ((gcf) iterable).zzh();
            gcf gcfVar = (gcf) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String str = "Element at index " + (gcfVar.size() - size) + " is null.";
                    int size2 = gcfVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        gcfVar.remove(size2);
                    }
                } else if (obj instanceof zzjb) {
                    gcfVar.X((zzjb) obj);
                } else {
                    gcfVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof d3) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(str2);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    abstract int b();

    abstract void d(int i);

    public final byte[] e() {
        try {
            byte[] bArr = new byte[O()];
            b2 c = b2.c(bArr);
            Q(c);
            c.d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
