package com.nytimes.android.bestsellers.vo;

import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.wv5;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes.dex */
public final class BookCategory {
    private final List<Book> books;
    private final String categoryKey;
    private final String categoryName;
    private final String headlineDate;
    private final String summaryDate;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] $childSerializers = {null, null, null, null, new qo(Book$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return BookCategory$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BookCategory(int i, String str, String str2, String str3, String str4, List list, mk7 mk7Var) {
        if (31 != (i & 31)) {
            wv5.a(i, 31, BookCategory$$serializer.INSTANCE.getDescriptor());
        }
        this.categoryKey = str;
        this.headlineDate = str2;
        this.categoryName = str3;
        this.summaryDate = str4;
        this.books = list;
    }

    public static /* synthetic */ BookCategory copy$default(BookCategory bookCategory, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bookCategory.categoryKey;
        }
        if ((i & 2) != 0) {
            str2 = bookCategory.headlineDate;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bookCategory.categoryName;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = bookCategory.summaryDate;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = bookCategory.books;
        }
        return bookCategory.copy(str, str5, str6, str7, list);
    }

    public static final /* synthetic */ void write$Self$bestsellers_release(BookCategory bookCategory, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = $childSerializers;
        dVar.y(serialDescriptor, 0, bookCategory.categoryKey);
        dVar.y(serialDescriptor, 1, bookCategory.headlineDate);
        dVar.y(serialDescriptor, 2, bookCategory.categoryName);
        dVar.y(serialDescriptor, 3, bookCategory.summaryDate);
        dVar.z(serialDescriptor, 4, kSerializerArr[4], bookCategory.books);
    }

    public final List<Book> books() {
        return this.books;
    }

    public final String categoryName() {
        return this.categoryName;
    }

    public final String component1() {
        return this.categoryKey;
    }

    public final String component2() {
        return this.headlineDate;
    }

    public final String component3() {
        return this.categoryName;
    }

    public final String component4() {
        return this.summaryDate;
    }

    public final List<Book> component5() {
        return this.books;
    }

    public final BookCategory copy(String str, String str2, String str3, String str4, List<Book> list) {
        zq3.h(str, "categoryKey");
        zq3.h(str2, "headlineDate");
        zq3.h(str3, "categoryName");
        zq3.h(str4, "summaryDate");
        zq3.h(list, "books");
        return new BookCategory(str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookCategory)) {
            return false;
        }
        BookCategory bookCategory = (BookCategory) obj;
        return zq3.c(this.categoryKey, bookCategory.categoryKey) && zq3.c(this.headlineDate, bookCategory.headlineDate) && zq3.c(this.categoryName, bookCategory.categoryName) && zq3.c(this.summaryDate, bookCategory.summaryDate) && zq3.c(this.books, bookCategory.books);
    }

    public final List<Book> getBooks() {
        return this.books;
    }

    public final String getCategoryKey() {
        return this.categoryKey;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final String getHeadlineDate() {
        return this.headlineDate;
    }

    public final String getSummaryDate() {
        return this.summaryDate;
    }

    public int hashCode() {
        return (((((((this.categoryKey.hashCode() * 31) + this.headlineDate.hashCode()) * 31) + this.categoryName.hashCode()) * 31) + this.summaryDate.hashCode()) * 31) + this.books.hashCode();
    }

    public final String headlineDate() {
        return this.headlineDate;
    }

    public final String summaryDate() {
        return this.summaryDate;
    }

    public String toString() {
        return "BookCategory(categoryKey=" + this.categoryKey + ", headlineDate=" + this.headlineDate + ", categoryName=" + this.categoryName + ", summaryDate=" + this.summaryDate + ", books=" + this.books + ")";
    }

    public BookCategory(String str, String str2, String str3, String str4, List<Book> list) {
        zq3.h(str, "categoryKey");
        zq3.h(str2, "headlineDate");
        zq3.h(str3, "categoryName");
        zq3.h(str4, "summaryDate");
        zq3.h(list, "books");
        this.categoryKey = str;
        this.headlineDate = str2;
        this.categoryName = str3;
        this.summaryDate = str4;
        this.books = list;
    }
}
