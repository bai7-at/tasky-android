package com.nytimes.android.io;

import com.nytimes.android.io.id.Identifier;

/* loaded from: classes4.dex */
public class Id<T> extends Identifier<Class<T>, String> {
    protected Id(Class<T> cls, String str) {
        super(cls, str);
    }

    public static <S> Id<S> of(Class<S> cls, String str) {
        return new Id<>(cls, str);
    }
}
