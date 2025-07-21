package com.google.common.collect;

/* loaded from: classes3.dex */
class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    static final EmptyImmutableListMultimap g = new EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableListMultimap() {
        super(ImmutableMap.o(), 0);
    }

    private Object readResolve() {
        return g;
    }
}
