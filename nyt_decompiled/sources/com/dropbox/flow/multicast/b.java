package com.dropbox.flow.multicast;

import com.dropbox.flow.multicast.ChannelManager;
import com.dropbox.flow.multicast.a;
import defpackage.uo6;
import defpackage.zq3;

/* loaded from: classes2.dex */
final class b implements a {
    private final int a;
    private final kotlin.collections.c b;

    public b(int i) {
        this.a = i;
        this.b = new kotlin.collections.c(uo6.i(i, 10));
    }

    @Override // com.dropbox.flow.multicast.a
    public void b(ChannelManager.b.AbstractC0166b.c cVar) {
        zq3.h(cVar, "item");
        while (a().size() >= this.a) {
            a().removeFirst();
        }
        a().addLast(cVar);
    }

    @Override // com.dropbox.flow.multicast.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kotlin.collections.c a() {
        return this.b;
    }

    @Override // com.dropbox.flow.multicast.a
    public boolean isEmpty() {
        return a.C0169a.a(this);
    }
}
