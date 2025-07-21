package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class m3f {
    final LinkedHashMap a;

    m3f(int i) {
        this.a = s3f.b(i);
    }

    final m3f a(Object obj, e4f e4fVar) {
        d4f.a(obj, TransferTable.COLUMN_KEY);
        d4f.a(e4fVar, "provider");
        this.a.put(obj, e4fVar);
        return this;
    }
}
