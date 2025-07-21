package kotlinx.coroutines.internal;

import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class InlineList<E> {
    private final Object holder;

    private /* synthetic */ InlineList(Object obj) {
        this.holder = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineList m926boximpl(Object obj) {
        return new InlineList(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <E> Object m927constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ Object m928constructorimpl$default(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m927constructorimpl(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m929equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof InlineList) && zq3.c(obj, ((InlineList) obj2).m935unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m930equalsimpl0(Object obj, Object obj2) {
        return zq3.c(obj, obj2);
    }

    /* renamed from: forEachReversed-impl, reason: not valid java name */
    public static final void m931forEachReversedimpl(Object obj, ss2 ss2Var) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ss2Var.invoke(obj);
            return;
        }
        zq3.f(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                ss2Var.invoke(arrayList.get(size));
            }
        }
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m932hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final Object m933plusFjFbRPM(Object obj, E e) {
        if (obj == null) {
            return m927constructorimpl(e);
        }
        if (obj instanceof ArrayList) {
            zq3.f(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(e);
            return m927constructorimpl(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m927constructorimpl(arrayList);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m934toStringimpl(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m929equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m932hashCodeimpl(this.holder);
    }

    public String toString() {
        return m934toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m935unboximpl() {
        return this.holder;
    }
}
