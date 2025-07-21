package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface oc {

    public interface a {
    }

    public interface b {
        void a(int i, Bundle bundle);
    }

    public static class c {
        public String a;
        public String b;
        public Object c;
        public String d;
        public long e;
        public String f;
        public Bundle g;
        public String h;
        public Bundle i;
        public long j;
        public String k;
        public Bundle l;
        public long m;
        public boolean n;
        public long o;
    }

    void a(c cVar);

    void b(String str, String str2, Bundle bundle);

    void c(String str, String str2, Object obj);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    Map d(boolean z);

    a e(String str, b bVar);

    int f(String str);

    List g(String str, String str2);
}
