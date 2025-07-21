package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ug1 implements mw0 {
    public static final ug1 c = new ug1(Collections.emptyMap());
    private int a;
    private final Map b;

    public ug1(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    private static void a(HashMap hashMap, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), h(entry.getValue()));
        }
    }

    private static Map e(Map map, ow0 ow0Var) {
        HashMap hashMap = new HashMap(map);
        j(hashMap, ow0Var.c());
        a(hashMap, ow0Var.b());
        return hashMap;
    }

    private static byte[] h(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(zj0.c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static boolean i(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void j(HashMap hashMap, List list) {
        for (int i = 0; i < list.size(); i++) {
            hashMap.remove(list.get(i));
        }
    }

    @Override // defpackage.mw0
    public final String b(String str, String str2) {
        byte[] bArr = (byte[]) this.b.get(str);
        return bArr != null ? new String(bArr, zj0.c) : str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ug1.class != obj.getClass()) {
            return false;
        }
        return i(this.b, ((ug1) obj).b);
    }

    public ug1 f(ow0 ow0Var) {
        Map e = e(this.b, ow0Var);
        return i(this.b, e) ? this : new ug1(e);
    }

    public Set g() {
        return this.b.entrySet();
    }

    @Override // defpackage.mw0
    public final long get(String str, long j) {
        byte[] bArr = (byte[]) this.b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }

    public int hashCode() {
        if (this.a == 0) {
            int i = 0;
            for (Map.Entry entry : this.b.entrySet()) {
                i += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.a = i;
        }
        return this.a;
    }
}
