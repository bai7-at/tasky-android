package com.nytimes.android.unfear.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.du8;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.kt2;
import defpackage.vu3;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt6;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class UnfearConverter {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private static UnfearConverter c = new UnfearConverter(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
    private final Map a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UnfearConverter a() {
            return UnfearConverter.c;
        }

        public final void b(UnfearConverter unfearConverter) {
            zq3.h(unfearConverter, "<set-?>");
            UnfearConverter.c = unfearConverter;
        }

        private a() {
        }
    }

    public UnfearConverter(Map map) {
        zq3.h(map, "converter");
        this.a = map;
    }

    public final void c(final Object obj, final Modifier modifier, Composer composer, final int i) {
        ww8 ww8Var;
        zq3.h(obj, "obj");
        zq3.h(modifier, "modifier");
        Composer h = composer.h(-1478491766);
        if (b.G()) {
            b.S(-1478491766, i, -1, "com.nytimes.android.unfear.core.UnfearConverter.draw (UnfearConverter.kt:18)");
        }
        kt2 kt2Var = (kt2) this.a.get(zt6.b(obj.getClass()));
        if (kt2Var == null) {
            ww8Var = null;
        } else {
            kt2Var.invoke(obj, modifier, h, Integer.valueOf((i & ContentType.LONG_FORM_ON_DEMAND) | 8));
            ww8Var = ww8.a;
        }
        if (ww8Var != null) {
            if (b.G()) {
                b.R();
            }
            cc7 k = h.k();
            if (k != null) {
                k.a(new gt2() { // from class: com.nytimes.android.unfear.core.UnfearConverter$draw$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        UnfearConverter.this.c(obj, modifier, composer2, gt6.a(i | 1));
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException(("Cannot draw " + zt6.b(obj.getClass()).c() + ": " + obj).toString());
    }

    public final UnfearConverter d(vu3 vu3Var, kt2 kt2Var) {
        zq3.h(vu3Var, "kClass");
        zq3.h(kt2Var, "composable");
        Map q = t.q(this.a, du8.a(vu3Var, kt2Var));
        zq3.f(q, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.reflect.KClass<*>, kotlin.Function4<kotlin.Any, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>>");
        return new UnfearConverter(q);
    }

    public /* synthetic */ UnfearConverter(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
