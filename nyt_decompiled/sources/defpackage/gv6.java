package defpackage;

import androidx.room.RoomDatabase;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class gv6 {
    public static final void a(so soVar, boolean z, ss2 ss2Var) {
        zq3.h(soVar, "map");
        zq3.h(ss2Var, "fetchBlock");
        so soVar2 = new so(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        int size = soVar.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (z) {
                soVar2.put(soVar.i(i), soVar.n(i));
            } else {
                soVar2.put(soVar.i(i), null);
            }
            i++;
            i2++;
            if (i2 == 999) {
                ss2Var.invoke(soVar2);
                if (!z) {
                    soVar.putAll(soVar2);
                }
                soVar2.clear();
                i2 = 0;
            }
        }
        if (i2 > 0) {
            ss2Var.invoke(soVar2);
            if (z) {
                return;
            }
            soVar.putAll(soVar2);
        }
    }

    public static final void b(HashMap hashMap, boolean z, ss2 ss2Var) {
        int i;
        zq3.h(hashMap, "map");
        zq3.h(ss2Var, "fetchBlock");
        HashMap hashMap2 = new HashMap(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        loop0: while (true) {
            i = 0;
            for (Object obj : hashMap.keySet()) {
                if (z) {
                    zq3.g(obj, TransferTable.COLUMN_KEY);
                    hashMap2.put(obj, hashMap.get(obj));
                } else {
                    zq3.g(obj, TransferTable.COLUMN_KEY);
                    hashMap2.put(obj, null);
                }
                i++;
                if (i == 999) {
                    ss2Var.invoke(hashMap2);
                    if (!z) {
                        hashMap.putAll(hashMap2);
                    }
                    hashMap2.clear();
                }
            }
            break loop0;
        }
        if (i > 0) {
            ss2Var.invoke(hashMap2);
            if (z) {
                return;
            }
            hashMap.putAll(hashMap2);
        }
    }
}
