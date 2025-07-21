package kotlin.enums;

import defpackage.zq3;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    private static final a a = new a(null);
    private static final long serialVersionUID = 0;
    private final Class<E> c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public EnumEntriesSerializationProxy(Enum[] enumArr) {
        zq3.h(enumArr, "entries");
        Class<E> cls = (Class<E>) enumArr.getClass().getComponentType();
        zq3.e(cls);
        this.c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.c.getEnumConstants();
        zq3.g(enumConstants, "getEnumConstants(...)");
        return kotlin.enums.a.a(enumConstants);
    }
}
