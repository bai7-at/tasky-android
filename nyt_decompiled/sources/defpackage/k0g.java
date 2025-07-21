package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.List;

/* loaded from: classes3.dex */
public final class k0g extends l1a {
    private final c8g c;

    public k0g(c8g c8gVar) {
        super("internal.registerCallback");
        this.c = c8gVar;
    }

    @Override // defpackage.l1a
    public final caa b(xhe xheVar, List list) {
        s0f.h(this.a, 3, list);
        String zzi = xheVar.b((caa) list.get(0)).zzi();
        caa b = xheVar.b((caa) list.get(1));
        if (!(b instanceof a9a)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        caa b2 = xheVar.b((caa) list.get(2));
        if (!(b2 instanceof m6a)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        m6a m6aVar = (m6a) b2;
        if (!m6aVar.W(TransferTable.COLUMN_TYPE)) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.c.a(zzi, m6aVar.W("priority") ? s0f.b(m6aVar.n("priority").zzh().doubleValue()) : NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, (a9a) b, m6aVar.n(TransferTable.COLUMN_TYPE).zzi());
        return caa.T;
    }
}
