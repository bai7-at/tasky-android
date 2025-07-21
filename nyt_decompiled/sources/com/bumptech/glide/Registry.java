package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.o;
import defpackage.av4;
import defpackage.b12;
import defpackage.cz6;
import defpackage.da2;
import defpackage.e12;
import defpackage.fv4;
import defpackage.iz6;
import defpackage.j07;
import defpackage.jz6;
import defpackage.ng3;
import defpackage.rq8;
import defpackage.sz5;
import defpackage.t91;
import defpackage.u91;
import defpackage.w64;
import defpackage.wz6;
import defpackage.xz6;
import defpackage.zu4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class Registry {
    private final av4 a;
    private final e12 b;
    private final jz6 c;
    private final xz6 d;
    private final u91 e;
    private final rq8 f;
    private final ng3 g;
    private final fv4 h = new fv4();
    private final w64 i = new w64();
    private final sz5 j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public NoModelLoaderAvailableException(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        sz5 e = da2.e();
        this.j = e;
        this.a = new av4(e);
        this.b = new e12();
        this.c = new jz6();
        this.d = new xz6();
        this.e = new u91();
        this.f = new rq8();
        this.g = new ng3();
        r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.c.d(cls, cls2)) {
            for (Class cls5 : this.f.b(cls4, cls3)) {
                arrayList.add(new g(cls, cls4, cls5, this.c.b(cls, cls4), this.f.a(cls4, cls5), this.j));
            }
        }
        return arrayList;
    }

    public Registry a(Class cls, b12 b12Var) {
        this.b.a(cls, b12Var);
        return this;
    }

    public Registry b(Class cls, wz6 wz6Var) {
        this.d.a(cls, wz6Var);
        return this;
    }

    public Registry c(Class cls, Class cls2, zu4 zu4Var) {
        this.a.a(cls, cls2, zu4Var);
        return this;
    }

    public Registry d(Class cls, Class cls2, iz6 iz6Var) {
        e("legacy_append", cls, cls2, iz6Var);
        return this;
    }

    public Registry e(String str, Class cls, Class cls2, iz6 iz6Var) {
        this.c.a(str, iz6Var, cls, cls2);
        return this;
    }

    public List g() {
        List b = this.g.b();
        if (b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return b;
    }

    public o h(Class cls, Class cls2, Class cls3) {
        o a = this.i.a(cls, cls2, cls3);
        if (this.i.c(a)) {
            return null;
        }
        if (a == null) {
            List f = f(cls, cls2, cls3);
            a = f.isEmpty() ? null : new o(cls, cls2, cls3, f, this.j);
            this.i.d(cls, cls2, cls3, a);
        }
        return a;
    }

    public List i(Object obj) {
        return this.a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List a = this.h.a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList();
            Iterator it2 = this.a.c(cls).iterator();
            while (it2.hasNext()) {
                for (Class cls4 : this.c.d((Class) it2.next(), cls2)) {
                    if (!this.f.b(cls4, cls3).isEmpty() && !a.contains(cls4)) {
                        a.add(cls4);
                    }
                }
            }
            this.h.b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    public wz6 k(cz6 cz6Var) {
        wz6 b = this.d.b(cz6Var.d());
        if (b != null) {
            return b;
        }
        throw new NoResultEncoderAvailableException(cz6Var.d());
    }

    public t91 l(Object obj) {
        return this.e.a(obj);
    }

    public b12 m(Object obj) {
        b12 b = this.b.b(obj.getClass());
        if (b != null) {
            return b;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    public boolean n(cz6 cz6Var) {
        return this.d.b(cz6Var.d()) != null;
    }

    public Registry o(t91.a aVar) {
        this.e.b(aVar);
        return this;
    }

    public Registry p(ImageHeaderParser imageHeaderParser) {
        this.g.a(imageHeaderParser);
        return this;
    }

    public Registry q(Class cls, Class cls2, j07 j07Var) {
        this.f.c(cls, cls2, j07Var);
        return this;
    }

    public final Registry r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.c.e(arrayList);
        return this;
    }
}
