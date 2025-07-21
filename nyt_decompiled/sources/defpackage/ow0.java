package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ow0 {
    private final Map a = new HashMap();
    private final List b = new ArrayList();

    private ow0 a(String str, Object obj) {
        this.a.put((String) ur.e(str), ur.e(obj));
        this.b.remove(str);
        return this;
    }

    public static ow0 g(ow0 ow0Var, long j) {
        return ow0Var.e("exo_len", j);
    }

    public static ow0 h(ow0 ow0Var, Uri uri) {
        return uri == null ? ow0Var.d("exo_redir") : ow0Var.f("exo_redir", uri.toString());
    }

    public Map b() {
        HashMap hashMap = new HashMap(this.a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public List c() {
        return Collections.unmodifiableList(new ArrayList(this.b));
    }

    public ow0 d(String str) {
        this.b.add(str);
        this.a.remove(str);
        return this;
    }

    public ow0 e(String str, long j) {
        return a(str, Long.valueOf(j));
    }

    public ow0 f(String str, String str2) {
        return a(str, str2);
    }
}
