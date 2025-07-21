package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.firebase.crashlytics.a;

/* loaded from: classes4.dex */
public final class j21 implements i21 {
    @Override // defpackage.i21
    public void a(String str) {
        zq3.h(str, "userId");
        a.a().f(str);
    }

    @Override // defpackage.i21
    public void b(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "value");
        a.a().e(str, str2);
    }
}
