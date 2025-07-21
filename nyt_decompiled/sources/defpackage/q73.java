package defpackage;

import defpackage.g04;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public interface q73 {
    public static final q73 a = new a();
    public static final q73 b = new g04.a().a();

    class a implements q73 {
        a() {
        }

        @Override // defpackage.q73
        public Map getHeaders() {
            return Collections.emptyMap();
        }
    }

    Map getHeaders();
}
