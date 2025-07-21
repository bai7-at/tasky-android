package com.nytimes.android.external.store3.base.impl;

import defpackage.e16;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class BarCode implements Serializable {
    private static final BarCode a = new BarCode("", "");
    private final String key;

    /* renamed from: type, reason: collision with root package name */
    private final String f60type;

    public BarCode(String str, String str2) {
        this.key = (String) e16.d(str2);
        this.f60type = (String) e16.d(str);
    }

    public static BarCode a() {
        return a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarCode)) {
            return false;
        }
        BarCode barCode = (BarCode) obj;
        return this.key.equals(barCode.key) && this.f60type.equals(barCode.f60type);
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.f60type.hashCode();
    }

    public String toString() {
        return "BarCode{key='" + this.key + "', type='" + this.f60type + "'}";
    }
}
