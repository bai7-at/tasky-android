package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes2.dex */
public final class th5 implements dg9 {
    public static final th5 a = new th5();

    private th5() {
    }

    @Override // defpackage.dg9
    public int weigh(Object obj, Object obj2) {
        zq3.h(obj, TransferTable.COLUMN_KEY);
        zq3.h(obj2, "value");
        return 1;
    }
}
