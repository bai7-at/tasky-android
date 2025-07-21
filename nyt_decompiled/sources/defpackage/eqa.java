package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class eqa {
    private final List a = new LinkedList();
    private final Map b;
    private final Object c;

    public eqa(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final bqa f() {
        return new bqa(dyf.b().elapsedRealtime(), null, null);
    }

    public final dqa a() {
        dqa dqaVar;
        boolean booleanValue = ((Boolean) pla.c().a(mpa.Q1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.c) {
            try {
                for (bqa bqaVar : this.a) {
                    long a = bqaVar.a();
                    String c = bqaVar.c();
                    bqa b = bqaVar.b();
                    if (b != null && a > 0) {
                        long a2 = a - b.a();
                        sb.append(c);
                        sb.append('.');
                        sb.append(a2);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(b.a()))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(b.a()));
                                sb2.append('+');
                                sb2.append(c);
                            } else {
                                hashMap.put(Long.valueOf(b.a()), new StringBuilder(c));
                            }
                        }
                    }
                }
                this.a.clear();
                String str = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(dyf.b().currentTimeMillis() + (((Long) entry.getKey()).longValue() - dyf.b().elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str = sb3.toString();
                }
                dqaVar = new dqa(sb.toString(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dqaVar;
    }

    public final Map b() {
        Map map;
        synchronized (this.c) {
            dyf.q().g();
            map = this.b;
        }
        return map;
    }

    public final void c(eqa eqaVar) {
        synchronized (this.c) {
        }
    }

    public final void d(String str, String str2) {
        upa g;
        if (TextUtils.isEmpty(str2) || (g = dyf.q().g()) == null) {
            return;
        }
        synchronized (this.c) {
            aqa a = g.a(str);
            Map map = this.b;
            map.put(str, a.a((String) map.get(str), str2));
        }
    }

    public final boolean e(bqa bqaVar, long j, String... strArr) {
        synchronized (this.c) {
            for (int i = 0; i <= 0; i++) {
                try {
                    this.a.add(new bqa(j, strArr[i], bqaVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return true;
    }
}
