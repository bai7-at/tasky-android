package io.embrace.android.embracesdk.arch.datasource;

import defpackage.qs2;

/* loaded from: classes5.dex */
public final class DataSourceImplKt {
    private static final qs2 NoInputValidation = new qs2() { // from class: io.embrace.android.embracesdk.arch.datasource.DataSourceImplKt$NoInputValidation$1
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            return Boolean.valueOf(m863invoke());
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final boolean m863invoke() {
            return true;
        }
    };

    public static final qs2 getNoInputValidation() {
        return NoInputValidation;
    }
}
