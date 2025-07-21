package kotlin.collections;

import defpackage.zq3;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class d0 extends c0 {
    public static Set e() {
        return EmptySet.a;
    }

    public static HashSet f(Object... objArr) {
        zq3.h(objArr, "elements");
        return (HashSet) ArraysKt___ArraysKt.A0(objArr, new HashSet(t.e(objArr.length)));
    }

    public static LinkedHashSet g(Object... objArr) {
        zq3.h(objArr, "elements");
        return (LinkedHashSet) ArraysKt___ArraysKt.A0(objArr, new LinkedHashSet(t.e(objArr.length)));
    }

    public static Set h(Object... objArr) {
        zq3.h(objArr, "elements");
        return (Set) ArraysKt___ArraysKt.A0(objArr, new LinkedHashSet(t.e(objArr.length)));
    }

    public static final Set i(Set set) {
        zq3.h(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : b0.d(set.iterator().next()) : b0.e();
    }

    public static Set j(Object... objArr) {
        zq3.h(objArr, "elements");
        return d.F0(objArr);
    }
}
