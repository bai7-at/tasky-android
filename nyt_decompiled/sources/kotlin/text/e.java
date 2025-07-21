package kotlin.text;

import defpackage.hf4;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes5.dex */
public interface e {

    public static final class a {
        public static b a(e eVar) {
            return new b(eVar);
        }
    }

    public static final class b {
        private final e a;

        public b(e eVar) {
            zq3.h(eVar, "match");
            this.a = eVar;
        }

        public final e a() {
            return this.a;
        }
    }

    b a();

    List b();

    hf4 c();
}
