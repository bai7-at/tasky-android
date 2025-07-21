package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.eventtracker.UserType;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class lz8 extends ue4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz8(String str, String str2, UserType userType, Set set, boolean z, q09 q09Var) {
        super(du8.a("cookie.nyts", str), du8.a("regi_id", str2), du8.a(TransferTable.COLUMN_TYPE, userType.getValue()), du8.a("entitlements", set != null ? i.u0(set, null, null, null, 0, null, null, 63, null) : null), du8.a("is_upgradeable", Boolean.valueOf(z)), du8.a("others", q09Var));
        zq3.h(userType, TransferTable.COLUMN_TYPE);
    }
}
