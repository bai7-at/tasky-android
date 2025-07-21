package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t21 {
    private final Map a = new LinkedHashMap();

    public static final class a extends t21 {
        public static final a b = new a();

        private a() {
        }

        @Override // defpackage.t21
        public Object a(b bVar) {
            zq3.h(bVar, TransferTable.COLUMN_KEY);
            return null;
        }
    }

    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.a;
    }
}
