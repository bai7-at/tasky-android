package defpackage;

import androidx.lifecycle.LiveData;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* loaded from: classes.dex */
final class mi5 implements hi5 {
    private final LiveData c;
    private final j64 d;

    public mi5(LiveData liveData, j64 j64Var) {
        zq3.h(liveData, TransferTable.COLUMN_STATE);
        zq3.h(j64Var, "future");
        this.c = liveData;
        this.d = j64Var;
    }
}
