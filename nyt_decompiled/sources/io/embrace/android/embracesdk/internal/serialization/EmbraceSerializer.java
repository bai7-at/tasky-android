package io.embrace.android.embracesdk.internal.serialization;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.i;
import defpackage.gm0;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.qd0;
import defpackage.qs2;
import defpackage.sd0;
import defpackage.wd5;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.internal.utils.ThreadLocalDelegate;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class EmbraceSerializer implements PlatformSerializer {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(EmbraceSerializer.class, "impl", "getImpl()Lcom/squareup/moshi/Moshi;", 0))};
    private final hp6 impl$delegate = new ThreadLocalDelegate(new qs2() { // from class: io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer$impl$2
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final i mo865invoke() {
            return new i.b().b(new EmbraceUrlAdapter()).b(new AppFrameworkAdapter()).d();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final i getImpl() {
        return (i) this.impl$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.embrace.android.embracesdk.internal.serialization.PlatformSerializer
    public <T> T fromJson(String str, Class<T> cls) {
        zq3.h(str, "json");
        zq3.h(cls, "clz");
        T t = (T) getImpl().c(cls).fromJson(str);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("JSON conversion failed.");
    }

    public final /* synthetic */ <T> T fromJsonWithTypeToken(String str) {
        zq3.h(str, "json");
        i impl = getImpl();
        zq3.n(4, "T");
        T t = (T) impl.c(Object.class).fromJson(str);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("JSON conversion failed.");
    }

    @Override // io.embrace.android.embracesdk.internal.serialization.PlatformSerializer
    public <T> String toJson(T t) {
        if (t == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String json = getImpl().d(t.getClass()).toJson(t);
        if (json != null) {
            return json;
        }
        throw new IllegalStateException("Failed converting object to JSON.");
    }

    @Override // io.embrace.android.embracesdk.internal.serialization.PlatformSerializer
    public <T> T fromJson(String str, Type type2) {
        zq3.h(str, "json");
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        T t = (T) getImpl().d(type2).fromJson(str);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("JSON conversion failed.");
    }

    @Override // io.embrace.android.embracesdk.internal.serialization.PlatformSerializer
    public <T> T fromJson(InputStream inputStream, Class<T> cls) {
        zq3.h(inputStream, "inputStream");
        zq3.h(cls, "clz");
        sd0 d = wd5.d(wd5.l(inputStream));
        try {
            T t = (T) getImpl().c(cls).fromJson(d);
            if (t != null) {
                gm0.a(d, null);
                return t;
            }
            throw new IllegalStateException("JSON conversion failed.");
        } finally {
        }
    }

    @Override // io.embrace.android.embracesdk.internal.serialization.PlatformSerializer
    public <T> String toJson(T t, Class<T> cls) {
        zq3.h(cls, "clz");
        String json = getImpl().c(cls).toJson(t);
        if (json != null) {
            return json;
        }
        throw new IllegalStateException("Failed converting object to JSON.");
    }

    @Override // io.embrace.android.embracesdk.internal.serialization.PlatformSerializer
    public <T> String toJson(T t, Type type2) {
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        String json = getImpl().d(type2).toJson(t);
        if (json != null) {
            return json;
        }
        throw new IllegalStateException("Failed converting object to JSON.");
    }

    @Override // io.embrace.android.embracesdk.internal.serialization.PlatformSerializer
    public <T> void toJson(T t, Class<T> cls, OutputStream outputStream) {
        zq3.h(cls, "clazz");
        zq3.h(outputStream, "outputStream");
        qd0 c = wd5.c(wd5.h(outputStream));
        try {
            getImpl().c(cls).toJson(c, (qd0) t);
            ww8 ww8Var = ww8.a;
            gm0.a(c, null);
        } finally {
        }
    }

    @Override // io.embrace.android.embracesdk.internal.serialization.PlatformSerializer
    public <T> T fromJson(InputStream inputStream, Type type2) {
        zq3.h(inputStream, "inputStream");
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        sd0 d = wd5.d(wd5.l(inputStream));
        try {
            T t = (T) getImpl().d(type2).fromJson(d);
            if (t != null) {
                gm0.a(d, null);
                return t;
            }
            throw new IllegalStateException("JSON conversion failed.");
        } finally {
        }
    }

    @Override // io.embrace.android.embracesdk.internal.serialization.PlatformSerializer
    public <T> void toJson(T t, ParameterizedType parameterizedType, OutputStream outputStream) {
        zq3.h(parameterizedType, TransferTable.COLUMN_TYPE);
        zq3.h(outputStream, "outputStream");
        qd0 c = wd5.c(wd5.h(outputStream));
        try {
            getImpl().d(parameterizedType).toJson(c, (qd0) t);
            ww8 ww8Var = ww8.a;
            gm0.a(c, null);
        } finally {
        }
    }
}
