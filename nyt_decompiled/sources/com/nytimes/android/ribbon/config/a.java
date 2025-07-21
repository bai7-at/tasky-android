package com.nytimes.android.ribbon.config;

import androidx.compose.runtime.Composer;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.config.model.RibbonConfigDTO;
import com.nytimes.android.api.config.model.RibbonTabType;
import defpackage.c27;
import defpackage.tp0;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.nytimes.android.ribbon.config.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0385a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RibbonTabType.values().length];
            try {
                iArr[RibbonTabType.BRAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RibbonTabType.NEWS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(Integer.valueOf(((RibbonConfigDTO) obj).getPosition()), Integer.valueOf(((RibbonConfigDTO) obj2).getPosition()));
        }
    }

    public static final List a(List list, Composer composer, int i) {
        com.nytimes.android.ribbon.config.b a;
        zq3.h(list, "<this>");
        composer.z(1489914623);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1489914623, i, -1, "com.nytimes.android.ribbon.config.asRibbonState (RibbonTabConfigRepository.kt:42)");
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((RibbonConfigDTO) obj).getEnabled()) {
                arrayList.add(obj);
            }
        }
        List<RibbonConfigDTO> N0 = i.N0(arrayList, new b());
        ArrayList arrayList2 = new ArrayList();
        for (RibbonConfigDTO ribbonConfigDTO : N0) {
            RibbonConfig a2 = RibbonConfig.Companion.a(ribbonConfigDTO.getId());
            composer.z(-1937800536);
            if (a2 == null) {
                a = null;
            } else {
                String b2 = b(ribbonConfigDTO, a2);
                int i2 = C0385a.a[ribbonConfigDTO.getType().ordinal()];
                if (i2 == 1) {
                    composer.z(-483139575);
                    a = c27.a(a2, b2, composer, 0);
                    composer.R();
                } else {
                    if (i2 != 2) {
                        composer.z(-483141301);
                        composer.R();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.z(-483139503);
                    a = c27.b(a2, b2, composer, 0);
                    composer.R();
                }
            }
            composer.R();
            if (a != null) {
                arrayList2.add(a);
            }
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return arrayList2;
    }

    private static final String b(RibbonConfigDTO ribbonConfigDTO, RibbonConfig ribbonConfig) {
        String displayName = ribbonConfigDTO.getDisplayName();
        if (displayName != null) {
            return displayName;
        }
        String id = ribbonConfig.getId();
        if (id.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(id.charAt(0));
            zq3.f(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            sb.append((Object) upperCase);
            String substring = id.substring(1);
            zq3.g(substring, "substring(...)");
            sb.append(substring);
            id = sb.toString();
        }
        return h.F(id, QueryKeys.END_MARKER, " ", false, 4, null);
    }
}
