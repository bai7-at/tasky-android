package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.py1;
import defpackage.ss2;
import defpackage.u87;
import defpackage.ww8;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class SaveableStateHolderImpl implements u87 {
    public static final a d = new a(null);
    private static final ea7 e = SaverKt.a(new gt2() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map invoke(fa7 fa7Var, SaveableStateHolderImpl saveableStateHolderImpl) {
            Map h;
            h = saveableStateHolderImpl.h();
            return h;
        }
    }, new ss2() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SaveableStateHolderImpl invoke(Map map) {
            return new SaveableStateHolderImpl(map);
        }
    });
    private final Map a;
    private final Map b;
    private androidx.compose.runtime.saveable.a c;

    public final class RegistryHolder {
        private final Object a;
        private boolean b = true;
        private final androidx.compose.runtime.saveable.a c;

        public RegistryHolder(Object obj) {
            this.a = obj;
            this.c = SaveableStateRegistryKt.a((Map) SaveableStateHolderImpl.this.a.get(obj), new ss2() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$RegistryHolder$registry$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(Object obj2) {
                    a g = SaveableStateHolderImpl.this.g();
                    return Boolean.valueOf(g != null ? g.a(obj2) : true);
                }
            });
        }

        public final androidx.compose.runtime.saveable.a a() {
            return this.c;
        }

        public final void b(Map map) {
            if (this.b) {
                Map d = this.c.d();
                if (d.isEmpty()) {
                    map.remove(this.a);
                } else {
                    map.put(this.a, d);
                }
            }
        }

        public final void c(boolean z) {
            this.b = z;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea7 a() {
            return SaveableStateHolderImpl.e;
        }

        private a() {
        }
    }

    public SaveableStateHolderImpl(Map map) {
        this.a = map;
        this.b = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map h() {
        Map x = t.x(this.a);
        Iterator it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            ((RegistryHolder) it2.next()).b(x);
        }
        if (x.isEmpty()) {
            return null;
        }
        return x;
    }

    @Override // defpackage.u87
    public void c(Object obj) {
        RegistryHolder registryHolder = (RegistryHolder) this.b.get(obj);
        if (registryHolder != null) {
            registryHolder.c(false);
        } else {
            this.a.remove(obj);
        }
    }

    @Override // defpackage.u87
    public void f(final Object obj, final gt2 gt2Var, Composer composer, final int i) {
        Composer h = composer.h(-1198538093);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1198538093, i, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        h.z(444418301);
        h.J(207, obj);
        h.z(-492369756);
        Object A = h.A();
        if (A == Composer.a.a()) {
            androidx.compose.runtime.saveable.a g = g();
            if (!(g != null ? g.a(obj) : true)) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            A = new RegistryHolder(obj);
            h.q(A);
        }
        h.R();
        final RegistryHolder registryHolder = (RegistryHolder) A;
        CompositionLocalKt.a(SaveableStateRegistryKt.b().c(registryHolder.a()), gt2Var, h, i & ContentType.LONG_FORM_ON_DEMAND);
        py1.a(ww8.a, new ss2() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1

            public static final class a implements ms1 {
                final /* synthetic */ SaveableStateHolderImpl.RegistryHolder a;
                final /* synthetic */ SaveableStateHolderImpl b;
                final /* synthetic */ Object c;

                public a(SaveableStateHolderImpl.RegistryHolder registryHolder, SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
                    this.a = registryHolder;
                    this.b = saveableStateHolderImpl;
                    this.c = obj;
                }

                @Override // defpackage.ms1
                public void dispose() {
                    Map map;
                    this.a.b(this.b.a);
                    map = this.b.b;
                    map.remove(this.c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ms1 invoke(ns1 ns1Var) {
                Map map;
                Map map2;
                map = SaveableStateHolderImpl.this.b;
                boolean containsKey = map.containsKey(obj);
                Object obj2 = obj;
                if (!containsKey) {
                    SaveableStateHolderImpl.this.a.remove(obj);
                    map2 = SaveableStateHolderImpl.this.b;
                    map2.put(obj, registryHolder);
                    return new a(registryHolder, SaveableStateHolderImpl.this, obj);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
            }
        }, h, 6);
        h.y();
        h.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$2
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
                    SaveableStateHolderImpl.this.f(obj, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public final androidx.compose.runtime.saveable.a g() {
        return this.c;
    }

    public final void i(androidx.compose.runtime.saveable.a aVar) {
        this.c = aVar;
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
