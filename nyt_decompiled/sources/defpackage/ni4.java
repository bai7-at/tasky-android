package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class ni4 {
    public static final List a(List list) {
        zq3.h(list, "<this>");
        return list.size() > 30 ? list.subList(0, 30) : list.subList(0, list.size());
    }
}
