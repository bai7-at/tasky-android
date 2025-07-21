package androidx.compose.runtime.saveable;

import defpackage.ea7;
import defpackage.fa7;
import defpackage.gt2;
import defpackage.ku8;
import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ListSaverKt {
    public static final ea7 a(final gt2 gt2Var, ss2 ss2Var) {
        gt2 gt2Var2 = new gt2() { // from class: androidx.compose.runtime.saveable.ListSaverKt$listSaver$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(fa7 fa7Var, Object obj) {
                List list = (List) gt2.this.invoke(fa7Var, obj);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    if (obj2 != null && !fa7Var.a(obj2)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                List list2 = list;
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            }
        };
        zq3.f(ss2Var, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return SaverKt.a(gt2Var2, (ss2) ku8.f(ss2Var, 1));
    }
}
