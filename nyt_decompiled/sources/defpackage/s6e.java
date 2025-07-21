package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class s6e {
    private final Clock a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();

    public s6e(Clock clock) {
        this.a = clock;
    }

    private final void d(String str, String str2) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, new ArrayList());
        }
        ((List) this.b.get(str)).add(str2);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            int i = 0;
            if (((List) entry.getValue()).size() > 1) {
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    i++;
                    arrayList.add(new r6e(((String) entry.getKey()) + InstructionFileId.DOT + i, (String) it2.next()));
                }
            } else {
                arrayList.add(new r6e((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void b(String str) {
        if (!this.c.containsKey(str)) {
            this.c.put(str, Long.valueOf(this.a.elapsedRealtime()));
            return;
        }
        long elapsedRealtime = this.a.elapsedRealtime() - ((Long) this.c.remove(str)).longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(elapsedRealtime);
        d(str, sb.toString());
    }

    public final void c(String str, String str2) {
        if (!this.c.containsKey(str)) {
            this.c.put(str, Long.valueOf(this.a.elapsedRealtime()));
            return;
        }
        d(str, str2 + (this.a.elapsedRealtime() - ((Long) this.c.remove(str)).longValue()));
    }
}
