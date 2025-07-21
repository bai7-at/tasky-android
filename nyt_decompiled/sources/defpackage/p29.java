package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class p29 {
    public static final void a(List list, int i) {
        zq3.h(list, "<this>");
        if (list.contains(Integer.valueOf(i))) {
            list.remove(Integer.valueOf(i));
        } else {
            list.add(Integer.valueOf(i));
        }
    }
}
