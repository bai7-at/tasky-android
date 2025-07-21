package com.nytimes.android.interests.db;

import com.nytimes.android.interests.db.PromotionalMedia;
import defpackage.c04;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qs2;
import defpackage.vu3;
import defpackage.zq3;
import defpackage.zt6;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

@lk7
/* loaded from: classes4.dex */
public abstract class InterestAsset {
    public static final Companion Companion = new Companion(null);
    private static final c04 a = c.b(LazyThreadSafetyMode.PUBLICATION, new qs2() { // from class: com.nytimes.android.interests.db.InterestAsset.Companion.1
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final KSerializer mo865invoke() {
            return new SealedClassSerializer("com.nytimes.android.interests.db.InterestAsset", zt6.b(InterestAsset.class), new vu3[]{zt6.b(InterestArticleAsset.class), zt6.b(InterestInteractiveAsset.class)}, new KSerializer[]{InterestArticleAsset$$serializer.INSTANCE, InterestInteractiveAsset$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) InterestAsset.a.getValue();
        }

        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    public /* synthetic */ InterestAsset(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final ZonedDateTime b(long j) {
        return Instant.ofEpochSecond(j).atZone(ZoneId.of("America/New_York"));
    }

    private final long l(Long l, Long l2) {
        if (l != null && l.longValue() != 0) {
            return l.longValue();
        }
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    private final OffsetDateTime o(long j) {
        OffsetDateTime from = OffsetDateTime.from(b(j));
        zq3.g(from, "from(...)");
        return from;
    }

    public static final /* synthetic */ void p(InterestAsset interestAsset, d dVar, SerialDescriptor serialDescriptor) {
    }

    public final String c() {
        String a2;
        PromotionalMedia.ImageDimension d;
        PromotionalMedia.ImageDimension c;
        PromotionalMedia.ImageDimension b;
        PromotionalMedia g = g();
        PromotionalMedia.ImageCrop a3 = g != null ? g.a() : null;
        if (a3 == null || (b = a3.b()) == null || (a2 = b.a()) == null) {
            a2 = (a3 == null || (c = a3.c()) == null) ? null : c.a();
            if (a2 == null) {
                if (a3 == null || (d = a3.d()) == null) {
                    return null;
                }
                return d.a();
            }
        }
        return a2;
    }

    public final String d() {
        PromotionalMedia.ImageDimension e;
        PromotionalMedia g = g();
        PromotionalMedia.ImageCrop a2 = g != null ? g.a() : null;
        if (a2 == null || (e = a2.e()) == null) {
            return null;
        }
        return e.a();
    }

    public abstract long e();

    public abstract long f();

    public abstract PromotionalMedia g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public final boolean m(InterestAsset interestAsset) {
        return interestAsset instanceof InterestInteractiveAsset;
    }

    public final OffsetDateTime n() {
        return o(l(Long.valueOf(e()), Long.valueOf(f())));
    }

    private InterestAsset() {
    }

    public /* synthetic */ InterestAsset(int i, mk7 mk7Var) {
    }
}
