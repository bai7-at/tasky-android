package com.google.common.collect;

import defpackage.a64;
import defpackage.b16;
import defpackage.gc8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public abstract class MultimapBuilder {

    private static final class ArrayListSupplier<V> implements gc8, Serializable {
        private final int expectedValuesPerKey;

        ArrayListSupplier(int i) {
            this.expectedValuesPerKey = e.b(i, "expectedValuesPerKey");
        }

        @Override // defpackage.gc8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    class a extends d {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // com.google.common.collect.MultimapBuilder.d
        Map c() {
            return p.c(this.a);
        }
    }

    class b extends d {
        final /* synthetic */ Comparator a;

        b(Comparator comparator) {
            this.a = comparator;
        }

        @Override // com.google.common.collect.MultimapBuilder.d
        Map c() {
            return new TreeMap(this.a);
        }
    }

    public static abstract class c extends MultimapBuilder {
        c() {
            super(null);
        }

        public abstract a64 e();
    }

    public static abstract class d {

        class a extends c {
            final /* synthetic */ int a;

            a(int i) {
                this.a = i;
            }

            @Override // com.google.common.collect.MultimapBuilder.c
            public a64 e() {
                return Multimaps.b(d.this.c(), new ArrayListSupplier(this.a));
            }
        }

        d() {
        }

        public c a() {
            return b(2);
        }

        public c b(int i) {
            e.b(i, "expectedValuesPerKey");
            return new a(i);
        }

        abstract Map c();
    }

    /* synthetic */ MultimapBuilder(a aVar) {
        this();
    }

    public static d a() {
        return b(8);
    }

    public static d b(int i) {
        e.b(i, "expectedKeys");
        return new a(i);
    }

    public static d c() {
        return d(o.c());
    }

    public static d d(Comparator comparator) {
        b16.k(comparator);
        return new b(comparator);
    }

    private MultimapBuilder() {
    }
}
