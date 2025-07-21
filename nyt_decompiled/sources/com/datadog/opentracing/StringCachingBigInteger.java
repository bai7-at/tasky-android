package com.datadog.opentracing;

import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes2.dex */
public class StringCachingBigInteger extends BigInteger {
    private String cachedString;

    public StringCachingBigInteger(String str, int i) {
        super(str, i);
    }

    @Override // java.math.BigInteger
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.math.BigInteger
    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.math.BigInteger
    public String toString() {
        if (this.cachedString == null) {
            this.cachedString = super.toString();
        }
        return this.cachedString;
    }

    public StringCachingBigInteger(int i, Random random) {
        super(i, random);
    }
}
