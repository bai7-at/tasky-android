package com.nytimes.android.abra.io;

import com.dropbox.android.external.store4.Fetcher;
import com.nytimes.android.abra.allocator.ResourceProvider;
import com.nytimes.android.abra.allocator.ValidationKt;
import com.nytimes.android.abra.models.AbraPackage;
import com.nytimes.android.abra.utilities.AbraLogger;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yj0;
import defpackage.zq3;
import java.nio.charset.Charset;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class StoreClientKt {
    public static final Fetcher getFetcherFunc(AbraService abraService) {
        zq3.h(abraService, "abraService");
        return Fetcher.a.b(new StoreClientKt$getFetcherFunc$1(abraService, null));
    }

    public static final qs2 getReaderFunc(final AbraFileSystem abraFileSystem) {
        zq3.h(abraFileSystem, "abraFileSystem");
        return new qs2() { // from class: com.nytimes.android.abra.io.StoreClientKt$getReaderFunc$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final AbraPackage mo865invoke() {
                return new AbraPackage(AbraFileSystem.this.readAbraRules(), AbraFileSystem.this.readAbraBundle(), AbraFileSystem.this.lastModifiedDate(), 0L, null, 24, null);
            }
        };
    }

    public static final ss2 getWriterFunc(final ResourceProvider resourceProvider, final AbraFileSystem abraFileSystem, final it2 it2Var) {
        zq3.h(resourceProvider, "resourceProvider");
        zq3.h(abraFileSystem, "abraFileSystem");
        zq3.h(it2Var, "isValid");
        return new ss2() { // from class: com.nytimes.android.abra.io.StoreClientKt$getWriterFunc$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Pair<byte[], byte[]>) obj);
                return ww8.a;
            }

            public final void invoke(Pair<byte[], byte[]> pair) {
                zq3.h(pair, "it");
                it2 it2Var2 = it2.this;
                byte[] bArr = (byte[]) pair.d();
                Charset charset = yj0.b;
                if (!((Boolean) it2Var2.invoke(new String(bArr, charset), new String((byte[]) pair.c(), charset), resourceProvider)).booleanValue()) {
                    AbraLogger.e$default(AbraLogger.INSTANCE, "Detected invalid js", null, 2, null);
                } else {
                    abraFileSystem.updateRules((byte[]) pair.c());
                    abraFileSystem.updateBundle((byte[]) pair.d());
                }
            }
        };
    }

    public static /* synthetic */ ss2 getWriterFunc$default(ResourceProvider resourceProvider, AbraFileSystem abraFileSystem, it2 it2Var, int i, Object obj) {
        if ((i & 4) != 0) {
            it2Var = new it2() { // from class: com.nytimes.android.abra.io.StoreClientKt$getWriterFunc$1
                @Override // defpackage.it2
                public final Boolean invoke(String str, String str2, ResourceProvider resourceProvider2) {
                    zq3.h(str, "jsCode");
                    zq3.h(str2, "rules");
                    zq3.h(resourceProvider2, "provider");
                    return Boolean.valueOf(ValidationKt.isValidJs$default(str, str2, resourceProvider2, null, 8, null));
                }
            };
        }
        return getWriterFunc(resourceProvider, abraFileSystem, it2Var);
    }
}
