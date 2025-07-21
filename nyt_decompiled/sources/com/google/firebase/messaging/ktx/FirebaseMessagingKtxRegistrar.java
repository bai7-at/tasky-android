package com.google.firebase.messaging.ktx;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.u34;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return i.e(u34.b("fire-fcm-ktx", "23.0.4"));
    }
}
