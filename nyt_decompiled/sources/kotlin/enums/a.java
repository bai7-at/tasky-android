package kotlin.enums;

import defpackage.b22;
import defpackage.zq3;

/* loaded from: classes5.dex */
public abstract class a {
    public static final b22 a(Enum[] enumArr) {
        zq3.h(enumArr, "entries");
        return new EnumEntriesList(enumArr);
    }
}
