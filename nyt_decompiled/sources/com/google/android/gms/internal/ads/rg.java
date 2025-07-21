package com.google.android.gms.internal.ads;

import defpackage.o1f;
import defpackage.w1f;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class rg implements w1f {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static void g(Iterable iterable, List list) {
        byte[] bArr = ai.d;
        iterable.getClass();
        if (iterable instanceof o1f) {
            List zzh = ((o1f) iterable).zzh();
            o1f o1fVar = (o1f) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String str = "Element at index " + (o1fVar.size() - size) + " is null.";
                    int size2 = o1fVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        o1fVar.remove(size2);
                    }
                } else if (obj instanceof zzgyl) {
                    o1fVar.W0((zzgyl) obj);
                } else {
                    o1fVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof ti) {
            list.addAll(iterable);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
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

    abstract int d(bj bjVar);

    public final zzgyl f() {
        try {
            int e = e();
            zzgyl zzgylVar = zzgyl.a;
            byte[] bArr = new byte[e];
            lh c = lh.c(bArr, 0, e);
            b(c);
            c.d();
            return new zzgyh(bArr);
        } catch (IOException e2) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e2);
        }
    }

    public final void h(OutputStream outputStream) {
        int e = e();
        int i = lh.d;
        if (e > 4096) {
            e = 4096;
        }
        kh khVar = new kh(outputStream, e);
        b(khVar);
        khVar.g();
    }

    public final byte[] i() {
        try {
            int e = e();
            byte[] bArr = new byte[e];
            lh c = lh.c(bArr, 0, e);
            b(c);
            c.d();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e2);
        }
    }
}
