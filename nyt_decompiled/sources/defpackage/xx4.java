package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.t21;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class xx4 extends t21 {
    /* JADX WARN: Multi-variable type inference failed */
    public xx4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.t21
    public Object a(t21.b bVar) {
        zq3.h(bVar, TransferTable.COLUMN_KEY);
        return b().get(bVar);
    }

    public final void c(t21.b bVar, Object obj) {
        zq3.h(bVar, TransferTable.COLUMN_KEY);
        b().put(bVar, obj);
    }

    public xx4(t21 t21Var) {
        zq3.h(t21Var, "initialExtras");
        b().putAll(t21Var.b());
    }

    public /* synthetic */ xx4(t21 t21Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? t21.a.b : t21Var);
    }
}
