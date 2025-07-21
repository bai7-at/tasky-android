package com.nytimes.android.unfear.nytdesignsystem.model;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.gt2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public interface HasKey {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();
        private static final gt2 b = new gt2() { // from class: com.nytimes.android.unfear.nytdesignsystem.model.HasKey$Companion$keyCalculator$1
            public final Object b(int i, Object obj) {
                Object key;
                zq3.h(obj, "item");
                HasKey hasKey = obj instanceof HasKey ? (HasKey) obj : null;
                return (hasKey == null || (key = hasKey.getKey()) == null) ? Integer.valueOf(i) : key;
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), obj2);
            }
        };
        private static final gt2 c = new gt2() { // from class: com.nytimes.android.unfear.nytdesignsystem.model.HasKey$Companion$keyListCalculator$1
            public final List b(int i, List list) {
                Object obj;
                zq3.h(list, "items");
                List list2 = list;
                ArrayList arrayList = new ArrayList(i.w(list2, 10));
                int i2 = 0;
                for (Object obj2 : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        i.v();
                    }
                    HasKey hasKey = obj2 instanceof HasKey ? (HasKey) obj2 : null;
                    if (hasKey == null || (obj = hasKey.getKey()) == null) {
                        obj = i + QueryKeys.END_MARKER + i2;
                    }
                    arrayList.add(obj);
                    i2 = i3;
                }
                return arrayList;
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), (List) obj2);
            }
        };

        private Companion() {
        }

        public final gt2 a() {
            return b;
        }

        public final gt2 b() {
            return c;
        }
    }

    Object getKey();
}
