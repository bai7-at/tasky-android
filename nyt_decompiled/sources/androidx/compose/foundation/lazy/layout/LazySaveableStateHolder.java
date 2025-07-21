package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.a;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.u87;
import defpackage.ww8;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class LazySaveableStateHolder implements androidx.compose.runtime.saveable.a, u87 {
    public static final Companion d = new Companion(null);
    private final androidx.compose.runtime.saveable.a a;
    private final sy4 b;
    private final Set c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea7 a(final androidx.compose.runtime.saveable.a aVar) {
            return SaverKt.a(new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$1
                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Map invoke(fa7 fa7Var, LazySaveableStateHolder lazySaveableStateHolder) {
                    Map d = lazySaveableStateHolder.d();
                    if (d.isEmpty()) {
                        return null;
                    }
                    return d;
                }
            }, new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$2
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final LazySaveableStateHolder invoke(Map map) {
                    return new LazySaveableStateHolder(androidx.compose.runtime.saveable.a.this, map);
                }
            });
        }

        private Companion() {
        }
    }

    public LazySaveableStateHolder(androidx.compose.runtime.saveable.a aVar) {
        this.a = aVar;
        this.b = b0.e(null, null, 2, null);
        this.c = new LinkedHashSet();
    }

    @Override // androidx.compose.runtime.saveable.a
    public boolean a(Object obj) {
        return this.a.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.a
    public a.InterfaceC0052a b(String str, qs2 qs2Var) {
        return this.a.b(str, qs2Var);
    }

    @Override // defpackage.u87
    public void c(Object obj) {
        u87 h = h();
        if (h == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        h.c(obj);
    }

    @Override // androidx.compose.runtime.saveable.a
    public Map d() {
        u87 h = h();
        if (h != null) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                h.c(it2.next());
            }
        }
        return this.a.d();
    }

    @Override // androidx.compose.runtime.saveable.a
    public Object e(String str) {
        return this.a.e(str);
    }

    @Override // defpackage.u87
    public void f(final Object obj, final gt2 gt2Var, Composer composer, final int i) {
        Composer h = composer.h(-697180401);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-697180401, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        u87 h2 = h();
        if (h2 == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        h2.f(obj, gt2Var, h, (i & ContentType.LONG_FORM_ON_DEMAND) | 520);
        py1.a(obj, new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$2

            public static final class a implements ms1 {
                final /* synthetic */ LazySaveableStateHolder a;
                final /* synthetic */ Object b;

                public a(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
                    this.a = lazySaveableStateHolder;
                    this.b = obj;
                }

                @Override // defpackage.ms1
                public void dispose() {
                    Set set;
                    set = this.a.c;
                    set.add(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ms1 invoke(ns1 ns1Var) {
                Set set;
                set = LazySaveableStateHolder.this.c;
                set.remove(obj);
                return new a(LazySaveableStateHolder.this, obj);
            }
        }, h, 8);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$3
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
                    LazySaveableStateHolder.this.f(obj, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public final u87 h() {
        return (u87) this.b.getValue();
    }

    public final void i(u87 u87Var) {
        this.b.setValue(u87Var);
    }

    public LazySaveableStateHolder(final androidx.compose.runtime.saveable.a aVar, Map map) {
        this(SaveableStateRegistryKt.a(map, new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                androidx.compose.runtime.saveable.a aVar2 = androidx.compose.runtime.saveable.a.this;
                return Boolean.valueOf(aVar2 != null ? aVar2.a(obj) : true);
            }
        }));
    }
}
