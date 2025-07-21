package com.nytimes.android.interests.db;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.an3;
import defpackage.b22;
import defpackage.bl2;
import defpackage.c04;
import defpackage.en3;
import defpackage.hb4;
import defpackage.k54;
import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.qs2;
import defpackage.uo6;
import defpackage.vu3;
import defpackage.wv5;
import defpackage.za0;
import defpackage.zq3;
import defpackage.zt6;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.c;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;
import org.threeten.bp.Duration;
import org.threeten.bp.Instant;

@lk7
/* loaded from: classes4.dex */
public abstract class Interest {
    public static final Companion Companion = new Companion(null);
    private static final c04 a = c.b(LazyThreadSafetyMode.PUBLICATION, new qs2() { // from class: com.nytimes.android.interests.db.Interest.Companion.1
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final KSerializer mo865invoke() {
            return new SealedClassSerializer("com.nytimes.android.interests.db.Interest", zt6.b(Interest.class), new vu3[]{zt6.b(BooksInterest.class), zt6.b(ColumnInterest.class), zt6.b(FilterInterest.class), zt6.b(FlashbackQuizInterest.class), zt6.b(NewsQuizInterest.class), zt6.b(NewsletterInterest.class), zt6.b(ShuffleInterest.class)}, new KSerializer[]{Interest$BooksInterest$$serializer.INSTANCE, Interest$ColumnInterest$$serializer.INSTANCE, Interest$FilterInterest$$serializer.INSTANCE, Interest$FlashbackQuizInterest$$serializer.INSTANCE, Interest$NewsQuizInterest$$serializer.INSTANCE, Interest$NewsletterInterest$$serializer.INSTANCE, Interest$ShuffleInterest$$serializer.INSTANCE}, new Annotation[0]);
        }
    });

    @lk7
    public static final class Book {
        public static final Companion Companion = new Companion(null);
        private final String a;
        private final String b;
        private final String c;
        private final String d;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Book a() {
                return new Book("", "", " ", " ");
            }

            public final KSerializer serializer() {
                return Interest$Book$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Book(int i, String str, String str2, String str3, String str4, mk7 mk7Var) {
            if (15 != (i & 15)) {
                wv5.a(i, 15, Interest$Book$$serializer.INSTANCE.getDescriptor());
            }
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public static final /* synthetic */ void e(Book book, d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, book.a);
            dVar.y(serialDescriptor, 1, book.b);
            dVar.y(serialDescriptor, 2, book.c);
            dVar.y(serialDescriptor, 3, book.d);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Book)) {
                return false;
            }
            Book book = (Book) obj;
            return zq3.c(this.a, book.a) && zq3.c(this.b, book.b) && zq3.c(this.c, book.c) && zq3.c(this.d, book.d);
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Book(link=" + this.a + ", promoImageURL=" + this.b + ", title=" + this.c + ", listName=" + this.d + ")";
        }

        public Book(String str, String str2, String str3, String str4) {
            zq3.h(str, "link");
            zq3.h(str2, "promoImageURL");
            zq3.h(str3, "title");
            zq3.h(str4, "listName");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }

    @lk7
    public static final class BooksInterest extends Interest {
        public static final Companion Companion = new Companion(null);
        private static final KSerializer[] e = {null, new qo(Interest$Book$$serializer.INSTANCE), new qo(InterestAsset.Companion.serializer())};
        private static final Map f = t.m(new Pair("nyt://interactive/bb8ee65e-952f-5f8f-8b93-82f8cbe2e405", "Best of the Century"), new Pair("nyt://interactive/08507769-fce0-59e0-a7ef-8e8b804825d6", "Best of 2024"));
        private final int b;
        private final List c;
        private final List d;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Map a() {
                return BooksInterest.f;
            }

            public final KSerializer serializer() {
                return Interest$BooksInterest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BooksInterest(int i, int i2, List list, List list2, mk7 mk7Var) {
            super(i, mk7Var);
            if (7 != (i & 7)) {
                wv5.a(i, 7, Interest$BooksInterest$$serializer.INSTANCE.getDescriptor());
            }
            this.b = i2;
            this.c = list;
            this.d = list2;
        }

        public static final /* synthetic */ void h(BooksInterest booksInterest, d dVar, SerialDescriptor serialDescriptor) {
            Interest.b(booksInterest, dVar, serialDescriptor);
            KSerializer[] kSerializerArr = e;
            dVar.w(serialDescriptor, 0, booksInterest.b);
            dVar.z(serialDescriptor, 1, kSerializerArr[1], booksInterest.c);
            dVar.z(serialDescriptor, 2, kSerializerArr[2], booksInterest.d);
        }

        public final List e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BooksInterest)) {
                return false;
            }
            BooksInterest booksInterest = (BooksInterest) obj;
            return this.b == booksInterest.b && zq3.c(this.c, booksInterest.c) && zq3.c(this.d, booksInterest.d);
        }

        public final List f() {
            return this.d;
        }

        public final int g() {
            return this.b;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "BooksInterest(totalSaved=" + this.b + ", savedBooks=" + this.c + ", sourceInteractives=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BooksInterest(int i, List list, List list2) {
            super(null);
            zq3.h(list, "savedBooks");
            zq3.h(list2, "sourceInteractives");
            this.b = i;
            this.c = list;
            this.d = list2;
        }
    }

    @lk7
    public static final class Choice {
        public static final Companion Companion = new Companion(null);
        private final String a;
        private final String b;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return Interest$Choice$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Choice(int i, String str, String str2, mk7 mk7Var) {
            if (3 != (i & 3)) {
                wv5.a(i, 3, Interest$Choice$$serializer.INSTANCE.getDescriptor());
            }
            this.a = str;
            this.b = str2;
        }

        public static final /* synthetic */ void c(Choice choice, d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, choice.a);
            dVar.y(serialDescriptor, 1, choice.b);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Choice)) {
                return false;
            }
            Choice choice = (Choice) obj;
            return zq3.c(this.a, choice.a) && zq3.c(this.b, choice.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Choice(id=" + this.a + ", text=" + this.b + ")";
        }

        public Choice(String str, String str2) {
            zq3.h(str, "id");
            zq3.h(str2, "text");
            this.a = str;
            this.b = str2;
        }
    }

    @lk7
    public static final class ColumnInterest extends Interest {
        public static final Companion Companion = new Companion(null);
        private static final KSerializer[] m = {null, null, null, null, null, null, null, null, null, null, new qo(InterestAsset.Companion.serializer())};
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;
        private final boolean h;
        private final PromotionalMedia i;
        private final String j;
        private final String k;
        private final List l;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ColumnInterestSize {
            private static final /* synthetic */ b22 $ENTRIES;
            private static final /* synthetic */ ColumnInterestSize[] $VALUES;
            public static final a Companion;
            private static final int HOURS_IN_DAY = 24;
            public static final ColumnInterestSize LARGE = new ColumnInterestSize("LARGE", 0);
            public static final ColumnInterestSize MEDIUM = new ColumnInterestSize("MEDIUM", 1);
            public static final ColumnInterestSize SMALL = new ColumnInterestSize("SMALL", 2);
            private static final hb4 largeRange;
            private static final an3 mediumRange;

            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ColumnInterestSize a(InterestAsset interestAsset) {
                    zq3.h(interestAsset, "asset");
                    long hours = Duration.between(interestAsset.n().toInstant(), Instant.now()).toHours();
                    hb4 hb4Var = ColumnInterestSize.largeRange;
                    long g = hb4Var.g();
                    if (hours <= hb4Var.j() && g <= hours) {
                        return ColumnInterestSize.LARGE;
                    }
                    an3 an3Var = ColumnInterestSize.mediumRange;
                    return (hours > ((long) an3Var.j()) || ((long) an3Var.g()) > hours) ? ColumnInterestSize.SMALL : ColumnInterestSize.MEDIUM;
                }

                private a() {
                }
            }

            private static final /* synthetic */ ColumnInterestSize[] $values() {
                return new ColumnInterestSize[]{LARGE, MEDIUM, SMALL};
            }

            static {
                ColumnInterestSize[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
                Companion = new a(null);
                largeRange = uo6.v(0L, 48);
                mediumRange = uo6.u(48, 168);
            }

            private ColumnInterestSize(String str, int i) {
            }

            public static b22 getEntries() {
                return $ENTRIES;
            }

            public static ColumnInterestSize valueOf(String str) {
                return (ColumnInterestSize) Enum.valueOf(ColumnInterestSize.class, str);
            }

            public static ColumnInterestSize[] values() {
                return (ColumnInterestSize[]) $VALUES.clone();
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return Interest$ColumnInterest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ColumnInterest(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, PromotionalMedia promotionalMedia, String str7, String str8, List list, mk7 mk7Var) {
            super(i, mk7Var);
            if (2047 != (i & 2047)) {
                wv5.a(i, 2047, Interest$ColumnInterest$$serializer.INSTANCE.getDescriptor());
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = z;
            this.i = promotionalMedia;
            this.j = str7;
            this.k = str8;
            this.l = list;
        }

        public static final /* synthetic */ void f(ColumnInterest columnInterest, d dVar, SerialDescriptor serialDescriptor) {
            Interest.b(columnInterest, dVar, serialDescriptor);
            KSerializer[] kSerializerArr = m;
            dVar.y(serialDescriptor, 0, columnInterest.b);
            dVar.y(serialDescriptor, 1, columnInterest.c);
            dVar.y(serialDescriptor, 2, columnInterest.d);
            dVar.y(serialDescriptor, 3, columnInterest.e);
            dVar.y(serialDescriptor, 4, columnInterest.f);
            dVar.y(serialDescriptor, 5, columnInterest.g);
            dVar.x(serialDescriptor, 6, columnInterest.h);
            dVar.l(serialDescriptor, 7, PromotionalMedia$$serializer.INSTANCE, columnInterest.i);
            dVar.y(serialDescriptor, 8, columnInterest.j);
            dVar.y(serialDescriptor, 9, columnInterest.k);
            dVar.z(serialDescriptor, 10, kSerializerArr[10], columnInterest.l);
        }

        public final List d() {
            return this.l;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColumnInterest)) {
                return false;
            }
            ColumnInterest columnInterest = (ColumnInterest) obj;
            return zq3.c(this.b, columnInterest.b) && zq3.c(this.c, columnInterest.c) && zq3.c(this.d, columnInterest.d) && zq3.c(this.e, columnInterest.e) && zq3.c(this.f, columnInterest.f) && zq3.c(this.g, columnInterest.g) && this.h == columnInterest.h && zq3.c(this.i, columnInterest.i) && zq3.c(this.j, columnInterest.j) && zq3.c(this.k, columnInterest.k) && zq3.c(this.l, columnInterest.l);
        }

        public int hashCode() {
            int hashCode = ((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Boolean.hashCode(this.h)) * 31;
            PromotionalMedia promotionalMedia = this.i;
            return ((((((hashCode + (promotionalMedia == null ? 0 : promotionalMedia.hashCode())) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
        }

        public String toString() {
            return "ColumnInterest(id=" + this.b + ", toneName=" + this.c + ", url=" + this.d + ", uri=" + this.e + ", type=" + this.f + ", name=" + this.g + ", showPicture=" + this.h + ", promotionalMedia=" + this.i + ", promotionalHeadline=" + this.j + ", promotionalExcerpt=" + this.k + ", assets=" + this.l + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ColumnInterest(String str, String str2, String str3, String str4, String str5, String str6, boolean z, PromotionalMedia promotionalMedia, String str7, String str8, List list) {
            super(null);
            zq3.h(str, "id");
            zq3.h(str2, "toneName");
            zq3.h(str3, "url");
            zq3.h(str4, "uri");
            zq3.h(str5, TransferTable.COLUMN_TYPE);
            zq3.h(str6, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str7, "promotionalHeadline");
            zq3.h(str8, "promotionalExcerpt");
            zq3.h(list, "assets");
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = z;
            this.i = promotionalMedia;
            this.j = str7;
            this.k = str8;
            this.l = list;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) Interest.a.getValue();
        }

        public final KSerializer serializer() {
            return a();
        }

        private Companion() {
        }
    }

    @lk7
    public static final class CompletedNewsQuizData {
        public static final Companion Companion = new Companion(null);
        private static final KSerializer[] e = {null, null, null, new qo(za0.a)};
        private Float a;
        private final Integer b;
        private final String c;
        private List d;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return Interest$CompletedNewsQuizData$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ CompletedNewsQuizData(int i, Float f, Integer num, String str, List list, mk7 mk7Var) {
            if (15 != (i & 15)) {
                wv5.a(i, 15, Interest$CompletedNewsQuizData$$serializer.INSTANCE.getDescriptor());
            }
            this.a = f;
            this.b = num;
            this.c = str;
            this.d = list;
        }

        public static final /* synthetic */ void e(CompletedNewsQuizData completedNewsQuizData, d dVar, SerialDescriptor serialDescriptor) {
            KSerializer[] kSerializerArr = e;
            dVar.l(serialDescriptor, 0, bl2.a, completedNewsQuizData.a);
            dVar.l(serialDescriptor, 1, en3.a, completedNewsQuizData.b);
            dVar.l(serialDescriptor, 2, l48.a, completedNewsQuizData.c);
            dVar.l(serialDescriptor, 3, kSerializerArr[3], completedNewsQuizData.d);
        }

        public final List b() {
            return this.d;
        }

        public final Float c() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompletedNewsQuizData)) {
                return false;
            }
            CompletedNewsQuizData completedNewsQuizData = (CompletedNewsQuizData) obj;
            return zq3.c(this.a, completedNewsQuizData.a) && zq3.c(this.b, completedNewsQuizData.b) && zq3.c(this.c, completedNewsQuizData.c) && zq3.c(this.d, completedNewsQuizData.d);
        }

        public int hashCode() {
            Float f = this.a;
            int hashCode = (f == null ? 0 : f.hashCode()) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List list = this.d;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "CompletedNewsQuizData(score=" + this.a + ", average=" + this.b + ", statsCopy=" + this.c + ", answers=" + this.d + ")";
        }

        public CompletedNewsQuizData(Float f, Integer num, String str, List list) {
            this.a = f;
            this.b = num;
            this.c = str;
            this.d = list;
        }
    }

    @lk7
    public static final class Filter {
        public static final Companion Companion = new Companion(null);
        private static final KSerializer[] d = {null, null, new qo(InterestAsset.Companion.serializer())};
        private final String a;
        private final int b;
        private final List c;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return Interest$Filter$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Filter(int i, String str, int i2, List list, mk7 mk7Var) {
            if (7 != (i & 7)) {
                wv5.a(i, 7, Interest$Filter$$serializer.INSTANCE.getDescriptor());
            }
            this.a = str;
            this.b = i2;
            this.c = list;
        }

        public static final /* synthetic */ void e(Filter filter, d dVar, SerialDescriptor serialDescriptor) {
            KSerializer[] kSerializerArr = d;
            dVar.y(serialDescriptor, 0, filter.a);
            dVar.w(serialDescriptor, 1, filter.b);
            dVar.z(serialDescriptor, 2, kSerializerArr[2], filter.c);
        }

        public final List b() {
            return this.c;
        }

        public final int c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) obj;
            return zq3.c(this.a, filter.a) && this.b == filter.b && zq3.c(this.c, filter.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            int i = this.b;
            List list = this.c;
            ArrayList arrayList = new ArrayList(i.w(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((InterestAsset) it2.next()).h());
            }
            return "name: " + str + " id: " + i + " assets:" + arrayList;
        }

        public Filter(String str, int i, List list) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(list, "assets");
            this.a = str;
            this.b = i;
            this.c = list;
        }
    }

    @lk7
    public static final class FilterInterest extends Interest {
        public static final Companion Companion = new Companion(null);
        private static final KSerializer[] d = {new qo(en3.a), new k54(Interest$Filter$$serializer.INSTANCE)};
        private final List b;
        private final Set c;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return Interest$FilterInterest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FilterInterest(int i, List list, Set set, mk7 mk7Var) {
            super(i, mk7Var);
            if (3 != (i & 3)) {
                wv5.a(i, 3, Interest$FilterInterest$$serializer.INSTANCE.getDescriptor());
            }
            this.b = list;
            this.c = set;
        }

        public static final /* synthetic */ void f(FilterInterest filterInterest, d dVar, SerialDescriptor serialDescriptor) {
            Interest.b(filterInterest, dVar, serialDescriptor);
            KSerializer[] kSerializerArr = d;
            dVar.z(serialDescriptor, 0, kSerializerArr[0], filterInterest.b);
            dVar.z(serialDescriptor, 1, kSerializerArr[1], filterInterest.c);
        }

        public final Set d() {
            return this.c;
        }

        public final List e() {
            Set set = this.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(set, 10)), 16));
            for (Object obj : set) {
                linkedHashMap.put(Integer.valueOf(((Filter) obj).c()), obj);
            }
            List list = this.b;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Filter filter = (Filter) linkedHashMap.get(Integer.valueOf(((Number) it2.next()).intValue()));
                if (filter != null) {
                    arrayList.add(filter);
                }
            }
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterInterest)) {
                return false;
            }
            FilterInterest filterInterest = (FilterInterest) obj;
            return zq3.c(this.b, filterInterest.b) && zq3.c(this.c, filterInterest.c);
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            return "FilterInterest(filterOrder=" + this.b + ", filters=" + this.c + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FilterInterest(List list, Set set) {
            super(null);
            zq3.h(list, "filterOrder");
            zq3.h(set, "filters");
            this.b = list;
            this.c = set;
        }
    }

    @lk7
    public static final class FlashbackQuizInterest extends Interest {
        public static final Companion Companion = new Companion(null);
        private static final KSerializer[] i = {null, null, null, new qo(za0.a), null, null, InterestAsset.Companion.serializer()};
        private final String b;
        private final String c;
        private final Integer d;
        private final List e;
        private final long f;
        private final String g;
        private final InterestAsset h;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return Interest$FlashbackQuizInterest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FlashbackQuizInterest(int i2, String str, String str2, Integer num, List list, long j, String str3, InterestAsset interestAsset, mk7 mk7Var) {
            super(i2, mk7Var);
            if (127 != (i2 & 127)) {
                wv5.a(i2, 127, Interest$FlashbackQuizInterest$$serializer.INSTANCE.getDescriptor());
            }
            this.b = str;
            this.c = str2;
            this.d = num;
            this.e = list;
            this.f = j;
            this.g = str3;
            this.h = interestAsset;
        }

        public static final /* synthetic */ void j(FlashbackQuizInterest flashbackQuizInterest, d dVar, SerialDescriptor serialDescriptor) {
            Interest.b(flashbackQuizInterest, dVar, serialDescriptor);
            KSerializer[] kSerializerArr = i;
            dVar.y(serialDescriptor, 0, flashbackQuizInterest.b);
            dVar.y(serialDescriptor, 1, flashbackQuizInterest.c);
            dVar.l(serialDescriptor, 2, en3.a, flashbackQuizInterest.d);
            dVar.z(serialDescriptor, 3, kSerializerArr[3], flashbackQuizInterest.e);
            dVar.F(serialDescriptor, 4, flashbackQuizInterest.f);
            dVar.y(serialDescriptor, 5, flashbackQuizInterest.g);
            dVar.z(serialDescriptor, 6, kSerializerArr[6], flashbackQuizInterest.h);
        }

        public final List d() {
            return this.e;
        }

        public final InterestAsset e() {
            return this.h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlashbackQuizInterest)) {
                return false;
            }
            FlashbackQuizInterest flashbackQuizInterest = (FlashbackQuizInterest) obj;
            return zq3.c(this.b, flashbackQuizInterest.b) && zq3.c(this.c, flashbackQuizInterest.c) && zq3.c(this.d, flashbackQuizInterest.d) && zq3.c(this.e, flashbackQuizInterest.e) && this.f == flashbackQuizInterest.f && zq3.c(this.g, flashbackQuizInterest.g) && zq3.c(this.h, flashbackQuizInterest.h);
        }

        public final String f() {
            return this.b;
        }

        public final long g() {
            return this.f;
        }

        public final String h() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = ((this.b.hashCode() * 31) + this.c.hashCode()) * 31;
            Integer num = this.d;
            return ((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.e.hashCode()) * 31) + Long.hashCode(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
        }

        public final Integer i() {
            return this.d;
        }

        public String toString() {
            return "FlashbackQuizInterest(event=" + this.b + ", image=" + this.c + ", score=" + this.d + ", answer=" + this.e + ", firstPublished=" + this.f + ", url=" + this.g + ", asset=" + this.h + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlashbackQuizInterest(String str, String str2, Integer num, List list, long j, String str3, InterestAsset interestAsset) {
            super(null);
            zq3.h(str, "event");
            zq3.h(str2, AssetConstants.IMAGE_TYPE);
            zq3.h(list, "answer");
            zq3.h(str3, "url");
            zq3.h(interestAsset, "asset");
            this.b = str;
            this.c = str2;
            this.d = num;
            this.e = list;
            this.f = j;
            this.g = str3;
            this.h = interestAsset;
        }
    }

    @lk7
    public static final class InitialNewsQuizData {
        public static final Companion Companion = new Companion(null);
        private static final KSerializer[] h = {InterestAsset.Companion.serializer(), null, new qo(Interest$Choice$$serializer.INSTANCE), null, null, null, null};
        private final InterestAsset a;
        private final String b;
        private final List c;
        private final String d;
        private final String e;
        private final Integer f;
        private final long g;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return Interest$InitialNewsQuizData$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ InitialNewsQuizData(int i, InterestAsset interestAsset, String str, List list, String str2, String str3, Integer num, long j, mk7 mk7Var) {
            if (127 != (i & 127)) {
                wv5.a(i, 127, Interest$InitialNewsQuizData$$serializer.INSTANCE.getDescriptor());
            }
            this.a = interestAsset;
            this.b = str;
            this.c = list;
            this.d = str2;
            this.e = str3;
            this.f = num;
            this.g = j;
        }

        public static final /* synthetic */ void i(InitialNewsQuizData initialNewsQuizData, d dVar, SerialDescriptor serialDescriptor) {
            KSerializer[] kSerializerArr = h;
            dVar.z(serialDescriptor, 0, kSerializerArr[0], initialNewsQuizData.a);
            dVar.y(serialDescriptor, 1, initialNewsQuizData.b);
            dVar.z(serialDescriptor, 2, kSerializerArr[2], initialNewsQuizData.c);
            dVar.y(serialDescriptor, 3, initialNewsQuizData.d);
            dVar.l(serialDescriptor, 4, l48.a, initialNewsQuizData.e);
            dVar.l(serialDescriptor, 5, en3.a, initialNewsQuizData.f);
            dVar.F(serialDescriptor, 6, initialNewsQuizData.g);
        }

        public final String b() {
            return this.d;
        }

        public final List c() {
            return this.c;
        }

        public final String d() {
            return this.e;
        }

        public final long e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialNewsQuizData)) {
                return false;
            }
            InitialNewsQuizData initialNewsQuizData = (InitialNewsQuizData) obj;
            return zq3.c(this.a, initialNewsQuizData.a) && zq3.c(this.b, initialNewsQuizData.b) && zq3.c(this.c, initialNewsQuizData.c) && zq3.c(this.d, initialNewsQuizData.d) && zq3.c(this.e, initialNewsQuizData.e) && zq3.c(this.f, initialNewsQuizData.f) && this.g == initialNewsQuizData.g;
        }

        public final String f() {
            return this.b;
        }

        public final InterestAsset g() {
            return this.a;
        }

        public final Integer h() {
            return this.f;
        }

        public int hashCode() {
            int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
            String str = this.e;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f;
            return ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Long.hashCode(this.g);
        }

        public String toString() {
            return "InitialNewsQuizData(quizAsset=" + this.a + ", question=" + this.b + ", choices=" + this.c + ", answer=" + this.d + ", explanation=" + this.e + ", totalQuestions=" + this.f + ", firstPublished=" + this.g + ")";
        }

        public InitialNewsQuizData(InterestAsset interestAsset, String str, List list, String str2, String str3, Integer num, long j) {
            zq3.h(interestAsset, "quizAsset");
            zq3.h(str, "question");
            zq3.h(list, "choices");
            zq3.h(str2, "answer");
            this.a = interestAsset;
            this.b = str;
            this.c = list;
            this.d = str2;
            this.e = str3;
            this.f = num;
            this.g = j;
        }
    }

    @lk7
    public static final class NewsQuizInterest extends Interest {
        public static final Companion Companion = new Companion(null);
        private final CompletedNewsQuizData b;
        private final InitialNewsQuizData c;
        private final String d;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return Interest$NewsQuizInterest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NewsQuizInterest(int i, CompletedNewsQuizData completedNewsQuizData, InitialNewsQuizData initialNewsQuizData, String str, mk7 mk7Var) {
            super(i, mk7Var);
            if (7 != (i & 7)) {
                wv5.a(i, 7, Interest$NewsQuizInterest$$serializer.INSTANCE.getDescriptor());
            }
            this.b = completedNewsQuizData;
            this.c = initialNewsQuizData;
            this.d = str;
        }

        public static final /* synthetic */ void g(NewsQuizInterest newsQuizInterest, d dVar, SerialDescriptor serialDescriptor) {
            Interest.b(newsQuizInterest, dVar, serialDescriptor);
            dVar.z(serialDescriptor, 0, Interest$CompletedNewsQuizData$$serializer.INSTANCE, newsQuizInterest.b);
            dVar.z(serialDescriptor, 1, Interest$InitialNewsQuizData$$serializer.INSTANCE, newsQuizInterest.c);
            dVar.y(serialDescriptor, 2, newsQuizInterest.d);
        }

        public final String c() {
            return this.d;
        }

        public final CompletedNewsQuizData d() {
            return this.b;
        }

        public final InitialNewsQuizData e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsQuizInterest)) {
                return false;
            }
            NewsQuizInterest newsQuizInterest = (NewsQuizInterest) obj;
            return zq3.c(this.b, newsQuizInterest.b) && zq3.c(this.c, newsQuizInterest.c) && zq3.c(this.d, newsQuizInterest.d);
        }

        public final boolean f() {
            List b = this.b.b();
            return !(b == null || b.isEmpty());
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "NewsQuizInterest(completedQuiz=" + this.b + ", initialQuizData=" + this.c + ", collectionUrl=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsQuizInterest(CompletedNewsQuizData completedNewsQuizData, InitialNewsQuizData initialNewsQuizData, String str) {
            super(null);
            zq3.h(completedNewsQuizData, "completedQuiz");
            zq3.h(initialNewsQuizData, "initialQuizData");
            zq3.h(str, "collectionUrl");
            this.b = completedNewsQuizData;
            this.c = initialNewsQuizData;
            this.d = str;
        }
    }

    @lk7
    public static final class NewsletterInterest extends Interest {
        public static final Companion Companion = new Companion(null);
        private static final KSerializer[] m = {null, null, null, null, null, null, null, null, null, null, new qo(InterestAsset.Companion.serializer())};
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;
        private final boolean h;
        private final PromotionalMedia i;
        private final String j;
        private final String k;
        private final List l;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return Interest$NewsletterInterest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NewsletterInterest(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, PromotionalMedia promotionalMedia, String str7, String str8, List list, mk7 mk7Var) {
            super(i, mk7Var);
            if (2047 != (i & 2047)) {
                wv5.a(i, 2047, Interest$NewsletterInterest$$serializer.INSTANCE.getDescriptor());
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = z;
            this.i = promotionalMedia;
            this.j = str7;
            this.k = str8;
            this.l = list;
        }

        public static final /* synthetic */ void f(NewsletterInterest newsletterInterest, d dVar, SerialDescriptor serialDescriptor) {
            Interest.b(newsletterInterest, dVar, serialDescriptor);
            KSerializer[] kSerializerArr = m;
            dVar.y(serialDescriptor, 0, newsletterInterest.b);
            dVar.y(serialDescriptor, 1, newsletterInterest.c);
            dVar.y(serialDescriptor, 2, newsletterInterest.d);
            dVar.y(serialDescriptor, 3, newsletterInterest.e);
            dVar.y(serialDescriptor, 4, newsletterInterest.f);
            dVar.y(serialDescriptor, 5, newsletterInterest.g);
            dVar.x(serialDescriptor, 6, newsletterInterest.h);
            dVar.l(serialDescriptor, 7, PromotionalMedia$$serializer.INSTANCE, newsletterInterest.i);
            dVar.y(serialDescriptor, 8, newsletterInterest.j);
            dVar.y(serialDescriptor, 9, newsletterInterest.k);
            dVar.z(serialDescriptor, 10, kSerializerArr[10], newsletterInterest.l);
        }

        public final List d() {
            return this.l;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsletterInterest)) {
                return false;
            }
            NewsletterInterest newsletterInterest = (NewsletterInterest) obj;
            return zq3.c(this.b, newsletterInterest.b) && zq3.c(this.c, newsletterInterest.c) && zq3.c(this.d, newsletterInterest.d) && zq3.c(this.e, newsletterInterest.e) && zq3.c(this.f, newsletterInterest.f) && zq3.c(this.g, newsletterInterest.g) && this.h == newsletterInterest.h && zq3.c(this.i, newsletterInterest.i) && zq3.c(this.j, newsletterInterest.j) && zq3.c(this.k, newsletterInterest.k) && zq3.c(this.l, newsletterInterest.l);
        }

        public int hashCode() {
            int hashCode = ((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Boolean.hashCode(this.h)) * 31;
            PromotionalMedia promotionalMedia = this.i;
            return ((((((hashCode + (promotionalMedia == null ? 0 : promotionalMedia.hashCode())) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
        }

        public String toString() {
            return "NewsletterInterest(id=" + this.b + ", toneName=" + this.c + ", url=" + this.d + ", uri=" + this.e + ", type=" + this.f + ", name=" + this.g + ", showPicture=" + this.h + ", promotionalMedia=" + this.i + ", promotionalHeadline=" + this.j + ", promotionalExcerpt=" + this.k + ", assets=" + this.l + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsletterInterest(String str, String str2, String str3, String str4, String str5, String str6, boolean z, PromotionalMedia promotionalMedia, String str7, String str8, List list) {
            super(null);
            zq3.h(str, "id");
            zq3.h(str2, "toneName");
            zq3.h(str3, "url");
            zq3.h(str4, "uri");
            zq3.h(str5, TransferTable.COLUMN_TYPE);
            zq3.h(str6, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str7, "promotionalHeadline");
            zq3.h(str8, "promotionalExcerpt");
            zq3.h(list, "assets");
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = z;
            this.i = promotionalMedia;
            this.j = str7;
            this.k = str8;
            this.l = list;
        }
    }

    @lk7
    public static final class PersonalizedItem {
        public static final Companion Companion = new Companion(null);
        private static final KSerializer[] c = {InterestAsset.Companion.serializer(), new qo(TrackingParam$$serializer.INSTANCE)};
        private final InterestAsset a;
        private final List b;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return Interest$PersonalizedItem$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ PersonalizedItem(int i, InterestAsset interestAsset, List list, mk7 mk7Var) {
            if (3 != (i & 3)) {
                wv5.a(i, 3, Interest$PersonalizedItem$$serializer.INSTANCE.getDescriptor());
            }
            this.a = interestAsset;
            this.b = list;
        }

        public static final /* synthetic */ void d(PersonalizedItem personalizedItem, d dVar, SerialDescriptor serialDescriptor) {
            KSerializer[] kSerializerArr = c;
            dVar.z(serialDescriptor, 0, kSerializerArr[0], personalizedItem.a);
            dVar.z(serialDescriptor, 1, kSerializerArr[1], personalizedItem.b);
        }

        public final InterestAsset b() {
            return this.a;
        }

        public final List c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PersonalizedItem)) {
                return false;
            }
            PersonalizedItem personalizedItem = (PersonalizedItem) obj;
            return zq3.c(this.a, personalizedItem.a) && zq3.c(this.b, personalizedItem.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "PersonalizedItem(asset=" + this.a + ", trackingParams=" + this.b + ")";
        }

        public PersonalizedItem(InterestAsset interestAsset, List list) {
            zq3.h(interestAsset, "asset");
            zq3.h(list, "trackingParams");
            this.a = interestAsset;
            this.b = list;
        }
    }

    @lk7
    public static final class ShuffleInterest extends Interest {
        public static final Companion Companion = new Companion(null);
        private static final KSerializer[] c = {new qo(Interest$PersonalizedItem$$serializer.INSTANCE)};
        private final List b;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return Interest$ShuffleInterest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ShuffleInterest(int i, List list, mk7 mk7Var) {
            super(i, mk7Var);
            if (1 != (i & 1)) {
                wv5.a(i, 1, Interest$ShuffleInterest$$serializer.INSTANCE.getDescriptor());
            }
            this.b = list;
        }

        public static final /* synthetic */ void e(ShuffleInterest shuffleInterest, d dVar, SerialDescriptor serialDescriptor) {
            Interest.b(shuffleInterest, dVar, serialDescriptor);
            dVar.z(serialDescriptor, 0, c[0], shuffleInterest.b);
        }

        public final List d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShuffleInterest) && zq3.c(this.b, ((ShuffleInterest) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "ShuffleInterest(shuffleItems=" + this.b + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShuffleInterest(List list) {
            super(null);
            zq3.h(list, "shuffleItems");
            this.b = list;
        }
    }

    public /* synthetic */ Interest(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void b(Interest interest, d dVar, SerialDescriptor serialDescriptor) {
    }

    private Interest() {
    }

    public /* synthetic */ Interest(int i, mk7 mk7Var) {
    }
}
