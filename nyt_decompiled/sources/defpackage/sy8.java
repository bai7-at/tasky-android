package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.c;
import kotlin.collections.i;
import kotlin.collections.t;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class sy8 implements pa3 {
    private final Map a;
    private final ByteString b;
    private final String c;
    private final String d;
    private final c04 e;

    public sy8(Map map, ByteString byteString) {
        zq3.h(map, "uploads");
        zq3.h(byteString, "operationByteString");
        this.a = map;
        this.b = byteString;
        UUID randomUUID = UUID.randomUUID();
        zq3.g(randomUUID, "randomUUID(...)");
        String uuid = randomUUID.toString();
        zq3.g(uuid, "toString(...)");
        this.c = uuid;
        this.d = "multipart/form-data; boundary=" + uuid;
        this.e = c.a(new qs2() { // from class: ry8
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                long d;
                d = sy8.d(sy8.this);
                return Long.valueOf(d);
            }
        });
    }

    private final ByteString c(Map map) {
        ad0 ad0Var = new ad0();
        rd0 rd0Var = new rd0(ad0Var, null);
        Set entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(i.w(entrySet, 10));
        int i = 0;
        for (Object obj : entrySet) {
            int i2 = i + 1;
            if (i < 0) {
                i.v();
            }
            arrayList.add(du8.a(String.valueOf(i), i.e(((Map.Entry) obj).getKey())));
            i = i2;
        }
        k.a(rd0Var, t.t(arrayList));
        return ad0Var.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(sy8 sy8Var) {
        x01 x01Var = new x01(wd5.b());
        qd0 c = wd5.c(x01Var);
        sy8Var.e(c, false);
        c.flush();
        long a = x01Var.a();
        Iterator it2 = sy8Var.a.values().iterator();
        if (!it2.hasNext()) {
            return a;
        }
        lh4.a(it2.next());
        throw null;
    }

    private final void e(qd0 qd0Var, boolean z) {
        qd0Var.V("--" + this.c + "\r\n");
        qd0Var.V("Content-Disposition: form-data; name=\"operations\"\r\n");
        qd0Var.V("Content-Type: application/json\r\n");
        qd0Var.V("Content-Length: " + this.b.E() + "\r\n");
        qd0Var.V("\r\n");
        qd0Var.m1(this.b);
        ByteString c = c(this.a);
        qd0Var.V("\r\n--" + this.c + "\r\n");
        qd0Var.V("Content-Disposition: form-data; name=\"map\"\r\n");
        qd0Var.V("Content-Type: application/json\r\n");
        qd0Var.V("Content-Length: " + c.E() + "\r\n");
        qd0Var.V("\r\n");
        qd0Var.m1(c);
        Iterator it2 = this.a.values().iterator();
        if (!it2.hasNext()) {
            qd0Var.V("\r\n--" + this.c + "--\r\n");
            return;
        }
        lh4.a(it2.next());
        qd0Var.V("\r\n--" + this.c + "\r\n");
        qd0Var.V("Content-Disposition: form-data; name=\"0\"");
        throw null;
    }

    @Override // defpackage.pa3
    public void a(qd0 qd0Var) {
        zq3.h(qd0Var, "bufferedSink");
        e(qd0Var, true);
    }

    @Override // defpackage.pa3
    public long getContentLength() {
        return ((Number) this.e.getValue()).longValue();
    }

    @Override // defpackage.pa3
    public String getContentType() {
        return this.d;
    }
}
