package com.nytimes.android.bestsellers.vo;

import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes.dex */
public final class Book {
    public static final Companion Companion = new Companion(null);
    private final String articleChapterLink;
    private final String author;
    private final String bookReviewLink;
    private final int currentRank;
    private final String firstChapterLink;
    private final String imageURL;
    private final String listName;
    private final int numWeeks;
    private final int rankLastWeek;
    private final String summary;
    private final String sundayReviewLink;
    private final String title;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return Book$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Book(int i, String str, String str2, int i2, int i3, String str3, String str4, int i4, String str5, String str6, String str7, String str8, String str9, mk7 mk7Var) {
        if (4095 != (i & 4095)) {
            wv5.a(i, 4095, Book$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.author = str2;
        this.currentRank = i2;
        this.numWeeks = i3;
        this.summary = str3;
        this.imageURL = str4;
        this.rankLastWeek = i4;
        this.firstChapterLink = str5;
        this.articleChapterLink = str6;
        this.bookReviewLink = str7;
        this.sundayReviewLink = str8;
        this.listName = str9;
    }

    public static final /* synthetic */ void write$Self$bestsellers_release(Book book, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, book.title);
        dVar.y(serialDescriptor, 1, book.author);
        dVar.w(serialDescriptor, 2, book.currentRank);
        dVar.w(serialDescriptor, 3, book.numWeeks);
        l48 l48Var = l48.a;
        dVar.l(serialDescriptor, 4, l48Var, book.summary);
        dVar.l(serialDescriptor, 5, l48Var, book.imageURL);
        dVar.w(serialDescriptor, 6, book.rankLastWeek);
        dVar.y(serialDescriptor, 7, book.firstChapterLink);
        dVar.y(serialDescriptor, 8, book.articleChapterLink);
        dVar.y(serialDescriptor, 9, book.bookReviewLink);
        dVar.y(serialDescriptor, 10, book.sundayReviewLink);
        dVar.y(serialDescriptor, 11, book.listName);
    }

    public final String articleChapterLink() {
        return this.articleChapterLink;
    }

    public final String author() {
        return this.author;
    }

    public final String bookReviewLink() {
        return this.bookReviewLink;
    }

    public final String component1() {
        return this.title;
    }

    public final String component10() {
        return this.bookReviewLink;
    }

    public final String component11() {
        return this.sundayReviewLink;
    }

    public final String component12() {
        return this.listName;
    }

    public final String component2() {
        return this.author;
    }

    public final int component3() {
        return this.currentRank;
    }

    public final int component4() {
        return this.numWeeks;
    }

    public final String component5() {
        return this.summary;
    }

    public final String component6() {
        return this.imageURL;
    }

    public final int component7() {
        return this.rankLastWeek;
    }

    public final String component8() {
        return this.firstChapterLink;
    }

    public final String component9() {
        return this.articleChapterLink;
    }

    public final Book copy(String str, String str2, int i, int i2, String str3, String str4, int i3, String str5, String str6, String str7, String str8, String str9) {
        zq3.h(str, "title");
        zq3.h(str2, "author");
        zq3.h(str5, "firstChapterLink");
        zq3.h(str6, "articleChapterLink");
        zq3.h(str7, "bookReviewLink");
        zq3.h(str8, "sundayReviewLink");
        zq3.h(str9, "listName");
        return new Book(str, str2, i, i2, str3, str4, i3, str5, str6, str7, str8, str9);
    }

    public final int currentRank() {
        return this.currentRank;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book book = (Book) obj;
        return zq3.c(this.title, book.title) && zq3.c(this.author, book.author) && this.currentRank == book.currentRank && this.numWeeks == book.numWeeks && zq3.c(this.summary, book.summary) && zq3.c(this.imageURL, book.imageURL) && this.rankLastWeek == book.rankLastWeek && zq3.c(this.firstChapterLink, book.firstChapterLink) && zq3.c(this.articleChapterLink, book.articleChapterLink) && zq3.c(this.bookReviewLink, book.bookReviewLink) && zq3.c(this.sundayReviewLink, book.sundayReviewLink) && zq3.c(this.listName, book.listName);
    }

    public final String firstChapterLink() {
        return this.firstChapterLink;
    }

    public final String getArticleChapterLink() {
        return this.articleChapterLink;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getBookReviewLink() {
        return this.bookReviewLink;
    }

    public final int getCurrentRank() {
        return this.currentRank;
    }

    public final String getFirstChapterLink() {
        return this.firstChapterLink;
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final String getListName() {
        return this.listName;
    }

    public final int getNumWeeks() {
        return this.numWeeks;
    }

    public final int getRankLastWeek() {
        return this.rankLastWeek;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getSundayReviewLink() {
        return this.sundayReviewLink;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((((this.title.hashCode() * 31) + this.author.hashCode()) * 31) + Integer.hashCode(this.currentRank)) * 31) + Integer.hashCode(this.numWeeks)) * 31;
        String str = this.summary;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageURL;
        return ((((((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.rankLastWeek)) * 31) + this.firstChapterLink.hashCode()) * 31) + this.articleChapterLink.hashCode()) * 31) + this.bookReviewLink.hashCode()) * 31) + this.sundayReviewLink.hashCode()) * 31) + this.listName.hashCode();
    }

    public final String imageURL() {
        return this.imageURL;
    }

    public final String listName() {
        return this.listName;
    }

    public final int numWeeks() {
        return this.numWeeks;
    }

    public final int rankLastWeek() {
        return this.rankLastWeek;
    }

    public final String summary() {
        return this.summary;
    }

    public final String sundayReviewLink() {
        return this.sundayReviewLink;
    }

    public final String title() {
        return this.title;
    }

    public String toString() {
        return "Book(title=" + this.title + ", author=" + this.author + ", currentRank=" + this.currentRank + ", numWeeks=" + this.numWeeks + ", summary=" + this.summary + ", imageURL=" + this.imageURL + ", rankLastWeek=" + this.rankLastWeek + ", firstChapterLink=" + this.firstChapterLink + ", articleChapterLink=" + this.articleChapterLink + ", bookReviewLink=" + this.bookReviewLink + ", sundayReviewLink=" + this.sundayReviewLink + ", listName=" + this.listName + ")";
    }

    public Book(String str, String str2, int i, int i2, String str3, String str4, int i3, String str5, String str6, String str7, String str8, String str9) {
        zq3.h(str, "title");
        zq3.h(str2, "author");
        zq3.h(str5, "firstChapterLink");
        zq3.h(str6, "articleChapterLink");
        zq3.h(str7, "bookReviewLink");
        zq3.h(str8, "sundayReviewLink");
        zq3.h(str9, "listName");
        this.title = str;
        this.author = str2;
        this.currentRank = i;
        this.numWeeks = i2;
        this.summary = str3;
        this.imageURL = str4;
        this.rankLastWeek = i3;
        this.firstChapterLink = str5;
        this.articleChapterLink = str6;
        this.bookReviewLink = str7;
        this.sundayReviewLink = str8;
        this.listName = str9;
    }
}
