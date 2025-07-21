package com.google.accompanist.permissions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.fr5;
import defpackage.ly4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public abstract class PermissionStateKt {
    public static final fr5 a(String str, ss2 ss2Var, Composer composer, int i, int i2) {
        zq3.h(str, "permission");
        composer.z(923020361);
        if ((i2 & 2) != 0) {
            ss2Var = new ss2() { // from class: com.google.accompanist.permissions.PermissionStateKt$rememberPermissionState$1
                public final void invoke(boolean z) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return ww8.a;
                }
            };
        }
        if (b.G()) {
            b.S(923020361, i, -1, "com.google.accompanist.permissions.rememberPermissionState (PermissionState.kt:33)");
        }
        ly4 a = MutablePermissionStateKt.a(str, ss2Var, composer, i & WebSocketProtocol.PAYLOAD_SHORT, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a;
    }
}
