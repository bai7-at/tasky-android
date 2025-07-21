package com.google.android.gms.internal.icing;

import defpackage.i4d;
import defpackage.rlc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class f implements i4d {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static void e(Iterable iterable, List list) {
        b0.a(iterable);
        if (iterable instanceof rlc) {
            List zzh = ((rlc) iterable).zzh();
            rlc rlcVar = (rlc) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    int size2 = rlcVar.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = rlcVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(sb2);
                        }
                        rlcVar.remove(size3);
                    }
                } else if (obj instanceof zzcf) {
                    rlcVar.G((zzcf) obj);
                } else {
                    rlcVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof u0) {
            list.addAll(iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                int size5 = list.size();
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("Element at index ");
                sb3.append(size5 - size4);
                sb3.append(" is null.");
                String sb4 = sb3.toString();
                int size6 = list.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(sb4);
                    }
                    list.remove(size6);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    public final byte[] b() {
        try {
            byte[] bArr = new byte[zzo()];
            r x = r.x(bArr);
            a(x);
            x.c();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    abstract int c();

    abstract void d(int i);
}
