package com.dropbox.flow.multicast;

import com.dropbox.flow.multicast.ChannelManager;
import defpackage.zq3;
import java.util.Collection;

/* loaded from: classes2.dex */
interface a {

    /* renamed from: com.dropbox.flow.multicast.a$a, reason: collision with other inner class name */
    public static final class C0169a {
        public static boolean a(a aVar) {
            zq3.h(aVar, "this");
            return aVar.a().isEmpty();
        }
    }

    Collection a();

    void b(ChannelManager.b.AbstractC0166b.c cVar);

    boolean isEmpty();
}
