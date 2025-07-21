package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class h12 implements u60 {
    public static final a e = new a(null);
    private final u60 c;
    private final InternalLogger d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h12(j12 j12Var, u60 u60Var, InternalLogger internalLogger) {
        zq3.h(j12Var, "encryption");
        zq3.h(u60Var, "delegate");
        zq3.h(internalLogger, "internalLogger");
        this.c = u60Var;
        this.d = internalLogger;
    }

    @Override // defpackage.t60
    public List a(File file) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        List<bp6> a2 = this.c.a(file);
        ArrayList arrayList = new ArrayList(i.w(a2, 10));
        for (bp6 bp6Var : a2) {
            if (!(bp6Var.a().length == 0)) {
                bp6Var.a();
                throw null;
            }
            byte[] a3 = bp6Var.a();
            if (!(bp6Var.b().length == 0)) {
                bp6Var.b();
                throw null;
            }
            arrayList.add(new bp6(a3, bp6Var.b()));
        }
        return arrayList;
    }

    @Override // defpackage.kf2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(File file, bp6 bp6Var, boolean z) {
        zq3.h(file, TransferTable.COLUMN_FILE);
        zq3.h(bp6Var, "data");
        bp6Var.a();
        throw null;
    }
}
