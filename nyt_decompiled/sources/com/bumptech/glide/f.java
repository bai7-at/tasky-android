package com.bumptech.glide;

import defpackage.mr8;
import defpackage.w75;

/* loaded from: classes2.dex */
public abstract class f implements Cloneable {
    private mr8 a = w75.a();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    final mr8 b() {
        return this.a;
    }
}
