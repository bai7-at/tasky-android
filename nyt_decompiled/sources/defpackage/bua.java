package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class bua extends tra {
    public String b;
    public long c;
    public String d;
    public String e;
    public String f;

    public bua(String str) {
        String str2 = QueryKeys.ENGAGED_SECONDS;
        this.b = QueryKeys.ENGAGED_SECONDS;
        this.c = -1L;
        this.d = QueryKeys.ENGAGED_SECONDS;
        this.e = QueryKeys.ENGAGED_SECONDS;
        this.f = QueryKeys.ENGAGED_SECONDS;
        HashMap a = tra.a(str);
        if (a != null) {
            this.b = a.get(0) == null ? QueryKeys.ENGAGED_SECONDS : (String) a.get(0);
            this.c = a.get(1) != null ? ((Long) a.get(1)).longValue() : -1L;
            this.d = a.get(2) == null ? QueryKeys.ENGAGED_SECONDS : (String) a.get(2);
            this.e = a.get(3) == null ? QueryKeys.ENGAGED_SECONDS : (String) a.get(3);
            this.f = a.get(4) != null ? (String) a.get(4) : str2;
        }
    }

    @Override // defpackage.tra
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.b);
        hashMap.put(4, this.f);
        hashMap.put(3, this.e);
        hashMap.put(2, this.d);
        hashMap.put(1, Long.valueOf(this.c));
        return hashMap;
    }
}
