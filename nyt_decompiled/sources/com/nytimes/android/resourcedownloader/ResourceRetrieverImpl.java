package com.nytimes.android.resourcedownloader;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.hybrid.model.HybridImage;
import com.nytimes.android.hybrid.model.HybridImageCrop;
import com.nytimes.android.hybrid.model.HybridSubResource;
import com.nytimes.android.io.network.raw.CachedNetworkSource;
import com.nytimes.android.resourcedownloader.data.LegacyResourceStoreMigration;
import com.nytimes.android.resourcedownloader.data.ResourceRepository;
import com.nytimes.android.resourcedownloader.model.HybridProperties;
import com.nytimes.android.resourcedownloader.model.MimeType;
import com.nytimes.android.resourcedownloader.model.Resource;
import com.nytimes.android.resourcedownloader.model.ResourceSource;
import defpackage.am6;
import defpackage.b04;
import defpackage.by0;
import defpackage.f55;
import defpackage.h07;
import defpackage.kz6;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.yj0;
import defpackage.zq3;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class ResourceRetrieverImpl implements h07 {
    private final ResourceRepository a;
    private final kz6 b;
    private final b04 c;
    private final SharedPreferences d;
    private final Resources e;
    private final int f;
    private final f55 g;
    private final LegacyResourceStoreMigration h;
    private final CoroutineDispatcher i;

    public ResourceRetrieverImpl(ResourceRepository resourceRepository, kz6 kz6Var, b04 b04Var, SharedPreferences sharedPreferences, Resources resources, int i, f55 f55Var, LegacyResourceStoreMigration legacyResourceStoreMigration, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(resourceRepository, "resourceRepository");
        zq3.h(kz6Var, "resourceDownloader");
        zq3.h(b04Var, "networkManager");
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(resources, "resources");
        zq3.h(f55Var, "networkStatus");
        zq3.h(legacyResourceStoreMigration, "legacyResourceStoreMigration");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = resourceRepository;
        this.b = kz6Var;
        this.c = b04Var;
        this.d = sharedPreferences;
        this.e = resources;
        this.f = i;
        this.g = f55Var;
        this.h = legacyResourceStoreMigration;
        this.i = coroutineDispatcher;
    }

    private final boolean h(SharedPreferences sharedPreferences) {
        return !zq3.c(sharedPreferences.getString(this.e.getString(am6.hybrid_download_image_key), this.e.getString(am6.hybrid_download_some_images_value)), this.e.getString(am6.hybrid_download_no_images_value));
    }

    @Override // defpackage.h07
    public Object a(HybridProperties hybridProperties, ResourceSource resourceSource, boolean z, by0 by0Var) {
        for (HybridSubResource hybridSubResource : hybridProperties.getHybridResources()) {
            String target = hybridSubResource.getTarget();
            if (hybridSubResource.isRequired() && target != null && MimeType.Companion.isCssOrJs(target)) {
                i(target, resourceSource);
            }
        }
        if (z && h(this.d) && this.g.c()) {
            Iterator<HybridImage> it2 = hybridProperties.getHybridImages().iterator();
            while (it2.hasNext()) {
                HybridImageCrop cropBasedOnViewPort = it2.next().getCropBasedOnViewPort(this.f);
                try {
                    this.b.a(cropBasedOnViewPort != null ? cropBasedOnViewPort.getTarget() : null);
                } catch (Throwable th) {
                    ul8.c z2 = ul8.a.z("HYBRID");
                    String target2 = cropBasedOnViewPort != null ? cropBasedOnViewPort.getTarget() : null;
                    if (target2 == null) {
                        target2 = "";
                    }
                    z2.f(th, "Failed to download image " + target2 + ": " + th.getMessage(), new Object[0]);
                }
            }
        }
        return ww8.a;
    }

    @Override // defpackage.h07
    public Object b(List list, by0 by0Var) {
        Object withContext = BuildersKt.withContext(this.i, new ResourceRetrieverImpl$prefetchGlobalResources$2(this, list, null), by0Var);
        return withContext == a.h() ? withContext : ww8.a;
    }

    @Override // defpackage.h07
    public InputStream c(String str) {
        String body;
        zq3.h(str, "url");
        MimeType.Companion companion = MimeType.Companion;
        if (!companion.isCssOrJs(str)) {
            if (companion.isImage(str)) {
                return ((CachedNetworkSource) this.c.get()).cacheFetch(str).t1();
            }
            FileNotFoundException fileNotFoundException = new FileNotFoundException("MimeType is not CSS, JS or JPEG for url=" + str);
            ul8.a.z("HYBRID").e(fileNotFoundException);
            throw fileNotFoundException;
        }
        Resource resource = this.a.getResource(str);
        if (resource != null && (body = resource.getBody()) != null) {
            byte[] bytes = body.getBytes(yj0.b);
            zq3.g(bytes, "getBytes(...)");
            return new ByteArrayInputStream(bytes);
        }
        throw new FileNotFoundException("Resource " + str + " not found");
    }

    @Override // defpackage.h07
    public Object d(Set set, Set set2, by0 by0Var) {
        Object withContext = BuildersKt.withContext(this.i, new ResourceRetrieverImpl$clearResourcesWithoutSources$2(this, set, set2, null), by0Var);
        return withContext == a.h() ? withContext : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.h07
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.util.Map r6, java.lang.String r7, boolean r8, defpackage.by0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.nytimes.android.resourcedownloader.ResourceRetrieverImpl$prefetchSectionResources$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.resourcedownloader.ResourceRetrieverImpl$prefetchSectionResources$1 r0 = (com.nytimes.android.resourcedownloader.ResourceRetrieverImpl$prefetchSectionResources$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.resourcedownloader.ResourceRetrieverImpl$prefetchSectionResources$1 r0 = new com.nytimes.android.resourcedownloader.ResourceRetrieverImpl$prefetchSectionResources$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.L$0
            com.nytimes.android.resourcedownloader.ResourceRetrieverImpl r8 = (com.nytimes.android.resourcedownloader.ResourceRetrieverImpl) r8
            kotlin.f.b(r9)
            r4 = r8
            r8 = r5
            r5 = r4
            goto L4d
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L42:
            kotlin.f.b(r9)
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L4d:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L76
            java.lang.Object r9 = r6.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r2 = r9.getKey()
            com.nytimes.android.resourcedownloader.model.HybridProperties r2 = (com.nytimes.android.resourcedownloader.model.HybridProperties) r2
            java.lang.Object r9 = r9.getValue()
            com.nytimes.android.resourcedownloader.model.ResourceSource r9 = (com.nytimes.android.resourcedownloader.model.ResourceSource) r9
            r0.L$0 = r5
            r0.L$1 = r7
            r0.L$2 = r6
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r9 = r5.a(r2, r9, r8, r0)
            if (r9 != r1) goto L4d
            return r1
        L76:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r6 = "HYBRID"
            ul8$c r5 = r5.z(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Resources downloaded for section="
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r5.l(r6, r7)
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.resourcedownloader.ResourceRetrieverImpl.e(java.util.Map, java.lang.String, boolean, by0):java.lang.Object");
    }

    public boolean i(String str, ResourceSource resourceSource) {
        zq3.h(str, "url");
        zq3.h(resourceSource, "source");
        try {
            if (!this.a.shouldFetchResource(str)) {
                this.a.insertSourceIfNecessary(str, resourceSource);
                return true;
            }
            this.a.insertOrUpdateResource(this.b.b(str), resourceSource);
            return true;
        } catch (Throwable th) {
            ul8.a.z("HYBRID").f(th, "Failed to download resource: " + th.getMessage(), new Object[0]);
            return false;
        }
    }

    public /* synthetic */ ResourceRetrieverImpl(ResourceRepository resourceRepository, kz6 kz6Var, b04 b04Var, SharedPreferences sharedPreferences, Resources resources, int i, f55 f55Var, LegacyResourceStoreMigration legacyResourceStoreMigration, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resourceRepository, kz6Var, b04Var, sharedPreferences, resources, i, f55Var, legacyResourceStoreMigration, (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
