package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class kc0 {
    private final List a;

    public kc0(List list) {
        this.a = Collections.synchronizedList(list);
    }

    public List a() {
        return this.a;
    }

    public kc0() {
        this.a = Collections.synchronizedList(new ArrayList());
    }
}
